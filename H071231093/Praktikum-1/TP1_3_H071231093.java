import java.util.Scanner;

public class TP1_3_H071231093 {
    public static void main(String[] args) {

        Scanner inputan = new Scanner(System.in);
        System.out.print("Input Tanggal-Bulan-Tahun : ");
        String Tanggal = inputan.nextLine();
        inputan.close();

        String output = konversiTanggal(Tanggal);

        System.out.println("Output : " + output);
    }

    public static String konversiTanggal(String input) {
        String[] bagian = input.split("-");
        String tanggal = bagian[0];
        String bulan = bagian[1];
        String tahun = bagian[2];
    
        String namaBulan;
        switch (bulan) {
            case "01":
                namaBulan = "Januari";
                break;
            case "02":
                namaBulan = "Februari";
                break;
            case "03":
                namaBulan = "Maret";
                break;
            case "04":
                namaBulan = "April";
                break;
            case "05":
                namaBulan = "Mei";
                break;
            case "06":
                namaBulan = "Juni";
                break;
            case "07":
                namaBulan = "Juli";
                break;
            case "08":
                namaBulan = "Agustus";
                break;
            case "09":
                namaBulan = "September";
                break;
            case "10":
                namaBulan = "Oktober";
                break;
            case "11":
                namaBulan = "November";
                break;
            case "12":
                namaBulan = "Desember";
                break;
            default:
                namaBulan = "Bulan tidak valid";
        }
        
        int digTahun = Integer.parseInt(tahun);
        if (digTahun >= 00 && digTahun <= 25) {
            tahun = "20" + tahun;
        } else if (digTahun >= 26 && digTahun <= 99) {
            tahun = "19" + tahun;
        }

        String output = tanggal + " " + namaBulan + " " + tahun;
        return output;
    }
    
}
