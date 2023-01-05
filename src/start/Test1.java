package start;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[20];
		System.out.println("排序前:");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100 + 1);
			System.out.print(a[i] + "\t");
		}

		for (int i = 0; i < a.length-1; i++) {
			System.out.println("第" + (i) + "轮之后:");
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int t;
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
			for (int e : a) {
				System.out.print(e + "\t");
			}
			System.out.println();
		}
	}
}
