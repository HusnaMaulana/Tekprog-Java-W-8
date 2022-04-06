public abstract class Sortable {
	public abstract int Compare(Sortable b);
	public static void shell_short(Sortable[] a) {
		int n = a.length;
                for (int gap = n/2; gap > 0; gap /= 2){
                    for (int i = gap; i < n; i += 1){
                        Sortable temp = a[i];
                        int j;
                        for (j = i; j >= gap && a[j - gap].Compare(temp) < 0; j -= gap)
                            a[j] = a[j - gap];
                            a[j] = temp;
                    }
                }
        }
}