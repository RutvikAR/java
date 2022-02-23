abstract class baseclass {
    abstract public void show();
}
class childclass
{
    public void show()
    {
        System.out.print("overloading abstraact method");
    }
}
public class abstractiondemo {
    public static void main(String[] args) {
        childclass obj = new childclass();
        obj.show();
    }
}