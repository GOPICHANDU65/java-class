
    public class A {
        public Student getStudent(){
            Student chandu = new Student();
            chandu.name = "HARI";
            chandu.rollno = 105;
            chandu.email = "chandu@gmail.com";
            Address address=new Address();
            address.houseno="18";
            address.street="jayanthiroad";
            address.village="peddapuram";
            address.pincode=521181;
            chandu.Address=address;
            Country country=new Country();
            country.country="india";
            address.Country= country;
            return chandu;



        }
        public static void main(String[]args){
            A og = new A();
            System.out.println(og.getStudent().name);
            System.out.println(og.getStudent().rollno);
            System.out.println(og.getStudent().email);
            System.out.println(og.getStudent().Address.houseno);
            System.out.println(og.getStudent().Address.street);
            System.out.println(og.getStudent().Address.village);
            System.out.println(og.getStudent().Address.pincode);
            System.out.println(og.getStudent().Address.Country.country);

        }




    }

