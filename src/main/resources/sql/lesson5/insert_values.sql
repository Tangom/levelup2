use posts;
insert into user 
	(login, name, lastName)
values
	("iv", "Ivan", "Pertov"),
    ("psi", "Petr", "Sidorov"),
    ("aleiva", "Aleksey", "Ivanov"),
    ("dmiche", "Dmitry", "Chernov"),
    ("anakuz", "Anastasia", "Kuzmenko");
    
insert into category 
	(name)
values
	("Military"),
    ("Science"),
    ("IT"),
    ("Programming"),
    ("Design"),
    ("Test");
    
insert into posts 
	(title, text, postedAt, userId)
values 
	("Wow!Look at this", "We are going to sea", now(), 3),
    ("Second post", "Added second post to this database", now(), 4);
    

insert into post_category 
	(categoryId, postId)
values
	(2, 1),
    (4, 2);
    
insert into comments 
	(text, commentedAt, userId, postId)
values
	("This is great!", now(), 1, 1),
    ("So boring!", now(), 2, 2),
    ("WTFFFFF!", now(), 3, 2);
    
    