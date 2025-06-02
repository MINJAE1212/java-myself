package ch2;

import java.util.Scanner;

public class Exs_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("사용자 이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("좋아하는 월을 입력하세요 (1~12): ");
        int month = scanner.nextInt();

        String season = Exs.getSeason(month);

        System.out.println(name + "님, 좋아하는 월은 " + month + "월입니다.");
        System.out.println("계절은 " + season + "입니다.");

        scanner.close();
    }

    String result_ex = Exs.getTernaryExam(75);
    {
        System.out.println("EX2-9, 삼항 연산자 예시: " + result_ex);
        System.out.println("----------------------------");

        // EX2-7, a++, ++a 예시,
        Exs.getIncDecExam();
        System.out.println("----------------------------");
        // 강제 형변환 예시
        Exs.getTypeExam();
        System.out.println("----------------------------");
        // EX2-3
        System.out.println("파이널 상수 이용한, 원면적 구하기 예제");
        // 반지름 5.0인 원의 면적 구하기
        String result = Exs.getCircleArea(5.0);
        System.out.println(result);
    }
}
