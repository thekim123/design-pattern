public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorMan dm = DoorMan.getInstance();
        dm.쫓아내(m);
        dm.쫓아내(c);
    }
}