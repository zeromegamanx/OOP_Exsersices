package circle;

public class Circle {
    private double radius;   //dữ liệu thành viên (tên dữ liệu)

    //hàm dựng
    public Circle(){    //Hàm dựng mặc định
        //khởi tạo dữ liệu đối tượng
        this.radius = 1.0;          //dữ liệu của đối tượng hiện tại
        System.out.println("Default constructor called");
    }

    public Circle(double radius){  //radius này là tham số. Đây là hàm dựng
        this.radius = radius;
        System.out.println("Parameter constructor called");
    }

    public double getRadius(){

        return this.radius;
    }
    public void setRadius(double radius){

        this.radius = radius;
    }

    public double getArea(){

        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference(){

        return 2 * Math.PI * this.radius;
    }

    public String toString(){
        StringBuilder description = new StringBuilder();
        description.append("circle")
                .append("[")
                .append("radius=")
                .append(this.radius)
                .append("]");
                return description.toString();
    }
}
