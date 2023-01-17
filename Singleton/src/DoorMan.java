/**
 * 문지기를 딱 한명만 만들고 싶어요
 */
public class DoorMan {

    private static DoorMan doorMan = new DoorMan();

    private DoorMan(){}

    public static DoorMan getInstance(){
        return doorMan;
    }

    public void 쫓아내(Animal a){
        System.out.println(a.getName() + " 쫓아내!!");
    }

}
