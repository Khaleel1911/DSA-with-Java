// Find the pairs and triplets which can be added to obtain target sum 

public class Target_Sum {
    public static void main(String[] args) {
        int []arr={1,4,5,6,3};
        int target_sum=12;
        pair_sum(arr, target_sum);
        System.out.println(" ");
        triplet_sum(arr,target_sum);
        
    }

    static void pair_sum(int []a,int target){
        int arr[]=a;
        int target_sum=target;
        System.out.println("Pairs for targetsum: ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target_sum){
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
    }
    
    static void triplet_sum(int []a,int target){
        int arr[]=a;
        int target_sum=target;
        System.out.println("Triplets for targetsum: ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++)
                if(arr[i]+arr[j]+arr[k]==target_sum){
                    System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                }
            }
         }
    }
}
