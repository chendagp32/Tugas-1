
public class Hewan {
    
    String nama;
    int umur;
 
    boolean status;
    
    //Method Set
    void setNama(String nama){
        this.nama = nama;
    }
    void setUmur(int umur){
        this.umur = umur;
    }
    void setStatus(boolean status){
        this.status = status;
    }
    
    //Method Get
    String getNama(){
        return nama;
    }
    int getUmur(){
        return umur;
    }
    boolean getStatus(){
        return status;
    }
    
    public static void main(String[] args){
        //Membuat Objek dari Class
        Hewan PesawatTelpon = new Hewan();
        //============== INPUT ==============
        PesawatTelpon.setNama("Chenda Gusmadarisky Puta");
        PesawatTelpon.setUmur(20);
        PesawatTelpon.setStatus(true);
        //============== OUTPUT ==============
        System.out.println("Nama Saya: "+ PesawatTelpon.getNama());
        System.out.println("Umur Saya: "+ PesawatTelpon.getUmur()+" Tahun");
        System.out.println("Status Saya: "+ PesawatTelpon.getStatus());
    }
}