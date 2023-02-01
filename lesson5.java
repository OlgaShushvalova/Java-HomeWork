import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class lesson5 {
    public static void main(String[] args) {
        //1. Создать словарь HashMap. Обобщение <Integer, String>.
        //2. Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)

        HashMap<Integer, String> dictionary = new HashMap<>();
        dictionary.put(0, "Петров Василий Иванович 50 м");
        dictionary.put(1, "Сидорова Лидия Михайловна 12 ж");
        dictionary.put(2, "Степанова Клавдия Васильевна 25 ж");
        dictionary.put(3, "Васильев Владимир Иванович 19 м");
        dictionary.put(4, "Куц Сергей Сергеевич 62 м");

        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();
        
        //3. Изменить значения сделав пол большой буквой.

        Set<Integer> kSet = dictionary.keySet();
        for (int i = 0; i < kSet.size(); i++) {
            String[] str = (dictionary.get(kSet.toArray()[i]).split("\n"));
            for (int j=0; j<str.length; j++){
                String[] tmp = str[j].split(" ");
                System.out.println(tmp[0] + " " + tmp[1] + " " + tmp[2] + " " + tmp[3] + " " + tmp[4].toUpperCase());
            }
        }

        //4. Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
        for (int i = 0; i < kSet.size(); i++) {
            String[] str = (dictionary.get(kSet.toArray()[i]).split("\r\n"));
            for (int j = 0; j < str.length; i++) {
                String[] tmp = str[j].split(" ");
                index.add(i);
                family.add(tmp[0]+" ");
                name.add(tmp[1].charAt(0) + ".");
                soname.add(tmp[2].charAt(0) + ".");
            }
    
        }
        for (int i = 0; i < index.size(); i++) {
            System.out.println(family.get(index.get(i)));
            System.out.println(name.get(index.get(i)));
            System.out.println(soname.get(index.get(i)));
            System.out.println();
        }
         
    }
}