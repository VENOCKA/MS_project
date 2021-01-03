DROP TABLE IF EXISTS categorie;
 
CREATE TABLE categorie (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);
 
INSERT INTO categorie (name) VALUES
  ('Histoire'),
  ('Jeux vidéo'),
  ('Film');