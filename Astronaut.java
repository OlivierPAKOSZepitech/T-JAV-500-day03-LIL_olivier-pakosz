import chocolate.*;
import planet.*;

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

    public void doActions() {
        System.out.println(this.name + ": Nothing to do.");
    }

    public void doActions(planet.Mars mars) {
        System.out.println(this.name + ": Started a mission.");
        this.destination = mars.getLandingSite();
    }

    public void doActions(chocolate.Mars mars) {
        System.out.println(this.name + ": Thanks for this Mars number " + mars.getId());
        if (this.destination == null) {
            System.out.println(
                    this.name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
        }
        this.snacks += 1;
    }
    public static void main(String[] args) {
        chocolate.Mars snack = new chocolate.Mars();
        planet.Mars rock = new planet.Mars("Viking 1");
        System.out.println(snack.getId());
        System.out.println(rock.getLandingSite());
    }
}