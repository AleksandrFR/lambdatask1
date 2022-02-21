package ru.netology;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); // тут будет арифметическая ошибка - деление на ноль,
                                         // для корректной работы программы обнрнём в try.. catch
        calc.println.accept(c);
    }
}
