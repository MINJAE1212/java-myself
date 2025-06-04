package ch4;

public class MainClassCh4 {
    public static void main(String[] args) {

        // Car car1 = new Car(); // 기본 생성자 호출

        // car1.model = "suv";
        // car1.price = "4000만원";
        // car1.company = "기아자동차";

        // car1.showInfo();

        // Car car2 = new Car(); // 기본 생성자 호출
        // car2.model = "k5세단";
        // car2.price = "3000만원";
        // car2.company = "기아자동차";
        // car2.showInfo();

        Phone phone1 = new Phone();
        phone1.model = "Galaxy";
        phone1.price = "100만원";
        phone1.company = "삼성전자";
        phone1.showInfo();
        System.out.println("============================");

        Phone phone2 = new Phone();
        phone2.model = "iPhone";
        phone2.price = "110만원";
        phone2.company = "Apple";
        phone2.showInfo();
        System.out.println("============================");

        Phone phone3 = new Phone();
        phone3.model = "Pixel";
        phone3.price = "90만원";
        phone3.company = "Google";
        phone3.showInfo();
        System.out.println("============================");
    }
}
