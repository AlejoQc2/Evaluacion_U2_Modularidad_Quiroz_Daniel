public class Ejercicio5_Quiroz {

    public static int sumaPares(int n) {
        if (n < 2) {
            return 0;
        }

        if (n % 2 != 0) {
            n--;
        }

        return n + sumaPares(n - 2);
    }
    public static boolean esCapicua(String palabra) {
        if (palabra.length() <= 1) {
            return true;
        }
        if (palabra.charAt(0) != palabra.charAt(palabra.length() - 1)) {
            return false;
        }
        return esCapicua(palabra.substring(1, palabra.length() - 1));
    }
    public static void main(String[] args) {
        System.out.println("sumaPares(10) = " + sumaPares(10));
        System.out.println("sumaPares(7) = " + sumaPares(7));
        System.out.println("esCapicua(\"12321\") = " + esCapicua("12321"));
        System.out.println("esCapicua(\"12345\") = " + esCapicua("12345"));
        System.out.println("esCapicua(\"121\") = " + esCapicua("121"));
    }
}
