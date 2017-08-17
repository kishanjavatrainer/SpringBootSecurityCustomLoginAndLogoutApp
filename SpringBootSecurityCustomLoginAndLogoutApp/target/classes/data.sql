  INSERT INTO `users` (`username`, `password`, `full_name`, `role`, `country`, `enabled`) VALUES
	('sean', '$2a$10$VtOI/NbNfv.K7rUBiEMSHOnb6sXyf2xvziCYJ7qqZXLLBcpc6Bmvy', 'Sean Murphy', 'ROLE_ADMIN', 'US', 1),
	('martin', '$2a$10$n0I0Fm5JK.9mBm71pcn/9updlvOtqz3QfYwdA8dGttBesurqYFda6', 'Martin Bingel', 'ROLE_USER', 'India', 1); 

   INSERT INTO `topics` (`topic_id`, `title`, `category`) VALUES
	(1, 'Spring Rest Boot', 'Spring Boot'),
	(2, 'Spring Boot Security', 'Spring Boot'),
	(3, 'Spring MVC Framework', 'Spring Framework');