package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        // 누적 합 계산하기
        int max = 100;
        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
