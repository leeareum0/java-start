package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        //상품 관리 프로그램 만들기
        int maxProducts = 10; //제약조건 - 10개까지만 등록
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요 : ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {

                if (productCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록 할 수 없습니다.");
                    continue; //while문으로 다시 돌아감
                }
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;

            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + " : " + productPrices[i] + "원");
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}
