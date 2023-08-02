public class Parrot extends Pet{
    String color;

    public Parrot(String name, String color) {
        super(name);
        this.color = color;
    }

    public void say(String phrase)
    {
        System.out.println("Попугай "+getName() +" говорит \""+phrase+"\"");
    }
}
