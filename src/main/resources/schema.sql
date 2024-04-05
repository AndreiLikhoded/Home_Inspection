create table if not exists Service_Order (
    id identity,
    client_Name varchar(50) not null,
    client_Street varchar(50) not null,
    client_City varchar(50) not null,
    client_State varchar(25) not null,
    created_at timestamp not null
    );

create table if not exists Order (
    id identity,
    service_order bigint not null,
    service_order_key bigint not null,
    ordered_at timestamp not null
    );

create table if not exists Item_Ref (
    item varchar(4) not null,
    order bigint not null,
    order_key bigint not null
    );

create table if not exists Item (
    id varchar(4) not null,
    name varchar(25) not null,
    type varchar(10) not null
    );


alter table Order
    add foreign key (service_order) references Service_Order(id);
alter table Item_Ref
    add foreign key (item) references Item(id);