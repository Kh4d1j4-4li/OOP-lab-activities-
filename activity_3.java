class distance{
    public int feet, inches;

    public void display () {
        System.out.println(feet + "\n" + inches);
    }
}
public class activity_3{
    public static void main(String[] args) {
        distance d1=new distance();
        d1.feet=300;
        d1.inches=400;
        d1.display();
    }
}