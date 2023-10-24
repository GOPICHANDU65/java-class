public class Constructor {
    public Constructor(Student ss ,Address aa){
        System.out.println("from Constructor");

    }
    public static void main(String[]args){
        Student sss = new Student ();
        Address aaa = new Address ();
        Constructor cc = new Constructor( sss, aaa);

    }
}
