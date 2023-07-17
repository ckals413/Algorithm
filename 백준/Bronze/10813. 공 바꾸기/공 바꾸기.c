#include <stdio.h>
int main() {
	int n, m, i, j,tmp;
	int arr[101];
	for (int k = 0; k < 101; k++) {
		arr[k] = k;
	}
	scanf("%d %d", &n, &m);
	for (int k = 1;  k <= m; k++) {
		scanf("%d %d", &i, &j);
		tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	for (int k = 1; k <= n; k++)
		printf("%d ", arr[k]);

	return 0;
}