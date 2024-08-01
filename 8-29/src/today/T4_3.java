package word;

public class T4_3 {
    public static void main(String[] args) {
        int n3 = 1000/3;
        int n5 = 1000/5;
        int n15 = 1000/15;
        double sum3 = n3*3+n3*(n3-1)/2.0*3;
        double sum5 = n5*5+n5*(n5-1)/2.0*5;
        double sum15 = n15*15+n15*(n15-1)/2.0*15;
        double sum = sum3+sum5-sum15;
        System.out.println(sum);

    }

}
