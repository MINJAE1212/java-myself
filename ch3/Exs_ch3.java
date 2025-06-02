package ch3;

import java.util.Scanner;

public class Exs_ch3 {

    public static void ex3_6_3() {

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < matrix.length; i++) { // 행 반복
            for (int j = 0; j < matrix[i].length; j++) { // 열 반복
                System.out.print(matrix[i][j] + " "); // 각 요소 출력
            }
            System.out.println(); // 행이 끝나면 줄바꿈
        }
    }

    public static void ex3_6_2() {

        int[] numbers = { 1, 2, 3, 4, 5 }; // 배열 선언과 동시에 값 할당

        for (int number : numbers) {
            System.out.print(number + " "); // 1 2 3 4 5 출력
        }
        System.out.println(); // 줄바꿈
    }

    public static void ex3_6() {
        int[] numbers = new int[5]; // 배열 선언, 크기 5개
        // int numbers[] = new int[5]; // C 스타일 배열 선언 (오래된 방식)

        // 배열에 값 할당
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // 1부터 5까지의 값 할당
        }

        // 배열 값 출력
        for (int number : numbers) {
            System.out.print(number + " "); // 1 2 3 4 5 출력
        }
        System.out.println(); // 줄바꿈
    }

    public static void ex3_5(Scanner scanner) {
        System.out.println("정수를 5개 입력하세요.");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            System.out.println("입력한 숫자: " + n + ", i의 값 확인 : " + i); // 입력한 숫자 확인용
            if (n <= 0)
                continue; // 0이나 음수인 경우 더하지 않고 다음 반복으로 진행
            else
                sum += n; // 양수인 경우 덧셈
        }
        System.out.println("양수의 합은 " + sum);

    }

    public static void ex3_4() {
        for (int i = 1; i < 10; i++) { // 단에 대한 반복. 1단에서 9단
            for (int j = 1; j < 10; j++) { // 각 단의 곱셈
                System.out.print(i + "*" + j + "=" + i * j); // 구구셈 출력
                System.out.print('\t'); // 하나씩 탭으로 띄기
            } // 두번째 for 문
            System.out.println(); // 한 단이 끝나면 다음 줄로 커서 이동
        } // 첫번째 for 문
    }

    public static void ex3_3() {
        char a = 'a';
        do {
            System.out.print(a);
            // char 타입의 a -> int 변환시 , 값: 97, 유니코드 값 : 97
            a = (char) (a + 1); // a+1 는 int 타입으로 계산되므로, char로 변환
        } while (a <= 'z');
    }

    public static int ex3_2_quiz(Scanner scanner) {
        String total = ""; // 입력된 총 문자열 수

        while (true) {
            System.out.println("문자를 입력하세요 (다음 문장에 q를 입력하면 종료): ");
            String input = scanner.nextLine(); // 한 줄 입력 받기
            total += input; // 입력된 문자열을 누적
            System.out.println("계속 입력하려면 아무키나 입력하고, 종료시에 q를 입력하세요.");
            String command = scanner.nextLine(); // 다음 명령어 입력 받기
            if (command.equals("q")) { // 대소문자 구분 없이 q 입력시 종료
                break; // while 문 종료
            }
        }
        int count = total.length(); // 입력된 문자열의 길이(문자 개수)
        return count;
    }

    public static void ex3_2(Scanner scanner) {
        int count = 0;
        String input;

        System.out.println("문자를 입력하세요 (q 입력 시 종료):");

        while (true) {
            input = scanner.next(); // 공백을 구분자로 하나의 문자열 입력 받음
            if (input.equals("q")) {
                break; // q 입력 시 반복문 종료
            }
            count++; // q가 아닌 입력마다 count 증가
        }

        System.out.println("입력한 문자의 개수: " + count);
    }

    public static int getSum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("i: " + i); // 디버깅용 출력
            sum += i;
            System.out.println("현재 합계: " + sum); // 디버깅용 출력
        }
        return sum;

    }

}
