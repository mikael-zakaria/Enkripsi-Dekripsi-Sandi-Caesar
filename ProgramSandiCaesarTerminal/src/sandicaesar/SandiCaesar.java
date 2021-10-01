package sandicaesar;

/**
 *
 * @author Mika'el Zakaria
 * 18.44 WIB - 26/09/2020 
 * Lamongan, East Java Indonesia
 * 
 * Ini Merupakan Program Enkripsi-Dekripsi Sederhana Menggunakan Metode Sandi Caesar Menggunakan Shifter Angka
 * Contoh : Jika Kata 'Zaka' di beri kunci 1(satu) maka hasil enkripsi yaitu 'Ablb'
 *          Jika Kata 'Aan' di beri kunci 1(satu) maka hasil enkripsi yaitu 'Bbo'
 * 
 */

public class SandiCaesar {
    
    //Method For Encrypt With 2 Paramaters Input And Modulo(for Key)
    public String enkripsi(String input, int kunci){
        String output = "";
        char huruf;
        
        //Looping untuk membaca semua huruf dari inputan
        for(int i=0; i<input.length(); i++){
            //Memasukkan Huruf(Char) dari inputan ke variabel huruf
            huruf = input.charAt(i);
            
            //Kondisi apabila huruf merupakan a - z (huruf Kecil) 
            if(huruf >= 'a' && huruf <= 'z'){
                
                //Modulo 26 digunakan untuk panjang huruf Alphabet a - z
                huruf += kunci%26;
                
                //Kondisi apabila huruf melebihi nilai ASCII dari 'z'(Kecil)
                if(huruf > 'z'){
                    
                    //Mengurangi nilai ASCII dari variabel huruf
                    huruf -= 26;
                }
                
            //Kondisi apabila huruf merupakan A - Z (huruf Kapital)
            }else if(huruf >= 'A' && huruf <= 'Z'){
                
                //Modulo 26 digunakan untuk panjang huruf Alphabet A-Z
                huruf += kunci%26;
                
                //Kondisi apabila huruf melebihi nilai ASCII dari 'Z'
                if(huruf > 'Z'){
                    
                    //Mengurangi nilai ASCII dari variabel huruf
                    huruf -= 26;
                }
            }
            
            //Mengisi String Output dengan char dari variabel huruf Dengan Perulangan For
            output += huruf;
        }
        
        //MeReturn Variable output Bertipe Data String
        return output;
    }
    
    //Method For Decrypt With 2 Paramaters Input And Modulo(for Key)
    public String dekripsi(String input, int kunci){
        String output = "";
        char huruf;
        
        //Looping untuk membaca semua huruf dari inputan
        for(int i=0; i<input.length(); i++){
            
            //Memasukkan Huruf(Char) dari inputan ke variabel huruf
            huruf = input.charAt(i);
            
            //Kondisi apabila huruf merupakan a - z (huruf Kecil)
            if(huruf >= 'a' && huruf <= 'z'){
                
                //Modulo 26 digunakan untuk panjang huruf Alphabet a - z
                huruf -= kunci%26;
                
                //Kondisi apabila huruf kurang dari nilai ASCII dari 'a'(Kecil)
                if(huruf < 'a'){
                    
                    //Menambah nilai ASCII dari variabel huruf
                    huruf += 26;
                }
                
            //Kondisi apabila huruf merupakan A - Z (huruf Kapital)    
            }else if(huruf >= 'A' && huruf <= 'Z'){
                
                //Modulo 26 digunakan untuk panjang huruf Alphabet A - Z
                huruf -= kunci%26;
                
                //Kondisi apabila huruf kurang dari nilai ASCII dari 'A'(Kapital)
                if(huruf < 'A'){
                    
                    //Menambah nilai ASCII dari variabel huruf
                    huruf += 26;
                }
            }
            
            //Mengisi String Output dengan char dari variabel huruf Dengan Perulangan For
            output += huruf;
        }
        
        //MeReturn Variable output Bertipe Data String
        return output;
    }
    
}
