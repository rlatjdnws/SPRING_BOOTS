# 자바웹프로그래밍 프로젝트 - 깃허브

## Getting Started
This project is a starting point for a Web application.
- [프로젝트 메인 주소](https://github.com/rlatjdnws/SPRING_BOOTS)

## 2주차 수업 요약
1. 실습내용 - 자바 환경 설정, 어노테이션 활성화
2. 응용문제 - 두번째 hello 페이지 추가, 맵핑 추가, 속성 변수 출력(완료)
3. 수정내용 - pom.xml의 starter-data-jpa, mysql-connector-j 주석처리 / @GetMapping을 통한 맵핑
4. 소스코드정리 - @GetMapping("/hello") // 전송 방식 GET
                     public String hello(Model model) {
                            model.addAttribute("data", " 반갑습니다."); // model 설정
                            return "hello"; // hello.html 연결
                    } 
어노테이션을 이용해 맵핑

## 3주차 수업 요약
1. 실습내용 - 포트폴리오 템플릿 적용, 개인 포트폴리오 작성
2. 응용문제 - 상세소개 되돌아가기 버튼, main.js에 confirmClose() 함수 추가(완료)
3. 수정내용 - 상세소개 버튼 맵핑으로 활성화 about_detailed.html 개별 페이지 작성
4. 소스코드정리 - <a class="btn btn-primary py-3 px-5 mt-3" href="/about_detailed" target="_blank">상세 소개</a> 
                 herf="/about_detailed"로 맵핑된 웹페이지

## 4주차 수업 요약
1. 실습내용 - 데이터베이스 연동, mysql를 통해 데이터베이스 생성
2. 응용문제 - testdb에 INSERT를 이용하여 사용자 추가(완료)
3. 수정내용 - testdb 관련 데이터베이스 테스트 
4. 소스코드정리 - MySQL: create databases 이름;

## 5주차 수업 요약
1. 실습내용 - 포트폴리오 화면에 데이터베이스 연동
2. 응용문제 - 게시판 글쓰기 수정, @RestController를 @Controller로 수정, BlogController.java 맵핑추가(미완)
3. 수정내용 - 블로그 게시판 조회, 글쓰기 
4. 소스코드정리 - th:each(데이터베이스 값 가져옴) / 데이터 생성:PostMapping

## 6주차 수업 요약
추석

## 7주차 수업 요약
1. 실습내용 - 블로그 게시판 기능 추가
2. 응용문제 - 수정페이지에 에러페이지 수정(완성했으나 에러를 어떨게 뜨게 하는지 모르겠음)
3. 수정내용 - 게시판 글 수정 및 삭제 추가
4. 소스코드정리 - @PutMapping: 데이터 수정, @DeleteMapping: 데이터 삭제 

## 8주차 수업 요약
중간고사 공지

## 9주차 수업 요약
중간고사

## 10주차 수업 요약
1. 실습내용 - 기존 블로그 게시판에 게시물 데이터베이스에 직접 넣기, 새로운 블로그 게시판 제작
2. 응용문제 - 글 수정 페이지 구축(웹페이지를 만들고 맵핑까지 했으나 에러가 뜸 어디서 잘못됐는지 모르겠음)
3. 수정내용 - board_list.html이라는 새로운 블로그 생성, 맵핑을 통해 게시판에서 board_view.html 연결, 수정 및 삭제 버튼 추가
4. 소스코드정리 - X

## 11주차 수업 요약
1. 실습내용 - 게시판 내용 추가 기능, 검색창 및 페이징
2. 응용문제 - 페이지 코드 수정(완료)
3. 수정내용 - 메인페이지에서 게시판 클릭 시 게시판 이동, board_write.html 페이지 생성, 검색 기능 추가
4. 소스코드정리 - 

## 12주차 수업 요약
1. 실습내용 - 로그인과 로그아웃 페이지 넣기, 보안 기능 추가
2. 응용문제 - 입력값 필터링(완료)
3. 수정내용 - 로그인 화면, 로그아웃 화면, 회원가입 화면 회원가입 시 데이터베이스에 입력됨
4. 소스코드정리 - @Bean을 통해 암호화 

## 13주차 수업 요약
1. 실습내용 - 로그인 기능 추가, 로그아웃 기능 추가
2. 응용문제 - 작성자 추가(완료)
3. 수정내용 - 로그인 시 데이터베이스의 데이터와 비교 후 게시판 페이지로 이동, 세션, 쿠키 기능 추가
4. 소스코드정리 - 

## 14주차 수업 요약
1. 실습내용 - 메인 페이지 메일 보내기 활성화, 지도 변경
2. 응용문제 - 문제 이해 못함
3. 수정내용 - 메일 보내기 입력 시 FileController.java를 통해 upload 파일에 저장됨, 지도 변경
4. 소스코드정리 - @Value("${spring.servlet.multipart.location}") properties 등록된 설정(경로) 주입

## 15주차 수업 요약
기말고사