DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS customer_address;

CREATE TABLE customer
(
  id integer NOT NULL,
  name text NOT NULL,
  CONSTRAINT pk_customer PRIMARY KEY (id)
);

CREATE TABLE customer_address
(
  id integer NOT NULL,
  customer_id integer NOT NULL,
  address text NOT NULL,
  CONSTRAINT pk_customer_address PRIMARY KEY (id),
  CONSTRAINT fk_customer FOREIGN KEY (customer_id)
  REFERENCES customer (id) MATCH SIMPLE
  ON UPDATE NO ACTION ON DELETE CASCADE
);

INSERT INTO customer values(1, 'Gerard Lundy');

INSERT INTO customer_address values(1, 1, 'Belfast, Co.Antrim, N.Ireland');
INSERT INTO customer_address values(2, 1, 'Killyleagh, Co.Down, N.Ireland');