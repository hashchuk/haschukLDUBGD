public class Main {
    public static void main(String[] args) {
        //        Преше завдання
        int a;
        int b;
        a = 25;
        b = 3;
        System.out.print(a/b);
        System.out.println( " та " + a%b);

        //        Друге завдання
        int mainNum = 25;
        int firstNum = mainNum / 10;
        int secondNum = mainNum % 10;
        int sum = firstNum + secondNum;
        System.out.println("Сума цифр двозначного числа " + mainNum + " дорівнює " + sum);
        //        Третє завдання
        double d = Math.round(19.44);
        System.out.println("Результат: " + d);

    }
}