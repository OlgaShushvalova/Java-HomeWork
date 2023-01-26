import java.io.FileReader;
//import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;

public class lesson4 {
    public static void main(String[] args) {
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();
        String str = "";

        //1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
        try {
            /*FileWriter writer = new FileWriter("test.txt");
            writer.append("Привет, как твои дела?");
            writer.flush();
            writer.close();*/

            FileReader reader = new FileReader("test.txt");
            while (reader.ready()){
                str += (char)reader.read();
            }
            reader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //System.out.println(str);

        // 2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
        //3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках.
        
        String[] text = str.split("\r\n");
        for (int i = 0; i < text.length; i++) {
            String[] sb = text[i].split(" ");
            //System.out.println(sb[0]+" "+sb[1].charAt(0)+"."+sb[2].charAt(0)+"."+" "+sb[3]+" "+sb[4]);

            family.add(sb[0]+" ");
            name.add(sb[1].charAt(0) + ".");
            soname.add(sb[2].charAt(0) + "."+" ");
            age.add(Integer.valueOf(sb[3]));
            gender.add(" "+sb[4]);
            index.add(i);
        }

        for (int i = 0; i < index.size(); i++) {
            System.out.printf(family.get(index.get(i)));
            System.out.printf(name.get(index.get(i)));
            System.out.printf(soname.get(index.get(i)));
            System.out.printf(age.get(index.get(i)).toString());
            System.out.printf(gender.get(index.get(i)));
            System.out.println();
        }
    }
}
