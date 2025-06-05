package ch4;

public class Phone {

    String model;
    String price;
    String company;

    public Phone() {
        // 기본 생성자 내용은 비워둠, 필요시 초기화 작업 가능
    }

    public Phone(String model) {
        this.model = model;

    }

    // 2개의 매개변수를 가지는 생성자
    public Phone(String model, String price) {
        this.model = model;
        this.price = price;
    }

    // 3개 형태의 생성자
    public Phone(String model, String price, String company) {
        this.model = model;
        this.price = price;
        this.company = company;

    }

    public void showInfo() {

        System.out.println("모델명 : " + this.model);
        System.out.println("가격 : " + this.price);
        System.out.println("제조사 : " + this.company);

    }
}
