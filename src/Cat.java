public class Cat extends Pet{
    /*private String name;

    public String getName() {
        return name;
    }

    public void setName(String s) {
        System.out.println("было имя " + name + " станет " + s);
        name = s;
    }*/

    public void say() {
        System.out.println("котик " + this.getName() + " говорит МЯУ");
    }

    public Cat() {
        //неявно вызывается super(), то есть деф кон баз класса
        setName("безымянный");
    }


    public void move() {
        jump();
    }

    public Cat(String name) {
        super(name);    //явный вызов конструктора базового класса с параметром
    }

    public void jump(){
        System.out.println("котик "+getName()+" прыгает");
    }
}
