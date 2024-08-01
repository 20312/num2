package word;

import java.util.HashSet;

public class T3_3 {
    public static void main(String[] args) {
        int age=1;
        while(true)
        {
            String num1=String.valueOf(age*age*age);
            String num2=String.valueOf(age*age*age*age);
            if(num1.length()==4 && num2.length()==6)
            {
                if(isRepeat(num1+num2))
                {
                    System.out.println(age);
                    System.out.print((int)Math.pow(age, 3)+","+(int)Math.pow(age,4));
                    break;
                }
            }else
            {
                age++;
            }
        }
    }
    public static boolean isRepeat(String num)//是否包含重复的
    {
        HashSet<Character> set=new HashSet<Character>();
        for(int i=0;i<num.length();i++)
        {
            if(!set.add(num.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}
