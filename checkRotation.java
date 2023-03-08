import java.util.*;
class CheckRotation{
    public static void main(String arg[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String a=sc.nextLine();
        System.out.println("Enter a String");
        String b=sc.nextLine();
        if(a.length()!=b.length()){
            System.out.println("They are not rotation of each other");
            return;
        }
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        if(rev.equals(b)){
            System.out.println("They are rotation of each other");
            return;
        }
        for(int i=0;i<a.length();i++){
            if((b.contains(a.substring(0,i)))&&(b.contains(a.substring(i,a.length())))){
                System.out.println("They are rotation of each other");
                return;
            }
        }
        System.out.println("They are not rotation of each other");
    }
}