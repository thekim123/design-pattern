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
