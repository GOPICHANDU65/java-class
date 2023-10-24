public class AB {
    public int getab(int a ,int b){
        int ab=a*a+b*b+2*a*b;
        return ab;
    }
    public static void main(String[]args){
        AB ab=new AB();
        System.out.println(ab.getab(2,2));

    }
}
