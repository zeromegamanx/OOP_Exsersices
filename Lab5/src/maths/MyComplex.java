package maths;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex(){     //Hàm dựng mặc định k có tham số truyền vào
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void  setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public String toString(){
        StringBuilder description = new StringBuilder();
        description.append(this.real)
                .append(" + ")
                .append("i")
                .append(this.imag);
            return description.toString();
    }

    public boolean isReal(){
        if (Double.compare(this.imag, 0.0)  == 0){  //Kiểm tra số real với số 0 có bằng nhau hay ko
            return true;
        }
        return false;
    }

    public boolean isImaginary(){
        if (Double.compare(this.real, 0.0)  == 0){
            return true;
        }
        return false;
    }

    public boolean equal(double real, double imag){
        if ((Double.compare(this.real , real) == 0)
                && (Double.compare(this.imag , imag) == 0)){
            return true;
        }
        return false;
    }

    public double magnitute(){
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public MyComplex addInto(MyComplex right){
        this.real = this.real + right.real;
        this.imag = this.imag + right.imag;
        return this; // trả về số hiện tại
    }
    public MyComplex addNew(MyComplex right){
        MyComplex newComplex = new MyComplex();
        newComplex.setReal(this.real + right.real);
        newComplex.setImag(this.imag + right.imag);
        return newComplex;
    }


}
