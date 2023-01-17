## 어댑터 패턴

#### 1. 언제 사용하는가?
- 외부 요소를 기존 시스템에 재사용하고 싶지만 아직 만들어지지 않은 경우
- 외부 요소를 기존 시스템에 재사용하고 싶지만 호환되지 않는 경우(실습) 

#### 2. 호환되지 않는 외부 요소 만들기
```java
public class OuterTiger {
    private String fullName = "호랑이";

    public String getFullName() {
        return fullName;
    }
}
```
- 위와 같이 우리가 전에 만들었던 다른 포멧인 fullName을 사용하는 OuterTiger를 만들었다.
- 외부 라이브러리를 쓴다던가 하는 예가 위와 비슷할것이다.

- Main클래스에 아래의 코드를 추가하면 당연하게도 타입이 맞지 않아 오류가 난다. 
```java
OuterTiger ot = new OuterTiger();
dm.쫓아내(ot);
```

- OuterTiger에 Animal을 상속하여 getName함수를 오버라이딩하면 기능은 작동하지만, OCP원칙에 위배된다.
- 따라서 Adapter를 하나 만들어서 기존 시스템에 활용해보도록 한다.

#### 3. Adapter 만들기

```java
public class TigerAdapter extends Animal{
    private OuterTiger outerTiger;

    public TigerAdapter(OuterTiger outerTiger) {
        this.outerTiger = outerTiger;
    }

    @Override
    public String getName() {
        return outerTiger.getFullName();
    }
}
```
- 위와 같이 Adapter를 만든다.
- 그러니까 컴포지션을 하는것이다. 
- 생성자에 OuterTiger를 주입하고, getName 메서드가 outerTiger의 getFullName을 반환하도록 한다.
- Main 클래스는 아래와 같이 변할것이다.
```java
TigerAdapter ot = new TigerAdapter(new OuterTiger());
```

- 그러면 OCP 원칙을 지키면서 OuterTiger를 사용할 수 있다.