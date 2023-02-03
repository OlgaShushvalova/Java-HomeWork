import java.util.HashMap;

public class lesson6 {
    //Разработать программу, имитирующую поведение коллекции HashSet. В программе содать метод add добавляющий элемент, и метод позволяющий выводить эллементы коллекции в консоль. Формат данных Integer.

    private static HashMap <Integer, Object> hMap = new HashMap<>();
    private static final Object OBJECT = new Object();
    public static void main(String[] args) {
        add(55);
        add(12);
        add(2);
        add(87);
        System.out.println(hMap);
        System.out.println(geString());
    }
    public static void add (Integer numbers){
        hMap.put(numbers, OBJECT);
    }

    private static String geString(){
        return hMap.keySet().toString();
    }
}
