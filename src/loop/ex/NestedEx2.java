package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        // 피라미드 출력하기
        int rows = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // 라인을 넘기지 않고 출력하기 위해 사용
            }
            System.out.println();
        }
    }
}
