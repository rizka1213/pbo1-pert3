import java.util.Date;

public class Siswa {
    private int id;
    private String nidn;
    private String namaLengkap;
    private Date tanggalLahir;
    private Date tanggalDiterima;
    private String jabatanKelas;
    private String Jurusan;
    private int tahunLulus;
    
    public void Belajar(){
        
    }
    
    public void melakukanPenelitian(){
        
    }
    
    public void melakukanMagang(){
        
    }
    
    public void menerimaNilai(){
        
    }

    public Siswa() {
    }

    public Siswa(int id, String nidn, String namaLengkap, Date tanggalLahir, Date tanggalDiterima, String jabatanKelas, String jurusan, int tahunLulus) {
        this.id = id;
        this.nidn = nidn;
        this.namaLengkap = namaLengkap;
        this.tanggalLahir = tanggalLahir;
        this.tanggalDiterima = tanggalDiterima;
        this.jabatanKelas = jabatanKelas;
        Jurusan = jurusan;
        this.tahunLulus = tahunLulus;
    }

    public Siswa(int id, String nidn, String namaLengkap) {
        this.id = id;
        this.nidn = nidn;
        this.namaLengkap = namaLengkap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Date getTanggalDiterima() {
        return tanggalDiterima;
    }

    public void setTanggalDiterima(Date tanggalDiterima) {
        this.tanggalDiterima = tanggalDiterima;
    }

    public String getJabatanKelas() {
        return jabatanKelas;
    }

    public void setJabatanKelas(String jabatanKelas) {
        this.jabatanKelas = jabatanKelas;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        Jurusan = jurusan;
    }

    public int getTahunLulus() {
        return tahunLulus;
    }

    public void setTahunLulus(int tahunLulus) {
        this.tahunLulus = tahunLulus;
    }
}
