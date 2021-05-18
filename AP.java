import java.util.*;


public class AP {
    public static void main(String args[] ) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) 
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int min = (2*b)-(a+c);
            if(min<0)
            {
                min = -(min);
            }
            if(min%2==0)
            {
                System.out.println(min/2);
            }else
            { 
                System.out.println((min/2)+1);
            }
            t--;
        }
    }
} 
