// Kelas Main

public class Main {
    public static void main(String[] args) {
        // Membuat array list untuk menyimpan objek Buku
        java.util.ArrayList<Buku> bukuList = new java.util.ArrayList<>();
    // Menambahkan beberapa buku ke dalam list
    bukuList.add(new Buku("Penulis1", "Judul1",  20000,  123));
    bukuList.add(new Buku("Penulis2", "Judul2",  15000,  456));
    bukuList.add(new Buku("Penulis3", "Judul3",  18000,  789));

    // Menghitung total harga dari semua buku yang dibeli
    double totalHarga =  0;
    for (Buku buku : bukuList) {
    totalHarga += buku.getHarga();
    }
      // Menampilkan total harga
      System.out.println("Total harga untuk semua buku yang dibeli: " + totalHarga);
    }
}

