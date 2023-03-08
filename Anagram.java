import java.util.*;
public class Anagram{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String a=sc.nextLine();
        System.out.println("Enter a String");
        String b=sc.nextLine();
        if(a.length()!=b.length()){
            System.out.println("They are not Anagrams");
            return;
        }
        ArrayList<Character> a1=new ArrayList<>();
        ArrayList<Character> a2=new ArrayList<>();
        char char1[]=a.toCharArray();
        char char2[]=b.toCharArray();
        Character[] c1 = new Character[char1.length];
        Character[] c2 = new Character[char2.length];
        // Using auto-boxing
        for (int i = 0; i < char1.length; i++) {
            c1[i] = char1[i];
        }
        for (int i = 0; i < char2.length; i++) {
            c2[i] = char2[i];
        }
        a1.addAll(Arrays.asList(c1));
        a2.addAll(Arrays.asList(c2));
        System.out.println(a1);
        System.out.println(a2);
        if(a1.containsAll(a2)){
            System.out.println("They are Anagrams");
        }
        else{
            System.out.println("They are not Anagrams");
        }
    }
}