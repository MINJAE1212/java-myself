package util.random;

public class RandomUtilMain {

    public static void main(String[] args) {

        System.out.println("Math.random()를 사용하여 생성된 난수: " + RandomUtil.generateRandom());
        System.out.println("1이상 45 이하 사이의 랜덤정수: " + RandomUtil.generateRandomInRange(1, 45));

        System.out.println("로또 번호 생성 결과: ");
        RandomUtil.Lotto(); // Lotto 메서드를 호출하여 로또 번호를 생성하고 출력

    }
}
