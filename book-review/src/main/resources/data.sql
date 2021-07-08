DROP TABLE IF EXISTS review;

CREATE TABLE review
(
    id      INT AUTO_INCREMENT PRIMARY KEY,
    book_id INT NOT NULL,
    stars   INT NOT NULL,
    author  VARCHAR(250) NOT NULL,
    content VARCHAR(250) NOT NULL
);

INSERT INTO review (id, book_id, stars, author, content)
VALUES (1, 2, 5, 'User 1', 'Fantastic book!'),
       (2, 3, 3, 'User 2', 'Not the best book Author 3 has written...'),
       (3, 7, 2, 'User 3', 'It is so boring, I actually had to force myself to finish it.'),
       (4, 6, 1, 'User 4', 'Too expensive!'),
       (5, 3, 4, 'User 5', 'Highly recommend this book, but it is a little bit too big.'),
       (6, 10, 1, 'User 6', 'Didn`t like the book.'),
       (7, 5, 5, 'User 7', 'It is so good, I have already read it twice!'),
       (8, 10, 4, 'User 8', 'A bit boring in the middle, but the ending is impressive!'),
       (9, 4, 2, 'User 9', 'I`d prefer to watch the movie.'),
       (10, 1, 3, 'User 10', 'Not bad, but not impressive either.');
