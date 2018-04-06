package praktek3;
public class elektronikAksi {
    public static void main(String[] args) {
        Elektronik e = new Elektronik();
       
       e.setMerk("Sharf");
       e.setJenis("ac");
       e.setHarga(3000000);
       
       
        e.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(e.getMerk());
        System.out.print("Jenisnya \t: ");
        System.out.println(e.getJenis());
        System.out.print("Harganya \t: ");
        System.out.println(e.getHarga());
        
    }
}
