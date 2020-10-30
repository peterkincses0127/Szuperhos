import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Kepregeny {
    private static ArrayList <Vasember> vasemberHosLista = new ArrayList<>();
    private static ArrayList <Batman> batmanHosLista = new ArrayList<>();
    static void szereplok(String file) throws FileNotFoundException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        try {
            String sor  = br.readLine();
            while (sor !=null){
                String[] st = sor.split(" ");
                if (st[0]== "Batman"){
                    Batman b1 = new Batman(100);
                    for (int i = 0; i < Integer.parseInt(st[1]); i++) {
                        b1.kutyutKeszit();
                    }
                    batmanHosLista.add(b1);
                    
                }else {
                    Vasember v1 = new Vasember(150, true);
                    for (int i = 0; i < Integer.parseInt(st[1]); i++) {
                        v1.kutyutKeszit();
                    }
                    vasemberHosLista.add(v1);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    static void szuperhosok(){
        for (Vasember item: vasemberHosLista
             ) {
            System.out.println(item.mekkoraAzEreje());
        }
        for (Batman item: batmanHosLista
        ) {
            System.out.println(item.mekkoraAzEreje());
        }
    }
    public static void main(String[] args) {
        try {
            szereplok("hosok.txt");
            szuperhosok();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
