DROP TABLE IF EXISTS discount;

CREATE TABLE discount
(
    genre VARCHAR(250) PRIMARY KEY,
    percent INT NOT NULL
);

INSERT INTO discount (genre, percent)
VALUES  ('fantasy', 20),
        ('adventure', 5),
        ('detective', 15),
        ('horror', 2);

