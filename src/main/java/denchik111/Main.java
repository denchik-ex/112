package denchik111;

public class Main {

    public static int countDigits(String s, int index) {
        // База рекурсии: дошли до конца строки
        if (index == s.length()) {
            return 0;
        }

        // Если текущий символ — цифра, добавляем 1
        int current = (s.charAt(index) >= '0' && s.charAt(index) <= '9') ? 1 : 0;

        // Переходим к следующему символу
        return current + countDigits(s, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(countDigits("abc", 0));    // 0
        System.out.println(countDigits("a1b23", 0));  // 3
        System.out.println(countDigits("2024", 0));   // 4
        System.out.println(countDigits("", 0));       // 0
    }
}