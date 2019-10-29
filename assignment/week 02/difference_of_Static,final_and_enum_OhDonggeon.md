### 2일차 과제

##### Java의 Static, Final, Cnum에 대해 최대한 소개하기

원리, 동작, 예제 등등..

 

##### static이란?

- static은 정적인 것으로 생각하면 쉽다.

- static을 선언한 변수, 메서드는 메모리에 고정되어 있어 instance화 시키지 않아도 사용 가능하다.

- static으로 선언된 변수는 모든 객체가 그 변수를 공유한다는 의미를 가지게 된다.

 

예제

```java
class Test {
    
    public static final int SUCCEED = 0x0001;
    public static final int FAILED = 0x0000;
    
	public static final int status = 0x0000;
    
    ...
    ...
    
    public static void getStatus() {
        return status;
    }
 }

class main {
    
    public static void main(String[] args) {
        System.out.println(Test.SUCCEED);
        
        if(Test.getStatus == Test.FAILED) {
            return;
        }
        
        ...
            
    }
}
```

##### final이란?

- 쉽게 말해서 변하지 않는 상수이다.
- 선언과 동시에 초기화하고 다른 값으로 바꿀 수 없다.

```java
class FinalClass {
    
    private final int fixNum = 10;
    
    //잘못된 예제
    public void fixNum(int num) {
        fixNum = num // 상수로 선언된 변수는 다른 값으로 바꿀 수 없다.
    }
    
    //사용 예제
    public void getFixNum() {
        return fixNum; // final로 선언된 상수는 참조만 가능하다.
    }
    
}
```

final로 선언하는 상수는 보통 클래스 전체에 걸쳐 사용하는 경우가 많기 때문에 보통 static과 같이 사용하는 경우가 많다.

final 메서드를 선언하는 경우 오버라이딩을 할 수 없고

final 클래스를 선언하는 경우 상속을 할 수 없다.



##### Enum이란?

- enumeration의 앞글자로 열거를 의미
- 관련이 있는 상수들의 집합을 의미
- enum은 완전한 클래스 형태

위의 code를 보면 final static 예약어를 사용하여 상수를 선언하였다.

여기서 문제점은 한 클래스 내에 final static으로 모두 선언하면 name의 중복이 발생 할 수도 있고, 여러개의 상수를 정의할 때 복잡할 경우가 있다.

enum을 사용하는 경우 상수를 집합화 시키기 때문에 코드가 단순해지고 가독성이 좋아진다. (여러개의 public static final ...을 사용 하는 것 보다) 또한 인스턴스 생성과 상속을 방지하여 상수 값의 타입 안전성이 보장된다.

enum은 valueOf(String) (String 값을 enum에서 가져온다)와 같은 기본적인 static method가 있고 name() (호출된 값의 이름을 String으로 return)이 있다.

예제

```java
public enum Gender {
    MALE("남자"), FEMALE("여자");
}

class Main {
    
    public static void main(String[] args) {
        Gender gender;
        gender = Gender.MALE;
        
    }
}
```

