import java.util.Scanner;

public class palendrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=sc.nextLine();
        String x= Palin_check(s)<=0 ? "not":"";
        System.out.println(s+" is "+x+" a palindrome");
    }
    public static int Palin_check(String s)
    {
        if(s.length()==1 || s.length()==0)
        {
            return 1;
        }
        if(s.charAt(0)!=s.charAt(s.length()-1)){
            return 0;
        }
        else{
            return Palin_check(s.substring(1,s.length()-1));
        }
    }
}
