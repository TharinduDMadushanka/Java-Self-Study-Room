//make same name methods using different data types(signature)---> method overloading
public class methodOverload {
    public static void main(String[] args) {
        int i = -100;
        long l = -200;
        float f = -300.3f;
        double d = -456.2;

        i = abs(i);
        l = abs(l);
        f = abs(f);
        d = abs(d);

        System.out.println(i); // 100
        System.out.println(l); // 200
        System.out.println(f); // 300.3
        System.out.println(d); // 456.

    }
    public static int abs(int i){
        i=-i;
        return i;
    }
    public static long abs(long l){
        l=-l;
        return l;
    }
    public static float abs(float f){
        f=-f;
        return f;
    }
    public static double abs(double d){
        d=-d;
        return d;
    }
}
