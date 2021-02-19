//Zadanie18
package com.company;

public class Zadanie18 {

    public static void main(String[] args) {
     /*   Задание 18
        Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
        общее их количество.*/
        String str = (" 1. ОБЩИЕ ПОЛОЖЕНИЯ\n" +
                "\n" +
                "1.1. Настоящий Договор, размещенный на сайте мёдтут.бел, в соответствии с п.2 ст.407 Гражданского кодекса Республики Беларусь (далее – ГК РБ) является публичной офертой Продавца, адресованной неопределенному кругу лиц, заключить договор купли-продажи Товара на условиях, определенных в настоящем Договоре, и содержит все существенные условия купли-продажи Товара по почте и через сеть Интернет.\n" +
                "\n" +
                "1.2. Заключение Договора происходит посредством присоединения Покупателя к настоящему Договору, т.е. посредством принятия (Акцепта) условий настоящего Договора в целом без каких-либо условий, изъятий и оговорок (ст.398 ГК РБ).\n" +
                "\n" +
                "1.3. Настоящий Договор при условии соблюдения порядка его принятия (Акцепта) считается заключенным в простой письменной форме (п. 2,3 ст.404, п.3 ст.408 ГК РБ).\n" +
                "\n" +
                "1.4. Продавец оставляет за собой право вносить изменения в настоящий Договор и в информацию на страницах Интернет-магазина в связи с чем, Покупатель обязуется на момент оформления Заказа ознакомиться с текстом настоящего Договора и информацией, размещенной на страницах Интернет-магазина.");
        int n = 0;
        char symbol;
        for(int i = 0;i < str.length(); i++){
            symbol = str.charAt(i);
            if(symbol == ',' || symbol == '.' || symbol == '-' || symbol == '?' || symbol == '!' || symbol == ':' || symbol == ';') {
                n++;
            }
        }
        System.out.println("У нас есть " + n + " знаков препинания");
    }
}