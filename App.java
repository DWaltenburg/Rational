//https://books.trinket.io/thinkjava/chapter11.html#sec140 Exercise 4-5
public class App {
    public static void main(String[] args) throws Exception {
        Rational rat1 = new Rational();
        rat1.numerator = 4;
        rat1.denominator = 6;
        Rational rat2 = new Rational(2, 5);

        rat1.printRational();
        rat2.toString();

        Rational rat3 = rat1.add(rat2);
        rat3.printRational();
    }
}
