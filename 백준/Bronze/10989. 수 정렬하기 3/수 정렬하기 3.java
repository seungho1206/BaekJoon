import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt((br.readLine()));
        }

        Arrays.sort(arr);


        for(int i : arr){
            sb.append(i).append("\n");
        }
        System.out.println(sb);

    }
}