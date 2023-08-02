public class ClassesAndMethods {
    public static void main(String[] args) {
        exemple1();
    }

    static void exemple1() {
        Cat kitty1=new Cat(), kitty2 = new Cat();
        kitty1.setName("Барсик");
        kitty2.setName("Клеопатра");
        System.out.println(kitty1.getName());
        kitty1.setName("Наполеон");
        System.out.println(kitty1.getName());
        //kitty2.name = "hjkljl";
    }
}

class Cat {
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String s)
    {
        System.out.println("было имя "+name+" станет "+s);
        name = s;
    }
}

class Dog{
    private String name;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(this.breed == null)
            this.breed = breed;
        else
            System.out.println("поздно, порода уже задана");
    }
}