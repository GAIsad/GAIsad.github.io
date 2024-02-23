package day240222;

public class Circle {
    //state
    Double pi= 3.14;
    private double radius;
    //behavior
    public void setradius(double setradius){
        radius=setradius;
        if(radius<0){
            System.out.println("错误的输入");
        }

    }
    public String getradius(){
        return "圆的面积是"+(pi*radius*radius);
    }
}
