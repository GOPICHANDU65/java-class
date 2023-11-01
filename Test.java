
        public class Test {
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
        Object ob =  new Object();
        Test t = new Test();
        Student2 ss = t.getpassedstudent(s1);
        if(ss !=null){
            System.out.println(ss.getmarks());
        }

        Student2 sss = t.getpassedstudent(s2);
        if(sss != null){
            System.out.println(sss.getmarks());
        }



    }
}
