public class Main {
    public static void main(String[] args) {
        // задача 1
        int age = 24;
        if (age >= 18) {
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
        // задача 2
        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        //задача 3
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч то придется заплатить штраф");
        } else {
            System.out.println("Если скокрость " + speed + " км/ч можно ездить спокойно");
        }
        // задача 4
        int age1 = 37;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу");
        } else if (age1 >=18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в университет");
        } else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить на работу");
        }
        // задача 5
        int age2 = 14;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему нельзя кататься на аттракционе");
        } else if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему можно кататься на аттракционе в сопровождении");
        } else if (age2 >= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему можно кататься на аттракционе без сопровождения");
        }

        // задача 6
        int places = 62;
        int places2 = 32;
        if (places < 60 && places2 < 42) {
            System.out.println("В вагоне есть и сидячие и стоячие места");
        } else if (places >= 60 && places2 < 42) {
            System.out.println("В вагоне есть только стоячее места");
        } else if (places < 60 && places2 >= 42) {
            System.out.println("В вагоне есть только сидячие места");
        } else if (places >= 60 && places2 >= 42) {
            System.out.println("В вагоне нет свободных места");
        }
        // задача 7
        int one = 80;
        int two = 70;
        int three = 90;
        if (one > two && one > three) {
            System.out.println("Первое число больше второго и третьего");
        } else if (two > one && two > three) {
            System.out.println("Второе число больше первого и третьего");
        } else  if (three > one && three > two) {
            System.out.println("Третье число больше второго и первого");
        } else if (one >= two && one > three) {
            System.out.println("первое и второе больше третьего");
        } else if (two >= three && two > one) {
                System.out.println("второе и третье число больше первого");
        } else if (one >= three && one > two) {
            System.out.println("первое и третье больеш второго");
        } else if(one >= two && two >= three) {
            System.out.println("все числа равны");

        }




    }
}