insert into user_details (id, birth_date, name)
values (1001, current_date(), 'Shreyas'),
(1002, current_date(), 'Ishi'),
(1003, current_date(), 'Jyoti'),
(1004, current_date(), 'Sanjiv');

insert into post(id, description, user_id)
values(2001, 'I want to learn spring boot', 1001),
(2002, 'I want to learn Vert.x', 1001),
(2003, 'I want to learn Vert.x', 1002);