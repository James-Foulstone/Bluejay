package MatrixProcessor;
import java.util.Scanner;
class Matric{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int iCap = scanner.nextInt();
        int jCap = scanner.nextInt();
        for (int i = 1; i <= iCap; i++) {
            for (int j = 1; j <= jCap; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}