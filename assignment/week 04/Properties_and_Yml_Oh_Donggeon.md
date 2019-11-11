# Properties와 Yml



위키백과에서?

.Properties와 Yml은 응용 프로그램의 구성 가능한 파라미터들을 저장하기 위해

자바 관련 기술을 주로 사용하는 파일들을 위한 파일 확장자이다.



이해는 잘 되지 않지만, 외부 설정 및 환경에 따라서 설정값을 다르게 하기 위한 파일 이라는 것을  알 수 있다.



#### Property의 우선순위

Spring boot 에서는 Property에 대해 우선 순위를 두고 있으며 우선 순위는 이러하다.

1. 유저 홈 디렉토리에 있는 spring-boot-dev-tools.properties

2. 테스트에 있는 @TestPropertySource

3. @SpringBootTest 애노테이션의 properties 애트리뷰트

4. 커맨드 라인 아규먼트

5. SPRING_APPLICATION_JSON (환경 변수 또는 시스템 프로티) 에 들어있는 프로퍼티

6. ServletConfig 파라미터

7. ServletContext 파라미터

8. java:comp/env JNDI 애트리뷰트

9. System.getProperties() 자바 시스템 프로퍼티

10. OS 환경 변수

11. RandomValuePropertySource

12. JAR 밖에 있는 특정 프로파일용 application properties

13. JAR 안에 있는 특정 프로파일용 application properties

14. JAR 밖에 있는 application properties

15. JAR 안에 있는 application properties

16. @PropertySource

17. 기본 프로퍼티 (SpringApplication.setDefaultProperties)        출처 : https://engkimbs.tistory.com/765

#### properties의 값 가져오기

1. @Values 어노테이션을 통한 외부 설정값 주입

application.properties

```properties
app.name=SpringStudy
app.description=${app.name} is a Spring Boot application
```

```java
@Controller
public class HomeController {

    @Value("${app.name}")
    String name;

    @Value("${app.description}")
    String description;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model) {

        model.addAttribute("name", name);
        model.addAttribute("description", description);
        //model.addAttribute("name", "world!!!");

        return "home";
    }
}
```

![1573476861185](C:\Users\cafa3\AppData\Roaming\Typora\typora-user-images\1573476861185.png)

  @ConfigurationProperties 어노테이션을 통한 외부 설정값 주입

```java
@Component
@ConfigurationProperties(prefix = "app")
public class Test {

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
```

```java
@Controller
public class HomeController {

    @Autowired
    Test test;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model) {

        model.addAttribute("name", test.getName());
        model.addAttribute("description", test.getDescription());
        //model.addAttribute("name", "world!!!");

        return "home";
    }
}
```

![1573476864409](C:\Users\cafa3\AppData\Roaming\Typora\typora-user-images\1573476864409.png)



### .properties를 버려야 하는 이유

자바의 *.proerties 파일은 텍스트 파일을 가장한 바이너리 파일이라고 보면 된다. 특수한 편집기나 변환기가 없으면 사용자에게는 결코 텍스트 파일로써 다뤄질 수 없는 설정 파일 형식이다.

 (출처 : http://egloos.zum.com/kwon37xi/v/4665590)

따라서, *.yml과 같은 외부 속성 파일 확장자를 선택해야하는 주된 이유 중 하나이다.

### yml이 아닌 yaml이다!

정확히는 yaml이고 어떻게 읽어야할지 모르겠다.

#### 왜 yml 이여야 하는가?

1. 사람이 보기 편하다.

   ​	.properties 같은 경우 키=값 매칭이므로 일일히 mapping 해줘야 하는 단점이 있지만, yml은 그럴 필요가 없다. 가독성 또한 우월하다.

   예시

   ```yaml
   environments:
       dev:
           url: http://dev.example.com
           name: Developer Setup
       prod:
           url: http://another.example.com
           name: My Cool App
   ```

   ```properties
   environments.dev.url=http://dev.example.com
   environments.dev.name=Developer Setup
   environments.prod.url=http://another.example.com
   environments.prod.name=My Cool App
   ```

2.   profile을 지정해서 환경에 따라 설정값을 다르게 가져갈 수 있는 장점이 있고, 하나의 파일에서 마치 여러개의 설정파일을 쓰는 듯하게 구분하여 사용할 수 있다.

   예시

   ```yaml
   spring:
       profiles: development
   server:
       address: 127.0.0.1
   ---
   spring:
       profiles: production & eu-central
   server:
       address: 192.168.1.120
   ```

3.    리스트로 표현하고자 할 때는 "-" (대쉬) 하나로 쓸 수 있다.

   예시

   ```yaml
   my:
   servers:
       - dev.example.com
       - another.example.com
   ```

