// space complexity O(1)
// time complexity O(n)
import java.util.*;
class BitonicGenetation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer arr[]=new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start=0,end=n-1;
        System.out.println(Arrays.toString(arr));
        while(start<end){
            while(start%2==0) start++;

            while(end%2!=0) end--;
            if(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
            start++;
            end--;
        }
       
        Arrays.sort(arr,0,(n/2));
        Arrays.sort(arr,n/2,n, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        
    }
}