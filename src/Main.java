import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Mela");
        fruits.add("Pera");
        fruits.add("Banana");
        fruits.add("Fragola");

        System.out.println("La frutta nella lista è: " + fruits);

        fruits.addFirst("Kiwi");
        fruits.addLast("Anguria");

        System.out.println("La frutta nella nuova lista è: " + fruits);
    }
}