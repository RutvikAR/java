class a{
    public void abc()
        {
            System.out.println("This is a method :");
        }
    }
    class b extends a{
        public void acb()
        {
            System.out.println("this is first :");
            abc();
        }
    }
    class extend {
    public static void main(String[] args) {
        b b1 = new b();
        b1.abc();
        System.out.print("\n \n \n \n");
        b1.acb();
    }
}
