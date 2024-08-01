package thuesday;

public class F17_1 {
    static  int[]num={2,3,4,5,6,7,8};
    static int ons=0;
    public static void main(String[] args) {
        for (int j=0;j<7;j++){
            for (int i=0;i<7;i++){
                if((num[i]+num[j])%2!=0&&i!=j){
                    ons++;
                }
            }

        }
        System.out.println("小米才对的次数为"+ons);
    }
}
