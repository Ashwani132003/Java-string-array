public class _4duplicate {

    public static void main(String[] args){

        int arr[] = {2,4,5,1,7,6,5,1};

        System.out.println("Duplicate Elements: ");
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }


    }
    
}
