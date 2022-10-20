public class _1copy_array_elements {

    public static void main(String[] args){

        int arr[] = {1,2,3,5,6,9};

        // Create an array of length same as length of arr
        int new_arr[] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            new_arr[i] = arr[i];
        }

        System.out.print("Elements of new array: ");

        // To check whether new array got new address or it's just pointing to address of old array.
        new_arr[0]++;
        // It changes only new array so new array is a copy of previous array

        for (int i=0;i<new_arr.length;i++){
            System.out.print(new_arr[i] + " ");
        }

        System.out.print("Elements of old array: ");

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }



    }
    
}
