package Day240324;

public class Person {
    //state
    String name;
    private int numberCat;
    private int numberDog;
    String nameCat;
    String nameDog;
    //behavior
    public int getNumberCat() {

        return numberCat;
    }

    public void setNumberCat(int numberCat) {
        if (numberCat>0) {
            this.numberCat = numberCat;
        }
        else{
            System.out.println("输入错误");
        }
    }
    public int getNumberDog() {
        return numberDog;
    }

    public void setNumberDog(int numberDog) {
        if (numberDog>0) {
            this.numberDog = numberDog;
        }
        else{
            System.out.println("输入错误");
        }
    }

    void adoptedCat(){
        System.out.println(name+"养了"+numberCat+"只猫"+"猫叫："+nameCat);
    }
    void adoptedDog(){
        System.out.println(name+"养了"+numberDog+"只狗"+"狗叫:"+nameDog);
    }

}
