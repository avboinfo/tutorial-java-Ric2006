package L_Lista;

public class Lista{


    class Iteratore{
        private Nodo nodo;

        private Iteratore(Nodo nodo){
            this.nodo = nodo;
        }

        public boolean hasNext(){
            return nodo != null;    //ha un successivo == true
        }                           //non ha un successivo == false

        public Nodo next(){
            if(nodo == null) return null;
            Nodo result = new Nodo(nodo.getValore(), nodo.getSuccessivo());
            nodo = nodo.getSuccessivo();
            return result;
        }
    }

    public Iteratore getIterator(){
        Iteratore i = new Iteratore(radice);
        return i;
    }

Nodo radice;

public Lista(){
    radice = null;
}

public boolean isEmpty(){
    return radice==null;
}
public boolean addAfter(Nodo n, int pos){
    if(isEmpty()){
        return false;
    }
    Nodo p = radice;
    while(p != null){
        if(p.getValore() == pos){
            n.setSuccessivo(p.getSuccessivo());
            p.setSuccessivo(n);
            return true;
        }
        p = p.getSuccessivo();
    }
    return false;
}

public void add(Nodo n){
    if(isempty()){
        radice = n;
    }else{
        Nodo p = radice;
        while(p.getSuccessivo()!=null){
            p=p.getSuccessivo();
        }
        p.setSuccessivo(n);
    }
}

public boolean removePos(int pos){
    if(isEmpty()){
        return false;
    }
    if(radice.getValore() == pos){
        radice = radice.getSuccessivo();
        return true;
    }
    Nodo p1 = radice;
    Nodo p2 = radice.getSuccessivo();
    while(p2 != null){
        if(p2.getValore() == pos){
            p1.setSuccessivo(p2.getSuccessivo());
            return true;
        }
        p1 = p2;
        p2 = p2.getSuccessivo();
    }
    return false;
}

public boolean removeValue(int value){
    if(isEmpty()){
        return false;
    }
    if(radice.getValore() == value){
        radice = radice.getSuccessivo();
        return true;
    }
    Nodo p1 = radice;
    Nodo p2 = radice.getSuccessivo();
    while(p2 != null){
        if(p2.getValore() == value){
            p1.setSuccessivo(p2.getSuccessivo());
            return true;
        }
        p1 = p2;
        p2 = p2.getSuccessivo();
    }
    return false;
    }
}







