import java.util.*;
public class groceries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap <Integer,Integer> h=new HashMap<>();
        //enter the numbers less than n 
        Integer arr[]=new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }
            else{
                h.put(arr[i],1);
            }
        }
        for(Map.Entry h1:h.entrySet())
            System.out.println("Item #"+h1.getKey()+"-sold #"+h1.getValue());
    }
    
}
