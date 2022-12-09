import java.util.*;

public class Main {
    public static void main(String[] args) {
        

        Map <Car, Harakter> map = new HashMap<>();
        map.put(new Car(100200),new Harakter(2010,"Honda",10000,"Black"));
        map.put(new Car(100300),new Harakter(2011,"Toyota",11000,"White"));
        map.put(new Car(100400),new Harakter(2012,"BMW",15000,"Red"));
        map.put(new Car(100500),new Harakter(2013,"Mersedes-Benz",16000,"Black"));
        map.put(new Car(100600),new Harakter(2015,"Lexus",20000,"Yellow"));

        System.out.println(map.entrySet());

        }

    }
