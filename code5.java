public class code5{
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 89, 33, 7};
       
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }
        System.out.println("The maximum element is: " + max);
    }
}