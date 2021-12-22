import java.util.*;
/**
 * Project Akhir Java Dasar Perbankan
 * Dosen : Mustika Mentari, S.Kom, M.Kom
 * @author Andhika Dwi Khalisyahputra
 */
public class Bank {

    // main
    public static void main(String[] args) {
        System.out.println("================= Selamat Datang di Bank DIKA =================");
        jumAkun = 20;
        instansiasiArray();
        do {
            menuAwal(jumAkun, jenisTabungan, namaNasabah, norekNasabah, saldoNasabah);
            System.out.println("Ingin melakukan transaksi lagi? (y/t)");
            menu = str.nextLine();
        } while (menu.equalsIgnoreCase("y"));
        // tesProgram();
    }

    // deklarasi variabel global
    static Scanner sc = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);
    static int jumAkun, norek, konfirmasi, lanjutTransfer = 1;
    static int[] norekNasabah, saldoNasabah, jenisTabungan;
    static int[] setorTerakhir, tarikTerakhir, transferTerakhir, terimaTerakhir;
    static String nama, menu;
    static String[] namaNasabah;
    static String[] tabungan = {"Admin", "Hemat", "Bebas"};

    // instansiasi array
    static void instansiasiArray() {
        namaNasabah = new String[jumAkun];
        norekNasabah = new int[jumAkun];
        jenisTabungan = new int[jumAkun];
        saldoNasabah = new int[jumAkun];
        setorTerakhir = new int[jumAkun];
        tarikTerakhir = new int[jumAkun];
        transferTerakhir = new int[jumAkun];
        terimaTerakhir = new int[jumAkun];
        namaNasabah[0] = "Admin";
        norekNasabah[0] = 1111;
        saldoNasabah[0] = 5_000_000;
        jenisTabungan[0] = 0;
    }

    // menu awal
    static void menuAwal(int jumAkun, int[] tabungan, String[] nama, int[] norek, int[] saldo) {
        boolean keluar = false;
        do {
            int menu;
            System.out.println("=======================");
            System.out.println("| 1. Masuk ke akun    |");
            System.out.println("| 2. Registrasi       |");
            System.out.println("| 3. Keluar           |");
            System.out.println("=======================");
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            switch (menu) {
            case 1:
                menuBank(jumAkun, tabungan, nama, norek, saldo);
                break;
            case 2:
                buatAkunNasabah();
                break;
            case 3:
                keluar = true;
                break;
            default:
                System.out.println("Mohon masukkan angka yang sesuai!");
            }
        } while (!keluar);
    }

    // tipe tabungan
    static void tipeTabungan() {
        // Tabungan Admin : bisa melihat data semua akun nasabah
        System.out.println("===============================================================");
        System.out.println("| 1. Tabungan Hemat : biaya transfer antar bank hanya Rp2000  |");
        System.out.println("| 2. Tabungan Bebas : bisa transaksi sepuasnya tanpa batasan  |");
        System.out.println("===============================================================");
    }

    // 
    static void buatAkunNasabah() {
        tipeTabungan();
        String buatAkun;
        System.out.println("Silahkan buat akun");
        int lanjutAkun = 1;
        for (int i = 1; i < jumAkun; i++) {
            if (namaNasabah[i] == null && norekNasabah[i] == 0 && saldoNasabah[i] == 0) {
                lanjutAkun = i;
                break;
            }
        }
        for (int i = lanjutAkun; i < jumAkun; i++) {
            boolean lanjutBuat = false;
            do {
                boolean lanjut = false;
                do {
                    System.out.print("Pilih jenis tabungan (1/2): ");
                    jenisTabungan[i] = sc.nextInt();
                    if (jenisTabungan[i] == 1 || jenisTabungan[i] == 2) {
                        lanjut = true;
                    } else {
                        System.out.println("Mohon masukkan angka 1/2");
                    }
                } while (!lanjut);
                if (namaNasabah[i] == null && norekNasabah[i] == 0 && saldoNasabah[i] == 0) {
                    System.out.print("Masukkan nama nasabah " +i+ " : ");
                    namaNasabah[i] = str.nextLine();
                    System.out.print("Masukkan no rekening : ");
                    norekNasabah[i] = sc.nextInt();
                    System.out.print("Masukkan setoran awal : ");
                    saldoNasabah[i] = sc.nextInt();
                    System.out.print("Buat akun lagi? (y/t) : ");
                    buatAkun = str.nextLine();
                    if (buatAkun.equalsIgnoreCase("y")) {
                        lanjutBuat = false;
                    } else {
                        lanjutBuat = true;
                    }
                }
                break;
            } while (!lanjutBuat);
            if (lanjutBuat) {
                break;
            }
        }
    }

    // tes program
    static void tesProgram() {
        jenisTabungan[1] = 1;
        namaNasabah[1] = "Andhika Dwi";
        norekNasabah[1] = 121212;
        saldoNasabah[1] = 10000;
        jenisTabungan[2] = 2;
        namaNasabah[2] = "Jotaro Kujo";
        norekNasabah[2] = 131313;
        saldoNasabah[2] = 20000;
        jenisTabungan[3] = 2;
        namaNasabah[3] = "Samuel Wilson";
        norekNasabah[3] = 141414;
        saldoNasabah[3] = 30000;
        jenisTabungan[4] = 1;
        namaNasabah[4] = "Kokoh Pribumi";
        norekNasabah[4] = 151515;
        saldoNasabah[4] = 40000;
        jenisTabungan[5] = 1;
        namaNasabah[5] = "Udin Mansyur";
        norekNasabah[5] = 161616;
        saldoNasabah[5] = 50000;
        jenisTabungan[5] = 2;
        namaNasabah[5] = "Tony Stark";
        norekNasabah[5] = 171717;
        saldoNasabah[5] = 60000;
        do {
            menuAwal(jumAkun, jenisTabungan, namaNasabah, norekNasabah, saldoNasabah);
            System.out.println("Ingin melakukan transaksi lagi? (y/t)");
            menu = str.nextLine();
        } while (menu.equalsIgnoreCase("y"));
    }

    // info semua nasabah
    static void infoSemuaNasabah(int[] jenis) {
        System.out.println("========== Tabungan Hemat ==========");
        System.out.println("Nama Lengkap\tNo Rekening\tSaldo");
        for (int i = 1; i < jumAkun; i++) {
            if (jenis[i] == 1) {
                System.out.println(namaNasabah[i]+ "\t" +norekNasabah[i]+ "\t\tRp" +saldoNasabah[i]);
            }
        }
        System.out.println();
        System.out.println("========== Tabungan Bebas ==========");
        System.out.println("Nama Lengkap\tNo Rekening\tSaldo");
        for (int i = 1; i < jumAkun; i++) {
            if (jenis[i] == 2) {
                System.out.println(namaNasabah[i]+ "\t" +norekNasabah[i]+ "\t\tRp" +saldoNasabah[i]);
            }
        }
    }

    // menu admin
    static void menuAdmin(int data, int[] saldo, String[] nama, int[] norek, int[] tabungan) {
        int menu;
        boolean keluar = false;
        do {
            System.out.println();
            System.out.println("=====================================");
            System.out.println("|    Selamat datang kembali Admin   |");
            System.out.println("| 1. Cek Data Semua Nasabah         |");
            System.out.println("| 2. Setor uang                     |");
            System.out.println("| 3. Tarik Uang                     |");
            System.out.println("| 4. Transfer Uang ke Nasabah       |");
            System.out.println("| 5. Cek Saldo dan Riwayat Transaksi|");
            System.out.println("| 6. Kembali                        |");
            System.out.println("=====================================");
            System.out.print("Pilih no 1-6 : ");
            menu = sc.nextInt();
            switch (menu) {
            case 1:
                infoSemuaNasabah(jenisTabungan);
                break;
            case 2:
                setorUang(data, saldo, tabungan);
                break;
            case 3:
                tarikUang(data, saldo);
                break;
            case 4:
                transferUang(data, nama, norek, saldo, tabungan);
                break;
            case 5:
                infoAkun(data, tabungan);
                riwayatTransaksi(data, setorTerakhir, tarikTerakhir, transferTerakhir, terimaTerakhir);
                break;
            case 6:
                keluar = true;
                break;
            default:
                System.out.println("Mohon masukkan angka yang sesuai!");
            }
        } while (!keluar);
    }

    // menu transaksi
    static void menuBank(int jumAkun, int[] tabungan, String[] nama, int[] norek, int[] saldo) {
        int cari, data, menu;
        lanjutTransfer = 0;
        System.out.print("Masukkan no rekening untuk transaksi : ");
        cari = sc.nextInt();
        for(int i = 0; i < jumAkun; i++) {
            if (cari == norekNasabah[i]) {
                konfirmasi = i;
                lanjutTransfer = 1;
                break;
            }
        }
        if (lanjutTransfer == 0) {
            System.out.println("Maaf no rekening tidak ditemukan");
        }
        if (cari == 1111) {
            data = 0;
            menuAdmin(data, saldo, nama, norek, tabungan);
            lanjutTransfer = 0;
        }
        if (lanjutTransfer == 1) {
            // data = i;
            boolean keluar = false;
            do {
                System.out.println();
                System.out.println("=====================================");
                System.out.println("|    Silahkan pilih menu di bawah   |");
                System.out.println("| 1. Cek Saldo                      |");
                System.out.println("| 2. Setor Uang                     |");
                System.out.println("| 3. Tarik Uang                     |");
                System.out.println("| 4. Transfer Uang                  |");
                System.out.println("| 5. Riwayat Transaksi              |");
                System.out.println("| 6. Kembali                        |");
                System.out.println("=====================================");
                System.out.print("Pilih no 1-6 : ");
                menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        infoAkun(konfirmasi, tabungan);
                        break;
                    case 2:
                        setorUang(konfirmasi, saldo, tabungan);
                        break;
                    case 3:
                        tarikUang(konfirmasi, saldo);
                        break;
                    case 4:
                        transferUang(konfirmasi, nama, norek, saldo, tabungan);
                        break;
                    case 5:
                        riwayatTransaksi(konfirmasi, setorTerakhir, tarikTerakhir, transferTerakhir, terimaTerakhir);
                        break;
                    case 6:
                        keluar = true;
                        break;
                    default:
                        System.out.println("Mohon masukkan angka yang sesuai!");
                }
            } while (!keluar);
        }
    }

    // info akun
    static void infoAkun(int akun, int[] jenis) {
        System.out.println("========== Informasi akun ==========");
        if (jenis[akun] == 1) {
            System.out.println("Jenis tabungan\t: " +tabungan[1]);
        } else if (jenis[akun] == 2) {
            System.out.println("Jenis tabungan\t: " +tabungan[2]);
        } else if (jenis[akun] == 0) {
            System.out.println("Jenis tabungan\t: " +tabungan[0]);
        }
        System.out.println("Nama Lengkap\t: " +namaNasabah[akun]);
        System.out.println("No Rekening\t: " +norekNasabah[akun]);
        System.out.println("Saldo\t\t: Rp" +saldoNasabah[akun]);
    }

    // setor uang
    static void setorUang(int akun, int[] saldo, int[] jenisTabunganSetor) {
        System.out.print("Masukkan jumlah setoran : ");
        int jumlah = sc.nextInt();
        if (jenisTabunganSetor[akun] == 1) {
            if ((jumlah+saldo[akun]) > 5_000_000) {
                System.out.println("Saldo tidak boleh melebihi batas");
                System.out.println("Penyetoran tidak berhasil\nSaldo : Rp" +saldo[akun]);
            } else {
                saldo[akun] += jumlah;
                System.out.println("Penyetoran berhasil\nSaldo anda : Rp" +saldo[akun]);
                setorTerakhir[akun] = 0;
                setorTerakhir[akun] += jumlah;
            }
        } else {
            saldo[akun] += jumlah;
            System.out.println("Penyetoran berhasil\nSaldo anda : Rp" +saldo[akun]);
            setorTerakhir[akun] = 0;
            setorTerakhir[akun] += jumlah;
        }
    }

    // tarik uang
    static void tarikUang(int akun, int[] saldo) {
        System.out.print("Masukkan jumlah uang : ");
		int jumlah = sc.nextInt();
        if (jumlah > saldo[akun]) {
            System.out.println("Maaf saldo anda tidak cukup");
        } else {
            saldo[akun] -= jumlah;
            System.out.println("Penarikan berhasil\nSaldo anda : Rp" +saldo[akun]);
            tarikTerakhir[akun] = 0;
            tarikTerakhir[akun] -= jumlah;
        }
    }

    // transfer
    static void transferUang(int akun, String[] nama, int[] norek, int[] saldo, int[] tabungan) {
        System.out.println("=====================");
        System.out.println("| 1. Antar rekening |");
        System.out.println("| 2. Antar bank     |");
        System.out.println("=====================");
        System.out.println("Pilih no 1/2 : ");
        int menu = sc.nextInt();
        int kodeBank;
        switch (menu) {
        case 1:
            transferAntarRekening(akun, nama, norekNasabah, saldo, tabungan);
            break;
        case 2:
            System.out.print("Masukkan kode bank : ");
            kodeBank = sc.nextInt();
            transferAntarBank(akun, nama, norekNasabah, saldo, kodeBank, tabungan);
            break;
        default:
            System.out.println("Mohon masukkan angka yang sesuai!");
        }
    }

    // transfer antar rekening
    static void transferAntarRekening(int akun, String[] nama, int[] norek, int[] saldo, int[] jenisTabunganTransfer) {
        int norekTujuan, data;
        int transferan;
        System.out.print("Masukkan no rekening tujuan : ");
        norekTujuan = sc.nextInt();
        lanjutTransfer = 0;
        for (int i = 1; i < jumAkun; i++) {
            if (norekTujuan == norekNasabah[i]) {
                System.out.println("Anda akan mengirim uang ke " +namaNasabah[i]);
                lanjutTransfer = 1;
                break;
            }
        }
        if (lanjutTransfer == 0) {  
            System.out.println("Maaf no rekening tidak ditemukan");
        }
        if (lanjutTransfer == 1) {
            for (int i = 0; i < jumAkun; i++) {
                if (norek[i] == norekTujuan) {
                    System.out.print("Masukkan nominal transfer : ");
                    transferan = sc.nextInt();
                    if (transferan > saldo[akun]) {
                        System.out.println("Maaf saldo anda tidak cukup");
                    } else {
                        if (jenisTabunganTransfer[i] == 1) {
                            if ((transferan+saldoNasabah[i]) > 5_000_000) {
                                System.out.println("Saldo penerima melebihi batas");
                                System.out.println("Transfer tidak berhasil\nSaldo anda : Rp" +saldo[akun]);
                                break;
                            } else {
                                data = i;
                                saldo[akun] -= transferan;
                                saldoNasabah[i] += transferan;
                                System.out.println("Transfer berhasil\nSaldo anda : Rp" +saldo[akun]);
                                System.out.println("Saldo penerima : Rp" +saldoNasabah[data]);
                                transferTerakhir[akun] = 0;
                                transferTerakhir[akun] += transferan;
                                terimaTerakhir[data] = 0;
                                terimaTerakhir[data] += transferan;
                                break;
                            }
                        } else {
                            data = i;
                            saldo[akun] -= transferan;
                            saldoNasabah[i] += transferan;
                            System.out.println("Transfer berhasil\nSaldo anda : Rp" +saldo[akun]);
                            System.out.println("Saldo penerima : Rp" +saldoNasabah[data]);
                            transferTerakhir[akun] = 0;
                            transferTerakhir[akun] += transferan;
                            terimaTerakhir[data] = 0;
                            terimaTerakhir[data] += transferan;
                            break;
                        }
                    }
                }
            }
        }
    }

    // data nasabah bank lain
    static void dataNasabahBankLain(int norekTujuan, int akun, int[] tabungan, int[] saldo) {
        String[][] namaBankLain = {
            {"Legawa Hakim", "Kayla Oktaviani", "Diana Susanti", "Karya Marbun"},
            {"Lega Wasita", "Himawan Damanik", "Cawisadi Prabowo", "Cici Yuliarti"},
            {"Tasdik Rajasa", "Rendy Natsir", "Lili Utami", "Himawan Damanik"}
        };
        int[][] norekBankLain = {
            {51212, 421212, 441212, 21212},
            {51313, 421313, 441313, 21313},
            {51414, 421414, 441414, 21414}
        };
        lanjutTransfer = 0;
        for (int i = 0; i < namaBankLain.length; i++) {
            boolean berhenti = true;
            for (int j = 0; j < namaBankLain[0].length; j++) {
                if (norekTujuan == norekBankLain[i][j]) {
                    System.out.println("Anda akan mengirim uang ke " +namaBankLain[i][j]);
                    lanjutTransfer = 1;
                    berhenti = false;
                    break;
                }
            }
            if (!berhenti) {
                break;
            }
        }
        if (lanjutTransfer == 0) {
            System.out.println("Maaf no rekening tidak ditemukan");
        }
        if (lanjutTransfer == 1) {
            System.out.print("Masukkan nominal transfer : ");
            int transferan = sc.nextInt();
            if ((transferan+5000) > (saldo[akun])) {
                System.out.println("Maaf saldo anda tidak cukup");
            } else {
                saldo[akun] -= (transferan+5000);
                if (tabungan[akun] == 1) {
                    saldo[akun] += 3000;
                    System.out.println("Selamat anda mendapatkan cashback Rp3000 dari Tabungan Hemat");
                }
                System.out.println("Transfer berhasil\nSaldo anda : Rp" +saldo[akun]);
                transferTerakhir[akun] = 0;
                transferTerakhir[akun] += transferan;
            }
        }
    }

    // transfer antar bank
    static void transferAntarBank(int akun, String[] nama, int[] norek, int[] saldo, int kodeBank, int[] tabungan) {
        String bank;
        int norekTujuan;
        String[] namaBank = {"JAGO", "MEGA", "Bukopin", "BTPN"};
        int[] kodenya = {542, 426, 441, 213};
        for (int i = 0; i < namaBank.length; i++) {
            if (kodeBank == kodenya[i]) {
                bank = namaBank[i];
                System.out.println("Anda akan transfer ke bank " +bank+ " dengan biaya Rp5000");
                System.out.print("Masukkan no rekening tujuan : ");
                norekTujuan = sc.nextInt();
                dataNasabahBankLain(norekTujuan, akun, tabungan, saldo);
            } else if (kodeBank != kodenya[0] && kodeBank != kodenya[1] && kodeBank != kodenya[2] && kodeBank != kodenya[3]) {
                System.out.println("Maaf kode bank tidak ditemukan");
                break;
            }
        }
    }

    // riawayat transaksi
    static void riwayatTransaksi(int akun, int[] setor, int[] tarik, int[] transfer, int[] terima) {
        System.out.println("========== Informasi akun ==========");
        System.out.println("Riwayat akun " +namaNasabah[akun]);
        System.out.println("Setoran terakhir\t: Rp" + setor[akun]);
        System.out.println("Tarik uang terakhir\t: Rp" + Math.abs(tarik[akun]));
        System.out.println("Transfer terakhir\t: Rp" + transfer[akun]);
        System.out.println("Terima uang terakhir  \t: Rp" + terima[akun]);
    }
}