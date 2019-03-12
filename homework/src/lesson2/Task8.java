package lesson2;

public class Task8 {
//    Задача 8
//    В городе N есть большой склад на котором существует 50000 различных полок. Для удобства работников
//    руководство склада решило заказать для каждой полки табличку с номером от 00001 до 50000 в местной типографии,
//    но когда таблички напечатали, оказалось что печатный станок из-за неисправности не печатал цифру 2, поэтому все таблички,
//    в номерах которых содержалась одна или более двойка (например, 00002 или 20202) — надо перепечатывать. Напишите программу,
//    которая подсчитает сколько всего таких ошибочных табличек оказалось в бракованной партии.

    public static void main(String[] args) {


        int count = 0;

        for (int i = 1; i <= 50000; i++) {


        int a = i / 10000 % 10;
        int b = i / 1000 % 10;
        int c = i / 100 % 10;
        int d = i / 10 % 10;
        int e = i % 10;

        if (a == 2 || b == 2 || c == 2 || d == 2 || e == 2)
            count++;

        }

        System.out.println(count);
    }
}