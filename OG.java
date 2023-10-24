public class OG {
    public Address getAddress(){
        Address chandu = new Address();
        chandu.houseno = "1\18";
        chandu.street = "jayanthiroad";
        chandu.village = "peddapuram";
        chandu.pincode = 521181;
        return chandu;

    }
    public static void main(String[]args){
        OG pk = new OG();
        System.out.println(pk.getAddress().houseno);
        System.out.println(pk.getAddress().street);
        System.out.println(pk.getAddress().village);
        System.out.println(pk.getAddress().pincode);
    }
}
