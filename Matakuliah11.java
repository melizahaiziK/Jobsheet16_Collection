public class Matakuliah11 {
    String kodeMK;
    String namaMK;
    int sks;

    public Matakuliah11(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    @Override
    public String toString() {
        return kodeMK + "\t" + namaMK + "\t" + sks;
    }
}
