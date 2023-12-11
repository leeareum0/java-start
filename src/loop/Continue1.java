package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            if (i  == 4) {
                i++;
                continue; // 건너뛰기
            }
            System.out.println(i);
            i++;
        }
    }
}
