public class Circle implements Shape {

    int radius;

    public double getPermiter (){
        return 2 * radius * Math.PI ;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public Circle (int radius){
        this.radius=radius;
    }


}
