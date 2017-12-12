-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 16.13
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1101`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1101`
--

CREATE TABLE `cv_1101` (
  `id` bigint(20) NOT NULL,
  `alamat_cv` varchar(255) DEFAULT NULL,
  `nama_cv` varchar(100) NOT NULL,
  `tanggal_cv` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `cv_1101`
--

INSERT INTO `cv_1101` (`id`, `alamat_cv`, `nama_cv`, `tanggal_cv`) VALUES
(1, 'pku', 'abc', '10 november 2017'),
(2, 'pku', 'xzy', '11 november 2017'),
(3, 'jkt', 'opq', '12 november 2017');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1101`
--

CREATE TABLE `nilai_1101` (
  `id` bigint(20) NOT NULL,
  `nama_cv` varchar(255) DEFAULT NULL,
  `nilai_cv` varchar(255) DEFAULT NULL,
  `cv_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1101`
--

INSERT INTO `nilai_1101` (`id`, `nama_cv`, `nilai_cv`, `cv_id`) VALUES
(12, 'abc', '70', 1),
(13, 'xzy', '69', 2),
(14, 'opq', '90', 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1101`
--
ALTER TABLE `cv_1101`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_n91mamhhjlwu0887ufyt3f30o` (`nama_cv`);

--
-- Indexes for table `nilai_1101`
--
ALTER TABLE `nilai_1101`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKrluks8vxyk9ek9x5n2pe6493u` (`cv_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1101`
--
ALTER TABLE `cv_1101`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `nilai_1101`
--
ALTER TABLE `nilai_1101`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `nilai_1101`
--
ALTER TABLE `nilai_1101`
  ADD CONSTRAINT `FKrluks8vxyk9ek9x5n2pe6493u` FOREIGN KEY (`cv_id`) REFERENCES `cv_1101` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
