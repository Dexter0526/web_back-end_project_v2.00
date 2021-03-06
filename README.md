# Construction Company Web
> 건설회사 웹 페이지로 관리자 권한으로 사업 실적, 특허, 뉴스등 업데이트 관리 시스템

[![Video Label](/Reference/mainView.PNG)](https://www.youtube.com/watch?v=GElavPh4Hv4)

- [이미지 클릭] : 유튜브 링크(https://www.youtube.com/watch?v=GElavPh4Hv4)
---------------------------------------

### ENVIROMENT
- java8
- tomcat9.0
- spring 5.0.7
- oracle11g(DB), HikariCP(DBCP)
- css, js : [bootstrapk] http://bootstrapk.com/

---------------------------------------

### PATTERN(MVC -> Spring 5Layer)

#### MVC
- View
- Controller
- Command
- DAO
- DTO

#### Spring 5Layer
- View(Presentation Layer)
- Controller(Control Layer)
- Command and Service(Business Logic Layer)
- Mapper(Persistence Layer)
- DTO(Domain Model Layer)
        
---------------------------------------

### TECH
#### 1. 사업분야
- 각 테이블 관리를 따로 하되, DB테이블 동일 구조로 페이지 호출시 하나의 세션 키에 덮어씌우는 방식
- 페이지 호출시 페이지 이름에 따라 테이블명 판별(mybatis) 동일 쿼리 사용
- 페이지 최초 호출시 DB 테이블 호출 후 모달 기능을 통해 각 사업에 맞는 테이블 내의 행 호출
- 관리자 권한(admin=2)으로 등록관리  

#### 2. 특허 보드
- 관리자 권한(admin=2)으로 등록관리  

#### 3. 뉴스
- 뉴스 테이블의 페이징(10개), 상세 보기 창과 페이지 테이블 창 일치
- 최고 조회수 4개 게시판 상단에 배치  

#### 4. 회원관리
- 전체 회원 리스트(페이징)
- 각 관리 번호에 따라 통계
- 관리 번호에 따른 회원 리스트(페이징 유지)
- 동적 쿼리 사용
- 회원가입 email ajax 사용(중복 email check)  

#### 5. 상담내역
- 사용자별 리스트 페이지 조회, 전체 리스트 페이징
- 사용자 상담 등록, 수정, 삭제시 관리자 메일로 해당 내용 발송
- 관리자 답변 등록시 사용자에게 메일 발송
- 답변 등록 완료시 수정, 삭제 불가능

#### 6. 오픈 api
- 공공데이터 포털 : 나라장터 오픈 api json 형식 파싱

#### 7. mybatis
- 동적 쿼리 및 sql 관리를 위해 적용  

#### 8. library
- hikariCP : tomcat DBCP -> hikariCP 변경 (hikariCP 깃허브 참조)
<img src="https://github.com/brettwooldridge/HikariCP/wiki/HikariCP-bench-2.6.0.png">  

