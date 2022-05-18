-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Gép: localhost
-- Létrehozás ideje: 2022. Máj 18. 19:12
-- Kiszolgáló verziója: 10.4.18-MariaDB
-- PHP verzió: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `konyvtar_db`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `Kiadok`
--

CREATE TABLE `Kiadok` (
  `KiadoID` int(5) NOT NULL,
  `KiadoNev` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `KolcsonzottKonyvek`
--

CREATE TABLE `KolcsonzottKonyvek` (
  `KolcsonzesID` int(5) NOT NULL,
  `LeltariSzam` int(5) NOT NULL,
  `TagID` varchar(9) NOT NULL,
  `KolcsonzesDatum` date NOT NULL DEFAULT current_timestamp(),
  `Visszahozva` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `Konyvek`
--

CREATE TABLE `Konyvek` (
  `KonyvID` int(5) NOT NULL,
  `Cim` varchar(50) NOT NULL,
  `KiadoID` int(5) NOT NULL,
  `Besorolas` varchar(50) NOT NULL,
  `Iro` varchar(50) NOT NULL,
  `Nyelv` varchar(50) NOT NULL,
  `Ar` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `Leltar`
--

CREATE TABLE `Leltar` (
  `KonyvID` int(5) NOT NULL,
  `Leltariszam` int(5) NOT NULL,
  `Hely` varchar(50) NOT NULL,
  `Kiadva` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `login_certs`
--

CREATE TABLE `login_certs` (
  `ID` int(5) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- A tábla adatainak kiíratása `login_certs`
--

INSERT INTO `login_certs` (`ID`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `Tagok`
--

CREATE TABLE `Tagok` (
  `TagID` int(5) DEFAULT NULL,
  `Nev` varchar(50) NOT NULL,
  `SzulDatum` varchar(50) NOT NULL,
  `Lakhely` varchar(50) NOT NULL,
  `SzemelyID` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `Kiadok`
--
ALTER TABLE `Kiadok`
  ADD PRIMARY KEY (`KiadoID`);

--
-- A tábla indexei `KolcsonzottKonyvek`
--
ALTER TABLE `KolcsonzottKonyvek`
  ADD PRIMARY KEY (`KolcsonzesID`);

--
-- A tábla indexei `Konyvek`
--
ALTER TABLE `Konyvek`
  ADD PRIMARY KEY (`KonyvID`);

--
-- A tábla indexei `Leltar`
--
ALTER TABLE `Leltar`
  ADD PRIMARY KEY (`Leltariszam`);

--
-- A tábla indexei `login_certs`
--
ALTER TABLE `login_certs`
  ADD PRIMARY KEY (`ID`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `Kiadok`
--
ALTER TABLE `Kiadok`
  MODIFY `KiadoID` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT a táblához `KolcsonzottKonyvek`
--
ALTER TABLE `KolcsonzottKonyvek`
  MODIFY `KolcsonzesID` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT a táblához `Konyvek`
--
ALTER TABLE `Konyvek`
  MODIFY `KonyvID` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT a táblához `Leltar`
--
ALTER TABLE `Leltar`
  MODIFY `Leltariszam` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT a táblához `login_certs`
--
ALTER TABLE `login_certs`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
