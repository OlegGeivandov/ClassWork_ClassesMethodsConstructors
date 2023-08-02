public abstract class Pet {
    private String name;

    public Pet(String name) {
        System.out.println("конструктор класса Pet");
        this.name = name;
    }

    public Pet() {
        System.out.println("дефолтный конструктор класса Pet");
    }

    public String getName() {

        return name;
    }

    public void setName(String s) {
        System.out.println("было имя " + name + " станет " + s);
        this.name = s;
    }

    public abstract void move();

    public void walkOutsideHouse()
    {
        System.out.println("выйдем из дома с "+getName());
        move();
        System.out.println("вернемся");
    }
}
