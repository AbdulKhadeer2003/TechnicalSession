import java.util.*;
public class FrequecyOfCharInString{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        HashMap<Character,Integer> h= new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(h.containsKey(str.charAt(i))){
                h.put(str.charAt(i),h.get(str.charAt(i))+1);
            }
            else{
                h.put(Character.valueOf(str.charAt(i)),1);
            }
        }
        System.out.printf("%-20s%-20s\n","Characters","Frequencies");
        for(Map.Entry s:h.entrySet()){
            System.out.printf("%-20s%-20s\n",s.getKey(),s.getValue());
        }

    }
}