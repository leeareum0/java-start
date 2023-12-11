package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxInOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxInOver; //형변환
        System.out.println("maxInOver casting = " + intValue);
    }
}
