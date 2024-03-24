package Day240321;

public class Cyclider extends Circle{
    private double length;
    public Cyclider(double radius){
        super(radius);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    //求圆柱面积
    public  double findVolume(){
        //return 3.14*getRadius*getRadius*getLength();
        //return super.findArea()*getLength();
        return findArea()*getLength();
    }
    /*@Override
    public double findArea(){
        return Math.PI*this.radius*this.radius;
    }*/
}
