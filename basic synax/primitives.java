public class primitives {
  // Java supports Eight primitive types
  // byte, short, int, long, float, and double
  // these are number based types meaning store number integer etc
  // boolean True or False
  // char: Unicode characters , and String 

  public static void primitivesTypes() {
    byte binary = Byte.MAX_VALUE - 2;
    short kilobytes = Short.MAX_VALUE - 2;
    int gigabytes = Integer.MAX_VALUE - 2;
    long exabytes = Long.MAX_VALUE - 2;
    float quettabytes = Float.MAX_VALUE - 2;
    double centillion_bytes = Double.MAX_VALUE - 2;

    boolean flag = true;

    char[] unicode = {
      '\u0048' ,'\u0065', '\u006C', '\u006C', '\u006F', '\u0020', '\u0057', '\u006F', '\u0072' , '\u006C', '\u0064', '\u0021' 
    };  
    // Strings are immutable
    String s =  "this is a string";
    

    Object[] types = {binary,kilobytes,gigabytes,exabytes,quettabytes,centillion_bytes,flag,new String(unicode),s};

    for (Object item : types) {
      IO.println(item);
    };

  };
  
  public static void IntegerLiterals() {
    // integer literals

    // The number 2009, in decimal
    int decimalValue = 2009;

    // The number 2009, in hexadecimal
    int hexadecimalVaule = 0x7D9;

    // The number 2009, in binary
    int binaryValue = 0b11111011001;

    Object[] ints = {decimalValue,hexadecimalVaule,binaryValue};

    for (Object item : ints) {
      IO.println(item);
    };

  };

  public static void main(String[] args) {
    IntegerLiterals();
  }

}
