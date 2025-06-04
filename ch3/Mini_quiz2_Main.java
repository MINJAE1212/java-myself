package ch3;

import java.util.Scanner;

public class Mini_quiz2_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 퀴즈2, 3x3 배열을 만들어 모든 요소에 1~9 채우고 출력
        // Mini_quiz2_Func.quiz2();
        scanner.close();

        // 퀴즈3, 문자열 배열을 메서드로 받아 가장 긴 문자열을 반환
        // 방법1
        String[] strings = { "apple", "banana", "cherry", "date" };
        String longestString = Mini_quiz2_Func.quiz3(strings);
        System.out.println("방법1, 가장 긴 문자열: " + longestString);
        // 방법2, strings, 랜덤하게 생성하는 메서드 이용해서,
        String[] randomStrings = Mini_quiz2_Func.generateRandomStrings(5);
        String longestRandomString = Mini_quiz2_Func.quiz3(randomStrings);
        System.out.println("방법2, 랜덤 문자열 중 가장 긴 문자열: " + longestRandomString);

    }
}
