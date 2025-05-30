package ch2;

public class Hello22 {
    public static void main(String[] args) {
        System.out.println("Hello, Java!"); // Hello, Java! 출력

        String myInfo = Introduce.introduce("곽민재", "010222222", "dsfkj@naver.com"); // Introduce 클래스의 introduce 메소드 호출
        System.out.println(myInfo); // Introduce 클래스의 introduce 메소드 호출 결과 출력

        String introduce_my = Introduce.introduce2("피자", "게임", "오버워치");
        System.out.println(introduce_my); // Introduce 클래스의 introduce2 메소드 호출 결과 출력

        // 퀴즈 1
        // Introduce 클래스에, 정의한 사칙연산 메소드를 이용해서, 각각 계산 결과를
        // result1, result2, result3, result4 변수에 담아서, 출력해보기

        int result1 = Introduce.sum(10, 20);
        System.out.println("sum 결과: " + result1);
        int result2 = Introduce.mul(10, 20);
        System.out.println("mul 결과: " + result2);
        int result3 = Introduce.sub(10, 20);
        System.out.println("sub 결과: " + result3);
        int result4 = Introduce.div(10, 20);
        System.out.println("div 결과: " + result4);
        float result5 = Introduce.div_float(10, 20);
        System.out.println("div_float 결과: " + result5);

    }

}