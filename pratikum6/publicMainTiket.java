public class latihanMainTiket {
    public static void main(String[] args) {
        
        latihanSistemTiket stutu = new latihanSistemTiket();
        latihanTiket t1 = new latihanTiket("Garuda Indonesia", 1750000, "Pontianak", "Jakarta");
        latihanTiket t2 = new latihanTiket("Batik Air", 950000, "Surabaya", "Palangkaraya");
        latihanTiket t3 = new latihanTiket("Citilink", 1500000, "Jogja", "Medan");
        latihanTiket t4 = new latihanTiket("AirAsia", 1500000, "Balikpapan", "Jakarta");
        latihanTiket t5 = new latihanTiket("Lion Air",2000000, "Surakarta", "Bali");
        
        stutu.tambah(t1);
        stutu.tambah(t2);
        stutu.tambah(t3);
        stutu.tambah(t4);
        stutu.tambah(t5);
        
        System.out.println("==============================");
        System.out.println("=====Data Sebelum Sorting=====");
        System.out.println("==============================");
        stutu.tampil();
        System.out.println("");
        System.out.println("==================================");
        System.out.println("Data ticket setelah di sorting berdasarkan :");
        System.out.println("Sorting dengan metode Bubble sort :");
        stutu.bubbleSort();
        stutu.tampil();
        System.out.println();
        System.out.println("======================================");
        System.out.println("Sorting dengan metode Selection sort :");
        System.out.println("======================================");
        System.out.println("");
        stutu.selectionSort();
        stutu.tampil();
        System.out.println("==================================");
    }
}