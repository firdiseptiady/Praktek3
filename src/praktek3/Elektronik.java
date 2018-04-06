package praktek3;

import static java.time.Clock.system;

public class Elektronik {
    String merk;
    String jenis;
    double harga;
    
    
    void cetakInfo(){
        System.out.println("Merk \t: "+merk+"\n"+"Jenis \t: "+jenis+"\n"+"Harga \t:"+harga);
    }
}
