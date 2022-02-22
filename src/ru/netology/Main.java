package ru.netology;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);// тут будет деление на ноль при делении на ноль результат бесконечность
            calc.println.accept(c);
    }
}
