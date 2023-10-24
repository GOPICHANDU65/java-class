public class AGE {
    public int getage(int year){
        int currentyear=2023;
        int age= currentyear-year;
        return age;

    }
    public static void main(String[]args){
        AGE age=new AGE();
        System.out.println(age.getage(2001));


    }
}
