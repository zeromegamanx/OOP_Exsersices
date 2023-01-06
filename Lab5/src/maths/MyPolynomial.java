package maths;

public class MyPolynomial {  // Poly = đa thức
    private double[] coeffs;  // coeffs = hệ số
    public MyPolynomial(double ... coeffs){
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return this.coeffs.length - 1;  //bậc của đa thức là length - 1
    }

    public String toString(){
        StringBuilder description = new StringBuilder();
        //duyệt mảng theo thứ tự ngược lại
        for (int i = this.getDegree(); i >= 0 ; i--) {
            description.append(this.coeffs[i])
                    .append("x^")
                    .append(i)
                    .append(" + ");     //thừa ra 2 ký tự trắng và dấu cộng cuối cùng
        }
        description.delete(description.length() - 3, description.length()); // xóa 3 ký tự thừa
        return description.toString();
    }

    public double evaluate(double x){
        double polyValue = 0;
        for (int i = this.getDegree(); i >= 0; i--){
            polyValue = polyValue * x + this.coeffs[i];
        }
        return polyValue;
    }

    public MyPolynomial add(MyPolynomial right){
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] addPolyData = new double[maxDegree];

        //them poly vào addPoly
        for (int i = 0; i <= this.getDegree(); i++) {
            addPolyData[i] += this.coeffs[i];
        }

        //Thêm rightPoly vào addPoly
        for (int i = 0; i <= right.getDegree(); i++) {
            addPolyData[i] += right.coeffs[i];
        }

        //Tạo đa thức nhận các dữ liệu trên vào đa thức
        MyPolynomial addPoly = new MyPolynomial(addPolyData);
        return addPoly;
    }

    public MyPolynomial multiply(MyPolynomial right){
        int multiPolyDegree = this.getDegree() + right.getDegree();  // bậc của đa thức hiện tại
        double[] multiPolyData = new double[multiPolyDegree];

        // gán giá trị bằng đa thức bằng công thức tích chập
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree() ; j++) {
                multiPolyData[i + j] += this.coeffs[i] + right.coeffs[j];
            }
        }

        MyPolynomial multiPoly = new MyPolynomial(multiPolyData);
        return multiPoly;
    }
}
