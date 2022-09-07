public class Rational {
    int numerator;
    int denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void printRational() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public Double toDouble() {
        return (double) (this.numerator) / (double) (this.denominator);
    }

    public void negate() {
        this.numerator -= 2 * this.numerator;
    }

    public void invert() {
        int n = this.numerator;
        this.numerator = this.denominator;
        this.denominator = n;
    }

    public Rational reduce() {
        int gcd = findGCD(this.numerator, this.denominator);
        return new Rational(this.numerator / gcd, this.denominator / gcd);
    }

    public Rational add(Rational rat) {//forlæng brøk a med brøk bs tæller vice versa
        Rational rat2 = new Rational(
            this.numerator*rat.denominator+rat.numerator*this.denominator, 
            this.denominator*rat.denominator
            );
        return rat2.reduce();
    }

    private static int findGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return findGCD(number2, number1 % number2);
    }
}
