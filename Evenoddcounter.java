package BAT_IT_2022_P_49;

public class Evenoddcounter {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 3, 5, 7, 9};
        
        // Variables to store the count of even and odd numbers
        int evenCount = 0;
        int oddCount = 0;
        
        // Linear Search to count even and odd numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        // Output the result
        System.out.println("Even Count = " + evenCount);
        System.out.println("Odd Count = " + oddCount);
    }
}