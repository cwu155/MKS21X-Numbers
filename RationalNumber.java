public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber (int num, int den){
    super (1.0);
    numerator = num;
    denominator = den;
  }

  public int getNumerator(){
    return 0;
  }

  public int getDenominator(){
    return 0;
  }

  public int getRational(){
    return 0;
    // divides the numerator by denominator to get a rounded int value.
  }

  public boolean isZero(){
    return false;
  }

  public String toString(){
    return "";
  }

}
