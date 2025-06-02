package util.random;

public class RandomUtil {

    // 0.0이상 1.0 미만의 난수를 생성하는 메소드를 작성
    public static double generateRandom() {

        double randomValue = Math.random(); // Math.random()은 0.0 이상 1.0 미만의 난수를 반환
        return randomValue; // 생성된 난수를 반환

    }

    public static int generateRandomInRange(int min, int max) {
        int randomValue = (int) (Math.random() * (max - min + 1)) + min;
        return randomValue;

    }
    // 랜덤한 숫자를 생성하는 기능.
    // 퀴즈1
    // 로또 번호를 생성하는 기능을 만들기.
    // 조건문을 활용해서, 중복된 숫자가 발생 안하도록, 1이상 45이하의 랜덤정수

    public static void Lotto() {

        int n1 = generateRandomInRange(1, 45);

        int n2;
        do {
            n2 = generateRandomInRange(1, 45);
        } while (n1 == n2); // 중복된 숫자가 발생하지 않도록

        int n3;
        do {
            n3 = generateRandomInRange(1, 45);
        } while (n1 == n3 || n2 == n3); // 중복된 숫자가 발생하지 않도록

        int n4;
        do {
            n4 = generateRandomInRange(1, 45);
        } while (n1 == n4 || n2 == n4 || n3 == n4); // 중복된 숫자가 발생하지 않도록

        int n5;
        do {
            n5 = generateRandomInRange(1, 45);
        } while (n1 == n5 || n2 == n5 || n3 == n5 || n4 == n5); // 중복된 숫자가 발생하지 않도록

        int n6;
        do {
            n6 = generateRandomInRange(1, 45);
        } while (n1 == n6 || n2 == n6 || n3 == n6 || n4 == n6 || n5 == n6); // 중복된 숫자가 발생하지 않도록

        System.out.println("자동 로또 번호 생성기 사용한 번호 : "
                + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6);
    }

}

// 정적 메소드를 만들어서, 출력 문장에서, 랜덤 숫자 6개 보여주기 형식으로 하기.