public class SiswaPindahan extends Siswa{

    public String npm;
    public String nomorHp;
    public int lamaKuliah;

    public void penerimaanSiswa(){

    }

    public void pengajuanPindahan(){

    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    public int getLamaKuliah() {
        return lamaKuliah;
    }

    public void setLamaKuliah(int lamaKuliah) {
        this.lamaKuliah = lamaKuliah;
    }

    @Override
    public void menerimaNilai() {
        super.menerimaNilai();
    }

    @Override
    public void melakukanPenelitian() {
        super.melakukanPenelitian();
    }
}
