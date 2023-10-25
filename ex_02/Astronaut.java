public class Astronaut {
    private static int nextId = 0;
    private int id;
    private String name;
    private int snacks;
    private String destination;

    public Astronaut(String name) {
        this.id = nextId;
        this.name = name;
        this.snacks = 0;
        this.destination = null;
        nextId++;
        System.out.println(name + " ready for launch!");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSnacks() {
        return snacks;
    }

    public String getDestination() {
        return destination;
    }

    public static void main(String[] args) {
        Astronaut mutta = new Astronaut("Mutta");
        Astronaut hibito = new Astronaut("Hibito");
        System.out.println(mutta.getId());
        System.out.println(hibito.getId());
    }
}