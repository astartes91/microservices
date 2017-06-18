CREATE TABLE public.employee (
  id BIGINT AUTO_INCREMENT PRIMARY KEY ,
  fullname VARCHAR NOT NULL ,
  position VARCHAR NOT NULL ,
  department VARCHAR NOT NULL ,
  employment_start_date TIMESTAMP NOT NULL,
  employment_end_date TIMESTAMP,
  status VARCHAR NOT NULL DEFAULT 'ACTIVE'
);

INSERT INTO public.employee (fullname, position, department, employment_start_date, employment_end_date)
VALUES (
  'EMPLOYEEV EMPLOY EMPLOYEEVICH',
  'VERY_IMPORTANT_POSITION',
  'VERY_COOL_DEPARTMENT',
  PARSEDATETIME('2010-10-10 10:10:10', 'yyyy-MM-dd hh:mm:ss'),
  PARSEDATETIME('2011-11-11 11:11:11',  'yyyy-MM-dd hh:mm:ss'),
);