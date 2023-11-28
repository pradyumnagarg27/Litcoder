import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numsArray = scanner.nextLine().split(" ");
        List<String> nums = Arrays.asList(numsArray);

        int queriesCount = Integer.parseInt(scanner.nextLine());
        List<int[]> queries = new ArrayList<>();
        for (int i = 0; i < queriesCount; i++) {
            String[] queryStr = scanner.nextLine().split(" ");
            int[] query = {Integer.parseInt(queryStr[0]), Integer.parseInt(queryStr[1])};
            queries.add(query);
        }

        List<Integer> result = kthSmallestTrimmedNumber(nums, queries);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> kthSmallestTrimmedNumber(List<String> nums, List<int[]> queries) {
        List<Integer> answer = new ArrayList<>();

        for (int[] query : queries) {
            int position = query[0];
            int trimLength = query[1];
            List<Integer> trimmedNums = new ArrayList<>();

            for (String num : nums) {
                int trimmed = Integer.parseInt((num.length() >= trimLength) ? num.substring(num.length() - trimLength) : num);
                trimmedNums.add(trimmed);
            }

            List<Integer> sortedNums = new ArrayList<>(trimmedNums);
            Collections.sort(sortedNums);
            
            int kthSmallest = (position <= sortedNums.size()) ? sortedNums.get(position - 1) : -1;
            int kthSmallestIndex = trimmedNums.indexOf(kthSmallest);
            answer.add((kthSmallest != -1) ? kthSmallestIndex : -1);
        }

        return answer;
    }
}
                                                                                                                            