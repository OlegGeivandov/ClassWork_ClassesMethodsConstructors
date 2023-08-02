import java.util.ArrayList;
import java.util.List;

public class ClassesAndMethods {
    public static void main(String[] args) {
        //exemple1();
        //exemple2();
        exemple3();
    }

    private static void exemple3() {
        Dog d = new Dog("Каштанка", "дворняга");
        d.walkOutsideHouse();
        Parrot parrot = new Parrot("Гоша", "зеленый");
        parrot.walkOutsideHouse();
        Cat cat = new Cat("Cat");
        cat.walkOutsideHouse();

        Pet[] pets = new Pet[3];
        pets[0] = cat;  pets[1] = parrot;  pets[2] = d;
        walkWithPets(pets);

        ArrayList<Pet> petArrayList = new ArrayList<>();
        petArrayList.addAll(List.of(pets));
        petArrayList.add(new Cat("Васька"));

        walkWithPets(petArrayList);
    }

    static void walkWithPets(Pet[] pets)
    {
        System.out.println("========== все пошли гулять ==========");
        for (int i = 0; i < pets.length; i++) {
            pets[i].walkOutsideHouse();
        }

        System.out.println("========== все вернулись ==========");
    }

    static void walkWithPets(ArrayList<Pet> petList)
    {
        Pet[] pets2 = new Pet[petList.size()];
        petList.toArray(pets2);
        walkWithPets(pets2);
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

