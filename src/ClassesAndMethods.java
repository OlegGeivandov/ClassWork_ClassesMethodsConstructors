public class ClassesAndMethods {
    public static void main(String[] args) {
        //exemple1();
        exemple2();
    }

    static void exemple2() {
        Cat kitty3 = new Cat("Васька");
        kitty3.say();

        Dog dog1 = new Dog("Мухтар", "овчарка");

    }

    static void exemple1() {
        Cat kitty1=new Cat(), kitty2 = new Cat();
        kitty1.setName("Барсик");
        kitty2.setName("Клеопатра");
        System.out.println(kitty1.getName());
        kitty1.setName("Наполеон");
        System.out.println(kitty1.getName());

        kitty1.say();
        Cat[] massiv = new Cat[3];
        massiv[0] = kitty1;
        massiv[1] = kitty2;
        massiv[2] = new Cat();
        for (Cat cat: massiv    ) {
            cat.say();
        }
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

    public void say()
    {
        System.out.println("котик "+name+" говорит МЯУ");
    }

    public Cat()
    {
        setName( "безымянный");
    }

    public Cat(String name)
    {
        setName(name);
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

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        System.out.println("вызван конструктор класса Dog");
    }
}