package ch2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        System.out.println("ScannerTest 시작");

        // 예제 코드
        // 기본 모양,
        // [클래스명] [변수명] = new [클래스명]();
        // 실제 작업 순서1
        Scanner scanner = new Scanner(System.in);
        // System.in : 표준 입력 스트림, 키보드 입력을 받기 위해 사용
        // 실제 작업 순서2
        System.out.println("이름을 입력하세요: ");
        // 실제 작업 순서3
        String name = scanner.nextLine(); // nextLine() 메서드를 사용하여 한 줄 전체를 입력받음
        // 실제 작업 순서4
        System.out.println("입력한 이름: " + name); // 입력받은 이름을 출력

        System.out.println("좋아하는 숫자를 입력하세요: ");
        // 실제 작업 순서3
        int number = scanner.nextInt(); // nextLine() 메서드를 사용하여 한 줄 전체를 입력받음
        // 실제 작업 순서4
        System.out.println("좋아하는숫자: " + number); // 입력받은 이름을 출력

        // 실제 작업 순서5
        scanner.close(); // Scanner 객체를 사용한 후에는 반드시 닫아줘야 함. 리소스 누수 방지

    }
}
