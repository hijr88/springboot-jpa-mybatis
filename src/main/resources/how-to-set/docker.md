####명령어 참고
- https://blog.naver.com/hijr88/222106310893
#### Docker Quickstart Terminal 실행
1. MySQL 설치하기
 - 이미지 리스트 확인
   - docker images
 - docker hub에서 mysql 검색
   - docker search mysql
   - https://hub.docker.com/search?q=mysql&type=image
 - 이미지 다운로드
   - docker pull mysql:8.0.17
   - 이미지 리스트 확인
2. 컨테이너 띄우기
 - docker run 방법 보다는 설정 파일로 띄우기
 - -> docker-compose.yml 참고
3. 컨테이너 확인
 - docker ps
 - docker ps -a
4. 컨테이너 실행
 - docker exec -it yh_mysql bash
   
-> mysql.md 