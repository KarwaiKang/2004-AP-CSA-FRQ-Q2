import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList;

    public Kennel() {
        this.petList = new ArrayList<Pet>();
    }

    public void allSpeak() {
        String out = "";
        for (Pet p : petList) {
            out += p.getName() + ": " + p.speak() + "\n";
        }
    }
}
