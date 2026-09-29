class time {
    public int hr, min , sec ;

    public time () {
        hr=0;
        min=0;
        sec=0;
    }
    public time( int h , int m, int s) {
        hr=h;
        min=m;
        sec=s;
    }
    public void display () {
        System.out.println(hr + ":" + min + ":" + sec);
    }
}
public class activity_5 {
    public static void main (String [] args ){
        time t1=new time();
        t1.display();

        time t2= new time( 3,4,5);
        t2.display();
    }
}