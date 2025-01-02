
import java.util.*;

public class Solution {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int no_sq=sc.nextInt();
            int count=0;
            
        
        for(int j=0;j<no_sq;j++)
        {
            int coins=sc.nextInt();
            if(coins%2!=0){
                count^=j;
            }
            
        }
        if(count==0){
            System.out.println("Second");
        
        }
        else{
            System.out.println("First");
            
        }
        
        }
        sc.close();
    }

   
}
