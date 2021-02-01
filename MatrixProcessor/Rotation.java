package MatrixProcessor;
import java.util.Scanner;
import java.util.Arrays;
public class Rotation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] Rotation = {1, 2, 3, 4, 5};
        int Rotations = scanner.nextInt();
        System.out.println(Arrays.toString(Rotation));
        for(int i = 0; i < Rotations; i++){
            int j, last;
            last = Rotation[Rotation.length-1];
            for(j = Rotation.length-1; j > 0; j--){
                Rotation[j] = Rotation[j - 1];
            }
            Rotation[0] = last;
            System.out.println(Arrays.toString(Rotation));
        }
    }
}