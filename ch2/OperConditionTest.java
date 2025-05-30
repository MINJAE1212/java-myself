package ch2;

public class OperConditionTest {

    // 순서1
    // 연습하는 메서드 추가
    public static void oper1() {
        // 1. 산술 연산자
        int a = 10;
        int b = 20;
        System.out.println("산술 연산자 테스트");
        System.out.println("a + b = " + (a + b)); // 덧셈
        System.out.println("a - b = " + (a - b)); // 뺄셈
        System.out.println("a * b = " + (a * b)); // 곱셈
        System.out.println("몫: b / a = " + (b / a)); // 나눗셈
        System.out.println("나머지: b % a = " + (b % a)); // 나머지

    }

    public static void oper2() {
        // 1. 산술 연산자
        int a = 50;
        int b = 100;
        System.out.println("산술 연산자 테스트");
        System.out.println("a + b = " + (a + b)); // 덧셈
        System.out.println("a - b = " + (a - b)); // 뺄셈
        System.out.println("a * b = " + (a * b)); // 곱셈
        System.out.println("몫: b / a = " + (b / a)); // 나눗셈
        System.out.println("나머지: b % a = " + (b % a)); // 나머지

    }

    // 조건문 예시 메서드
    public static void conditionExample() {
        int number = 0;

        System.out.println("조건문 if 예시 시작");
        // if 문 예시
        if (number > 0) {
            System.out.println("양수입니다.");
        } else if (number < 0) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("0입니다.");
        }

        System.out.println("조건문 스위치 예시 시작");
        // switch 문 예시
        switch (number) { // 스위치 조건으로 확인 후, break 문으로 빠져나옴
            // 만약, break 문이 없으면, 다음 case로 계속 진행됨
            case 0:
                System.out.println("0입니다.");
                break; // case 0에서 빠져나옴
            case 1:
                System.out.println("1입니다.");
                break; // case 1에서 빠져나옴
            default:
                System.out.println("1이 아닌 다른 숫자입니다.");
                break; // default에서 빠져나옴
        }

    }

}
