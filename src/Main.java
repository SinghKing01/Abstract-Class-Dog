import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Rottweiler extends Dog {

    public Rottweiler(int intialEnergy) {
        super(intialEnergy);
    }

    public void eat(){
        energy++;
    }
    public  void poop(){
        try{
            if(energy == 0){
                throw new NegativeEnergy("Negative Energy not allowed!");
            }else{
                energy--;
            }
        } catch (NegativeEnergy e) {
            System.out.println("Error: " + e);
        }
    }

}

public class Main {
    static Rottweiler r1 = new Rottweiler(20);
    static Rottweiler r2 = new Rottweiler(7);

    static String txt = "hello hello hi how are I you hi how you";

    static String [] parsed = txt.split(" ");

    public static void main(String[] args) {

        for (int i = 0; i < 25; i++) {
            r1.poop();
            r2.eat();
        }

        System.out.printf("R1 energy: %d, R2 energy: %d%n", r1.energy, r2.energy);

        Map<String,Integer> mapping = new HashMap<String,Integer>();
        for (int i = 0; i < parsed.length; i++) {
            mapping.put(parsed[i],0);
        }

        for (int i = 0; i < parsed.length; i++) {
            int val = mapping.get(parsed[i]);
            mapping.put(parsed[i],val+1);
        }
        System.out.println(mapping.entrySet());

        ArrayList<String> strList = new ArrayList<String>();
        strList.add("HELLO");
        strList.add("Dilpreet");
        strList.add("Singh");
        String [] str = new String[5];
        strList.toArray(str);

        for(String word : str){
            System.out.printf("%s, ",word);
        }
    }
}