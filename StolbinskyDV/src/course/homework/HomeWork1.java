package course.homework;




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
       line = line.trim().replaceAll("[^()]","");                       //удаляем символы кроме скобок
       if (line.length() % 2 == 0){                                     //Должно быть четное количество символов всегда. Хотя наверное это и так ниже можно понять по конечной длинне строки
            while (line.contains("()")) {                               //задаем цикл while, который будет работать до тех пор, пока будет находить пару скобок
               line = line.replaceAll("\\(\\)","");                     // в это время эту пару скобок он удаляет и присваивает новое значение для строки
            }
            return line.length() == 0;                                  // проверяется равна ли длинна строки конечная 0 Да = true, Нет = false
        }
        return false;
    }


    //Через цикл
    public boolean convention2(String line){
     int count = 0;
     for (int i = 0; i < line.length(); i++){
         if (line.substring(i,i+1).equals("(") ){  //можно заменить на charAt и тогда можно использовать обычное сравнение ==
             count++;
         }
         else if (line.substring(i,i+1).equals(")")){
             count--;
         }
         else{
             continue;
         }
         if (count < 0){
             return  false;
         }
     }
     return count == 0;
    }
    
    
}
   




