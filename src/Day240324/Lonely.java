package Day240324;

public class Lonely {
    //state
    String name;
    String 不同人的孤独;
    String 描述孤独;
    String 描述一个人;
    //behavior
    void everyonesay(String name,String 不同人的孤独){
        System.out.println(name+不同人的孤独);
    }
    void say(String 描述孤独){
        this.描述孤独=描述孤独;
        System.out.println("每个人都有自己的孤独"+描述孤独);
    }
     private void privatedescribe(){
         System.out.println("谁tm让你评价的");
        System.out.println("习大大很牛逼");
    }
    void describe(String 描述一个人){

      this.描述一个人=描述一个人;
      privatedescribe();
    }
}
