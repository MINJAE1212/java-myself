package ch2;

public class Exs {

    public static String getSeason(int month) {
        String season;
        switch (month) {
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            default:
                season = "잘못된 입력";
                break;
        }
        return season;
    }

    public static String getTernaryExam(int score) {

        String result = (score >= 60) ? "합격" : "불합격";

        return result;
    }

    public static void getIncDecExam() {
        int a = 10;
        int b = 20;

        System.out.println("a++: " + (a++)); // 10 출력 후, a는 11로 증가
        System.out.println("결과1 a: " + a); // 11 출력
        System.out.println("++a: " + (++a)); // 12 출력
        System.out.println("결과2 a: " + a); // 12 출력

        // 복합 대입 연산자
        b += 5; // b = b + 5; b는 이제 25
        System.out.println("b += 5: " + b);
    }

    public static void getTypeExam() {

        int num4 = 128;

        byte num5 = (byte) num4;
        System.out.println("num5: " + num5);

    }

    public static String getCircleArea(double radius) {
        final double PI = 3.14159; // 원주율 상수
        if (radius < 0) {
            return "반지름은 음수가 될 수 없습니다.";
        }

        double area = PI * radius * radius; // 원의 면적 계산

        String result = String.format("반지름 %.2f의 원의 면적은 %.2f입니다.", radius, area);
        return result;
    }
}
