create table books (
isbn char(13) not null,
title varchar(255),
authors varchar(255),
pageCount varchar(255),
haveRead char(3),
notes varchar(255),
thumbnail varchar(255)
);
ALTER TABLE books ADD PRIMARY KEY(isbn);