public class Test1 {

    public Student2 getpassedstudent(Student2 s) {

        if (s.getmarks() > 35) {
            return s;
        }
        else {
            return null;
        }

    }
    public static void main(String[]args){

        Student2 s1 = new Student2("chandu", 22, 50);

        Student2 s2 = new Student2("sarath", 45, 32);
        Test1 T = new Test1();
        Student2 ss = T.getpassedstudent(s1);
        if(ss !=null){
            System.out.println(ss.getmarks());
        }

        Student2 sss = T.getpassedstudent(s2);
        if(sss != null){
            System.out.println(sss.getmarks());
        }


        Student2 s3 = s1;
        Student2 s4 = s2;
        if (s1==s3){
            System.out.println("both s1 and s3 are erual");
        }
        else {
            System.out.println("both s1 and s3 are not equal");
        }
        if(s2==s4){
            System.out.println("both s2 and s4 are  equal");
        }
        else{
            System.out.println("both s2 and s4 are not equal");
        }
        if(s1==s2){
            System.out.println("both s1 and s2 are equal");
        }
        else{

            System.out.println("both s1 and s2 are not equal");
        }
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        }

    }



