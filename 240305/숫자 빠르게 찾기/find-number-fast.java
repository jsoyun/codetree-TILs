import java.util.Scanner;
public class Main {

    public static final int MAX_N = 100000;
    
    public static int n, m;
    public static int[] arr = new int[MAX_N];

    public static int find(int target){
           int left =0;
        int right = n-1;
            while(left <= right){
                int mid = (left+ right)/2;
                if (arr[mid] == target){
                    return mid;
                } else if (arr[mid] > target){
                    right = mid -1;
                } else{
                    left = mid +1;
                }

                  
            }
              return -1;

        


    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner scanner = new Scanner(System.in);

         n = scanner.nextInt();
        m = scanner.nextInt();



        for (int i =0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

         for (int i =0; i<m; i++){
            int x= scanner.nextInt();
            //이진 탐색 
            int index = find(x);

            if (index >= 0){
                System.out.println(index+1);
            } else {
                System.out.println(-1);
            }
        }



    }
}