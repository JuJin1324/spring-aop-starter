# spring-aop-starter

## Gradle
### dependencies
> ```groovy
> dependencies {
>     ...
>     implementation 'org.springframework.boot:spring-boot-starter-aop'
>     ...
> }
> ```

## AOP 의 활용 방안
### Service 메서드의 Parameter Null Check
> Service 클래스에서 Parameter 가 있는 메서드들에서 각 메서드 안에서 파라미터 Null Check 를 하지 않고 AOP 를 통해서 Null Check 를 진행한다.  
> `starter.spring.aop.aspect.ParameterNullCheckAspect` 클래스 참조  

### Annotation 생성 vs 기존 Annotation 에 붙이기
> Aspect 를 추가할 때 꼭 짝이되는 Annotation 을 생성할 필요 없이 기존의 Annotation 에 Aspect 를 연결해도 된다.  
> 예를 들면 기존 Annotation 인 @GetMapping 을 달고 있는 메서드는 모두 실행하는 Aspect 를 생성할 수도 있다.  
> 혹은 Annotation 이 아닌 위의 `ParameterNullCheckAspect` 처럼 Annotation 이 아닌 서비스 클래스 자체에 Aspect 를 연결할 수도 있다.  

