public class primitives {
  // Java supports Eight primitive types
  // byte, short, int, long, float, and double
  // these are number based types meaning store number integer etc
  // boolean 
  // char: Unicode characters , and String

  public static void main(String[] args) {
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

    Object[] types = {binary,kilobytes,gigabytes,exabytes,quettabytes,centillion_bytes,flag,new String(unicode)};

    for (Object item : types) {
      IO.println(item);
    };

  };
  

}
