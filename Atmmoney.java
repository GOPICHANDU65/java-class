public class Atmmoney {
    public Atm getAtmmmoney(Atm a){
        if (a.getpassword()==7899){
            return a;
        }
        else {
            return null;
        }

    }
    public static void main(String[]arga){
        Atm atm = new Atm(7899,5000);
        Atm atm2 = new Atm(345,4000);
        Atmmoney aa = new Atmmoney();
        Atm mm = aa.getAtmmmoney(atm);
        if(mm!=null){
            System.out.println(mm.getpassword());
        }

        Atm mmm = aa.getAtmmmoney(atm2);
        if(mmm != null){
            System.out.println(mmm.getpassword());
        }
    }
}
