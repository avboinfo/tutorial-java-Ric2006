package L_Lista;

public class Lista {

    Nodo radice;
    
    public Lista() {
        radice = null;
    }

    public boolean isEmpty() {
        return radice==null;
    }

    public void add( Nodo n ) {
        if (isEmpty()) {
            radice = n;
        } else {
            Nodo p = radice;
            while (p.getSuccessivo()!=null) p = p.getSuccessivo();
            p.setSuccessivo( n );
        }
    }
    public void addHead(Nodo n){
        if (isEmpity()){
            radice =n;
        }else {
            n.setsuccessivo(radice);
            radice=n;
        }
    }
    public void addSorted(Nodo n){
        if (isEmpty()){radice =n n.setSuccessivo(null);return;}
        int vn= n.getValore();
        if(vn<radice.getValore()){
            n.setSuccessivo(radice);
            radice=n;
            return;
        };
        Nodo p1= radice;
        Nodo p2=radice.getSuccessivo();
        while (p2!=null && vn>vp2.getValore()){
            p1=p2;
            p1=p2.getSuccessivo();
        }
        n.setSuccessivo(p2);
        p1.setSuccessivo(n);
    }
    public String toString() {
        String s = "Elementi della lista: ";
        Nodo p = radice;
        while (p!=null) {
            s += p + " ";
            p = p.getSuccessivo();
        }
        s += "End!\n";
        return s;
    }
}