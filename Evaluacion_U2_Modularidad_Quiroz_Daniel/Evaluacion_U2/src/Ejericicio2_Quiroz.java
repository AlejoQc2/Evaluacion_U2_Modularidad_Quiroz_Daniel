public class Ejericicio2_Quiroz {
    static int pot(int b, int e) {
        if (e == 0) return 1; 
        return b * pot(b, e - 1); 
    }

    public static void main (String[]args){
        int b=3;
        int e=4;
        pot(3,4);
        System.out.println("El numero es :"+pot(b,e));
        System.out.println("b: "+b);
        System.out.println("e: "+e);
    }
}
