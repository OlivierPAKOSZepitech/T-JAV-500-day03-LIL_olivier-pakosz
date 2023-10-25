package planet;

public class Mars {
    private static int nextId = 0;
    private int id;
    private String landingSite;

    public Mars(String landingSite) {
        this.id = nextId;
        this.landingSite = landingSite;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getLandingSite() {
        return landingSite;
    }
}
