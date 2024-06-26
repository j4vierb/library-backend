-- Define database schema

CREATE TABLE IF NOT EXISTS book(
  book_id int,
  title varchar(80),
  description varchar(80),
  available boolean,
  publicationDate varchar(80),
  constraint PK_BOOK PRIMARY KEY(book_id)
);

CREATE TABLE IF NOT EXISTS character(
  character_id int,
  name varchar(80),
  description varchar(80),
  constraint PK_CHARACTER PRIMARY KEY(character_id)
);

CREATE TABLE IF NOT EXISTS editorial(
  editorial_id int,
  name varchar(80),
  constraint PK_EDITORIAL PRIMARY KEY(editorial_id)
);

CREATE TABLE IF NOT EXISTS comment(
  comment_id int,
  header varchar(80),
  body varchar(80),
  constraint PK_COMMENT PRIMARY KEY(comment_id)
);

CREATE TABLE IF NOT EXISTS author(
  author_id int,
  firstname varchar(80),
  lastname varchar(80),
  constraint PK_AUTHOR PRIMARY KEY(author_id)
);

CREATE TABLE IF NOT EXISTS critic(
  critic_id int,
  firstname varchar(80),
  lastname varchar(80),
  constraint PK_CRITIC PRIMARY KEY(critic_id)
);

-- Add relations between the tables

-- One to one relationships
ALTER TABLE book
add column character_id int;

ALTER TABLE book
ADD CONSTRAINT FK_BOOK_CHARACTER
FOREIGN KEY (character_id)
REFERENCES character(character_id);

-- One to many relationships
-- To implement this relationship you need to implement
-- a foreign key from the "one table" to the "many table"

-- editorial (1) - book (*)
ALTER TABLE book
add column editorial_id int;

ALTER TABLE book
ADD CONSTRAINT FK_EDITORIAL_BOOK
FOREIGN KEY (editorial_id)
REFERENCES editorial(editorial_id);

-- book (1) - comments (*)
ALTER TABLE comment
ADD COLUMN book_id int;

ALTER TABLE comment
ADD CONSTRAINT FK_BOOK_COMMENT
FOREIGN KEY (book_id)
REFERENCES book(book_id);

-- critic (1) - comment (*)
ALTER TABLE comment
ADD COLUMN critic_id int;

ALTER TABLE comment
ADD CONSTRAINT FK_CRITIC_COMMENT
FOREIGN KEY (critic_id)
REFERENCES critic(critic_id);

-- Many to many relationships
-- To implement this relationships you need the concept of an associative table, a data
-- entity whose sole purpose is to maintain the relationship between two or more
-- tables in a relational database

CREATE TABLE authorBook(
  author_id int,
  book_id int,
  CONSTRAINT PK_AUTHOR_BOOK PRIMARY KEY (author_id, book_id)
);

ALTER TABLE authorBook
ADD CONSTRAINT FK_AUTHORBOOK_AUTHOR
FOREIGN KEY (author_id)
REFERENCES author(author_id);

ALTER TABLE authorBook
ADD CONSTRAINT FK_AUTHORBOOK_BOOK
FOREIGN KEY (book_id)
REFERENCES book(book_id);

