package L_Lista;

public class NodoGen<T> {
    private T valore;
    private NodoGen<T> successivo;

    public NodoGen(T valore){
        this.valore = valore;
        successivo = null;
    }

    public void setValore(T nValore) {
        valore = nValore;
    }

    public T getValore() {
        return valore;
    }

    public String toString() {
        return "Il suo valore è: " + valore;
    }
}
