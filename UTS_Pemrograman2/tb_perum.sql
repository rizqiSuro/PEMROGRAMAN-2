-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 24 Apr 2020 pada 15.21
-- Versi server: 10.4.8-MariaDB
-- Versi PHP: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perumahan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_perum`
--

CREATE TABLE `tb_perum` (
  `No` int(11) NOT NULL,
  `Nama Perumahan` varchar(100) NOT NULL,
  `Alamat` varchar(150) NOT NULL,
  `No Telp` varchar(13) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Pengembang` varchar(50) NOT NULL,
  `Tipe` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_perum`
--

INSERT INTO `tb_perum` (`No`, `Nama Perumahan`, `Alamat`, `No Telp`, `Email`, `Pengembang`, `Tipe`) VALUES
(1, 'kk', 'kalwet', '09873345', 'fsfsdfsd@gmail.com', 'wrewr', '1');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
