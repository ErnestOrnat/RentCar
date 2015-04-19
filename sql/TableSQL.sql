DROP schema IF EXISTS `avtosalon`;
create schema avtosalon;

CREATE TABLE  `user_table` (
  `user_id` INT(100)  NOT NULL AUTO_INCREMENT,
  `fullname` VARCHAR(25) NOT NULL,
  `password` VARCHAR(20) NOT NULL,
   PRIMARY KEY (`user_id`)
 )  AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;


CREATE TABLE  `car_table` (
 `car_id` INT(100)  NOT NULL AUTO_INCREMENT,
 `user_id` INT(100)  NOT NULL,
 `brand` VARCHAR(100) NOT NULL,
 `model` VARCHAR(255) NOT NULL,
 `classcar` VARCHAR(255) NOT NULL,
 `color` VARCHAR(255) NOT NULL,
 `transmition` VARCHAR(255) NOT NULL,
 `price` INT(255) NOT NULL,
 `status` INT(255) NOT NULL,
 `car_DATE` DATE NOT NULL,
 PRIMARY KEY (`car_id`) ,
 FOREIGN KEY (`user_id`) REFERENCES `user_table` (`user_id`)
)  AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

CREATE TABLE   `history_table` (
 `car_id` INT(100)  NOT NULL ,
 `user_id` INT(100)  NOT NULL ,
PRIMARY KEY (`car_id`,`user_id`),
FOREIGN KEY (`user_id`) REFERENCES `user_table` (`user_id`),
FOREIGN KEY (`car_id`) REFERENCES `car_table` (`car_id`)
) AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;
