#include <stdio.h>
int main() {
	int T, n, min, max, c;
	int arr[100] = { 0, };
	scanf("%d %d", &T, &n);

	for (int j = 0; j < n; j++) {
		scanf("%d %d %d", &min, &max, &c);
		for (int i = min; i <= max; i++) {
			arr[i] = c;
		}
	}
	
	for (int i = 1; i <= T; i++) {
		printf("%d ", arr[i]);
	}
	return 0;
}