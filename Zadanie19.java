
/*Задание 19
Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.*/


public class Zadanie19 {

    public static void main(String[] args) {

        String str = " Вот вляпался  попробуй разберись  ";
        int n = 1;
        char symbol;

        String str1 = new String(str.trim());

                 System.out.println(str1);

        String str2 = new String(str1.replaceAll("\\s+", "*"));

                System.out.println(str2);

        for (int i = 0; i < str2.length(); i++) {
            symbol = str2.charAt(i);
                if (symbol == '*') {
                    n++;
                }
        }
                  System.out.println("У нас есть " + n + " слов");
    }
}

/*Вот вляпался  попробуй разберись
Вот*вляпался*попробуй*разберись
У нас есть 4 слов

Process finished with exit code 0*/