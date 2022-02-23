class sybca {
        sybca()
        {
            System.out.println ("This is constructor");
            runmethod();
        }
        public static void runmethod()
        {
            System.out.println("This is static method");
        }
        public void sybca()
        {
            System.out.println("This is sybca method");
        }
    }
public class ks
{
    public static void main(String[] args) {
        sybca s1 = new sybca();
        s1.sybca();
    }
}


