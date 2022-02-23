class a{
    void bca()
        {
            System.out.println("This is a method :");
        }
    }
    class b extends a{
        void bca()
        {
            System.out.println("this is first :");
        }
    }
    class methourr1 extends b {
        void bca(){
            System.out.println("this is hello :");

        }
    public static void main(String[] args) {
        a a1 = new a();
        a1.bca();
        a a2 = new b();
        a2.bca();
        a a3 = new methourr1();
        a3.bca();
    }
}
