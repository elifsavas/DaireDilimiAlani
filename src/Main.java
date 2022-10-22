import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        int r, aci ;
        double pi = 3.14, alan ;

        Scanner input = new Scanner(System.in) ;

        System.out.print("Merkez Açı: ");
        aci = input.nextInt();

        System.out.print("Dairenin Yarıçapı: ");
        r = input.nextInt() ;

        alan = (pi*(r*r)*aci)/360 ;
        System.out.println("Daire Dilimi Alanı:" + alan );
    }
}
