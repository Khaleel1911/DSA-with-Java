// 5  Java Program to print the duplicate elements of an array

public  class Prog_5{
    public static void main(String[] args) {  
        int [] arr = {1,1,1,1,2, 2,3, 4,4,4, 2, 7, 8,2, 8};  
        int count=0;
        System.out.println("Duplicate elements in array are: ");   
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) {
                    count++;
                } 

                      
            }  
            if(count==1){
                System.out.print(arr[i]+" ");
            }
            count=0;
        }  
    }
}