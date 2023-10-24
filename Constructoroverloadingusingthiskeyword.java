public class Constructoroverloadingusingthiskeyword {
    private String Tv;
    private Motherboard Motherboard;
    public Constructoroverloadingusingthiskeyword(String tv32) {

        this(tv32,new Motherboard());
    }
    public Constructoroverloadingusingthiskeyword(String tv32, Motherboard mb) {
        this.Tv = tv32;
        this.Motherboard = mb;
    }
    public static void main(String[] args) {
        Constructoroverloadingusingthiskeyword C = new Constructoroverloadingusingthiskeyword("tv32",new Motherboard());
        System.out.println(C.Tv);
        System.out.println(C.Motherboard);

    }
}
