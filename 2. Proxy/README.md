## Proxy 패턴

### 1. 배경
- Strategy 패턴에서 구현한 프로그램을 확장하려고 한다.
- DoorMan의 쫓아내 매소드를 직접적으로 수정하면 OCP원칙을 위배하게 된다.
- 이것을 피하기 위해 Proxy 패턴을 적용한다.


### 2. 상속으로 구현하기
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
- 앱을 실행하면 다음과 같은 결과가 나온다.
```
1. 상속으로 구현한것 실행
안녕?
쥐 쫓아내!!
안녕?
고양이 쫓아내!!
```
- 이로써 구현된 프로그램을 손대지 않고 기능을 추가하는 것을 완료하였다.


## 3. 위임으로 구현하기
```java
// 위임으로 프록시 패턴 구현
public class DoorManProxy2 {

    private DoorMan doorMan;

    public DoorManProxy2(DoorMan doorMan) {
        this.doorMan = doorMan;
    }

    public void 쫓아내(Animal a) {
        System.out.println("안녕");
        doorMan.쫓아내(a);
    }
}
```
- 위임으로 구현한 예이다.

```
2. 위임으로 구현한것 실행
안녕
쥐 쫓아내!!
안녕
고양이 쫓아내!!
```

- 이번시간 배운것을 바탕으로 프록시 패턴은 프로그램에 기능을 추가하는데 본래의 프로그램에 변경하지 않은채로 하는 패턴이라고 정리하고 마친다.
- 프록시 패턴을 배우고 좀 더 알아봐야겠다고 생각했던 부분은 Transaction과 nginx에서 사용하는 프록시이다. 여기에 해당하는 건지 모르겠지만 공부하고 정리하여 올리겠다.