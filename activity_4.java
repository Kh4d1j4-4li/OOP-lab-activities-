class marks{
    public int A;
    public int B;
    public int C;

    public marks(){
        A=55;
        B=56;
        C=45;
    }
    public marks( int a, int b, int c) {
        A=a;
        B=b;
        C=c;

    }
    public int sum_marks( ) {
        return( A + B+ C);
    }
}
public class activity_4{
    public static void main (String [] args){
        marks m1=new marks();
        System.out.println(m1.sum_marks());
    }
}