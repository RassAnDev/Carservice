CREATE TABLE users (
user_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
username VARCHAR(100) NOT NULL,
password VARCHAR(20) NOT NULL
);

CREATE TABLE clients_individuals (
client_individual_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
surname VARCHAR(100) NOT NULL,
firstname VARCHAR(100) NOT NULL,
patronymic VARCHAR(100) NOT NULL,
mobile VARCHAR(100) NOT NULL
);

CREATE TABLE clients_organizations (
client_organization_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
name_of_company VARCHAR (200) NOT NULL,
legal_adress VARCHAR(500) NOT NULL,
taxpayer_number VARCHAR(50) NOT NULL,
registration_reason_code VARCHAR(50) NOT NULL,
state_registration_number VARCHAR(50) NOT NULL,
bank_details VARCHAR(500) NOT NULL,
agreement_number VARCHAR(50) NOT NULL,
agreement_date DATE NOT NULL,
mobile VARCHAR(100) NOT NULL
);

CREATE TABLE clients (
client_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
client_organization_id INT,
client_individual_id INT,
FOREIGN KEY (client_organization_id) REFERENCES clients_organizations(client_organization_id) ON DELETE CASCADE,
FOREIGN KEY (client_individual_id) REFERENCES clients_individuals (client_individual_id) ON DELETE CASCADE
);

CREATE TABLE organizations_executors (
organization_executor_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
name_of_company VARCHAR(200) NOT NULL,
legal_adress VARCHAR(500) NOT NULL,
taxpayer_number VARCHAR(50) NOT NULL,
registration_reason_code VARCHAR(50) NOT NULL,
state_registration_number VARCHAR(50) NOT NULL,
bank_details VARCHAR(500) NOT NULL
);

CREATE TABLE cars (
car_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
brand VARCHAR(50) NOT NULL,
model VARCHAR(50) NOT NULL,
license_plate VARCHAR(20) NOT NULL,
year_of_issue INT NOT NULL,
vin_code VARCHAR(50) NOT NULL,
engine_volume DOUBLE NOT NULL,
engine_power INT NOT NULL,
mileage INT NOT NULL
);

CREATE TABLE payments_options (
payment_option_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
cash VARCHAR(50) NOT NULL,
cashless VARCHAR(50) NOT NULL
);

CREATE TABLE employees (
employee_position_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
surname VARCHAR(100) NOT NULL,
firstname VARCHAR(100) NOT NULL,
patronymic VARCHAR(100) NOT NULL
);

CREATE TABLE work_order (
work_order_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
client_id INT,
car_id INT,
employee_position_performer INT,
employee_position_master_cons INT,
payment_option_id INT,
work_order_number INT NOT NULL,
startdate DATETIME NOT NULL,
enddate DATETIME NOT NULL,
work_quantity INT NOT NULL,
work_amount DOUBLE NOT NULL,
auto_part_quantity INT NOT NULL,
auto_part_amount DOUBLE NOT NULL,
discount_on_work DOUBLE,
total_cost DOUBLE NOT NULL,
wage_percentage DOUBLE NOT NULL,
recommendation VARCHAR(1000),
FOREIGN KEY (client_id) REFERENCES clients (client_id) ON DELETE CASCADE,
FOREIGN KEY (car_id) REFERENCES cars (car_id) ON DELETE CASCADE,
FOREIGN KEY (employee_position_performer) REFERENCES employees (employee_position_id) ON DELETE CASCADE,
FOREIGN KEY (employee_position_master_cons) REFERENCES employees (employee_position_id) ON DELETE CASCADE,
FOREIGN KEY (payment_option_id) REFERENCES payments_options (payment_option_id) ON DELETE CASCADE
);

CREATE TABLE acts_executed_works (
act_executed_work_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
organization_executor_id INT,
client_id INT,
work_order_id INT,
FOREIGN KEY (organization_executor_id) REFERENCES organizations_executors (organization_executor_id) ON DELETE CASCADE,
FOREIGN KEY (client_id) REFERENCES clients (client_id) ON DELETE CASCADE,
FOREIGN KEY (work_order_id) REFERENCES work_order (work_order_id) ON DELETE CASCADE
);

CREATE TABLE invoices_for_payments (
invoice_for_payment_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
act_executed_work_id INT,
FOREIGN KEY (act_executed_work_id) REFERENCES acts_executed_works (act_executed_work_id) ON DELETE CASCADE
);

CREATE TABLE works (
work_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
work_order_id INT,
title VARCHAR(200) NOT NULL,
unit_price DOUBLE NOT NULL,
FOREIGN KEY (work_order_id) REFERENCES work_order (work_order_id) ON DELETE CASCADE
);

CREATE TABLE auto_parts (
auto_part_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
work_order_id INT,
purchase_date DATE NOT NULL,
auto_part_name VARCHAR(200) NOT NULL,
catalogue_number VARCHAR(100) NOT NULL,
supplier_name VARCHAR(200) NOT NULL,
wholesale_unit_price DOUBLE NOT NULL,
unit_retail_price DOUBLE NOT NULL,
markup_amount DOUBLE NOT NULL,
FOREIGN KEY (work_order_id) REFERENCES work_order (work_order_id) ON DELETE CASCADE
);

INSERT users (username, password)
VALUES
('admin', '1'),
('user', '2');

INSERT clients_individuals (surname, firstname, patronymic, mobile)
VALUES
('Анищенко', 'Владислав', 'Владимирович', '8-919-187-58-73'),
('Черных', 'Иван', 'Иванович', '8-933-777-87-78'),
('Китаев', 'Александр', 'Владимирович', '8-910-341-01-13');

INSERT clients_organizations (name_of_company, legal_adress, taxpayer_number, registration_reason_code,
state_registration_number, bank_details, agreement_number, agreement_date, mobile)
VALUES
('Общество с ограниченной ответственностью «Фирма Строительного Снабжения»', 
'394056, г. Воронеж, ул. Солдатское поле, 1а', '3663106818', '366301001', '1143668047885', 
'Р/с № 40702810913000075376 в Центрально-Черноземном банке Сбербанка России 
Кор/сч. 30101810600000000681 БИК 042007681', '04-1120', '2020-11-04', '8-950-767-44-79');

INSERT organizations_executors (name_of_company, legal_adress, taxpayer_number, registration_reason_code,
state_registration_number, bank_details)
VALUES
('Индивидуальный предприниматель Карлов Максим Алексеевич',
'394019, г. Воронеж, ул. Холмистая, д. 12А, Автоцентр «V8 motors»', '366518496515', '0',
'313366825300230', 'Р/с 40802810202940001121 в АО «АЛЬФА-БАНК» К/с 30101810200000000593
БИК 044525593');

INSERT cars (brand, model, license_plate, year_of_issue, vin_code, engine_volume,
engine_power, mileage)
VALUES 
('BMW', '320 GT', 'О 599 МА 36', '2013', 'WBA3X11030D441518', '2.0', '183', '95000'),
('AUDI', 'Q8', 'А 999 АА 136', '2019', 'WAUZZZ4M9GD010412', '4.0', '355', '88000'),
('BMW', 'X6', 'Х 066 ЕХ 36', '2010', 'WBAFG61020LW97239', '3.0', '235', '303000');

INSERT payments_options (cash, cashless)
VALUES ('наличный', 'безналичный');

INSERT employees (surname, firstname, patronymic)
VALUES
('Звягин', 'Владимир', 'Михайлович'),
('Степанников', 'Андрей', 'Иванович'),
('Усачев', 'Александр', 'Сергеевич'),
('Лимарченко', 'Дмитрий', 'Владиславович');

INSERT works (title, unit_price)
VALUES 
('Масло ДВС - замена', '800.00'),
('Фильтр воздушный - замена', '300.00'),
('Фильтр салонный - замена', '400.00'),
('Амортизатор передний - замена', '2000.00'),
('Колодки тормозные задние - замена', '1500.00'),
('Развал-схождение 3D', '1800.00');

INSERT auto_parts (purchase_date, auto_part_name, catalogue_number, supplier_name,
wholesale_unit_price, unit_retail_price, markup_amount)
VALUES 
('2021-08-09', 'Масло моторное 5W30', 'A444B', 'Москворечье', '700.00', '1000.00', '300.00'),
('2021-08-10', 'Фильтр воздушный', 'B555A', 'Форум Авто', '350.00', '400.00', '50.00'),
('2021-08-09', 'Фильтр салонный', 'C777D', 'Автоспутник', '300.00', '350.00', '50.00'),
('2021-08-11', 'Амортизатор передний', 'D888C', 'Аркона', '3300.00', '4000.00', '700.00'),
('2021-08-10', 'Колодки тормозные задние', 'A999D', 'Емекс', '1200.00','1600.00', '400.00');

INSERT work_order (work_order_number, startdate, enddate, work_quantity, work_amount,
auto_part_quantity, auto_part_amount, discount_on_work, total_cost, wage_percentage, recommendation)
VALUES
('1', '2021-08-11 16:00:00', '2021-08-11 19:00:00', '1', '800.00', '1', '1000.00', '5.00',
'1710.00', '45.00', 'Техническое обслуживание по регламенту');