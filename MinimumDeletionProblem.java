import java.util.*;
public class MinimumDeletionProblem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String x=sc.nextLine();
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(char c:x.toCharArray()){
            hmap.put(c,(hmap.getOrDefault(c,0)+1));
        }        
        int freq=Collections.min(hmap.values());
        List<Integer> l=new ArrayList<>();
        l.addAll(hmap.values());
        System.out.println(freq);
        System.out.println(l);
        int result=check(l,freq);
        System.out.print(result);
    }

    private static int check(List<Integer> l, int freq) {
        if(l.size()==0){
            return 0;
        }
        int x=l.get(0);
        l.remove(0);
        return (x-freq)+check(l, freq);
    }
}