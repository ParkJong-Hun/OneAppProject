CREATE TABLE User(
    id INTEGER,
    nickname varchar(20),
    created TimeStamp,
    updated TimeStamp
    primary key(id)
);

CREATE TABLE Comment(
    id INTEGER,
    commenter varchar(20),
    postId INTEGER,
    created TimeStamp,
    updated TimeStamp
    primary key(id)
);