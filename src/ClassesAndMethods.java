public class ClassesAndMethods {
    public static void main(String[] args) {
        //exemple1();
        exemple2();
    }

    static void exemple2() {
        Cat kitty3 = new Cat("Васька");
        kitty3.say();

        Dog dog1 = new Dog("Мухтар", "овчарка");

        Parrot popka = new Parrot("Кеша", "белый");
        popka.say("А вы бывали на Таити?");
        Pet p = new Cat("Зверюшка");
        System.out.println(p.getClass().getName());
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

