public class Dog extends Pet {
   // private String name;
    private String breed;

 //   public String getName() {
 //       return name;
 //   }

 //   public void setName(String name) {
 //       this.name = name;
 //   }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (this.breed == null)
            this.breed = breed;
        else
            System.out.println("поздно, порода уже задана");
    }

    public Dog(String name, String breed) {
        super();//можно не писать, дефолтный конструктор базового класса
                //будет вызван неявно
        setName(name);
        this.breed = breed;
        System.out.println("вызван конструктор класса Dog");
    }
}
