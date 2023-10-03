import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] weight = new int[]{1, 2, 3};
        for (int a = 0; a < weight.length; a++) {
            System.out.println(weight[a]);
        }
        {
            System.out.println(Arrays.toString(weight));
        }
        {
            float[] k = {1.57f, 7.654f, 9.986f};
            for (int i = 0; i < k.length; i++) {
                System.out.println(k[i]);
            }
            System.out.println(Arrays.toString(k));
            {
                System.out.println();
            }

            int[] arr = {3, 7, 9};
            for (int b = 0; b < arr.length; b++) {
                System.out.println(arr[b]);
            }
            System.out.println(Arrays.toString(arr));
        }

        int[] w = {1, 2, 3};
        for (int z = w.length - 1; z >= 0; z--) {
            System.out.print(w[z]+", ");}
        System.out.println();

        float[] e = {1.57f, 7.654f, 9.986f};
            for (int r = e.length - 1; r >= 0; r--) {
                System.out.print(e[r] + ", ");}
        System.out.println();

        int[] number = {3, 7, 9};
        for (int u = number.length - 1; u >= 0; u--){
            System.out.print(number[u]+", ");}
        System.out.println();
        int [] array = {1,2,3,4,5,6,7,8,9};
        for (int num =0;num< array.length;num++){
            if(array[num] % 2 !=0){
            System.out.print(num+", ");
                }
            }
        }
        }