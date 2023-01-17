## Singleton 패턴

### 1. 왜 만드나
- 클래스의 인스턴스가 프로그램 내에서 단 하나만 있다는 것을 보장하기 위해서 만든다.
- 예를 들어 우리가 이전에 만든 문지기를 딱 한명만 두고 싶다는 요구사항을 구현하고자 한다.

- 이번 시간에 배운 것은 간단하다. 코드 내부에 주석으로 설명하겠다.
```java
public class DoorMan {

    // 필드의 접근제어자를 private로 설정하고 static으로 둔다. 프로그램을 실행하면 메모리에 뜰것이다. 
    private static DoorMan doorMan = new DoorMan();
    
    // 생성자 역시 접근제어자를 private로 설정한다. 외부 클래스에서는 접근할 수가 없다.
    private DoorMan() {
    }

    // 이 Doorman 친구를 사용하려면 getter가 있어야 하는데, 그 getter이다. 필드에서 만든 doorMan을 리턴한다.
    public static DoorMan getInstance() {
        return doorMan;
    }

    public void 쫓아내(Animal a){
        System.out.println(a.getName() + " 쫓아내!!");
    }
}
```

- 여기까지가 오늘 배운 싱글턴 패턴이다. 이것은 간단하지만, 이것이 객체의 유일성을 '절대' 보장하지 않는다.
- 백기선님 유튜브에 이것의 유일성을 깨뜨리는 방법이 나와있고, 이것을 방지하기 위한 방법이 또 나와 있다.
- 추후에 메타코딩님의 강의를 다보고 나서 심화학습 하도록 하겠다.