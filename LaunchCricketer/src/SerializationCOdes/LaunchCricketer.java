package SerializationCOdes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Cricketer implements Serializable
{
    String name;
    int runs;
    float avg;
    int catches;
    int matches;
   
    public Cricketer(String name, int runs, float avg, int catches, int matches) {
        super();
        this.name = name;
        this.runs = runs;
        this.avg = avg;
        this.catches = catches;
        this.matches = matches;
    }
   
    void disp() {
        System.out.println("Name of the Cricketer: "+name);
        System.out.println("Runs of the Cricketer: "+runs);
        System.out.println("Avrg of the Cricketer: "+avg);
        System.out.println("Catches of the Cricketer: "+catches);
        System.out.println("Matches of the Cricketer: "+matches);
    }
}

