package lesson2;

public class Task7 {

//    Задача 7*
//    Электронные часы показывают время в формате от 00:00 до 23:59.
//    Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается
//    симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).

    public static void main(String[] args) {

        int count = 0;

        for (int x = 0; x < 24; x++) {

            for (int y = 0; y < 60 ; y++) {



                if (x==y)
                    System.out.println(x + ":" + y);
            }

        }


    }
}
