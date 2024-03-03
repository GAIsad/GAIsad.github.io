package day240303.e2;

public class Studentwithdogs {
    String id;
    String name;
    String age;
    Dog[] dogs;
    public void show(){
        System.out.println("学生(学号"+id+")的信息：学号="+id+" "+"姓名="+name+" "+"年龄="+age+" "+"\n"+"有"+dogs.length+"只狗狗");
        for(Dog dog:dogs){
            System.out.println("狗（编号"+dog.id+")的信息:编号="+dog.id+"、名字="+dog.name+"、颜色="+dog.color);
        }
    }
}
