package cond.ex;

public class MoveRateEx {
    public static void main(String[] args) {
        //평점에 따른 영화 추천하기
        double rating = 6;

        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }

}
