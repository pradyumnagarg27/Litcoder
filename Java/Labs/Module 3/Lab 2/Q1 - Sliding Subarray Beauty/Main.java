import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] inputArr = scanner.nextLine().trim().split(" ");
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }
        
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        
        List<Integer> result = slidingSubarrayBeauty(arr, k, n);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> slidingSubarrayBeauty(int[] arr, int k, int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            int[] subarray = Arrays.copyOfRange(arr, i, i + k);
            Arrays.sort(subarray);
            result.add(subarray[n - 1]);
        }

        return result;
    }
}
                                                                                                                            