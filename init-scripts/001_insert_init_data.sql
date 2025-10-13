set search_path to public;

insert into users (email, username)
values ('corneliu@voiculescu.org', 'cvoiculescu'),
       ('ioana@voiculescu.org', 'ivoiculescu');

insert into products (name, price)
values ('Book', 10),
       ('Toy', 20),
       ('Table', 50);