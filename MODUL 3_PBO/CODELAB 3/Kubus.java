import java.util.Scanner;

public class Kubus extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    public double sisi;

    public Kubus(String namee) {
        super(namee);
    }
    
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Input sisi: ");
        sisi = scanner.nextDouble();
    }

    public void luasPermukaan(){
        double hasil = 6 * sisi * sisi;
        super.luasPermukaan();
        System.out.println("Luas permukaan " + getName() + ": " + hasil);
    }


    public void volume(){
        double hasil = Math.pow(sisi, 3);
        super.volume();
        System.out.println("Volume " + getName() + ": " + hasil);
    }
}
