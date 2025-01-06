# Trip Gateway Application

이 프로젝트는 Spring Boot를 기반으로 한 API 게이트웨이 애플리케이션으로, API 라우팅, 보안, 시스템 상태 모니터링 등의 기능을 제공합니다.

## 요구사항

```plaintext
- Java Development Kit (JDK) 23 이상
- Gradle (빌드 도구)
- Maven Central Repository 접근 권한 (의존성 다운로드)
```

## 사용된 기술

```plaintext
- Spring Boot
  - spring-boot-starter-web: RESTful API와 웹 기능 개발
  - spring-boot-starter-webflux: 비동기 웹 애플리케이션 지원
  - spring-cloud-starter-gateway-mvc: API Gateway 기능 제공
  - spring-boot-starter-data-redis: Redis를 이용한 캐싱 및 세션 관리
  - spring-boot-starter-security: 애플리케이션 보안
  - spring-boot-starter-actuator: 애플리케이션 상태 확인 및 모니터링
- H2 데이터베이스: 개발 및 테스트를 위한 인메모리 데이터베이스
- JWT (JSON Web Token): jjwt-api를 활용한 토큰 기반 인증
- Logback 및 SLF4J: 효과적인 로깅
```

## 프로젝트 설정

### 레포지토리 클론

```bash
git clone https://github.com/your-repo/trip-application.git
cd trip-application
```

### 프로젝트 빌드 및 실행

1. **클린 및 빌드:**

```bash
./gradlew clean build
```

2. **애플리케이션 실행:**

```bash
./gradlew bootRun
```

## 패키지 구조

```plaintext
- actuator: 다른 서버들이 정상적으로 실행되고 있는지 확인하기 위한 설정이 포함된 패키지.
- auth: 인증과 관련된 처리를 담당하는 패키지 (로그인, 로그아웃, JWT 토큰 발급 등).
- common: 프로젝트 전반에서 사용되는 공통 기능과 클래스를 포함하는 패키지 (공통 에러 처리 등).
- config: 스프링 부트 설정 파일을 관리하는 패키지 (보안, 데이터베이스, 캐싱, Gateway 설정 등).
```

## 주요 기능

```plaintext
1. 인증 및 권한 관리
   - Spring Security를 사용하여 엔드포인트 보호.
   - JWT 기반 토큰 인증.

2. API Gateway
   - Spring Cloud Gateway를 사용하여 API 라우팅 및 필터링.

3. 시스템 상태 모니터링
   - Spring Boot Actuator를 사용하여 애플리케이션 상태 확인 및 서버 헬스 체크.

4. 캐싱
   - Redis 기반 캐싱으로 성능 최적화.

5. 로깅
   - SLF4J 및 Logback을 활용하여 로깅과 디버깅.
```

## 개발 노트

```plaintext
1. 의존성 관리
   - Gradle과 io.spring.dependency-management 플러그인을 사용하여 의존성 관리.
   - Spring Cloud BOM을 통해 호환성을 유지.

2. Java Toolchain
   - Java 23 버전을 사용하도록 설정.

3. 애노테이션 프로세싱
   - Lombok을 사용하여 반복 코드를 최소화.

4. 개발 도구
   - Spring Boot DevTools를 활용하여 개발 중 핫 리로드 지원.
```

## 기여 방법

```plaintext
이 레포지토리를 포크한 후 수정 사항을 적용하여 Pull Request를 제출하세요.
기여하기 전에 프로젝트의 기여 가이드를 참고하세요.
```

## 라이선스

```plaintext
이 프로젝트는 MIT 라이선스를 따릅니다. 자세한 내용은 LICENSE 파일을 참고하세요.
```
