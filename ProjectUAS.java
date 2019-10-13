import java.util.*;
import java.text.NumberFormat;
public class ProjectUAS {
    public static NumberFormat bentuk = NumberFormat.getInstance(); //Untuk format currency

    public static String[] pertanyaanbiasa = { //Pertanyaan Pengetahuan
            "Merek HP terkenal", "Kota yang dijuluki kota wali", "Buah yang disukai banyak orang",
            "Makanan pokok orang indonesia", "Yang mempunyai arti 'SUCI'", "Pusat tata surya", "Kota Pahlawan",
            "Alat Tulis", "Film terkenal", "Buah yang manis dan mempunyai kulit berduri", "Merek laptop", "Manis",
            "Kebutuhan Manusia", "Tanaman beribu manfaat", "Teman bang jarwo", "Kartun favorit anak-anak" };
    public static String[] jawabanbiasa = { //Jawaban Pengetahuan
            "Nokia", "Tuban", "Mangga", "Nasi", "Putih", "Matahari", "Surabaya", "Kapur", "Laskar Pelangi", "Durian",
            "Axioo", "Gula", "Oksigen", "Pisang", "Sopo", "Spongebob" };

    public static String[] pertanyaanlucu = { //Pertanyaan Lucu
            "2+2X2-2/2", "Binatang apa yang jago berenang", "Makan gado-gado enaknya pake apa",
            "Kera apa yang bikin heboh dan juga bikin repot", "Kenapa Bebek goreng enak rasanya",
            "Ikan apa yang paling menderita", "Ayam apa yg ditabrak mobil gak bisa mati",
            "Benda apa yang baru dibeli langsung dibuang", "Tentara apa yang paling kecil", "Jauh dimata dekat di hati",
            "Ada berapakah jumlah Abjad", "Kapan sebaiknya kita membuka pintu",
            "Band yang tidak pernah mengeluarkan album", "Apa yang lebih lucu dari 24",
            "Jus apa yang tidak bisa diminum", "Kota yang selalu sendiri", "Mangga apa yang susah" };

    public static String[] jawabanlucu = { //Jawaban Lucu
            "5", "Bebek", "Sendok", "KERAcunan makanan", "Karena ada huruf B", "Ikan yang tidak bisa berenang",
            "Ayam panjang umur", "Peti Mati", "Tentara sekutu", "Usus", "5", "Saat pintu tertutup", "Blue Band", "25",
            "JUStru itu saya tidak tahu", "Solo", "MANGGAruk punggung pakai kaki" };

    public static String[] makanan = { //Makanan
            "Nasi Goreng Jawa", "Nasi Goreng Mawut", "Mie Goreng\t", "Mie Rebus\t", "Tahu Lontong\t", "Tahu Theck\t",
            "Belut\t\t", "Soto Lamongan\t", "Kare Ayam\t", "Asem Bandeng\t", "Gule Kambing\t", "Pecel Lele\t",
            "Mie ayam\t", "Nasi Jagung\t", "Nasi Biasa\t" };

    public static String[] minuman = { //Minuman
            "Es Teh\t\t", "Es Jeruk\t", "Es Dawet\t", "Es Siwalan\t", "Es Degan\t", "Soda Gembira\t", "Es Legen\t",
            "Legen (1 botol)\t", "Joshua\t\t", "Kopi\t\t" };

    public static int[] hargamakanan = { //Harga Makanan
            10000, 12000, 8000, 5000, 8000, 15000, 10000, 10000, 10000, 20000, 10000, 8000, 7000, 2000, 3000 };

    public static int[] hargaminuman = { //Harga Minuman
            2000, 3000, 5000, 6000, 7000, 8000, 5000, 8000, 5000, 3000 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plh_program, inisialisasi, inisialisasi2;
        boolean ulang = false, ulang1 = false, ulangprogram = false, ulangprogram1 = false;
        do {
            System.out.print("Press enter key to continue . . . .");
            inisialisasi = sc.nextLine();
            if (inisialisasi.equalsIgnoreCase("")) {
                ulang1 = false;
                enter1();
            } else {
                ulang1 = true;
            }
        } while (ulang1);
        do {
            awalan();
            System.out.println();
            System.out.println("1. Program Tebak-tebakan");
            System.out.println("2. Program Warung\n");
            do {
            System.out.print("Pilih program yang dijalankan : ");
                plh_program = sc.nextLine();
                if (plh_program.equalsIgnoreCase("1")) {
                    ulang = false;
                    tebakan();
                } else if (plh_program.equalsIgnoreCase("2")) {
                    ulang = false;
                    warung();
                } else {
                    ulang = true;
                    System.out.println("Masukan inputan dengan benar");
                    System.out.println();
                }
            } while (ulang);
            do {
                System.out.print("ketik [ ULANG ] jika ingin mengulangi program, tekan [ ENTER ] untuk keluar . . . : ");
                inisialisasi2 = sc.nextLine();
                if (inisialisasi2.equalsIgnoreCase("")) {
                    ulangprogram1 = false;
                    ulangprogram = false;
                } else if (inisialisasi2.equalsIgnoreCase("ulang")) {
                    enter1();
                    ulangprogram1 = false;
                    ulangprogram = true;
                } else {
                    ulangprogram1 = true;
                    System.out.println("Masukan inputan dengan benar!");
                }
            } while (ulangprogram1);
        } while (ulangprogram);
    }
    public static void tebakan() { //Program Tebakan
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        Random rand = new Random();
        int acakbiasa;
        int acaklucu;
        int kesempatan = 3;
        int score = 0;
        String pilih;
        String pilih1;
        String jawabbiasa;
        String jawablucu;
        String tampil = "";
        boolean ulang = false; //mengulang pernyataan mengulang jika jawaban selain iya/tidak
        boolean ulangpertanyaan = false; //mengulang Game
        boolean ulang2 = false; //Pengulangan yang dilakukan jika jawaban selain iya/tidak"
        boolean salah = false;
        String kembali;
        do {
            awalan1();
            System.out.println("Kategori Pertanyaan : ");
            System.out.println("1. Pertanyaan Pengetahuan"); //Memilih jenis pertanyaan
            System.out.println("2. Pertanyaan Lucu\n"); //Memilih jenis pertanyaan
            do {
                System.out.print("Pilih pertanyaan :");
                pilih = sc.nextLine();
                acakbiasa = rand.nextInt(jawabanbiasa.length); //Acak Soal
                acaklucu = rand.nextInt(jawabanlucu.length); //Acak Soal

                if (pilih.equalsIgnoreCase("1")) { //Pertanyaan Pengetahuan
                    salah = false;
                    enter();
                    do {
                        System.out.println();
                        System.out.println("===============================================================");
                        System.out.println("=                   PERTANYAAN PENGETAHUAN                    =");
                        System.out.println("===============================================================");
                        System.out.println(" Score : " + score + "\t\t" + tampil + "\t\tKesempatan menjawab " + kesempatan); //Kesempatan menjawab
                        System.out.println();
                        System.out.println(" Kata Kunci\t: " + pertanyaanbiasa[acakbiasa]); //Soal
                        System.out.print(" Jawaban\t: "); //Inputan jawaban
                        jawabbiasa = sc1.nextLine();

                        if (jawabbiasa.equalsIgnoreCase(jawabanbiasa[acakbiasa])) { //Jika jawaban benar
                            System.out.println();
                            tampil = "BENAR !";
                            score = score + 100;
                            acakbiasa = rand.nextInt(jawabanbiasa.length);
                            enter();
                            continue; //mengskip perlangan, akan tetapi program ini fungsinya untuk mengulang
                        } else {
                            System.out.println("");
                            tampil = "SALAH !";
                        }
                        kesempatan--;
                        if (kesempatan != 0) {
                            enter();
                        }
                        if (kesempatan == 0 && !jawabbiasa.equalsIgnoreCase(jawabanbiasa[acakbiasa])) {
                            System.out.println("\nMaaf anda kurang beruntung !!");
                            System.out.println("Jawabannya adalah : " + jawabanbiasa[acakbiasa] + "\n");
                            System.out.println("                          Score ( " + score + " ) \n");
                            do {
                                System.out.print(
                                    "Apakah anda ingin mengulangi pertanyaan Pengetahuan(iya/tidak) ? ");
                                kembali = sc1.nextLine();
                                if (kembali.equalsIgnoreCase("iya")) {
                                    enter();
                                    acakbiasa = rand.nextInt(jawabanbiasa.length); //Acak pertanyaan
                                    kesempatan = 3; //Kesempatan kembali seperti semula
                                    tampil = "";
                                    score = 0;
                                    ulang2 = false;
                                    continue; //mengskip perlangan, akan tetapi program ini fungsinya untuk mengulang 
                                } else if (kembali.equalsIgnoreCase("tidak")) {
                                    ulang2 = false;
                                    break; //Berhenti perulangan dan menuju ke bawah
                                } else {
                                    ulang2 = true;
                                    System.out.println(
                                        "Harap menginputkan data dengan benar!");
                                    System.out.println();
                                }
                            } while (ulang2); //Perulangan jika yang diinputkan diluar IYA/TIDAK
                        }
                    } while (kesempatan > 0);

                } else if (pilih.equalsIgnoreCase("2")) { //Pertanyaan lucu
                    salah = false;
                    enter();
                    do {
                        System.out.println();
                        System.out.println("===============================================================");
                        System.out.println("=                     PERTANYAAN LUCU                         =");
                        System.out.println("===============================================================");
                        System.out.println(" Score : " + score + "\t\t" + tampil +
                            "\t\tKesempatan menjawab " + kesempatan); //Kesempatan menjawab
                        System.out.println();
                        System.out.println(" Kata Kunci\t: " + pertanyaanlucu[acaklucu]); //Soal
                        System.out.print(" Jawaban\t: "); //Inputan jawaban
                        jawablucu = sc1.nextLine();

                        if (jawablucu.equalsIgnoreCase(jawabanlucu[acaklucu])) { //Jika jawaban benar
                            System.out.println();
                            tampil = "BENAR !";
                            score = score + 100;
                            acaklucu = rand.nextInt(jawabanlucu.length);
                            enter();
                            continue; //mengskip perlangan, akan tetapi program ini fungsinya untuk mengulang
                        } else {
                            System.out.println("");
                            tampil = "SALAH !";
                        }
                        kesempatan--;
                        if (kesempatan != 0) {
                            enter();
                        }
                        if (kesempatan == 0 && !jawablucu.equalsIgnoreCase(jawabanlucu[acaklucu])) {
                            System.out.println("\nMaaf anda kurang beruntung !!");
                            System.out.println("Jawabannya adalah : " + jawabanlucu[acaklucu] + "\n");
                            System.out.println("                          Score ( " + score + " ) \n");
                            do {
                                System.out.print("Apakah anda ingin mengulangi pertanyaan lucu(iya/tidak) ? ");
                                kembali = sc1.nextLine();
                                if (kembali.equalsIgnoreCase("iya")) {
                                    enter();
                                    acaklucu = rand.nextInt(jawabanlucu.length); //Acak pertanyaan
                                    kesempatan = 3; //Kesempatan kembali seperti semula
                                    tampil = "";
                                    score = 0;
                                    ulang2 = false;
                                    continue; //mengskip perlangan, akan tetapi program ini fungsinya untuk mengulang 
                                } else if (kembali.equalsIgnoreCase("tidak")) {
                                    ulang2 = false;
                                    break; //Berhenti perulangan dan menuju ke bawah
                                } else {
                                    ulang2 = true;
                                    System.out.println(
                                        "Harap menginputkan data dengan benar!");
                                    System.out.println();
                                }
                            } while (ulang2); //Perulangan jika yang diinputkan diluar IYA/TIDAK
                        }
                    } while (kesempatan > 0);
                } else {
                    salah = true;
                    System.out.println("Harap memilih pertanyaan dengan benar");
                }
            } while (salah);
            do {
                System.out.println();
                System.out.print("Apakah anda ingin mengulangi game (iya/tidak) ? "); //
                pilih1 = sc1.nextLine();
                if (pilih1.equalsIgnoreCase("iya")) {
                    score = 0;
                    tampil = "";
                    kesempatan = 3;
                    ulang = false;
                    ulangpertanyaan = true;
                    System.out.println("\n\n\n\n");
                } else if (pilih1.equalsIgnoreCase("tidak")) {
                    ulangpertanyaan = false;
                    penutupan();
                    break;
                } else {
                    ulang = true;
                    System.out.println("Harap menginputkan data dengan benar!");
                }
            } while (ulang); //ULANG = FALSE Diulang jika perintah salah
        } while (ulangpertanyaan); //ULANGPERTANYAAN = FALSE Diulang jika perintah salah
    }
    public static void warung() { //Program Warung
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        String tanyamember, tanyaulang;
        String tanyamakan, tanyaminum;
        int input1, input2, jumlah1, jumlah2, total1, total2, diskon, bayar;
        int potongan = 0, potongan1_1 = 0;
        int totalsemua = 0, totalsemua2 = 0;
        int totalpasti = 0;
        int totalsemua1 = 0;
        int no_pesan = 1; //Untuk mengisi Nomer pesanan		
        boolean ulangmember = false;
        boolean ulangbayar = false;
        boolean ulangawal = false;
        boolean ulangtanya = false;
        boolean kdmakanan = false, kdminuman = false;
        boolean pesanmakanan = false, pesanminuman = false;
        boolean lnjt_makanan = false, lnjt_minuman = false;

        do {
            awalan2(); //menampilkan awalan warung
            System.out.println("Di warung ini terdapat berbagai macam Makanan dan Minuman, antara lain :\n");
            System.out.println("               ===   Makanan   ===\n");
            System.out.println("=================================================");
            for (int a = 0; a < makanan.length; a++) {
                int no_a = a + 1;
                System.out.println(
                    "| " + no_a + ".\t" + makanan[a] + "\t Rp " + bentuk.format(hargamakanan[a]) + " ,-" + "\t|"); //Menampilkan makanan dan harga
            }
            System.out.println("=================================================");

            System.out.println();
            System.out.println("               ===   Minuman   ===\n");
            System.out.println("=================================================");

            for (int a = 0; a < minuman.length; a++) {
                int no_a = a + 1;
                System.out.println(
                    "| " + no_a + ".\t" + minuman[a] + "\t Rp. " + bentuk.format(hargaminuman[a]) + " ,-" + "\t|"); //Menampilkan minuman dan harga
            }
            System.out.println("=================================================");
            System.out.println();
            System.out.println("PROMO : Jika membeli lebih dari 50.000 akan mendapat potongan sebesar 15 %");
            System.out.println("                   [ Berlaku untuk MEMBER dan NON MEMBER ]                   ");
            System.out.println();
            do {
                System.out.print("Apakah anda memiliki kartu member (iya/tidak) ? "); //Ditanya apakah mempunyai member/tidak
                tanyamember = sc2.nextLine();
                if (tanyamember.equalsIgnoreCase("iya")) { //Jika mempunyai diskon
                    System.out.println(); //Untuk Member					
                    System.out.println("              =============[   MEMBER   ]=============\n"); //Untuk Member
                    System.out.println("Untuk Member mendapatkan potongan 5% untuk semua makanan dan minuman");
                    ulangmember = false;
                    System.out.println();
                } else if (tanyamember.equalsIgnoreCase("tidak")) { //Jika tidak mempunyai diskon
                    System.out.println();
                    System.out.println("              =============[   NON MEMBER   ]=============\n"); //Untuk non Member
                    System.out.println();
                    ulangmember = false;
                } else {
                    System.out.println("Harap memasukan data dengan benar!");
                    ulangmember = true;
                }
            } while (ulangmember); //Diulang jika menginputkan tidak sesuai yang diperintahkan
            System.out.println("=====    [ MAKANAN ]     =====");
            do {
                do {
                    System.out.println();
                    System.out.println("[ Pesanan ke-" + no_pesan + " ]");
                    System.out.println();
                    System.out.println("============================================");
                    System.out.print("Masukan kode makanan\t: ");
                    input1 = sc3.nextInt();
                    if (input1 >= makanan.length || input1 < 1) { //jika kode minuman yang diinputkan tidak terdapat pada menu maka diulang
                        kdmakanan = true;
                        System.out.println("Harap memasukan kode dengan benar!\n");
                        continue;
                    } else {
                        kdmakanan = false;
                    }
                    System.out.println("Nama Makanan\t\t: " + makanan[input1 - 1]);
                    System.out.println("Harga Makanan\t\t: Rp " + bentuk.format(hargamakanan[input1 - 1]));
                    System.out.print("Jumlah beli\t\t: ");
                    jumlah1 = sc3.nextInt();
                    total1 = (jumlah1 * hargamakanan[input1 - 1]);
                    System.out.println("Total\t\t\t: Rp " + bentuk.format(total1));
                    totalsemua1 = totalsemua1 + total1; //Jumlah total harga makanan yang dipesan 
                    System.out.println("============================================");
                } while (kdmakanan); //Mengulang jika kode makanan yang dimasukan salah
                do {
                    System.out.println();
                    System.out.print(
                        "Tekan [ Enter ] untuk melanjutkan memesan, tekan [ N ] untuk berhenti memesan . . . : ");
                    tanyamakan = sc4.nextLine();
                    if (tanyamakan.equalsIgnoreCase("")) {
                        lnjt_makanan = false;
                        pesanmakanan = true;
                    } else if (tanyamakan.equalsIgnoreCase("N")) {
                        System.out.println("\n\n\n");
                        lnjt_makanan = false;
                        pesanmakanan = false;
                    } else {
                        lnjt_makanan = true;
                        System.out.println("Harap memasukan data dengan benar!");
                    }
                } while (lnjt_makanan); //diulang jika memasukan input salah
                no_pesan = no_pesan + 1;
            } while (pesanmakanan); //mengulang input makanan kembali

            no_pesan = 1; //Menginialisasi nomer pesan menjadi 1

            System.out.println();
            System.out.println("=====    [ MINUMAN ]     =====");
            do {
                do {
                    System.out.println();
                    System.out.println("[ Pesanan ke-" + no_pesan + " ]");
                    System.out.println();
                    System.out.println("============================================");
                    System.out.print("Masukan kode minuman\t: ");
                    input2 = sc3.nextInt();
                    if (input2 >= minuman.length || input2 < 1) { //jika kode minuman yang diinputkan tidak terdapat pada menu maka diulang
                        kdminuman = true;
                        System.out.println("Harap memasukan kode dengan benar!\n");
                        continue;
                    } else {
                        kdminuman = false;
                    }
                    System.out.println("Nama Minuman\t\t: " + minuman[input2 - 1]);
                    System.out.println("Harga Minuman\t\t: Rp " + hargaminuman[input2 - 1]);
                    System.out.print("Jumlah beli\t\t: ");
                    jumlah2 = sc3.nextInt();
                    total2 = (jumlah2 * hargaminuman[input2 - 1]);
                    System.out.println("Total\t\t\t: Rp " + total2);
                    totalsemua2 = totalsemua2 + total2; //Jumlah total harga Minuman yang dipesan
                    System.out.println("============================================");
                } while (kdminuman);
                do {
                    System.out.println();
                    System.out.print(
                        "Tekan [ Enter ] untuk melanjutkan memesan, tekan [ N ] untuk berhenti memesan . . . : ");
                    tanyaminum = sc4.nextLine();
                    if (tanyaminum.equalsIgnoreCase("")) {
                        lnjt_minuman = false;
                        pesanminuman = true;
                    } else if (tanyaminum.equalsIgnoreCase("N")) {
                        lnjt_minuman = false;
                        pesanminuman = false;
                    } else {
                        lnjt_minuman = true;
                        System.out.println("Harap memasukan data dengan benar!");
                    }
                } while (lnjt_minuman);
                no_pesan = no_pesan + 1;
            } while (pesanminuman);

            totalsemua = totalsemua1 + totalsemua2;

            if (tanyamember.equalsIgnoreCase("iya")) {
                potongan = (totalsemua * 5) / 100;
            } else {
                potongan = 0;
            }
            diskon = (totalsemua * 15) / 100;

            if (totalsemua >= 50000) {
                totalpasti = totalsemua - (diskon + potongan);
                potongan1_1 = diskon + potongan;
            } else {
                totalpasti = totalsemua - potongan;
                potongan1_1 = potongan;
            }
            do {
                System.out.println("\n\n\n\n");
                System.out.println("==================================================");
                System.out.println("     || ------------- NOTA ------------- ||");
                System.out.println("==================================================");
                System.out.println("|| Total Makanan\t\t: Rp " + bentuk.format(totalsemua1) + "\t||");
                System.out.println("|| Total Minuman\t\t: Rp " + bentuk.format(totalsemua2) + "\t||");
                System.out.println("|| Total Makanan dan Minuman\t: Rp " + bentuk.format(totalsemua) + "\t||");
                System.out.println("|| Total Potongan\t\t: Rp " + bentuk.format(potongan1_1) + "\t||");
                System.out.println("|| Biaya yang harus dibayar\t: Rp " + bentuk.format(totalpasti) + "\t||");
                System.out.println("||\t\t\t\t\t\t||");
                System.out.print("   Bayar\t\t\t: Rp ");
                bayar = sc3.nextInt();
                if (bayar < totalpasti) {
                    ulangbayar = true;
                    System.out.println("Harap menginputkan data dengan benar!");
                } else {
                    ulangbayar = false;
                    break;
                }
            } while (ulangbayar); //Perulangan jika BAYAR kurang dari total pasti
            System.out.println("|| Kembali\t\t\t: Rp " + bentuk.format(bayar - totalpasti) + "\t||");
            System.out.println("==================================================");
            System.out.println("             **** TERIMA KASIH ****");
            System.out.println();
            do {
                System.out.print("Apakah anda ingin memesan kembali(iya/tidak) : ");
                tanyaulang = sc2.nextLine();
                if (tanyaulang.equalsIgnoreCase("iya")) {
                    ulangawal = true;
                    ulangtanya = false;
                    totalsemua = 0;
                    totalsemua1 = 0;
                    totalsemua2 = 0;
                    potongan1_1 = 0;
                    totalpasti = 0;
                    no_pesan = 1;
                } else if (tanyaulang.equalsIgnoreCase("tidak")) {
                    ulangtanya = false;
                    ulangawal = false;
                    penutupan();
                } else {
                    ulangtanya = true;
                    System.out.println("Harap menginputkan data dengan benar!");
                }
            } while (ulangtanya); //Diulang jika menginputkan tidak sesuai yang diperintahkan
        } while (ulangawal); //Diulang dari awal program
    }
    public static void awalan() { //awalan program
        System.out.println("    ====================================================");
        System.out.println("   ==|         =       PROJECT AKHIR       =          |==");
        System.out.println("<==|         =         AGUS PRASETYO        =           |==>");
        System.out.println("   ==|    =  PROGRAM WARUNG DAN TEBAK TEBAKAN  =      |==");
        System.out.println("    ====================================================");
    }
    public static void awalan1() { //Untuk awalan tebak tebakan
        System.out.println("\n");
        System.out.println(" ====================================================");
        System.out.println("==|   SELAMAT DATANG DI PERMAINAN TEBAK TEBAKAN   |==");
        System.out.println(" ====================================================");
        System.out.println("\n");
    }
    public static void awalan2() { //Untuk tampilan awal warung
        System.out.println("\n");
        System.out.println(" ====================================================");
        System.out.println("==|\tSELAMAT DATANG DI WARUNG MURAH MERIYAH\t   |==");
        System.out.println(" ====================================================");
        System.out.println("\n");
    }
    public static void penutupan() { // menampilkan kata terima kasih
        System.out.println("\n\n");
        System.out.println("==================================================================================\n");
        System.out.println(" ######## #### #####   ##  ###    ###  ####      ##   ##  ####  ###### ## ##  ## ");
        System.out.println("    ##    ##   ##  ##  ##  ## #  # ## ##  ##     ## ##   ##  ## ##     ## ##  ## ");
        System.out.println("    ##    #### ## ##   ##  ##  ##  ## ##  ##     ###     ##  ## ###### ## ###### ");
        System.out.println("    ##    ##   ##  ##  ##  ##      ## ######     ## ##   ######     ## ## ##  ## ");
        System.out.println("    ##    #### ##   ## ##  ##      ## ##  ##     ##   ## ##  ## ###### ## ##  ## \n");
        System.out.println("==================================================================================");
        System.out.println("\n\n");
    }
    public static void enter() { //Untuk enter
        System.out.println("===============================================================\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void enter1() { //Untuk enter
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}