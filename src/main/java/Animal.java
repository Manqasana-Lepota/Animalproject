public class Animal {

    private String name;


    public Animal() {

    }

    public void sound()
    {

        System.out.println( name + " Sound");
    }

    public void eat()
    {

        System.out.println( name + " eats");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
