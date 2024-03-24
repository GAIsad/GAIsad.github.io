package Day240324;

public class Person {
    //state
    String name;
    int numberCat;
    int numberDog;
    String nameCat;
    String nameDog;
    //behavior
    public int getNumberCat() {
        return numberCat;
    }

    public void setNumberCat(int numberCat) {
        this.numberCat = numberCat;
    }
    public int getNumberDog() {
        return numberDog;
    }

    public void setNumberDog(int numberDog) {
        this.numberDog = numberDog;
    }

    void adoptedCat(){
        System.out.println(name+"养了"+numberCat+"只猫"+"猫叫："+nameCat);
    }
    void adoptedDog(){
        System.out.println(name+"养了"+numberDog+"只狗"+"狗叫:"+nameDog);
    }

}
