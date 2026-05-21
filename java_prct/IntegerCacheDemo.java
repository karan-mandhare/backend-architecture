package java_prct;
public class IntegerCacheDemo{
    public static void main(String[] args) {
        for(int i = -130;i<=130;i++){
            Integer a = i; // autoboxing conversion of int to Integer
            Integer b = i; // method used Integer.valueOf(i) which uses cache for values between -128 and 127
            if (a != b) {
                System.out.println("Different references at: " + i);
            }
        }
    }
}