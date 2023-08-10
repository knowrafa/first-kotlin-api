create table person
(
    id         uuid         not null
        primary key,
    created_at timestamp(6),
    updated_at timestamp(6),
    address    varchar(100) not null,
    first_name varchar(80)  not null,
    gender     varchar(80)  not null,
    last_name  varchar(80)  not null
);