PERTANYAAN PERCOBAAN 1
1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?
2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!
3. Ubah kode pada baris kode 38 menjadi seperti ini
LinkedList<String> names = new LinkedList<>();
4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya
names.push("Mei-mei");
System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", 
    names.getFirst(), names.size(), names.getLast());
System.out.println("Names: " + names.toSTring());
5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!

JAWABAN :
1. Karena pada kode:
List l = new ArrayList();
ArrayList dibuat tanpa menggunakan generic (tanpa menentukan tipe data). Akibatnya, ArrayList dianggap menyimpan objek bertipe Object, sehingga dapat menampung berbagai jenis data seperti Integer, String, dan tipe data lainnya dalam satu list.
2. sudah di modif
3. sudah ditambahkan
4. sudah di tambahkan
5. Penambahan data menggunakan method add() pada LinkedList akan menempatkan elemen baru di bagian akhir list. Method getFirst() digunakan untuk mengambil elemen pertama, getLast() untuk mengambil elemen terakhir, dan size() untuk mengetahui jumlah elemen yang tersimpan dalam LinkedList. Setelah beberapa data ditambahkan, jumlah elemen bertambah dari 1 menjadi 6, sedangkan elemen pertama tetap Mei-mei dan elemen terakhir berubah menjadi Al-Qarni.

PERTANYAAN PERCOBAAN 2
1. Apakah perbedaan fungsi push() dan add() pada objek fruits?
2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?
3. Jelaskan fungsi dari baris 46-49?
4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian?
5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!
6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!

JAWABAN :
1. Pada objek Stack, method push() dan add() sama-sama digunakan untuk menambahkan elemen ke dalam koleksi, tetapi memiliki tujuan yang berbeda.
-push() merupakan method khusus pada kelas Stack yang digunakan untuk menambahkan elemen ke bagian atas (top of stack) sesuai prinsip LIFO (Last In First Out).
-add() merupakan method umum dari interface List yang digunakan untuk menambahkan elemen ke akhir koleksi
2. sudah di modif
3. Kode tersebut menggunakan Iterator untuk menelusuri dan menampilkan setiap elemen pada objek fruits. Method hasNext() digunakan untuk memeriksa apakah masih ada elemen berikutnya, sedangkan next() digunakan untuk mengambil elemen satu per satu. Perulangan akan berhenti ketika seluruh elemen dalam Stack telah dibaca dan ditampilkan.
4. Setelah tipe data diubah dari Stack<String> menjadi List<String>, program menghasilkan error pada method push() dan pop(). Hal ini terjadi karena push() dan pop() merupakan method yang dimiliki oleh kelas Stack, sedangkan variabel fruits sekarang bertipe List. Interface List hanya dapat mengakses method yang didefinisikan di dalamnya, seperti add(), remove(), get(), dan size(). Oleh karena itu, method khusus Stack tidak dapat dipanggil meskipun objek yang dibuat masih berupa new Stack<>().
5. sudah dimodif
6. sudah dimodif

PERTANYAAN PERCOBAAN 3
1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa?
2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!
3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!

JAWABAN :
1. menggunakan konsep Varargs (Variable Arguments).
Varargs ditandai dengan penggunaan tanda titik tiga (...) setelah tipe data parameter, kelebihan Varargs: 
-Jumlah parameter fleksibel, method dapat menerima jumlah argumen yang berbeda-beda.
-Kode lebih sederhana, tidak perlu membuat banyak method overload.
-Lebih mudah digunakan, pemanggilan method menjadi lebih praktis dan fleksibel.
2. sudah di modif
3. sudah ditambahkan