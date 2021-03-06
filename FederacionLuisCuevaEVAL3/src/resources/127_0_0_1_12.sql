-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-05-2022 a las 20:49:16
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 7.3.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdfederacion`
--
CREATE DATABASE IF NOT EXISTS `bdfederacion` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bdfederacion`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `atletas`
--

CREATE TABLE `atletas` (
  `id` int(11) NOT NULL,
  `altura` float NOT NULL,
  `peso` float NOT NULL,
  `idpersona` int(11) NOT NULL,
  `idequipo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `atletas`
--

INSERT INTO `atletas` (`id`, `altura`, `peso`, `idpersona`, `idequipo`) VALUES
(1, 1.7, 89.9, 1, NULL),
(2, 1.98, 72.8, 2, NULL),
(3, 1.69, 65.7, 3, NULL),
(4, 1.9, 89.4, 4, NULL),
(5, 1.87, 68, 5, NULL),
(6, 1.81, 67.5, 6, NULL),
(7, 1.79, 89.9, 7, NULL),
(8, 1.86, 65.8, 8, NULL),
(9, 1.9, 72, 9, NULL),
(10, 1.81, 84.8, 10, NULL),
(11, 1.76, 89.5, 11, NULL),
(12, 1.99, 67.7, 12, NULL),
(13, 1.6, 65.6, 13, NULL),
(14, 1.86, 79.2, 14, NULL),
(15, 1.79, 84.4, 15, NULL),
(16, 1.81, 68.9, 16, NULL),
(17, 1.99, 69.3, 17, NULL),
(18, 1.8, 65, 18, NULL),
(19, 1.69, 68.8, 19, NULL),
(20, 1.79, 84.6, 20, NULL),
(21, 1.86, 69.2, 21, NULL),
(22, 1.89, 69, 22, NULL),
(23, 1.99, 79.4, 23, NULL),
(24, 1.82, 69.7, 24, NULL),
(25, 1.79, 87.8, 25, NULL),
(26, 1.8, 69.3, 26, NULL),
(27, 1.89, 65, 27, NULL),
(28, 1.99, 68.2, 28, NULL),
(29, 1.85, 89.8, 29, NULL),
(30, 1.89, 79.8, 30, NULL),
(31, 1.76, 64.5, 31, NULL),
(32, 1.81, 69, 32, NULL),
(33, 1.99, 88.1, 33, NULL),
(34, 1.6, 69.5, 34, NULL),
(35, 1.86, 67.7, 35, NULL),
(36, 1.89, 64.9, 36, NULL),
(37, 1.71, 89.8, 37, NULL),
(38, 1.89, 68.6, 38, NULL),
(39, 1.89, 79.6, 39, NULL),
(40, 1.65, 69.4, 40, NULL),
(41, 1.89, 65, 41, NULL),
(42, 1.7, 89.5, 42, NULL),
(43, 1.79, 69.1, 43, NULL),
(44, 1.81, 78.8, 44, NULL),
(45, 1.99, 89, 45, NULL),
(46, 1.86, 69.7, 46, NULL),
(47, 1.69, 89.1, 47, NULL),
(48, 1.79, 69.5, 48, NULL),
(49, 1.7, 79.2, 49, NULL),
(50, 1.86, 69.9, 50, NULL),
(51, 1.81, 88, 51, NULL),
(52, 1.99, 64.1, 52, NULL),
(53, 1.69, 69.2, 53, NULL),
(54, 1.86, 85.5, 54, NULL),
(55, 1.8, 69.1, 55, NULL),
(56, 1.89, 89.5, 56, NULL),
(57, 1.71, 68, 57, NULL),
(58, 1.79, 65.8, 58, NULL),
(59, 1.66, 89.9, 59, NULL),
(60, 1.69, 69.4, 60, NULL),
(61, 1.8, 89, 61, NULL),
(62, 1.8, 69.3, 62, NULL),
(63, 1.89, 69.1, 63, NULL),
(64, 1.89, 68, 64, NULL),
(65, 1.79, 89, 65, NULL),
(66, 1.89, 79.1, 66, NULL),
(67, 1.89, 69, 67, NULL),
(68, 1.69, 69.7, 68, NULL),
(69, 1.8, 69.8, 69, NULL),
(70, 1.89, 88.4, 70, NULL),
(71, 1.79, 64.3, 71, NULL),
(72, 1.89, 67, 72, NULL),
(73, 1.9, 65.1, 73, NULL),
(74, 1.81, 69, 74, NULL),
(75, 1.8, 89, 75, NULL),
(76, 1.69, 68.9, 76, NULL),
(77, 1.89, 64.3, 77, NULL),
(78, 1.79, 69.2, 78, NULL),
(79, 1.79, 67.7, 79, NULL),
(80, 1.8, 87.8, 80, NULL),
(81, 1.81, 69.6, 81, NULL),
(82, 1.69, 79.4, 82, NULL),
(83, 1.86, 69.5, 83, NULL),
(84, 1.7, 88.9, 84, NULL),
(85, 1.89, 67.2, 85, NULL),
(86, 1.69, 65, 86, NULL),
(87, 1.79, 69, 87, NULL),
(88, 1.87, 85.5, 88, NULL),
(89, 1.89, 69.3, 89, NULL),
(90, 1.62, 67.2, 90, NULL),
(91, 1.89, 68.7, 91, NULL),
(92, 1.99, 65.8, 92, NULL),
(93, 1.69, 89.5, 93, NULL),
(94, 1.89, 69.8, 94, NULL),
(95, 1.89, 67, 95, NULL),
(96, 1.79, 64.7, 96, NULL),
(97, 1.62, 69.8, 97, NULL),
(98, 1.89, 79, 98, NULL),
(99, 1.86, 77.6, 99, NULL),
(100, 1.82, 69.8, 100, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `abreviatura` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`id`, `nombre`, `abreviatura`) VALUES
(1, 'Júnior', 'J'),
(2, 'Sénior', 'S'),
(3, 'Especial', 'E');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipos`
--

CREATE TABLE `equipos` (
  `id` int(11) NOT NULL,
  `anioincripcion` year(4) NOT NULL,
  `idmanager` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lugares`
--

CREATE TABLE `lugares` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `ubicacion` varchar(50) NOT NULL,
  `airelibre` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `lugares`
--

INSERT INTO `lugares` (`id`, `nombre`, `ubicacion`, `airelibre`) VALUES
(1, 'Las Mestas', 'Gijón', 1),
(2, 'Centro Ciudad', 'Gijón', 1),
(3, 'Parque San Francisco', 'Oviedo', 1),
(4, 'Puerto', 'Avilés', 1),
(5, 'Pabellon deportivo Aviles', 'Avilés', 0),
(6, 'Centro Ciudad', 'Oviedo', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `managers`
--

CREATE TABLE `managers` (
  `id` int(11) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `idpersona` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `metales`
--

CREATE TABLE `metales` (
  `id` int(11) NOT NULL,
  `pureza` float NOT NULL,
  `asignada` tinyint(1) NOT NULL DEFAULT 0,
  `idoro` int(11) DEFAULT NULL,
  `idplata` int(11) DEFAULT NULL,
  `idbronce` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `metales`
--

INSERT INTO `metales` (`id`, `pureza`, `asignada`, `idoro`, `idplata`, `idbronce`, `fecha`) VALUES
(1, 0.85, 0, 1, NULL, NULL, NULL),
(2, 0.71, 0, NULL, 1, NULL, NULL),
(3, 0.78, 0, NULL, NULL, 1, NULL),
(4, 0.45, 1, 2, NULL, NULL, '2022-05-02'),
(5, 0.6, 1, NULL, 2, NULL, '2022-05-04'),
(6, 0.37, 1, NULL, NULL, 2, '2022-05-03');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `participantes`
--

CREATE TABLE `participantes` (
  `id` int(11) NOT NULL,
  `dorsal` int(3) NOT NULL,
  `calle` char(1) NOT NULL,
  `tiempo` time DEFAULT NULL,
  `penalizacion` tinyint(1) NOT NULL DEFAULT 0,
  `otros` varchar(500) DEFAULT NULL,
  `idprueba` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `participantes`
--

INSERT INTO `participantes` (`id`, `dorsal`, `calle`, `tiempo`, `penalizacion`, `otros`, `idprueba`) VALUES
(1, 1, '1', NULL, 0, 'jdghjdghjdghj', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `patrocinadores`
--

CREATE TABLE `patrocinadores` (
  `id` int(11) NOT NULL,
  `idresponsable` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `web` varchar(150) DEFAULT NULL,
  `dotacion` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `patrocinadores`
--

INSERT INTO `patrocinadores` (`id`, `idresponsable`, `nombre`, `web`, `dotacion`) VALUES
(1, 1, 'ALSA', 'www.alsa.es', 500),
(2, 2, 'Ayto. Gijón', 'www.gijon.es', 250),
(3, 3, 'Universidad de Oviedo', 'www.uniovi.es', 350.5),
(4, 4, 'CIFP LaLaboral', 'www.cifplalaboral.es', 255.99);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE `personas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `fechanac` date NOT NULL,
  `nifnie` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`id`, `nombre`, `telefono`, `fechanac`, `nifnie`) VALUES
(1, 'Jesus Perez Garcia', '697032897', '1993-07-31', '27184136EE'),
(2, 'Carlos Fernandez Avia', '685432819', '1980-11-14', 'Z2951204XX'),
(3, 'Luis Martinez Diaz', '695342871', '1998-01-08', '25031466ZZ'),
(4, 'Carmen Corrales Vega', '645532881', '1976-06-16', '35525353JJ'),
(5, 'Daniel Ruiz Blanco', '921342819', '2000-02-13', '08397958ZZ'),
(6, 'Pedro Gonzalez Puig', '690552712', '1977-07-20', '45070350XX'),
(7, 'Martin Ibarra Encina', '683542893', '1981-05-12', 'Y8645085CC'),
(8, 'Dinia Pino Novell', '685302577', '1978-04-17', '64104890AA'),
(9, 'Maria Frisuelos Ruiz', '605437884', '1979-03-01', '03424035WW'),
(10, 'Hector Garcia Perez', '607332815', '2001-12-11', '99185055QQ'),
(11, 'Carmen Perez Foz', '945707801', '1982-04-29', 'Y7323050WW'),
(12, 'Francisco Plaza Ayuso', '694432818', '1990-01-10', '32765678QQ'),
(13, 'Maria Jesus Perez Salinas', '635714801', '1983-12-09', '97424933SS'),
(14, 'Laura Castro Llorente', '695432805', '1989-05-21', 'X7592180HH'),
(15, 'Gabriela del Rio Severo', '681232816', '2001-02-28', '56743664LL'),
(16, 'Carla Gallo Pedroso', '687342207', '1984-05-30', 'Y4876028LL'),
(17, 'Alberto Perez Lago', '695382349', '1988-06-29', '39503961NN'),
(18, 'Aser Linares Nobel', '685337834', '1991-11-07', 'Z8316394JJ'),
(19, 'Daniel Suarez Melano', '680734341', '1985-06-30', '41102537LL'),
(20, 'Raquel Gonzalez Banda', '985334823', '2000-07-06', '13538622VV'),
(21, 'Maria Calvo Egea', '930332814', '1986-06-15', 'Y4649348GG'),
(22, 'Hugo Blasco Rato', '684035810', '1987-08-28', 'Y4822833TT'),
(23, 'Andrés Martinez Real', '671332800', '1988-07-05', '52305619PP'),
(24, 'Raul Velazquez Garcia', '690352881', '1987-06-09', '12229911YY'),
(25, 'Asuncion Garcia Perez', '603330818', '2001-09-28', '17472923FF'),
(26, 'Juan Jesus Ruiz Volantes', '620932819', '1986-10-08', 'X2713769EE'),
(27, 'Cecilio Gallo Garcia', '684012713', '1988-01-04', 'X5002764BB'),
(28, 'Sandra Vega Cuena', '605384817', '1985-02-22', 'Z6049056SS'),
(29, 'Sergio Poo Martinez', '608332113', '1989-07-03', 'Z6677201FF'),
(30, 'Pedro Toca Gutierrez', '985432713', '2002-10-02', '97983890AA'),
(31, 'Borja Perez Suarez', '680332801', '1982-12-27', '95555853FF'),
(32, 'Ander Santos Higuera', '682452807', '1990-10-01', '82783662SS'),
(33, 'Dominica Gonzalez Perez', '650237810', '1980-01-23', '79498609YY'),
(34, 'Laura Suarez Blasco', '680345912', '1990-02-01', 'X1689237WW'),
(35, 'Almudena Diaz Maltras', '685482881', '2002-06-25', '25340895RR'),
(36, 'Nicolasa Serrano Soto', '647002899', '1991-05-31', '64193092TT'),
(37, 'Maria Jesus Ibarra Montoya', '678305812', '1981-06-30', '91957994SS'),
(38, 'Yolanda Lopez Garcia', '684372315', '1992-11-15', '39232202KK'),
(39, 'Renata Prieto Fernandez', '605399813', '1975-07-14', '77727922CC'),
(40, 'Antonia Garcia Herrera', '675332884', '2000-12-24', '08950223AA'),
(41, 'Diego Diez Murcia', '645572813', '1993-04-08', '79448459LL'),
(42, 'Agatha Fernandez Marron', '644382856', '1994-04-08', 'Z6362552KK'),
(43, 'Luis Plaza Martinez', '607332436', '1977-05-29', 'X2387733BB'),
(44, 'Alberto Corrales Suarez', '629332834', '1978-06-13', '42105482AA'),
(45, 'Pedro del Val Almendro', '678433858', '2001-12-28', 'X6999745VV'),
(46, 'Teresa Gonzalez Garcia', '615432888', '1995-12-26', '19262790ZZ'),
(47, 'Luisa Pina Soto', '605332720', '1969-03-25', 'Y8550187CC'),
(48, 'Jana Blanco Garcia', '635337841', '1996-05-24', '31023630BB'),
(49, 'Cristina Pedrosa Garcia', '605372412', '1997-01-27', 'Z7910725HH'),
(50, 'Daniel Pares Mendez', '985357417', '2001-12-25', '35802654AA'),
(51, 'Martin Velazquez Melendez', '913232811', '1996-10-26', 'X5640435FF'),
(52, 'Candida Rato Linares', '605332872', '1990-04-23', '24474332DD'),
(53, 'Sebastian Castro Castro', '985372809', '1992-07-25', 'X8688631JJ'),
(54, 'Carlos del Pino Inda', '685332817', '1983-03-12', '38439209EE'),
(55, 'Lucia Santos Fresneda', '949332872', '2000-06-24', '52270684XX'),
(56, 'Andrés Diaz Lago', '609332927', '1969-12-08', '72980983MM'),
(57, 'Brigida Fernandez Fernandez', '675332819', '1987-12-27', '73727978YY'),
(58, 'Carlos Melano Largo', '685932817', '1998-10-11', '18350189FF'),
(59, 'Maria Rox Suarez', '985538470', '1995-01-23', '29475525JJ'),
(60, 'Francisco Calvo Real', '604832312', '2001-12-08', '50367980GG'),
(61, 'Diego Egea Gutierres', '987932838', '1991-05-10', '78208566XX'),
(62, 'Pablo Diez Vega', '67133591', '1978-01-28', 'Y1758825YY'),
(63, 'Hector Suarez Gonzalez', '670358827', '1992-08-21', 'Y1609578YY'),
(64, 'Andrés Gonzalez Res', '935332801', '1989-12-29', '43471148KK'),
(65, 'Juan Encina Panes', '609132923', '2001-11-20', '18269546WW'),
(66, 'Asier Mendez Blanco', '642782839', '1980-04-02', '28788465DD'),
(67, 'Luis Rajoy Garcia', '695282109', '1998-06-19', '66211725SS'),
(68, 'Rafael Pis Pedrosa', '685332913', '1981-05-09', '79204204RR'),
(69, 'Federico Ruiz Fresno', '685722391', '1997-06-30', '46671151BB'),
(70, 'Rosa Feroz Corbato', '645332823', '2002-12-31', '42909469WW'),
(71, 'Rai Jordan Riego Garcia', '918332819', '1980-07-21', '66975078KK'),
(72, 'Carmen Lago Par', '649332871', '1996-03-20', '97843368BB'),
(73, 'Asuncion Serrano Vega', '635839771', '1979-06-10', 'Z2707685SS'),
(74, 'Marina Castro Garcia', '659331801', '1995-01-18', 'Z8555951WW'),
(75, 'Maria Ana de la Riva Suarez', '685932890', '2000-02-10', '67172867XX'),
(76, 'Maria Salas Fernandez', '675331829', '1994-07-01', 'X2293232VV'),
(77, 'Amaya Fernandez Muela', '97539218', '1978-04-02', 'Y2544788JJ'),
(78, 'Sandra Peres Robles', '929352801', '1993-08-08', '76517927DD'),
(79, 'Ursula Suarez Diaz', '645702851', '1990-06-17', 'Y8861516KK'),
(80, 'Gabriel Julio Sol', '985372858', '2000-02-16', '38784755QQ'),
(81, 'Carlos Culto Medina', '6230328710', '1992-03-08', '34487252VV'),
(82, 'Natasha Puig Garcia', '625159802', '1998-12-15', '96241332VV'),
(83, 'Dario Linares Gutierrez', '988032859', '1977-04-03', '90852353FF'),
(84, 'Diego Bolo Garcia', '659373808', '1976-11-04', 'Z6538331BB'),
(85, 'Alberto Agujas Montoya', '930832821', '2001-12-07', '90514904ZZ'),
(86, 'Martin Garcia Garcia', '698501818', '1991-05-04', '14607818NN'),
(87, 'Jorge Ibarretxe Gallo', '680392814', '1975-04-08', '48868669VV'),
(88, 'Daniel Muela Velazquez', '682312841', '1974-02-05', '83097887ZZ'),
(89, 'Teresa Martinez Vivo', '680372845', '1990-07-16', '37441134DD'),
(90, 'Borja Lagos Perez', '699332873', '2002-01-15', '29908580RR'),
(91, 'Andrés Gonzalez Galvez', '989300959', '1989-12-08', 'Y6359761EE'),
(92, 'Maria Garcia de Vivar', '938332801', '1973-08-14', '24690168JJ'),
(93, 'Juan Robles Sello', '689337821', '1971-06-05', '20548833NN'),
(94, 'Pablo Leon Garcia', '685409720', '1989-01-06', '32778256JJ'),
(95, 'Amalia del Pino Gutierrez', '910832839', '2001-12-30', '90815175CC'),
(96, 'Raul Plaza Corbato', '694937805', '1988-09-14', '17039814BB'),
(97, 'Padro Santos Diaz', '637339880', '1972-09-13', '08345111KK'),
(98, 'Juaquin Dalmata Serrano', '929330831', '1987-09-08', '92724132TT'),
(99, 'Francisco Suarez Serrano', '970309833', '1986-04-26', '88821224PP'),
(100, 'Emma Fernandez Corral', '941272809', '2002-10-12', '85410682KK'),
(1001, 'Sonia Montoya Torna', '671250081', '1990-07-12', '29733812XX'),
(1002, 'Natalia Prado Aguja', '680235891', '1989-02-11', '49855958PP'),
(1003, 'Martin Puig Fernandez', '694382839', '1978-08-07', '94752983KK'),
(1004, 'Juan Alvarez Roig', '685732413', '1985-07-06', 'Z7500169NN'),
(1005, 'Carlos Diez Cobo', '675312945', '1989-09-08', 'Y6072270PP'),
(1006, 'Carmen Martinez Tazones', '958232831', '1990-10-21', '84577138CC'),
(1007, 'Hector Calvo Blanco', '688257823', '1984-02-11', 'X3034373YY'),
(1008, 'Pablo Linares Altamira', '697131831', '1990-01-08', '69650971WW'),
(1009, 'Hugo Fuero Ruiz', '951832859', '1978-10-10', 'Z1182828NN'),
(1010, 'Luis Garcia Gonzalez', '681952317', '1983-08-09', '54161963EE'),
(1011, 'Carmen Diaz Castro', '61734815', '1979-10-07', 'Y6521791VV'),
(1012, 'Borja Vega Martinez', '688215870', '1979-07-10', '57979381SS'),
(1013, 'Carlos Garcia Perez', '650732808', '1982-05-20', '30730072WW'),
(1014, 'Maria Ruiz Fernandez', '652732818', '1981-02-21', '77712913FF'),
(1015, 'Emma del Rio Flores', '650732111', '1980-01-02', '15580165BB'),
(2001, 'Rosario Prado Blanco', '627943650', '1979-09-18', '49586708LL'),
(2002, 'Laura Torices Fernandez', '685334056', '1980-02-08', '19932413SS'),
(2003, 'Manuel Santiago Diez', '638135956', '1983-10-31', 'Y6223253LL'),
(2004, 'Alfredo Garcia Gallo', '608364550', '1981-03-28', 'X2408426GG'),
(2005, 'Ramon Garcia Lazo', '694267193', '1976-08-13', '75564453TT'),
(2006, 'Rosa Diez Lucas', '628324853', '1981-04-07', '77483039HH'),
(2007, 'Ana Ruiz Arenas', '629304871', '1988-11-04', 'X7352499CC'),
(2008, 'Alvaro Osorno Soto', '654768870', '1998-03-23', '13486677YY'),
(2009, 'Bernabe Ruiz Garcia', '623804841', '1978-11-14', '20709459YY'),
(2010, 'Elisabeth Salamanca Blanco', '669359871', '1980-04-07', '56608421QQ'),
(2011, 'Ana Ruiz Jurado', '609304772', '1985-12-25', '22878897SS'),
(2012, 'Maria Cuena Velazquez', '672340851', '1983-09-14', '77131100WW'),
(2013, 'Juana de la Riva Gutierrez', '629904871', '1989-01-09', '69092756CC'),
(2014, 'Damian Ortiz Arenas', '681331773', '1987-07-24', '92223222FF'),
(2015, 'Cesar Gutierrez Fernandez', '690302861', '1995-08-10', '85283417SS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pruebas`
--

CREATE TABLE `pruebas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `fecha` date NOT NULL,
  `idlugar` int(11) NOT NULL,
  `individual` tinyint(1) NOT NULL,
  `idpatrocinador` int(11) NOT NULL,
  `idresultado` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pruebas`
--

INSERT INTO `pruebas` (`id`, `nombre`, `fecha`, `idlugar`, `individual`, `idpatrocinador`, `idresultado`) VALUES
(1, 'Prueba1', '2022-06-10', 1, 1, 3, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `responsables`
--

CREATE TABLE `responsables` (
  `id` int(11) NOT NULL,
  `idpersona` int(11) NOT NULL,
  `telefonoprof` varchar(10) NOT NULL,
  `horaini` time DEFAULT NULL,
  `horafin` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `responsables`
--

INSERT INTO `responsables` (`id`, `idpersona`, `telefonoprof`, `horaini`, `horafin`) VALUES
(1, 1011, '902422202', '00:00:00', '23:59:00'),
(2, 1012, '985181105', '09:00:00', '18:00:00'),
(3, 1013, '985103000', '08:30:00', '20:00:00'),
(4, 1014, '985185503', '08:30:00', '10:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `resultados`
--

CREATE TABLE `resultados` (
  `id` int(11) NOT NULL,
  `definitivo` tinyint(1) NOT NULL DEFAULT 0,
  `fechahora` datetime DEFAULT NULL,
  `idoro` int(11) DEFAULT NULL,
  `idplata` int(11) DEFAULT NULL,
  `idbronce` int(11) DEFAULT NULL,
  `idpuesto1` int(11) DEFAULT NULL,
  `idpuesto2` int(11) DEFAULT NULL,
  `idpuesto3` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `atletas`
--
ALTER TABLE `atletas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKPERSONA` (`idpersona`),
  ADD KEY `FKEQUIPO` (`idequipo`);

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `abreviatura` (`abreviatura`),
  ADD UNIQUE KEY `abreviatura_2` (`abreviatura`),
  ADD UNIQUE KEY `abreviatura_3` (`abreviatura`);

--
-- Indices de la tabla `equipos`
--
ALTER TABLE `equipos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKMANAGER` (`idmanager`);

--
-- Indices de la tabla `lugares`
--
ALTER TABLE `lugares`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `managers`
--
ALTER TABLE `managers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_PERSONA` (`idpersona`);

--
-- Indices de la tabla `metales`
--
ALTER TABLE `metales`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `participantes`
--
ALTER TABLE `participantes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_prueba` (`idprueba`);

--
-- Indices de la tabla `patrocinadores`
--
ALTER TABLE `patrocinadores`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nombre` (`nombre`),
  ADD KEY `fk_responsables` (`idresponsable`);

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nifnie` (`nifnie`);

--
-- Indices de la tabla `pruebas`
--
ALTER TABLE `pruebas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_lugares` (`idlugar`),
  ADD KEY `fk_patrocinadores` (`idpatrocinador`),
  ADD KEY `FK_resultados` (`idresultado`);

--
-- Indices de la tabla `responsables`
--
ALTER TABLE `responsables`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_personas` (`idpersona`);

--
-- Indices de la tabla `resultados`
--
ALTER TABLE `resultados`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_puesto1` (`idpuesto1`),
  ADD KEY `FK_puesto2` (`idpuesto2`),
  ADD KEY `FK_puesto3` (`idpuesto3`),
  ADD KEY `FK_oro` (`idoro`),
  ADD KEY `FK_plata` (`idplata`),
  ADD KEY `FK_bronce` (`idbronce`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `atletas`
--
ALTER TABLE `atletas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `equipos`
--
ALTER TABLE `equipos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `lugares`
--
ALTER TABLE `lugares`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `managers`
--
ALTER TABLE `managers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `participantes`
--
ALTER TABLE `participantes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `patrocinadores`
--
ALTER TABLE `patrocinadores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `personas`
--
ALTER TABLE `personas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2016;

--
-- AUTO_INCREMENT de la tabla `pruebas`
--
ALTER TABLE `pruebas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `responsables`
--
ALTER TABLE `responsables`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `resultados`
--
ALTER TABLE `resultados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `atletas`
--
ALTER TABLE `atletas`
  ADD CONSTRAINT `fkequipo` FOREIGN KEY (`idequipo`) REFERENCES `equipos` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `fkpersona` FOREIGN KEY (`idpersona`) REFERENCES `personas` (`id`);

--
-- Filtros para la tabla `equipos`
--
ALTER TABLE `equipos`
  ADD CONSTRAINT `fk_manager` FOREIGN KEY (`idmanager`) REFERENCES `managers` (`id`);

--
-- Filtros para la tabla `managers`
--
ALTER TABLE `managers`
  ADD CONSTRAINT `FK_PERSONA` FOREIGN KEY (`idpersona`) REFERENCES `personas` (`id`);

--
-- Filtros para la tabla `participantes`
--
ALTER TABLE `participantes`
  ADD CONSTRAINT `FK_prueba` FOREIGN KEY (`idprueba`) REFERENCES `pruebas` (`id`);

--
-- Filtros para la tabla `patrocinadores`
--
ALTER TABLE `patrocinadores`
  ADD CONSTRAINT `fk_responsables` FOREIGN KEY (`idresponsable`) REFERENCES `responsables` (`id`);

--
-- Filtros para la tabla `pruebas`
--
ALTER TABLE `pruebas`
  ADD CONSTRAINT `FK_resultados` FOREIGN KEY (`idresultado`) REFERENCES `resultados` (`id`),
  ADD CONSTRAINT `fk_lugares` FOREIGN KEY (`idlugar`) REFERENCES `lugares` (`id`),
  ADD CONSTRAINT `fk_patrocinadores` FOREIGN KEY (`idpatrocinador`) REFERENCES `patrocinadores` (`id`);

--
-- Filtros para la tabla `responsables`
--
ALTER TABLE `responsables`
  ADD CONSTRAINT `FK_personas` FOREIGN KEY (`idpersona`) REFERENCES `personas` (`id`);

--
-- Filtros para la tabla `resultados`
--
ALTER TABLE `resultados`
  ADD CONSTRAINT `FK_bronce` FOREIGN KEY (`idbronce`) REFERENCES `metales` (`id`),
  ADD CONSTRAINT `FK_oro` FOREIGN KEY (`idoro`) REFERENCES `metales` (`id`),
  ADD CONSTRAINT `FK_plata` FOREIGN KEY (`idplata`) REFERENCES `metales` (`id`),
  ADD CONSTRAINT `FK_puesto1` FOREIGN KEY (`idpuesto1`) REFERENCES `participantes` (`id`),
  ADD CONSTRAINT `FK_puesto2` FOREIGN KEY (`idpuesto2`) REFERENCES `participantes` (`id`),
  ADD CONSTRAINT `FK_puesto3` FOREIGN KEY (`idpuesto3`) REFERENCES `participantes` (`id`);
--
-- Base de datos: `phpmyadmin`
--
CREATE DATABASE IF NOT EXISTS `phpmyadmin` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `phpmyadmin`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__bookmark`
--

CREATE TABLE `pma__bookmark` (
  `id` int(10) UNSIGNED NOT NULL,
  `dbase` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `user` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `label` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `query` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Bookmarks';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__central_columns`
--

CREATE TABLE `pma__central_columns` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_length` text COLLATE utf8_bin DEFAULT NULL,
  `col_collation` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_isNull` tinyint(1) NOT NULL,
  `col_extra` varchar(255) COLLATE utf8_bin DEFAULT '',
  `col_default` text COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Central list of columns';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__column_info`
--

CREATE TABLE `pma__column_info` (
  `id` int(5) UNSIGNED NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `column_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `comment` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `mimetype` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Column information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__designer_settings`
--

CREATE TABLE `pma__designer_settings` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `settings_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Settings related to Designer';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__export_templates`
--

CREATE TABLE `pma__export_templates` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `export_type` varchar(10) COLLATE utf8_bin NOT NULL,
  `template_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `template_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved export templates';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__favorite`
--

CREATE TABLE `pma__favorite` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Favorite tables';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__history`
--

CREATE TABLE `pma__history` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `timevalue` timestamp NOT NULL DEFAULT current_timestamp(),
  `sqlquery` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='SQL history for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__navigationhiding`
--

CREATE TABLE `pma__navigationhiding` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Hidden items of navigation tree';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__pdf_pages`
--

CREATE TABLE `pma__pdf_pages` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `page_nr` int(10) UNSIGNED NOT NULL,
  `page_descr` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='PDF relation pages for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__recent`
--

CREATE TABLE `pma__recent` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Recently accessed tables';

--
-- Volcado de datos para la tabla `pma__recent`
--

INSERT INTO `pma__recent` (`username`, `tables`) VALUES
('root', '[{\"db\":\"bdfederacion\",\"table\":\"resultados\"},{\"db\":\"bdfederacion\",\"table\":\"metales\"},{\"db\":\"bdfederacion\",\"table\":\"participantes\"},{\"db\":\"bdfederacion\",\"table\":\"pruebas\"},{\"db\":\"bdfederacion\",\"table\":\"personas\"},{\"db\":\"bdfederacion\",\"table\":\"equipos\"},{\"db\":\"bdfederacion\",\"table\":\"atletas\"},{\"db\":\"bdfederacion\",\"table\":\"lugares\"},{\"db\":\"bdfederacion\",\"table\":\"patrocinadores\"},{\"db\":\"bdfederacion\",\"table\":\"participante\"}]');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__relation`
--

CREATE TABLE `pma__relation` (
  `master_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Relation table';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__savedsearches`
--

CREATE TABLE `pma__savedsearches` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved searches';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__table_coords`
--

CREATE TABLE `pma__table_coords` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `pdf_page_number` int(11) NOT NULL DEFAULT 0,
  `x` float UNSIGNED NOT NULL DEFAULT 0,
  `y` float UNSIGNED NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table coordinates for phpMyAdmin PDF output';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__table_info`
--

CREATE TABLE `pma__table_info` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `display_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table information for phpMyAdmin';

--
-- Volcado de datos para la tabla `pma__table_info`
--

INSERT INTO `pma__table_info` (`db_name`, `table_name`, `display_field`) VALUES
('dbfederacion', 'patrocinadores', 'nombre'),
('dbfederacion', 'responsables', 'telefono');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__table_uiprefs`
--

CREATE TABLE `pma__table_uiprefs` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `prefs` text COLLATE utf8_bin NOT NULL,
  `last_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Tables'' UI preferences';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__tracking`
--

CREATE TABLE `pma__tracking` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `version` int(10) UNSIGNED NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `schema_snapshot` text COLLATE utf8_bin NOT NULL,
  `schema_sql` text COLLATE utf8_bin DEFAULT NULL,
  `data_sql` longtext COLLATE utf8_bin DEFAULT NULL,
  `tracking` set('UPDATE','REPLACE','INSERT','DELETE','TRUNCATE','CREATE DATABASE','ALTER DATABASE','DROP DATABASE','CREATE TABLE','ALTER TABLE','RENAME TABLE','DROP TABLE','CREATE INDEX','DROP INDEX','CREATE VIEW','ALTER VIEW','DROP VIEW') COLLATE utf8_bin DEFAULT NULL,
  `tracking_active` int(1) UNSIGNED NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Database changes tracking for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__userconfig`
--

CREATE TABLE `pma__userconfig` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `timevalue` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `config_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User preferences storage for phpMyAdmin';

--
-- Volcado de datos para la tabla `pma__userconfig`
--

INSERT INTO `pma__userconfig` (`username`, `timevalue`, `config_data`) VALUES
('root', '2022-05-18 18:48:59', '{\"Console\\/Mode\":\"collapse\",\"lang\":\"es\",\"NavigationWidth\":279,\"ThemeDefault\":\"pmahomme\"}');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__usergroups`
--

CREATE TABLE `pma__usergroups` (
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL,
  `tab` varchar(64) COLLATE utf8_bin NOT NULL,
  `allowed` enum('Y','N') COLLATE utf8_bin NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User groups with configured menu items';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma__users`
--

CREATE TABLE `pma__users` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Users and their assignments to user groups';

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pma__central_columns`
--
ALTER TABLE `pma__central_columns`
  ADD PRIMARY KEY (`db_name`,`col_name`);

--
-- Indices de la tabla `pma__column_info`
--
ALTER TABLE `pma__column_info`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `db_name` (`db_name`,`table_name`,`column_name`);

--
-- Indices de la tabla `pma__designer_settings`
--
ALTER TABLE `pma__designer_settings`
  ADD PRIMARY KEY (`username`);

--
-- Indices de la tabla `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_user_type_template` (`username`,`export_type`,`template_name`);

--
-- Indices de la tabla `pma__favorite`
--
ALTER TABLE `pma__favorite`
  ADD PRIMARY KEY (`username`);

--
-- Indices de la tabla `pma__history`
--
ALTER TABLE `pma__history`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username` (`username`,`db`,`table`,`timevalue`);

--
-- Indices de la tabla `pma__navigationhiding`
--
ALTER TABLE `pma__navigationhiding`
  ADD PRIMARY KEY (`username`,`item_name`,`item_type`,`db_name`,`table_name`);

--
-- Indices de la tabla `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  ADD PRIMARY KEY (`page_nr`),
  ADD KEY `db_name` (`db_name`);

--
-- Indices de la tabla `pma__recent`
--
ALTER TABLE `pma__recent`
  ADD PRIMARY KEY (`username`);

--
-- Indices de la tabla `pma__relation`
--
ALTER TABLE `pma__relation`
  ADD PRIMARY KEY (`master_db`,`master_table`,`master_field`),
  ADD KEY `foreign_field` (`foreign_db`,`foreign_table`);

--
-- Indices de la tabla `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_savedsearches_username_dbname` (`username`,`db_name`,`search_name`);

--
-- Indices de la tabla `pma__table_coords`
--
ALTER TABLE `pma__table_coords`
  ADD PRIMARY KEY (`db_name`,`table_name`,`pdf_page_number`);

--
-- Indices de la tabla `pma__table_info`
--
ALTER TABLE `pma__table_info`
  ADD PRIMARY KEY (`db_name`,`table_name`);

--
-- Indices de la tabla `pma__table_uiprefs`
--
ALTER TABLE `pma__table_uiprefs`
  ADD PRIMARY KEY (`username`,`db_name`,`table_name`);

--
-- Indices de la tabla `pma__tracking`
--
ALTER TABLE `pma__tracking`
  ADD PRIMARY KEY (`db_name`,`table_name`,`version`);

--
-- Indices de la tabla `pma__userconfig`
--
ALTER TABLE `pma__userconfig`
  ADD PRIMARY KEY (`username`);

--
-- Indices de la tabla `pma__usergroups`
--
ALTER TABLE `pma__usergroups`
  ADD PRIMARY KEY (`usergroup`,`tab`,`allowed`);

--
-- Indices de la tabla `pma__users`
--
ALTER TABLE `pma__users`
  ADD PRIMARY KEY (`username`,`usergroup`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pma__column_info`
--
ALTER TABLE `pma__column_info`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pma__history`
--
ALTER TABLE `pma__history`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  MODIFY `page_nr` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- Base de datos: `test`
--
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `test`;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
