public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber (int nume, int deno){
    super (0.0);
    numerator = nume;
    denominator = deno;
    if (deno == 0){
      numerator = 0;
      denominator = 1;
    }
    reduce();
  }

  public double getValue(){
    return (0.0 + numerator ) / denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);
  }

  public boolean equals (RationalNumber other){
    return (this.getValue() == other.getValue());
  }

  public String toString(){
    if ((denominator == 1) || (numerator == 0)){
      return (numerator + "");
    } else {
      return (numerator + "/" + denominator);
    }
  }

 private static int gcd(int a, int b){
   if (b == 0){
     return a;
   } else {
     return gcd(b, a % b);
   }
}

 private void reduce(){
   int GCD = gcd(numerator, denominator);
   numerator = numerator / GCD;
   denominator = denominator / GCD;
 }

 /******************Operations Return a new RationalNumber!!!!****************/
 /**
 *Return a new RationalNumber that is the product of this and the other
 */
 public RationalNumber multiply(RationalNumber other){
   return new RationalNumber(this.getNumerator() * other.getNumerator(), this.getDenominator() * other.getDenominator());
 }

 /**
 *Return a new RationalNumber that is the this divided by the other
 */
 public RationalNumber divide(RationalNumber other){
    return new RationalNumber(this.getNumerator() * other.getDenominator(), this.getDenominator() * other.getNumerator());
 }

 /**
 *Return a new RationalNumber that is the sum of this and the other
 */
 public RationalNumber add(RationalNumber other){
   return new RationalNumber((this.getNumerator() * other.getDenominator() + this.getDenominator() * other.getNumerator()), (this.getDenominator() * other.getDenominator()));
 }
 /**
 *Return a new RationalNumber that this minus the other
 */
 public RationalNumber subtract(RationalNumber other){
   return new RationalNumber((this.getNumerator() * other.getDenominator() - this.getDenominator() * other.getNumerator()), (this.getDenominator() * other.getDenominator()));
 }

}
