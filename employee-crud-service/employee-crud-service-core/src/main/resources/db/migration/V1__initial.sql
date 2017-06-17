CREATE TABLE employee (
  id BIGINT AUTO_INCREMENT,
  fullname VARCHAR,
  position VARCHAR,
  department VARCHAR,
  employment_start_date TIMESTAMP,
  employment_end_date TIMESTAMP
);

INSERT INTO employee (fullname, position, department, employment_start_date, employment_end_date)
VALUES (
  'EMPLOYEEV EMPLOY EMPLOYEEVICH',
  'VERY_IMPORTANT_POSITION',
  'VERY_COOL_DEPARTMENT',
  PARSEDATETIME('2010-10-10 10:10:10', 'yyyy-MM-dd hh:mm:ss'),
  PARSEDATETIME('2011-11-11 11:11:11',  'yyyy-MM-dd hh:mm:ss')
);