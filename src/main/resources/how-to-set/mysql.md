##MySQL 설정

- mysql -u root -p
- 1234
- 타임존 확인
  - select @@global.time_zone, @@session.time_zone;
  - select now();  
- db 생성
  - show databases;
  - create database woo;
- 유저 생성
  - CREATE USER 'yh'@'%' IDENTIFIED BY '1234';
- 권한 부여
  - SHOW GRANTS FOR yh;
  - GRANT ALL PRIVILEGES ON *.* TO 'yh'@'%';
  - FLUSH PRIVILEGES;
- 유저 변경 위한 나가기 exit

- 생성한 유저로 접속
  - mysql -u yh -p
- 테이블 생성
  - show databases;
  - use woo;
  - show tables;  
  - -> Account.sql
    

