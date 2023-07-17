#include <stdio.h>
int main() {
	int T, n, i, j;
	int arr[101];
	for (int k = 0; k < 101; k++) {
		arr[k] = k;
	}
	scanf("%d %d", &T, &n);
	for (int k = 0; k < n; k++) {
		scanf("%d %d", &i, &j);
		int tmp[101];
		for (int a = i; a <= j; a++) {
			tmp[a] = arr[a];
		}
		for (int a = i; a <= j; a++) {
			arr[a] = tmp[i + j - a];
		}
	}
	for (int k = 1; k <= T; k++) {
		printf("%d ", arr[k]);
	}

	return 0;
}