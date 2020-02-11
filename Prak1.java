package prak1;

import java.util.Scanner;
import java.util.ArrayList;
class prak1{
	Scanner may = new Scanner(System.in);
	ArrayList<String> nik = new ArrayList<>();
	ArrayList<String> nama = new ArrayList<>();
	ArrayList<String> ttl = new ArrayList<>();
	ArrayList<String> jenkel = new ArrayList<>();
	ArrayList<String> goldar = new ArrayList<>();
	public static void main (String[] args) {
		prak1 mymy = new prak1();
		mymy.identitas();
		mymy.menu();
	}
	void identitas(){
		String niks;
		String namas;
		String ttls;
		String jenkels;
		System.out.println("Masukkan NIK : ");
		niks=may.nextLine();
		nik.add(niks);
		System.out.println("Masukkan Nama :");
		namas=may.nextLine();
		nama.add(namas);
		System.out.println("Masukkan TTL :");
		ttls=may.nextLine();
		ttl.add(ttls);
		System.out.println("Masukkan Jenis Kelamin :");
		jenkels=may.nextLine();
		jenkel.add(jenkels);
		Goldar();
	}
	void Goldar(){		
            int goldars;
		System.out.println("Masukkan Golongan Darah");
		goldars =may.nextInt();
		if (goldars == 1) {
			goldar.add("A");
		} else if (goldars == 2 ){
			goldar.add("B");
		} else if (goldars == 3){
			goldar.add("AB");
		} else if (goldars == 4){
			goldar.add("O");
		} else {
			System.out.println("Nomor Tidak Ada Mohon Ulangi");
			Goldar();
		}
	}
	void menu(){
		int pilih;
		System.out.println("Yakin Dengan Pilihan Ini ? ");
		System.out.println("1. Penambahan Data Baru");
		System.out.println("2. Melihat Hasil");
		System.out.println("3. Keluar");
		System.out.println("Masukkan Pilihan");
		pilih = may.nextInt();
		switch(pilih){
			case 1 : 
			System.out.println("Masukkan Lagi Data");
			identitas();
			case 2:
			System.out.println("Lihat Hasil");
			for (int i=0;i<nik.size() ;i++ ) {
				System.out.print("NIK : ");
				System.out.println(i + nik.get(i));
			}
			for (int i=0;i<nama.size() ;i++ ) {
				System.out.print("NAMA : ");
				System.out.println(i + nama.get(i));
			}
			for (int i=0;i<ttl.size() ;i++ ) {
				System.out.print("TTL : ");
				System.out.println(i + ttl.get(i));
			}
			for (int i=0;i<jenkel.size() ;i++ ) {
				System.out.print("Jenis Kelamin : ");
				System.out.println(i + jenkel.get(i));
			}
			for (int i=0;i<goldar.size() ;i++ ) {
				System.out.print("Golongan Darah : ");
				System.out.println(i + goldar.get(i));
			}
			case 3 :
			System.exit(0);
			default :
			System.out.println("Tidak Ada Pilihan  ");
			menu();
		}
	}
}