import java.util.*;
import java.lang.Math;

public class MaxGrainPath {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int n, m;
		n = kbd.nextInt();
		m = kbd.nextInt();
		int [][]array = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array[i][j] = kbd.nextInt();
			}
		}

		int [][]countArray = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				countArray[i][j] = array[i][j];
			}
		}

		int right = 0, bottom = 0;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--) {
				right = 0;
				bottom = 0;
				if (j != m - 1) {
					right = countArray[i][j+1];
				}
				if (i != n - 1) {
					bottom = countArray[i+1][j];
				}
				countArray[i][j] += Math.max(right, bottom);
			}
		}

		int i = 0, j = 0;
		int result = array[i][j];
		while(i != n - 1 && j != m - 1) {
			bottom = 0;
			right = 0;
			if (i + 1 != n) {
				bottom = countArray[i+1][j];
			}
			if (j + 1 != m) {
				right = countArray[i][j+1];
			}
			if (bottom >= right) {
				i = i + 1;
				result += array[i][j];
			} else {
				j = j + 1;
				result += array[i][j];
			}
		}
		result += array[n-1][m-1];
		System.out.println(result);
	}
}
