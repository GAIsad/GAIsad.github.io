package day240131;

public class Student {
    //state 储存-> fields 里层
    private String name;
    private char sex;
    private String hairstyle;
    private int age;

    public Student(String name, char sex, String hairstyle, int age) {
        this.name = name;
        this.sex = sex;
        this.hairstyle = hairstyle;
        this.age = age;
    }

    //behavior 暴露通过方法(最基础的main方法）外层
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getHairstyle(){
        return hairstyle;
    }
    public void setHairstyle(String hairstyle){
        this.hairstyle=hairstyle;
    }
}
