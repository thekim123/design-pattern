public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();

        System.out.println();
        System.out.println("1. 상속으로 구현한것 실행");
        // 상속
        DoorMan dm = new DoorManProxy();
        dm.쫓아내(m);
        dm.쫓아내(c);

        System.out.println("---------------------");
        System.out.println();
        System.out.println("2. 위임으로 구현한것 실행");
        // 위임
        DoorManProxy2 dm2 = new DoorManProxy2(new DoorMan());
        dm2.쫓아내(m);
        dm2.쫓아내(c);
    }
}