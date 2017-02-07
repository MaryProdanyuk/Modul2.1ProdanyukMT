import com.sun.javafx.runtime.SystemProperties;

/**
 * Created by Admin on 06.02.2017.
 */
public class Module21 {
    public static void main(String[] args) {
        int[] array = {-100, -2, 6, 8, -17, 0, 45, 89, -6, 47};
        Module21 module21 = new Module21();
        module21.sum(array);
        module21.min(array);
        module21.max(array);
        module21.maxPositive(array);
        module21.multiplication(array);
        module21.modulus(array);
        module21.secondLargest(array);

    }

    public void sum(int array[]) {

        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa += array[i];
        }
        System.out.println("Сумма элементов = " + summa);
    }

    public void min(int array[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("Минимальный элемент в массиве: " + min);
    }

    public void max(int array[]) {
        long max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение в массиве: " + max);
    }

    public void maxPositive(int array[]) {
        int maxPos = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0 && maxPos < array[i])
                maxPos = array[i];
        }
        if (maxPos < 0) {
            System.out.println("Нет положительных числел.");
        } else
            System.out.println("Наибольшее положительное число: " + maxPos);
    }


    public void multiplication(int array[]) {
        long multi = 1;
        for (int i = 0; i < array.length; i++) {
            multi *= array[i];
        }
        System.out.println("Произведение элементов = " + multi);
    }


    public void modulus(int array[]) {
        double mod;
        mod = array[0] % array[array.length - 1];
        System.out.println("Модуль от деления " + mod);
    }


    public void secondLargest(int array[]) {
        int SecMax = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if ((array[i] > SecMax) && (array[i] != max)) {
               SecMax = array[i];
           }
        }
        System.out.println("Второе максимальное число " + SecMax);
    }

}


