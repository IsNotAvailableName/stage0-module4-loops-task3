package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int maxDivisor = 0;
        for (int i = 1; i <= Math.max(first, second); i++) {
            if (first % i == 0 && second % i == 0) {
                maxDivisor = i;
            }
        }
        System.out.println(maxDivisor);
    }
}
