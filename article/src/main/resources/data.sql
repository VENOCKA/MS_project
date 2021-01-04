DROP TABLE IF EXISTS article;
 
CREATE TABLE article (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  categorie VARCHAR(250) NOT NULL,
  auteur VARCHAR(250) NOT NULL,
  date DATETIME NOT NULL,
  contenu VARCHAR(250) NOT NULL,
  idCommentaire INT NOT NULL,
);
 
INSERT INTO article (categorie, auteur, date, contenu, idCommentaire) VALUES
  ('Laurent', 'laurent','Laurent.laurent@gmail.com','test',1),
  ('Sophie', 'sophie','sophie.sophie@gmail.com','test',1),
  ('Agathe', 'agathe','agathe.agathe@gmail.com','test',1);