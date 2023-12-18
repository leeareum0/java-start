package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello word";
        printMessage("Hello word!", 3);
        printMessage("Hello word!", 5);
        printMessage("Hello word!", 7);
    }
    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
