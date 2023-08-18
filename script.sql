-- Database: exercice2JDBC

-- DROP DATABASE IF EXISTS "exercice2JDBC";

-- CREATE DATABASE "exercice2JDBC"
--     WITH
--     OWNER = postgres
--     ENCODING = 'UTF8'
--     LC_COLLATE = 'French_France.1252'
--     LC_CTYPE = 'French_France.1252'
--     TABLESPACE = pg_default
--     CONNECTION LIMIT = -1
--     IS_TEMPLATE = False;


CREATE TABLE Client (
    id  serial PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
	phone_number varchar(50),
    number_identity VARCHAR(50)
);

CREATE TABLE Session_bank (
    id serial PRIMARY KEY,
    client_id INT,
    solde_number DECIMAL(10, 2),
    FOREIGN KEY (client_id) REFERENCES Client(id)
);

CREATE TABLE Operation (
    id serial PRIMARY KEY,
    session_id INT NOT NULL,
    rising_number DECIMAL(10, 2),
    statut_title VARCHAR(255),
    FOREIGN KEY (session_id) REFERENCES Session_bank(id)
);