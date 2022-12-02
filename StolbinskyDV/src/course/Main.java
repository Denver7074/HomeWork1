package course;

import course.homework.HomeWork1;

public class Main {

    public static void main(String[] args) {

        HomeWork1 homeWork1 = new HomeWork1();

        //Дано
        int a = 5;
        int b = 15;

        //Арифметическое выражение одной переменной через другую
        System.out.print("Arithmetic replacement method:" + "\n" + homeWork1.arithmetic(a,b));
        //Выражение переменных с созданием третьей
        System.out.print("\nThrough the third variable:" + "\n" + homeWork1.third(a,b));
        //В одну строку, но мне кажется это не правильно так как должен быть метод типа swap, как в C#
        System.out.print("\nOne line:" + "\n" + homeWork1.line(a,b));
        //Проверка валидности выражения
        System.out.println("\n"+"The expression is valid: "+ homeWork1.convention("()()fgdfg"));

    }
}
