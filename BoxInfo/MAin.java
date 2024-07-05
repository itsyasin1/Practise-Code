package BoxInfo;

public class Main {
    public static void main(String[] args) {
        //Creating New Object
        Box box = new Box(2.0,4.0,6.0);
        Box box2 = new Box(8.0,10.0,12.0);

        double ans1 = box.getVolume();
        double ans2 = box2.getVolume();

        System.out.println("Box 1: " + ans1);
        System.out.println("Box 2: " + ans2);
    }
}
