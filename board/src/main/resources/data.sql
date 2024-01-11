INSERT INTO board (board_name)
VALUES
    ('자유 게시판'),
    ('개발 개시판'),
    ('일상 게시판'),
    ('사건사고 게시판');

INSERT INTO article(board_id, title, content, password)
VALUES
    (1,'Hi','hello','1'),
    (2,'my','name','aa'),
    (3,'is','yang','1a'),
    (4,'nice','to meet','1')