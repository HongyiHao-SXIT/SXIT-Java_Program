public class Complex {
    private double a;
    private double b;

    public Complex() {
    }

    public Complex(double a) {
        this.a = a;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Complex add(Complex cn) {
        Complex temp = new Complex();
        temp.setA(this.getA() + cn.getA());
        temp.setB(this.getB() + cn.getB());
        return temp;
    }

    public Complex subtract(Complex cn) {
        Complex temp = new Complex();
        temp.setA(this.getA() - cn.getA());
        temp.setB(this.getB() - cn.getB());
        return temp;
    }

    public Complex multiply(Complex cn) {
        Complex temp = new Complex();
        temp.setA(this.getA() * cn.getA() - this.getB() * cn.getB());
        temp.setB(this.getB() * cn.getA() + this.getA() * cn.getB());
        return temp;
    }

    public Complex divide(Complex cn) {
        double denominator = cn.getA() * cn.getA() + cn.getB() * cn.getB();
        if (denominator == 0) {
            throw new ArithmeticException("The divisor cannot be zero");
        }
        Complex temp = new Complex();
        temp.setA((this.getA() * cn.getA() + this.getB() * cn.getB()) / denominator);
        temp.setB((this.getB() * cn.getA() - this.getA() * cn.getB()) / denominator);
        return temp;
    }

    @Override
    public String toString() {
        if (b >= 0) {
            return a + " + " + b + "i";
        } else {
            return a + " - " + (-b) + "i";
        }
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, 2);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);
        Complex quotient = c1.divide(c2);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c1 + c2 = " + sum);
        System.out.println("c1 - c2 = " + difference);
        System.out.println("c1 * c2 = " + product);
        System.out.println("c1 / c2 = " + quotient);
    }
}    