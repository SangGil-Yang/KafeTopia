drop table member;
drop table myhistory;
drop table reviewboard;
drop table menu;
drop table cafe;
drop table topping;
drop table store;


CREATE TABLE Member(
	id varchar(50) not null,
	name varchar(50) not null,
	pw varchar(30) not null,
	email varchar(40) not null,
	tel varchar(30) not null,
	point int(10) not null default '0',
	primary key(id)
);

CREATE TABLE MyHistory(
	seq int(10) not null auto_increment,
	cafeid varchar(30) not null,
	id varchar(50) not null,
	menu varchar(100) not null,
	price int(10) not null default '0',
	location varchar(30) not null,
	date datetime,
	primary key(seq),
	foreign key(cafeid) references Cafe(cafeid),
	foreign key(id) references Member(id)
);


CREATE TABLE ReviewBoard (
	seq int(10) not null auto_increment,
	author varchar(50) not null,
	cafeid varchar(30) not null,
	title varchar(100) not null,
	content varchar(200) not null,
	count int(10) not null default '0',
	likecount int(10) not null default '0',
	img varchar(100),
	date datetime,
	primary key(seq),
	foreign key(author) references Member(id),
	foreign key(cafeid) references Cafe(cafeid)
);

CREATE TABLE cafe (
	cafeid varchar(30) not null,
	name varchar(50) not null,
	primary key(cafeid)
);

CREATE TABLE STORE (
	address varchar(200) not null,
	cafeid varchar(30) not null,
	city varchar(20) not null,
	location varchar(30) not null,
	primary key(address),
	foreign key(cafeid) references Cafe(cafeid)
);

CREATE TABLE Menu (
	seq int(10) not null auto_increment,
	cafeid varchar(30) not null,
	name varchar(100) not null,
	price int(10) not null default '0',
	img varchar(100),
	type varchar(50) not null,
	sales int(10) not null,
	common varchar(100),
	primary key(seq),
	foreign key(cafeid) references Cafe(cafeid)
);

CREATE TABLE Topping (
	name varchar(20) not null,
	price int(10) not null,
	type varchar(50),
	primary key(name)
);
