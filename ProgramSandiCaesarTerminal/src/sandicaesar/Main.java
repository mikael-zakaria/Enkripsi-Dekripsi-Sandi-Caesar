package sandicaesar;

//Paket Untuk Inputan Data Pada Terminal
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author MZeeta
 */
public class Main {

    //Membuat Static Variabel Untuk Inputan 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //Membuat Static Variabel Dari Kelas SandiCaesar
    static SandiCaesar sandi_caesar = new SandiCaesar();
    
    public static void main(String[] args) throws IOException {
        
        int pilihan;
        
        do {
            
            System.out.println("1. Enkripsi");
            System.out.println("2. Dekripsi");
            System.out.println("0. Exit");
            
            System.out.print("-> ");
            pilihan = Integer.parseInt( br.readLine() );
            
            if (pilihan == 1) {
                enkripsi();
            } else if (pilihan == 2){
                dekripsi();
            } else if (pilihan == 0){
                break;
            } else {
                System.err.println("\nInputan Anda Tidak Valid\n");
            }
            
        } while( pilihan != 0 );
        
        System.out.println("\nProgram Berhenti");
        
    }
    
    //Membuat Method Prosedur Static Untuk MengEnkripsi 
    static void enkripsi () throws IOException {
        
        String input = "";
        int kunci;
        
        System.out.print("\nMasukkan Inputan Kata Anda      : ");
        input = br.readLine();
        
        System.out.print("Masukkan Inputan Kunci Angka Anda : ");
        kunci = Integer.parseInt(br.readLine()) ;
        
        System.out.println("\nChiper Text : " + sandi_caesar.enkripsi(input, kunci));
        
        System.out.println();
    }
    
    //Membuat Method Prosedur Static Untuk MenDekripsi
    static void dekripsi () throws IOException {
        
        String input = "";
        int kunci;
        
        System.out.print("\nMasukkan Inputan Kata Anda      : ");
        input = br.readLine();
        
        System.out.print("Masukkan Inputan Kunci Angka Anda : ");
        kunci = Integer.parseInt(br.readLine()) ;
        
        System.out.println("\nPlain Text : " + sandi_caesar.dekripsi(input, kunci));
        
        System.out.println();
    }
    
}
