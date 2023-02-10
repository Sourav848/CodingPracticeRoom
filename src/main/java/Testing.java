import java.util.ArrayList;

public class Testing {
    public static void main(String args[]) {
                
        //int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
        int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 999, 6, 0, 9 };
        
        int arr1[] = moveZerosToLast(arr, arr.length);
        /*
         * for (int i = 0; i < arr1.length; i++) { System.out.print(" " +arr1[i]); }
         */
        
      int[]  nums = {1,7,3,6,5,6};
     // System.out.print(" " +pivotIndex(nums));
      
      int[] A = {100,180,260,310,40,535,695};
      stockBuySell(A, A.length);
      
    }
    
    //window sliding technique

    static int[] moveZerosToLast(int[] arr, int n) {
        int ptr1 = 0;
        int ptr2 = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            if (arr[i] == 0) {
                ptr1 = i;
                ptr2 = ptr1 + 1;
                while (ptr2 < n) {
                    if (arr[ptr2] != 0) {
                        temp = ptr2;
                        break;
                    }
                    ptr2++;
                }
                
                if (temp != 0) {
                int zeroValue = arr[ptr1];
                arr[ptr1] = arr[temp];
                arr[temp] = zeroValue;}
            }
        }
        return arr;
    }
    
    public static int pivotIndex(int[] arr) {

        int n = arr.length;
        int leftsum = 0;
        int rightsum = 0;
        for (int i = 0; i < n; i++)
            rightsum += arr[i];

        for (int i = 0; i < n; i++) {
            rightsum -= arr[i]; // rightsum is now right rightsum for index i

            if (leftsum == rightsum)
                return i;

            leftsum += arr[i];
        }

     return -1;
        
    }
    
    
    static void stockBuySell(int A[], int n) {
        ArrayList<Integer> soln=null;
        
        ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<n;i++){
            
            if(A[i]>A[i-1]){
                soln = new ArrayList<>();
                soln.add(i-1);
                soln.add(i);
                aList.add(soln);
            }
            }
            
        
        
        
        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < aList.get(i).size(); j++) {
                System.out.print(aList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    
    
}
