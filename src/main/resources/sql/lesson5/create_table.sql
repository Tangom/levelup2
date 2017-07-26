use posts;
create table if not exists user (
	userId int auto_increment primary key,
    login varchar(15) not null unique,
    name varchar(30),
    lastName varchar(30)
);

create table if not exists posts(
	postId int primary key auto_increment,
    title varchar(100) not null,
    text varchar(300) not null,
    postedAt timestamp not null,
    userId int not null,
    foreign key (userId) references user(userId)
);

create table if not exists comments(
	commentId int primary key auto_increment,
    text varchar(300) not null,
    commentedAt timestamp not null,
    userId int not null,
    postId int not null,
    foreign key (userId) references user(userId),
    foreign key (postId) references posts(postId)
);

create table if not exists category(
	categoryId int primary key auto_increment,
    name varchar(20)
);

create table if not exists post_category(
	categoryId int not null,
    postId int not null,
    constraint post_category_pk primary key (categoryId, postId),
    foreign key (categoryId) references category(categoryId),
    foreign key (postId) references posts(postId)
);