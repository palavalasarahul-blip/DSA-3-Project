import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int key = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int idx = 0;
        boolean found = false;
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                idx = i;
                found = true;
            }
        }

        if(found==true){
            System.out.println("key found at index : "+idx);
        }
        else{
            System.out.println("Key not found");
        }


    }
}