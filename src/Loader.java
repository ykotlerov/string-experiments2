import java.util.Scanner;

public class Loader
{
    public static void main(String[] args)
    {
        //Задача 1
        // Подсчёт суммы всех чисел в строке
        /*String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        text.trim();
        String s = "";
        int summa = 0;
        String [] strings = text.split("\\s+");

        for (int i = 0; i < strings.length; i++)
        {
           s = strings[i].replaceAll("[^0-9]","");
           if (s.length() > 0 ) summa = summa + Integer.parseInt(s);
           s = "";
        }

        System.out.println("Сумма заработанных денег: " + summa + " руб.");  */

        //Задача 2
        // Разделение строки на Ф.И.О.: Фёдоров Дмитрий Петрович
        /*Scanner in = new Scanner(System.in);
        System.out.print("Укажите Фамилию Имя и Отчество : ");
        String fio = in.nextLine();
        fio.trim();
        String [] strings = fio.split("\\s+");
        if (strings.length > 0)
        {
          for (int i = 0; i <= strings.length-1; i++)
          {
                StringBuffer s = new StringBuffer();
                switch(i)
                {
                    case 0: s.append("Фамилия: "); break;
                    case 1: s.append("Имя: "); break;
                    case 2: s.append("Отчество: ") ; break;
                    default: s.append("Ещё какой-то текст: "); break;
                }
               System.out.println(s.append(strings[i]));
          }
        } else System.out.println("Ф.И.О на задано!");  */

        //Задача 3
        // Приведение телефона к формату +7 XXX XXX-XX-XX
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String text = in.nextLine();
        String namber = text.replaceAll("[^0-9]","");

        if (namber.length() == 11 & ( namber.charAt(0) == '7' || namber.charAt(0) == '8') ) {
            String s = "";
            s += namber.substring(1, 11);
            namber = ""; namber += s;
        }
        if (namber.length() != 10)
            System.out.println("Номер телефона указан неверно.");
        else
        {
            System.out.println("Номер приведённый к требуемому формату:");
            System.out.println("+7 " + namber.substring(0,3) + " " + namber.substring(3,6) + "-" + namber.substring(6,8) + "-" + namber.substring(8,10));
        }

    }
}