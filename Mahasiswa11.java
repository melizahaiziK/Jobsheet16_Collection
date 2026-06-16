public class Mahasiswa11 {
    String nim;
    String nama;
    String telp;

    public Mahasiswa11(String nim, String nama, String telp) {
        this.nim = nim;
        this.nama = nama;
        this.telp = telp;
    }

    @Override
    public String toString() {
        return nim + "\t" + nama + "\t" + telp;
    }
}
