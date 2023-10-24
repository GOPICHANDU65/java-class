public class Person {
    public  int getperson(){

        return adhno;
    }

    private int adhno;
    public Person(int adhno){
        this.adhno=adhno;

    }
    public static void main(String[]args){
        Person pp = new Person(788);
        Person ppp= new Person(789);
        System.out.println(pp.adhno);
        System.out.println(ppp.adhno);
    }



}

