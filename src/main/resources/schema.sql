create schema if not exists public;

create table if not exists public.addresses
(
    id                    bigserial
    primary key,
    insert_date_time      timestamp not null,
    insert_user_id        bigint    not null,
    is_deleted            boolean,
    last_update_date_time timestamp not null,
    last_update_user_id   bigint    not null,
    address_line1         varchar(255),
    address_line2         varchar(255),
    city                  varchar(255),
    country               varchar(255),
    state                 varchar(255),
    zip_code              varchar(255)
    );

alter table public.addresses
    owner to postgres;

create table if not exists public.companies
(
    id                    bigserial
    primary key,
    insert_date_time      timestamp not null,
    insert_user_id        bigint    not null,
    is_deleted            boolean,
    last_update_date_time timestamp not null,
    last_update_user_id   bigint    not null,
    company_status        varchar(255),
    phone                 varchar(255),
    title                 varchar(255)
    constraint uk_5hg8884r4umln1u4knfesnofy
    unique,
    website               varchar(255),
    address_id            bigint
    constraint fk8w70yf6urddd0ky7ev90okenf
    references public.addresses
    );

alter table public.companies
    owner to postgres;

create table if not exists public.categories
(
    id                    bigserial
    primary key,
    insert_date_time      timestamp not null,
    insert_user_id        bigint    not null,
    is_deleted            boolean,
    last_update_date_time timestamp not null,
    last_update_user_id   bigint    not null,
    description           varchar(255),
    company_id            bigint
    constraint fkdp7yf5up5coo4njjvq1dwdxif
    references public.companies
    );

alter table public.categories
    owner to postgres;

create table if not exists public.clients_vendors
(
    id                    bigserial
    primary key,
    insert_date_time      timestamp not null,
    insert_user_id        bigint    not null,
    is_deleted            boolean,
    last_update_date_time timestamp not null,
    last_update_user_id   bigint    not null,
    client_vendor_name    varchar(255),
    client_vendor_type    varchar(255),
    phone                 varchar(255),
    website               varchar(255),
    address_id            bigint
    constraint fkbwd5aa0n1fnf115jpfas7a6k9
    references public.addresses,
    company_id            bigint
    constraint fkfnu04508v82hakats3xclvx58
    references public.companies
    );

alter table public.clients_vendors
    owner to postgres;

create table if not exists public.invoices
(
    id                    bigserial
    primary key,
    insert_date_time      timestamp not null,
    insert_user_id        bigint    not null,
    is_deleted            boolean,
    last_update_date_time timestamp not null,
    last_update_user_id   bigint    not null,
    date                  date,
    invoice_no            varchar(255),
    invoice_status        varchar(255),
    invoice_type          varchar(255),
    client_vendor_id      bigint
    constraint fk8xos3kqm1uc1cwi6pr27bf2ct
    references public.clients_vendors,
    company_id            bigint
    constraint fk9uwtrg1887fbqa4gb98n6hik6
    references public.companies
    );

alter table public.invoices
    owner to postgres;

create table if not exists public.products
(
    id                    bigserial
    primary key,
    insert_date_time      timestamp not null,
    insert_user_id        bigint    not null,
    is_deleted            boolean,
    last_update_date_time timestamp not null,
    last_update_user_id   bigint    not null,
    low_limit_alert       integer   not null,
    name                  varchar(255),
    product_unit          varchar(255),
    quantity_in_stock     integer   not null,
    category_id           bigint
    constraint fkog2rp4qthbtt2lfyhfo32lsw9
    references public.categories
    );

alter table public.products
    owner to postgres;

create table if not exists public.invoice_products
(
    id                    bigserial
    primary key,
    insert_date_time      timestamp not null,
    insert_user_id        bigint    not null,
    is_deleted            boolean,
    last_update_date_time timestamp not null,
    last_update_user_id   bigint    not null,
    price                 numeric(19, 2),
    profit_loss           numeric(19, 2),
    quantity              integer,
    remaining_quantity    integer,
    tax                   integer,
    total                 numeric(19, 2),
    invoice_id            bigint
    constraint fkhstgarlaggolnedwh9bnkxiau
    references public.invoices,
    product_id            bigint
    constraint fkt82fyxjb334r2frijlnvvucg2
    references public.products
    );

alter table public.invoice_products
    owner to postgres;

create table if not exists public.roles
(
    id                    bigserial
    primary key,
    insert_date_time      timestamp not null,
    insert_user_id        bigint    not null,
    is_deleted            boolean,
    last_update_date_time timestamp not null,
    last_update_user_id   bigint    not null,
    description           varchar(255)
    );

alter table public.roles
    owner to postgres;

create table if not exists public.users
(
    id                    bigserial
    primary key,
    insert_date_time      timestamp    not null,
    insert_user_id        bigint       not null,
    is_deleted            boolean,
    last_update_date_time timestamp    not null,
    last_update_user_id   bigint       not null,
    enabled               boolean      not null,
    firstname             varchar(255),
    lastname              varchar(255),
    password              varchar(255) not null,
    phone                 varchar(255),
    username              varchar(255) not null
    constraint uk_r43af9ap4edm43mmtq01oddj6
    unique,
    company_id            bigint
    constraint fkin8gn4o1hpiwe6qe4ey7ykwq7
    references public.companies,
    role_id               bigint
    constraint fkp56c1712k691lhsyewcssf40f
    references public.roles
    );

alter table public.users
    owner to postgres;
