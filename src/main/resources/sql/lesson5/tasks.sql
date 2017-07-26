use posts;
# select all user comments

select login, text from user us
join comments c on us.userId = c.userId and us.login = "aleiva";

# select all rows from left table and existing from second
select * from user
left join comments on user.userId = comments.userId;

select * from comments
right join user on user.userId = comments.userId;

select * from user 
join posts on user.userId = posts.userId;

select title, text, postedAt, name from posts p
join post_category pc on p.postId = pc.postId
join category c on pc.categoryId = c.categoryId;

select u.name, lastName, title, text, c.name from user u
join posts p on u.userId = p.postId
join post_category pc on pc.postId = p.postId
join category c on c.categoryId = pc.categoryId;

