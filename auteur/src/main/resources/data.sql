DROP TABLE IF EXISTS auteurs;
 
CREATE TABLE auteurs (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL
);
 
INSERT INTO auteurs (name, password, email) VALUES
  ('Laurent', 'laurent','Laurent.laurent@gmail.com'),
  ('Sophie', 'sophie','sophie.sophie@gmail.com'),
  ('Agathe', 'agathe','agathe.agathe@gmail.com');