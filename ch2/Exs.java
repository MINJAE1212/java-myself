package ch2;

public class Exs {

    public static String getCircleArea(double radius) {
        final double PI = 3.14159; // 원주율 상수
        if (radius < 0) {
            return "반지름은 음수가 될 수 없습니다.";
        }
        // PI = 3.14159123412; // 상수는 재할당 불가, 컴파일 에러 발생
        double area = PI * radius * radius; // 원의 면적 계산
        // String.format , 기본 옵션
        // 소수점 둘째 자리까지 출력
        // %.2f : 소수점 둘째 자리까지 출력 -> radius
        // %.2f : 소수점 둘째 자리까지 출력 -> area
        String result = String.format("반지름 %.2f의 원의 면적은 %.2f입니다.", radius, area);
        return result;
    }
}
