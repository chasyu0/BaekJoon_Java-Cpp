import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /* 삼각형의 세변을 입력받는다.
		 * 정렬을 한다.
		 * 가장 긴 변 < 두 변의 합 ? 모든 변의 합 : (가장 긴변 - 1) + (나머지 두변의 합);
		 */
        
        int[] arr = new int[3];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        int result = (arr[2] < arr[0] + arr[1]) ?
            (arr[0] + arr[1] + arr[2]) :
                ((arr[0] + arr[1]) * 2 - 1);
        
        System.out.println(result);
        sc.close();
    }
}