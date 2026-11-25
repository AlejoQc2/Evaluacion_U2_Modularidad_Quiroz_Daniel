public class Ejercicio3_Quiroz {
    static void m(int a, int[] v) { 
        a++; 
        v[1] += a; 
    }
    public static void main(String[]args){
        int a=5;
        int[] v={1,2,3};
        m(a,v);
        System.out.println(a + " " + v[1]);
    } 
}
// "a" no va a cambiar dado a que lo usamos para que el valor de v[] cambie, en este caso se le suma "a" al v[] pero al momento que vamos a presentar las variables solo llamamos a "a", no al valor modificado