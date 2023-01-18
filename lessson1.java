
import java.util.Random;


public class lessson1 {

    // 1 Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i 
    public static int randomNum() {
        return new Random().nextInt(2001);
    }  
    
    // 2 Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    public static int maxBit(int i) {
        return Integer.toBinaryString(i).length();
    }

    public static void main(String[] args) {
        int i = randomNum();
        System.out.println("Случайное число: = " + i);
        int n = maxBit(i);
        System.out.println("Старший бит = " + n);

    //3  Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1 
        int c = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n != 0) c++;
        } 

        int[] m1 = new int[c];
        c = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n != 0) m1[c++] = j;
        }

    // 4 Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        c = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n == 0) c++;
        } 

        int[] m2 = new int[c];
        c = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n == 0) m2[c++] = j;
        }
    }
}

 

    
   
