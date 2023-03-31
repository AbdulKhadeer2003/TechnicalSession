import java.util.*;
public class reccursion1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(0)==s.charAt((i))){
                if(!Palin_check(s.substring(0, i+1))){
                    count++;
                    res=res+s.charAt(i);
                }
                else{
                    break;
                }
            }
            else{
                count++;
                res=res+s.charAt(i);
            }
        }
        res=res+s;
        System.out.println(res+" "+count);
        
        
    }
    public static boolean Palin_check(String s)
    {
        if(s.length()==1 || s.length()==0)
        {
            return true;
        }
        if(s.charAt(0)!=s.charAt(s.length()-1)){
            return false;
        }
        else{
            return Palin_check(s.substring(1,s.length()-1));
        }
    }
}