START TRANSACTION;

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `department` varchar(255) DEFAULT NULL,
                            `name` varchar(255) DEFAULT NULL,
                            `email` varchar(255) DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci AUTO_INCREMENT=100 COMMENT='employee table';

INSERT INTO `employee` (`id`, `department`, `name`, `email`) VALUES
(1, 'Front Office', 'Phil', 'admin@4loop.co.uk'),
(2, 'Back Office', 'Phil', 'admin@4loop.co.uk'),
(3, 'Support', 'No_Reply', 'support@email.com');

COMMIT;