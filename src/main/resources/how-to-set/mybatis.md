1. application.yml 설정 작성
   - datasource는 jpa에서 이미 작성했을것.
2. Mapper Scan 위해 Application.java에서 @MapperScan 애노테이션 선언
3. mapper.xml 작성 
   - 위에서 설정한 경로에 생성할것
   - namespace는 패키지 포함 인터페이스 경로 
4. 인터페이스에 @Mapper, dto에 @Alias
5. legacy와 다르게 클래스 impl 안하고 바로 xml과 연결되어 실행
6. 테스트 실행


### 번외
- log 포맷을 아름답게!
  - 의존성 'org.bgee.log4jdbc-log4j2:log4jdbc-log4j2-jdbc4.1:1.16' 추가
  - datasource - url 앞에 prefix 붙이기
  - resources 하위에 log4jdbc.log4j2.properties 추가
  - app.yml에 jdbc 로그레벨 설정