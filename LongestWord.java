import java.util.*;
class LongestWord{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String words[]=str.split("[^A-Za-z0-9]");
        int wordLength=0;
        String result="";
        for(int i=0;i<words.length;i++){
            int x=words[i].length();
            if(x>wordLength){
                result=words[i];
                wordLength=x;
            }
        }
        System.out.println(result+" "+wordLength);
    }
}