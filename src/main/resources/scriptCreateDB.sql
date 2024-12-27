create table Customers
(
    cedula          varchar(255) not null
        primary key,
    active          integer,
    email          varchar(255),
    full_name varchar(255),
    phone_number  double precision,
    password     varchar(255),
    rol             varchar(255)
);

create table sales
(
    invoice_number serial
        primary key,
    customer_cedula varchar(255)
        constraint fkauu0631j70fiv097sj24cylhe
            references Customers,
    date          timestamp(6),
    payment_method     varchar(255),
    total          double precision
);

create table car_brand
(
    id          serial
        primary key,
    description varchar(255)
);

create table cars
(
    car_code          serial
        primary key,
    car_brand_id         integer
        constraint fk4m5c9mn0806wd0n5po3uaef3k
            references car_brand,
    category              varchar(255),
    color                  varchar(255),
    cylinder_capacity             double precision,
    fuel_type       varchar(255),
    horsepower_number double precision,
    image_path            varchar(255),
    model            double precision,
    door_number      integer,
    seat_quantity      integer,
    price                 double precision,
    reference             varchar(255),
    direction              varchar(255),
    traction               integer,
    transmission            varchar(255),
    stock                  integer
);

create table cars_sales
(
    cars_sales_car_code   integer not null
        constraint fkh0l7s0kisxakvxjf45l79fh
            references cars,
    cars_sales_invoice_number integer not null
        constraint fkjk5rbyxmmqi3tygwadgaj6j6o
            references sales,
    amount               integer,
    total                  integer,
    primary key (cars_sales_car_code, cars_sales_invoice_number)
);
