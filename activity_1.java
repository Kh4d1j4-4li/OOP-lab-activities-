class circle{
    public int radius;
    public circle () {
            radius = 30;
    }
    public circle ( int r){
        radius=r;
    }
    public double cal_circumference() {
        return(2* radius * 3.14);
    }
}
public class activity_1{
    public static void main (String [] args){
        circle c1=new circle ();
        System.out.println(c1.cal_circumference());
        circle c2=new circle( 20);
        System.out.println(c2.cal_circumference());
    }
}
