CREATE TABLE t_order(
  order_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  product_id VARCHAR(255) NOT NULL ,
  customer  VARCHAR(255) NOT NULL ,
  number INT NOT NULL
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

