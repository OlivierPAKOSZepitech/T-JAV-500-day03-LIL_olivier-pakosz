import planet.moon.Phobos;

public class Astronaut {

    private static int count = 0;
    private int id = count++;
    private String name;
    private int snacks = 0;
    private String destination = null;

    public Astronaut(String name) {
        this.name = name;
        System.out.println(name + " ready for launch!");
    }

    public void doActions() {
        System.out.println(name + ": Nothing to do.");
        if(this.destination == null){
            System.out.println(name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
        }
    }

    public void doActions(planet.Mars planet) {
        System.out.println(name+ ": Started a mission!");
        this.destination = planet.getLandingSite();
    }

    public void doActions(chocolate.Mars chocolate) {
        this.snacks++;
        System.out.println(name + ": Thanks for this mars number " + chocolate.getId());
        if(this.destination == null){
            System.out.println(name + ": I may have done nothing, but I have " + this.snacks + " Mars to eat at least!");
        }
    }

    public void doActions(Phobos phobos){
        System.out.println(name + ": Started a mission!");
        this.destination = phobos.getLandingSite();
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

    public static int getCount() {
        return count;
    }

    public String getDestination() {
        return destination;
    }

}
