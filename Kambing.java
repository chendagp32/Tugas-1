 

    public class Kambing {
    String Bulu, telinga , mata, kaki,mulut;
        
    /*
    set = kata "SET" hanya kebiasaan programmer yang mengartikan
    fungsi untuk memasukkan nilai kedalam method pada suatu class
    
    get = kata "GET" hanya kebiasaan programmer yang mengartikan
    fungsi untuk mengambil nilai dari class
    */
    
    public void setBulu(String bulu) {
        this.Bulu = Bulu;
    }
 
    public void setMata(String mata) {
        this.mata = mata;
    }
 
    public void setTelinga(String telinga) {
        this.telinga = telinga;
    }
    public void setKaki(String kaki) {
        this.kaki = kaki;
    }
 
    public String getBulu() {
        return Bulu;
    }
 
    public String getmata() {
        return mata;
    }
 
    public String getmulut() {
        return mulut;
    }
 
    public String gettelinga() {
        return telinga;
    }
 
    public String getKaki() {
        return kaki;
    }
    
    void hewanberupa( String m ){ //dgn parameter
        System.out.println("Seekor Kambing"+ m);
    }
    
    void makan(){ //tanpa parameter
        System.out.println("makan rumput");
    }

    void Fungsi(){
    System.out.println("Berkurban di Hari raya Idul Adha");
    }
    
    
    void wilayah(){  
        System.out.println("Berada seluruh wilayah");
    }
    
    void minum(){ 
        System.out.println("minumnya air");
    }
 
}