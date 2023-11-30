
-- -----------------------------------------------------
-- Schema golf
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS golf ;
USE golf ;

-- -----------------------------------------------------
-- Table admin
-- -----------------------------------------------------
DROP TABLE IF EXISTS admin ;

CREATE TABLE IF NOT EXISTS admin (
  id_admin VARCHAR(20) NOT NULL,
  mdp_admin VARCHAR(20) NOT NULL,
  PRIMARY KEY (id_admin));


-- -----------------------------------------------------
-- Table arbitre
-- -----------------------------------------------------
DROP TABLE IF EXISTS arbitre ;

CREATE TABLE IF NOT EXISTS arbitre (
  id_arbitre VARCHAR(20) NOT NULL,
  nom_arbitre VARCHAR(20) NOT NULL,
  prenom_arbitre VARCHAR(20) NOT NULL,
  mdp_arbitre VARCHAR(20) NOT NULL,
  date_nai DATE NOT NULL,
  email_arbitre VARCHAR(30) NOT NULL,
  cin_arbitre BIGINT NOT NULL,
  date_ins_arbitre DATETIME NOT NULL,
  salaire FLOAT NOT NULL,
  grade VARCHAR(40) NULL NOT NULL,
  sexe CHAR(1) NULL DEFAULT NULL,
  PRIMARY KEY (id_arbitre),
  UNIQUE INDEX cin_arbitre (cin_arbitre ASC) VISIBLE);


-- -----------------------------------------------------
-- Table terrain
-- -----------------------------------------------------
DROP TABLE IF EXISTS terrain ;

CREATE TABLE IF NOT EXISTS terrain (
  id_terrain INT NOT NULL,
  nom_terrain VARCHAR(50) NULL DEFAULT NULL,
  nbr_trous INT NOT NULL,
  espace FLOAT NOT NULL,
  PRIMARY KEY (id_terrain));


-- -----------------------------------------------------
-- Table type_compt
-- -----------------------------------------------------
DROP TABLE IF EXISTS type_compt ;

CREATE TABLE IF NOT EXISTS type_compt (
  id_type INT NOT NULL,
  nom_type VARCHAR(30) NOT NULL,
  recompense FLOAT NOT NULL,
  PRIMARY KEY (id_type));


-- -----------------------------------------------------
-- Table competition
-- -----------------------------------------------------
DROP TABLE IF EXISTS competition ;

CREATE TABLE IF NOT EXISTS competition (
  id_compt INT NOT NULL,
  id_type INT NULL DEFAULT NULL,
  id_terrain INT NOT NULL,
  nom_compt VARCHAR(30) NULL DEFAULT NULL,
  date_compt DATE NOT NULL,
  id_arbitre VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (id_compt),
  INDEX fk_terr_idx (id_terrain ASC) VISIBLE,
  INDEX k_type_idx (id_type ASC) VISIBLE,
  INDEX fk (id_arbitre ASC) VISIBLE,
  CONSTRAINT fk
    FOREIGN KEY (id_arbitre)
    REFERENCES arbitre (id_arbitre)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT fk_terr
    FOREIGN KEY (id_terrain)
    REFERENCES terrain (id_terrain)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT k_type
    FOREIGN KEY (id_type)
    REFERENCES type_compt (id_type)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table entraineur
-- -----------------------------------------------------
DROP TABLE IF EXISTS entraineur ;

CREATE TABLE IF NOT EXISTS entraineur (
  id_entraineur VARCHAR(20) NOT NULL,
  nom_entraineur VARCHAR(20) NOT NULL,
  prenom_entraineur VARCHAR(20) NOT NULL,
  mdp_entraineur VARCHAR(20) NOT NULL,
  date_nai DATE NULL DEFAULT NULL,
  email_entraineur VARCHAR(30) NULL DEFAULT NULL,
  cin_entraineur BIGINT NOT NULL,
  date_ins_entraineur DATETIME NULL DEFAULT NULL,
  salaire FLOAT NOT NULL,
  sexe CHAR(1) NULL DEFAULT NULL,
  PRIMARY KEY (id_entraineur),
  UNIQUE INDEX cin_entraineur (cin_entraineur ASC) VISIBLE);


-- -----------------------------------------------------
-- Table joueur
-- -----------------------------------------------------
DROP TABLE IF EXISTS joueur ;

CREATE TABLE IF NOT EXISTS joueur (
  id_joueur VARCHAR(20) NOT NULL,
  nom_joueur VARCHAR(20) NOT NULL,
  prenom_joueur VARCHAR(20) NOT NULL,
  mdp_joueur VARCHAR(20) NOT NULL,
  date_nai DATE NULL DEFAULT NULL,
  email_joueur VARCHAR(30) NULL DEFAULT NULL,
  cin_joueur BIGINT NOT NULL,
  date_ins_joueur DATETIME NULL DEFAULT NULL,
  abonement VARCHAR(20) NULL DEFAULT NULL,
  main_prefere CHAR(1) NULL DEFAULT NULL,
  id_entraineur VARCHAR(20) NULL DEFAULT NULL,
  sexe CHAR(1) NULL DEFAULT NULL,
  PRIMARY KEY (id_joueur),
  UNIQUE INDEX cin_joueur (cin_joueur ASC) VISIBLE,
  INDEX fk_entr (id_entraineur ASC) VISIBLE,
  CONSTRAINT fk_entr
    FOREIGN KEY (id_entraineur)
    REFERENCES entraineur (id_entraineur)
    ON DELETE SET NULL
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table reservation
-- -----------------------------------------------------
DROP TABLE IF EXISTS reservation ;

CREATE TABLE IF NOT EXISTS reservation (
  id_reser BIGINT NOT NULL,
  date_reser DATE NULL DEFAULT NULL,
  duree_reser TIME NULL DEFAULT NULL,
  id_joueur VARCHAR(20) NULL DEFAULT NULL,
  id_terrain INT NULL DEFAULT NULL,
  PRIMARY KEY (id_reser));


-- -----------------------------------------------------
-- Table score
-- -----------------------------------------------------
DROP TABLE IF EXISTS score ;

CREATE TABLE IF NOT EXISTS score (
  id_joueur VARCHAR(20) NOT NULL,
  id_compt INT NOT NULL,
  pts INT NULL DEFAULT NULL,
  verifié TINYINT(1) NULL DEFAULT NULL,
  PRIMARY KEY (id_joueur, id_compt),
  INDEX fk_enc_idx (id_compt ASC) VISIBLE,
  CONSTRAINT fk_enc
    FOREIGN KEY (id_compt)
    REFERENCES competition (id_compt)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT fk_enj
    FOREIGN KEY (id_joueur)
    REFERENCES joueur (id_joueur)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table seance_e
-- -----------------------------------------------------
DROP TABLE IF EXISTS seance_e ;

CREATE TABLE IF NOT EXISTS seance_e (
  id_seance INT NOT NULL,
  date_seance DATE NULL DEFAULT NULL,
  duree_seance TIME NULL DEFAULT NULL,
  id_joueur VARCHAR(20) NULL DEFAULT NULL,
  id_terrain INT NULL DEFAULT NULL,
  id_entraineur VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (id_seance),
  INDEX fk_e (id_entraineur ASC) VISIBLE,
  INDEX fk_j (id_joueur ASC) VISIBLE,
  INDEX fk_t (id_terrain ASC) VISIBLE,
  CONSTRAINT fk_e
    FOREIGN KEY (id_entraineur)
    REFERENCES entraineur (id_entraineur)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT fk_j
    FOREIGN KEY (id_joueur)
    REFERENCES joueur (id_joueur)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT fk_t
    FOREIGN KEY (id_terrain)
    REFERENCES terrain (id_terrain)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

USE golf ;

-- -----------------------------------------------------
-- procedure get_gangant
-- -----------------------------------------------------

USE golf;
DROP procedure IF EXISTS get_gangant;

DELIMITER //
CREATE PROCEDURE get_gangant(IN competition_id INT, OUT player_nom VARCHAR(20),out player_prenom varchar(20))
BEGIN
    SELECT k.nom_joueur,k.prenom_joueur INTO player_nom,player_prenom
    FROM joueur k
    INNER JOIN score s ON s.id_joueur = k.id_joueur
    WHERE s.id_compt = competition_id AND s.verifié = 1
    ORDER BY s.pts DESC
    LIMIT 1;
    select player_nom,player_prenom;
END;
//

DELIMITER ;
