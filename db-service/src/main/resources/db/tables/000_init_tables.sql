set
    search_path to public;

call create_sequence_proc('products_id_seq');
call create_sequence_proc('users_id_seq');

create table if not exists products
(
    id    bigint default nextval('products_id_seq'::regclass)
        primary key,
    name  varchar(255),
    price double precision not null
);

create index if not exists idx_name
    on products (name);

create index if not exists idx_price
    on products (price);

create table if not exists users
(
    id       bigint default nextval('users_id_seq'::regclass)
        primary key,
    email    varchar(255),
    username varchar(255)
);

create index if not exists idx_username
    on users (username);

create index if not exists idx_email
    on users (email);

