import java.time.LocalDate;
import java.util.Scanner;

public class QuanLyPhongTro {

    public static void main(String[] args) {
        int ngay;
        Scanner sc = new Scanner(System.in);
        ngay = sc.nextInt();
        LocalDate date1 = LocalDate.of(2023, 5, ngay);

        System.out.println("Date 1: " + date1);
    }
}