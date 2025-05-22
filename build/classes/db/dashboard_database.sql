-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2025 at 04:17 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dashboard_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `dashboard_members`
--

CREATE TABLE `dashboard_members` (
  `member_id` int(20) NOT NULL,
  `member_name` varchar(255) NOT NULL,
  `member_password` varchar(255) NOT NULL,
  `member_position` varchar(20) NOT NULL,
  `member_email` varchar(255) NOT NULL,
  `member_contact` int(20) NOT NULL,
  `member_status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dashboard_members`
--

INSERT INTO `dashboard_members` (`member_id`, `member_name`, `member_password`, `member_position`, `member_email`, `member_contact`, `member_status`) VALUES
(1, 'Michael', 'iktsuarpok', 'Admin', 'betest@gmail.com', 912, 'Active'),
(4, 'test', 'NyaDNd1pMQRb3N+SYj/4GaZCRLU9DnRtQ4eXNJ1NpXg=', 'Admin', 'testtest', 435435345, 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `dashboard_products`
--

CREATE TABLE `dashboard_products` (
  `product_id` int(11) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `product_type` varchar(255) NOT NULL,
  `product_status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `recovery`
--

CREATE TABLE `recovery` (
  `member_id` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `token` varchar(255) NOT NULL,
  `ex-date` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dashboard_members`
--
ALTER TABLE `dashboard_members`
  ADD PRIMARY KEY (`member_id`);

--
-- Indexes for table `dashboard_products`
--
ALTER TABLE `dashboard_products`
  ADD PRIMARY KEY (`product_id`);

--
-- Indexes for table `recovery`
--
ALTER TABLE `recovery`
  ADD PRIMARY KEY (`member_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dashboard_members`
--
ALTER TABLE `dashboard_members`
  MODIFY `member_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `dashboard_products`
--
ALTER TABLE `dashboard_products`
  MODIFY `product_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `recovery`
--
ALTER TABLE `recovery`
  MODIFY `member_id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
