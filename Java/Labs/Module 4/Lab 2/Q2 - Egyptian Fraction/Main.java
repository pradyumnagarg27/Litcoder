import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();

        List<Integer> result = egyptianFraction(numerator, denominator);
        for (int fraction : result) {
            System.out.println(fraction);
        }
    }

    public static List<Integer> egyptianFraction(int numerator, int denominator) {
        List<Integer> result = new ArrayList<>();

        while (numerator != 0) {
            int unitFractionDenominator = (int) Math.ceil((double) denominator / numerator);
            result.add(unitFractionDenominator);

            numerator = numerator * unitFractionDenominator - denominator;
            denominator = denominator * unitFractionDenominator;
        }

        return result;
    }
}
                                                                                                                            