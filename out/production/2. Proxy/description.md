## Proxy 패턴

### 1. 배경
- Strategy 패턴에서 구현한 프로그램을 확장하려고 한다.
- DoorMan의 쫓아내 매소드를 직접적으로 수정하면 OCP원칙을 위배하게 된다.
- 이것을 피하기 위해 Proxy 패턴을 적용한다.


### 2. 상속으로 프록시 패턴 구현하기
```java
public class DoorManProxy extends DoorMan {
    
    public void 쫓아내(Animal a){
        // 안녕이라는 문구를 출력함.
        System.out.println("안녕?");
        super.쫓아내(a);
    }
}
```
- 위와 같이 DoorManProxy 클래스를 만들고 DoorMan 클래스를 상속받는다.
- 그리고 쫓아내 매소드를 만들고, 추가하고자 하는 것들을 넣은다음 상위클래스의 쫓아내 매소드를 사용하면 끝이다.
- 

