public class whileloop {
    public static void main(String[] args) {
        long i=0,fact=1,num=5;
        i = num;
        while (num!=0) {
            fact = fact*num;
            num--;
        }
        System.out.print("the foctorial of "+i+"is : "+fact);
    }
}
