set
search_path to public;

drop procedure if exists create_sequence_proc(text, text);

create procedure
    create_sequence_proc(seq_name text, schema_name text default 'public')
    language plpgsql as
'BEGIN
   IF
NOT EXISTS (
      SELECT 1 FROM pg_class c
      JOIN pg_namespace n ON n.oid = c.relnamespace
      WHERE c.relkind = ''S''
        AND c.relname = seq_name
        AND n.nspname = schema_name
   ) THEN
      EXECUTE format(''CREATE SEQUENCE public.%I'', seq_name);
END IF;
END;';