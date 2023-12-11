package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        for (int a = 0; a <= lengthOfLastNumber; a++) {
            for (int i = 0, x = 1; i < a; i++, x *= 10) {
                result += 9 * x;
            }
        }
        System.out.println(result);
    }
}
