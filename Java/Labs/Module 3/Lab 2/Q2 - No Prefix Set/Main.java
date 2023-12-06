import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] passwords = scanner.nextLine().trim().split(" ");

        String result = isGoodPassword(passwords);
        System.out.println(result);
    }

    public static String isGoodPassword(String[] passwords) {
        Arrays.sort(passwords);
        for (int i = 0; i < passwords.length - 1; i++) {
            if (passwords[i + 1].startsWith(passwords[i])) {
                return "BAD PASSWORD";
            }
        }
        return "GOOD PASSWORD";
    }
}
                                                                                                                            