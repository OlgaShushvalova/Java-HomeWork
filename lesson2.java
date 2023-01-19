
public class lesson2 {
    public static void main(String[] args) {
        //1
        wordString("солнце","луна");
        //2
        wordStringRev("солнце","ецнлос");
        //3
        String s= "земля";
        s=reverseStr(s);
        System.out.println(s);
        //4
        StringBuilder sb = createStr(3, 56);
        System.out.println(sb);
        //5
        modifySymbol(sb);
        System.out.println(sb);
        //6
        repSymbol(sb);
        System.out.println(sb);
    }
 
    //1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
    public static void wordString(String str1, String str2) {
        System.out.println(str1.contains(str2));
    }

    //2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
    public static void wordStringRev(String str1, String str2) {
        System.out.println(str1.equals(new StringBuilder(str2).reverse().toString()));
    }

    //3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
    public static String reverseStr(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    //4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
    public static StringBuilder createStr(int a, int b) {
        StringBuilder builder = new StringBuilder();
            builder.append(String.format("%d + %d = %d\n", a, b, a + b));
            builder.append(String.format("%d - %d = %d\n", a, b, a - b));
            builder.append(String.format("%d * %d = %d\n", a, b, a * b));
            return builder;
    }
    
    //5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
    public static StringBuilder modifySymbol(StringBuilder builder) {
        int index;
        while ((index = builder.indexOf("="))!=-1) {
            builder.deleteCharAt(index).insert(index, "равно").toString();
        }
        return builder;
    }
       
    //6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
    public static StringBuilder repSymbol(StringBuilder builder) {
        builder.toString().replaceAll("=", "равно");
        return builder;
    }
}
