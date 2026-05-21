package java_prct;
public class BoxingPerf {
    public static void main(String[] args){
        long t1 = System.nanoTime();
        long primSum = 0;
        for (long i = 0; i < 10_000_000L; i++) primSum += i;
        System.out.println("Primitive: " + (System.nanoTime() - t1) / 1_000_000 + " ms");

        long t2 = System.nanoTime();
        Long boxSum = 0L;
        for (long i = 0; i < 10_000_000L; i++) boxSum += i;
        System.out.println("Boxed:     " + (System.nanoTime() - t2) / 1_000_000 + " ms");
    }
}
