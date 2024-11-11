
import java.util.Arrays;
import java.util.Comparator;

public class CDTestDemo {

	public static void main(String[] args) {

		int[] arr = new int[] { 0, 5, 1, 3, 0, 7, 0, 4 };
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(arr[arr.length-2]);
		
		//int toptwo=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1).findFirst().get();
		//System.out.println(toptwo);

		// 0025173574

//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] == 0) {
//				for (int j = i - 1; j >= 0; j--) {
//					arr[j + 1] = arr[j];
//					if (j == 0 || arr[j - 1] == 0) {
//						arr[j] = 0;
//						break;
//					}
//
//				}
//				
//			}
//		}
//		for (int val : arr) {
//			System.out.print(val);
//		}

	}

}
