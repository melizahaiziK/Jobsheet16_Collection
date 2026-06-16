import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main11 {
    static ArrayList<Mahasiswa11> daftarMhs = new ArrayList<>();
    static ArrayList<Matakuliah11> daftarMK = new ArrayList<>();
    static ArrayList<Nilai11> daftarNilai = new ArrayList<>();

    public static void isiData() {
        daftarMhs.add(new Mahasiswa11("20001", "Thalhah", "021x10"));
        daftarMhs.add(new Mahasiswa11("20002", "Zubair", "021x11"));
        daftarMhs.add(new Mahasiswa11("20003", "Abdur-rahman", "021x12"));
        daftarMhs.add(new Mahasiswa11("20004", "Sa'ad", "021x13"));
        daftarMhs.add(new Mahasiswa11("20005", "Sa'id", "021x14"));
        daftarMhs.add(new Mahasiswa11("20006", "Ubaidah", "021x15"));

        daftarMK.add(new Matakuliah11("00001", "Internet of Things", 3));
        daftarMK.add(new Matakuliah11("00002", "Algoritma dan Struktur Data", 2));
        daftarMK.add(new Matakuliah11("00003", "Algoritma dan Pemrograman", 2));
        daftarMK.add(new Matakuliah11("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMK.add(new Matakuliah11("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    public static void inputNilai(Scanner sc) {
    System.out.println("Masukan data");

    System.out.print("Kode\t: ");
    String kode = sc.nextLine();

    System.out.print("Nilai\t: ");
    double nilai = sc.nextDouble();
    sc.nextLine();
    
    System.out.println("\nDAFTAR MAHASISWA");
    System.out.println("*********************************************");
    System.out.printf("%-10s %-15s %-10s\n","NIM", "Nama", "Telf");
    for (Mahasiswa11 m : daftarMhs) {
    System.out.printf("%-10s %-15s %-10s\n",
            m.nim,
            m.nama,
            m.telp);
    }
    System.out.print("Pilih mahasiswa by nim: ");
    String nim = sc.nextLine();
    Mahasiswa11 mhsDipilih = null;
    for (Mahasiswa11 m : daftarMhs) {
        if (m.nim.equals(nim)) {
            mhsDipilih = m;
            break;
        }
    }
    System.out.println("\nDAFTAR MATA KULIAH");
    System.out.println("*********************************************");
    System.out.printf("%-8s %-45s %-3s\n","Kode","Mata Kuliah","SKS");
    for (Matakuliah11 mk : daftarMK) {
    System.out.printf("%-8s %-45s %-3d\n",
            mk.kodeMK,
            mk.namaMK,
            mk.sks);
    }
    System.out.print("Pilih mk by kode: ");
    String kodeMK = sc.nextLine();
    Matakuliah11 mkDipilih = null;
    for (Matakuliah11 mk : daftarMK) {
        if (mk.kodeMK.equals(kodeMK)) {
            mkDipilih = mk;
            break;
        }
    }
    if (mhsDipilih != null && mkDipilih != null) {
        daftarNilai.add(
                new Nilai11(
                        mhsDipilih,
                        mkDipilih,
                        nilai));
    }
}

    public static void tampilNilai() {

    System.out.println("\nDAFTAR NILAI MAHASISWA");
    System.out.println("**************************************************");

    System.out.printf("%-10s %-12s %-40s %-5s %-5s\n","Nim","Nama","Mata Kuliah","SKS","Nilai");
    for (Nilai11 n : daftarNilai) {
        System.out.printf("%-10s %-12s %-40s %-5d %.2f\n",
                n.mahasiswa.nim,
                n.mahasiswa.nama,
                n.mataKuliah.namaMK,
                n.mataKuliah.sks,
                n.nilai);
    }
}

    public static void cariNilai(String nim) {
    int totalSKS = 0;
    System.out.printf("%-10s %-12s %-40s %-5s %-5s\n",
            "Nim",
            "Nama",
            "Mata Kuliah",
            "SKS",
            "Nilai");
    for (Nilai11 n : daftarNilai) {
        if (n.mahasiswa.nim.equals(nim)) {
            System.out.printf("%-10s %-12s %-40s %-5d %.2f\n",
                    n.mahasiswa.nim,
                    n.mahasiswa.nama,
                    n.mataKuliah.namaMK,
                    n.mataKuliah.sks,
                    n.nilai);
            totalSKS += n.mataKuliah.sks;
        }
    }
    System.out.println("\nTotal SKS " + totalSKS + " telah diambil.");
}

    public static void urutNilai() {
        Collections.sort(
                daftarNilai,
                Comparator.comparingDouble(n -> n.nilai)
        );
        tampilNilai();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        isiData();
        int pilih;
        do {

            System.out.println("\n================================================");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("================================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Cari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.print("Pilih : ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    inputNilai(sc);
                    break;

                case 2:
                    tampilNilai();
                    break;

                case 3:
                    tampilNilai();
                    System.out.print("\nMasukkan data mahasiswa[nim] : ");
                    String nim = sc.nextLine();
                    cariNilai(nim);
                    break;

                case 4:
                    urutNilai();
                    break;
            }

        } while (pilih != 5);
        sc.close();
    }
}
