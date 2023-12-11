package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        for (int i = 0, x = 1; i < String.valueOf(t).length(); i++, x *= 10) {
            sum += (t % (x * 10) - t % x) / x;
        }
        System.out.println(Math.abs(sum));
    }
}
