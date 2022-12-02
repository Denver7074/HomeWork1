package course.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public class HomeWork1 {


    //Выражение одной переменной через другую с помощью арифметических действий.
    // Можно выполнить через
    public String arithmetic(int a, int b){
        a = a ^ b; // ^ можно заменить на сумму или умножение (a + b)
        b = a ^ b; // ^ можно заменить на разность или деление (a - b)
        a = a ^ b; // ^ можно заменить на разность или деление (a- b)
        return "Variable a = " + a + "\nVariable b = " + b;
    }

    //Выражение двух переменных через третью.
    public String third(int a, int b){
        int c = a;
        a = b;
        b = c;
        return "Variable a = " + a + "\nVariable b = " + b;
    }

    //Выражение в одну строку
    public String line(int a, int b){
        a = a ^ b ^ (b = a);
        return "Variable a = " + a + "\nVariable b = " + b;
    }

    public boolean convention(String line){
       line = line.trim().replaceAll("[^()]","");//удаляем символы кроме скобок
       if (line.length() % 2 == 0){//Должно быть четное количество символов всегда. Хотя наверное это и так ниже можно понять по конечной длинне строки?
            while (line.contains("()")) { //задаем цикл while, который будет работать до тех пор, пока будет находить пару скобок
               line = line.replaceAll("\\(\\)","");// в это время эту пару скобок он удаляет и присваивает новое значение для строки
            }
            return line.length() == 0; // проверяется равна ли длинна строки конечная 0 Да = true, Нет = false
        }
        return false;
    }



}
