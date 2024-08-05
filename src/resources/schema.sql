CREATE TABLE IF NOT EXISTS `studentList` (
  `sid` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone_number` varchar(20) NOT NULL,
  `address` varchar(20) NOT NULL,
);

CREATE TABLE IF NOT EXISTS `SubjectList` (
  `sid` int NOT NULL,
   `subject_name` varchar PRIMARY KEY,
  `s_credit` varchar(100) NOT NULL,
  ` s_type` boolean NOT NULL,
  `s_theory` varchar NOT NULL,
   `s_lab` int NOT NULL,
    `sinternal` int NOT NULL,
     ` s_endsem` boolean NOT NULL,
     `practical` int  NOT NULL,
      `professor` varchar(20) NOT NULL,

);
