package L_Lista;

public class MainGen {
    public static void main(String[] args){
        NodoGen<String> n = new NodoGen<>("Forza magica roma");
        System.out.println( n );

        NodoGen<Float> nf = new NodoGen<>(3.5f);
        System.out.println( nf);
    }
}
