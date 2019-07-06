-- auto-generated definition
create table products
(
  user_id      integer
    constraint products_simple_user_id_fk
      references simple_user,
  type_product text,
  price        integer
);

alter table products
  owner to postgres;


-- auto-generated definition
create table simple_user
(
  id         serial not null
    constraint simple_user_pk
      primary key,
  first_name text,
  last_name  text
);

alter table simple_user
  owner to postgres;



