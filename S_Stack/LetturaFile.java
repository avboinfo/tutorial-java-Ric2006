package S_Stack;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LetturaFile {
     

    Stack<String> s;

    public LetturaFile() {
        s = new Stack <String>();
    }

     public void Leggi_file(String fn, String fnOutput){
         
        File f = new File(fn);

        try{
              Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
  	          String r = sc.nextLine();
                s.push(r);
            }
        }catch (Exception ex) {
	            System.out.println(ex.getMessage());
         }  
         Scrivi_file(fnOutput);
    }  

    public void Scrivi_file(String fn){
        
        try {
            
            FileWriter scr;
            scr =  new FileWriter(fn, false);
            BufferedWriter out = new BufferedWriter(scr);
            if(s.size()==0){
                out.newLine(); 
            }
            String x = null;
            do{
                x=s.pop();
                if(x!=null){
                    out.write(x);
                    out.newLine();
                }
            }while(x != null);

            out.close();
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
    }       
}


