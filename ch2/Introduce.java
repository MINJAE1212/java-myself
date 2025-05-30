package ch2;

public class Introduce {
    // 정적인 메소드 정의,(함수정의)
    // 메소드1 , 결과 반환값의 타입 : int
    public static int sum(int n, int m) {
        return n + m;
    }

    // 메소드2 , 결과 반환값의 타입 : int
    public static int mul(int n, int m) {
        return n * m;
    }

    // 메소드3 , 결과 반환값의 타입 : int
    public static int sub(int n, int m) {
        return n - m;
    }

    // 메소드4 , 결과 반환값의 타입 : int
    public static int div(int n, int m) {
        return n / m;
    }

    // 메소드5 , 결과 반환값의 타입 : float
    public static float div_float(int n, int m) {
        return (float) n / m; // 정수를 입력 받아서, 계산시 이것도 정수로 계산이 되니깐
    }

    public static String introduce(String name, String phone, String email) {
        String introduce_myself = "저는 " + name + " 입니다. 제 전화번호 : " + phone + " 이고,이메일: " + email + "입니다.";
        return introduce_myself;
    }

    public static String introduce2(String food, String hobby, String game) {
        String introduce_my = "제가 좋아하는 음식은 " + food + " 입니다. 제 취미는 : " + hobby + " 이고, 좋아하는 게임은: " + game + "입니다.";
        return introduce_my;
    }

    // 정적 메소드, 이름 : main
    public static void main(String[] args) {
        int result = sum(100, 200);
        System.out.println("sum 이라는 함수 이용해서 결과 출력 : " + result);

        int result2 = mul(10, 20);
        System.out.println("mul 이라는 함수 이용해서 결과 출력 : " + result2);

        int result3 = sub(100, 20);
        System.out.println("sub 이라는 함수 이용해서 결과 출력 : " + result3);

        int result4 = div(1, 3);
        System.out.println("div 이라는 함수 이용해서 결과 출력 : " + result4);

        float result5 = div_float(1, 3); // 반환값의 타입이 :float 이니까, 받을 변수의 타입도 일치
        System.out.println("div_float 이라는 함수 이용해서 결과 출력 : " + result5);

        int s; // 변수를 정의만 했고, 실제 할당은 안한 상태,
        char a; // 데이터 타입 char , 한 문자만을 의미 함.
        s = 100;
        a = 'd';
        System.out.println("정수 표현 : " + s);
        System.out.println("문자 표현 : " + a);

        String introduce_info = introduce("곽민재", "010-4325-1111", "dkdkdk@naver.com");
        System.out.println(introduce_info);

        String introduce_my = introduce2("국밥", "운동", "축구게임");
        System.out.println(introduce_my);

    }
}
