-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 26, 2022 at 06:25 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `agencytravel`
--

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `S_no` int(3) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `membership_id` int(4) DEFAULT NULL,
  `date_of_joining` date DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `mobile_no` varchar(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `wallet_amt` int(7) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rent_details`
--

CREATE TABLE `rent_details` (
  `s_no` int(3) NOT NULL,
  `cust_name` varchar(20) DEFAULT NULL,
  `membership_id` int(10) NOT NULL,
  `issue_date` date DEFAULT NULL,
  `return_date` date DEFAULT NULL,
  `issued_by` varchar(20) NOT NULL,
  `staff_id` int(5) NOT NULL,
  `veh_name` varchar(20) DEFAULT NULL,
  `veh_model` varchar(20) DEFAULT NULL,
  `veh_no` varchar(20) NOT NULL,
  `issue_status` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `staffmembers`
--

CREATE TABLE `staffmembers` (
  `S_no` int(3) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `name` varchar(20) NOT NULL,
  `staff_id` int(4) DEFAULT NULL,
  `date_of_joining` date DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `mobile_no` varchar(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `staff_working_status` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `veh_details`
--

CREATE TABLE `veh_details` (
  `S_no` int(3) NOT NULL,
  `vehicle_no` varchar(6) DEFAULT NULL,
  `veh_comp` varchar(20) DEFAULT NULL,
  `veh_model` varchar(20) DEFAULT NULL,
  `veh_status` varchar(30) DEFAULT NULL,
  `seating_cap` int(2) DEFAULT NULL,
  `price_per_day` int(5) DEFAULT NULL,
  `issued_by` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `members`
--
ALTER TABLE `members`
  ADD PRIMARY KEY (`S_no`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `membership_id` (`membership_id`);

--
-- Indexes for table `rent_details`
--
ALTER TABLE `rent_details`
  ADD PRIMARY KEY (`s_no`);

--
-- Indexes for table `staffmembers`
--
ALTER TABLE `staffmembers`
  ADD PRIMARY KEY (`S_no`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `staff_id` (`staff_id`);

--
-- Indexes for table `veh_details`
--
ALTER TABLE `veh_details`
  ADD PRIMARY KEY (`S_no`),
  ADD UNIQUE KEY `vehicle_no` (`vehicle_no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `members`
--
ALTER TABLE `members`
  MODIFY `S_no` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `rent_details`
--
ALTER TABLE `rent_details`
  MODIFY `s_no` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
--
-- AUTO_INCREMENT for table `staffmembers`
--
ALTER TABLE `staffmembers`
  MODIFY `S_no` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `veh_details`
--
ALTER TABLE `veh_details`
  MODIFY `S_no` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
