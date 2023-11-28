import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int result = clumsy(n);
        System.out.println(result);
    }

    public static int clumsy(int n) {
        if (n <= 2) {
            return n;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        n--;

        String[] operations = {"*", "//", "+", "-"};
        int opIndex = 0;

        while (n > 0) {
            if (operations[opIndex].equals("*")) {
                stack.push(stack.pop() * n);
            } else if (operations[opIndex].equals("//")) {
                stack.push(stack.pop() / n);
            } else if (operations[opIndex].equals("+")) {
                stack.push(n);
            } else {
                stack.push(-n);
            }

            n--;
            opIndex = (opIndex + 1) % 4;
        }

        int sum = 0;
        for (int num : stack) {
            sum += num;
        }

        return sum;
    }
}
                                                                                                                            