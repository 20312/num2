package word;

public class T2_2 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                int s=i*j;
                if(i*j<=9){
                    System.out.print(j+"*"+i+"="+s+"  ");
                }
                else{
                    System.out.print(j+"*"+i+"="+s+" ");
                }
            }
            System.out.println();
        }
    }
}
