package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        //홀수 짝수 찾기
        int x = 3;

        String result = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println("x = " + x + ", " + result);
    }
}
