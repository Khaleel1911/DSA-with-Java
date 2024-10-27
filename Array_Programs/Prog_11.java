// Java Program to Remove Duplicate Element in an array

public class Prog_11 {
    public static void main(String[] args) {
        int []arr={1,2,4,5,4,2,1};
        System.out.println("After removing duplicates: ");
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                
            }
            if(count==1){
                System.out.print(arr[i]+" ");
            }
            
        }
    }
}
