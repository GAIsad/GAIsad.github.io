package day240131;

public class PhoneTest {
    public static void main(String[] args) {


        Phone phone = new Phone();
        phone.size=12;
        phone.phonecolor="blue";
        phone.phonesort="IQQO";
        System.out.println(phone.size+" "+phone.phonesort+" "+phone.phonecolor);
        phone.function1("dad");
        phone.function2("23分钟");
    }
}