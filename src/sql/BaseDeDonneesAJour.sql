-- phpMyAdmin SQL Dump
-- version 4.4.1.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost:3306
-- Généré le :  Sam 03 Février 2018 à 16:26
-- Version du serveur :  5.5.42
-- Version de PHP :  5.6.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de données :  `notesdefrais`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `email_admin` varchar(50) NOT NULL,
  `mdp_admin` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `admin`
--

INSERT INTO `admin` (`id_admin`, `email_admin`, `mdp_admin`) VALUES
(1, 'lionel@gmail.com', 'lionel');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `id_societe` int(11) NOT NULL,
  `nom_societe` varchar(50) NOT NULL,
  `adresse_societe` varchar(50) NOT NULL,
  `email_societe` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`id_societe`, `nom_societe`, `adresse_societe`, `email_societe`) VALUES
(1, 'Samsung', '123 avenue ST-Denis 93100 St-Denis', 'samsung@samsung.com'),
(2, 'Adidas', '76 Boulevard Saint-Martin 75006 Paris', 'adidas@adidas.com');

-- --------------------------------------------------------

--
-- Structure de la table `demandeavance`
--

CREATE TABLE `demandeavance` (
  `iddemande` int(11) NOT NULL,
  `date` date NOT NULL,
  `type` varchar(50) NOT NULL,
  `montant` double NOT NULL,
  `id_salarie` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `demandeavance`
--

INSERT INTO `demandeavance` (`iddemande`, `date`, `type`, `montant`, `id_salarie`) VALUES
(1, '2018-02-02', 'avance sur espèces', 200, 1);

-- --------------------------------------------------------

--
-- Structure de la table `hebergement`
--

CREATE TABLE `hebergement` (
  `id_heberg` int(11) NOT NULL,
  `cause_herberg` varchar(50) NOT NULL,
  `montant_heberg` double NOT NULL,
  `montantAnnexes_heberg` double NOT NULL,
  `date_heberg` date NOT NULL,
  `id_salarie` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `hebergement`
--

INSERT INTO `hebergement` (`id_heberg`, `cause_herberg`, `montant_heberg`, `montantAnnexes_heberg`, `date_heberg`, `id_salarie`) VALUES
(1, 'Distance > 50 km', 200, 50, '2018-01-29', 1);

-- --------------------------------------------------------

--
-- Structure de la table `kilometrique`
--

CREATE TABLE `kilometrique` (
  `id_km` int(11) NOT NULL,
  `date_km` date NOT NULL,
  `depart_km` varchar(50) NOT NULL,
  `arrivee_km` varchar(50) NOT NULL,
  `distance_km` int(11) NOT NULL,
  `puissance` int(11) NOT NULL,
  `id_salarie` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `kilometrique`
--

INSERT INTO `kilometrique` (`id_km`, `date_km`, `depart_km`, `arrivee_km`, `distance_km`, `puissance`, `id_salarie`) VALUES
(1, '2018-02-01', 'Epinay sous Senart', 'La Roche sur Yon', 350, 7, 1);

-- --------------------------------------------------------

--
-- Structure de la table `restaurant`
--

CREATE TABLE `restaurant` (
  `id_rest` int(11) NOT NULL,
  `date_rest` date NOT NULL,
  `montant_rest` double NOT NULL,
  `nom_societe` varchar(50) NOT NULL,
  `id_salarie` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `restaurant`
--

INSERT INTO `restaurant` (`id_rest`, `date_rest`, `montant_rest`, `nom_societe`, `id_salarie`) VALUES
(1, '2018-01-29', 200, '[Samsung]', 1);

-- --------------------------------------------------------

--
-- Structure de la table `salarie`
--

CREATE TABLE `salarie` (
  `id_salarie` int(11) NOT NULL,
  `nom_salarie` varchar(50) NOT NULL,
  `prenom_salarie` varchar(50) NOT NULL,
  `email_salarie` varchar(50) NOT NULL,
  `mdp_salarie` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `salarie`
--

INSERT INTO `salarie` (`id_salarie`, `nom_salarie`, `prenom_salarie`, `email_salarie`, `mdp_salarie`) VALUES
(1, 'lionem', 'mbenda', 'lionel@gmail.com', 'lionel');

-- --------------------------------------------------------

--
-- Structure de la table `taxi`
--

CREATE TABLE `taxi` (
  `id_taxi` int(11) NOT NULL,
  `date_taxi` date NOT NULL,
  `depart_taxi` varchar(50) NOT NULL,
  `arrivee_taxi` varchar(50) NOT NULL,
  `montant_taxi` double NOT NULL,
  `nom_societe` varchar(50) NOT NULL,
  `id_salarie` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `taxi`
--

INSERT INTO `taxi` (`id_taxi`, `date_taxi`, `depart_taxi`, `arrivee_taxi`, `montant_taxi`, `nom_societe`, `id_salarie`) VALUES
(1, '2018-02-01', 'Paris', 'Tours', 250, '[Samsung]', 0);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id_societe`);

--
-- Index pour la table `demandeavance`
--
ALTER TABLE `demandeavance`
  ADD PRIMARY KEY (`iddemande`);

--
-- Index pour la table `hebergement`
--
ALTER TABLE `hebergement`
  ADD PRIMARY KEY (`id_heberg`);

--
-- Index pour la table `kilometrique`
--
ALTER TABLE `kilometrique`
  ADD PRIMARY KEY (`id_km`);

--
-- Index pour la table `restaurant`
--
ALTER TABLE `restaurant`
  ADD PRIMARY KEY (`id_rest`);

--
-- Index pour la table `salarie`
--
ALTER TABLE `salarie`
  ADD PRIMARY KEY (`id_salarie`);

--
-- Index pour la table `taxi`
--
ALTER TABLE `taxi`
  ADD PRIMARY KEY (`id_taxi`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `id_societe` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `demandeavance`
--
ALTER TABLE `demandeavance`
  MODIFY `iddemande` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `hebergement`
--
ALTER TABLE `hebergement`
  MODIFY `id_heberg` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `kilometrique`
--
ALTER TABLE `kilometrique`
  MODIFY `id_km` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `restaurant`
--
ALTER TABLE `restaurant`
  MODIFY `id_rest` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `salarie`
--
ALTER TABLE `salarie`
  MODIFY `id_salarie` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `taxi`
--
ALTER TABLE `taxi`
  MODIFY `id_taxi` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;