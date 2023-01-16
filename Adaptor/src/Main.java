public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        TigerAdapter ot = new TigerAdapter(new OuterTiger());
        DoorMan dm = new DoorMan();

        dm.쫓아내(m);
        dm.쫓아내(c);
        dm.쫓아내(ot);
    }
}