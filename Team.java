import planet.Mars;
import planet.moon.Phobos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private ArrayList<Astronaut> astronauts = new ArrayList<>();

    public Team(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Astronaut astronaut){
        this.astronauts.add(astronaut);
    }

    public void remove(Astronaut astronaut){
        this.astronauts.remove(astronaut);
    }

    public int countMembers(){
        return this.astronauts.size();
    }

    public void showMembers(){
        if(this.astronauts.isEmpty()){
            return;
        }

        StringBuilder sb = new StringBuilder(this.name + ": ");
        astronauts
                .forEach(astronaut -> sb
                        .append(astronaut.getName())
                        .append(astronaut.getDestination() == null ? " on standby" : " on mission")
                        .append(", "));
        System.out.println(sb.substring(0, sb.length() - 2) + ".");
    }

    public void doActions(Mars mars){
        this.astronauts
                .forEach(astronaut -> astronaut.doActions(mars));
    }

    public void doActions(chocolate.Mars mars){
        this.astronauts
                .forEach(astronaut -> astronaut.doActions(mars));
    }

    public void doActions(){
        System.out.println(this.name + ": Nothing to do.");
    }

    public void doActions(Phobos phobos){
        this.astronauts
                .forEach(astronaut -> astronaut.doActions(phobos));
    }

}
