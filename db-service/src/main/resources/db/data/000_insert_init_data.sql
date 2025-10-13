set search_path to public;

insert into users (email, username)
values ('test1@test.org', 'test1'),
       ('test2@test.org', 'test2');

insert into products (name, price)
values ('Book', 10),
       ('Toy', 20),
       ('Table', 50);
