#include <stdio.h>
int main() {

	int n, max;
	int sum, m = 0;
	int arr[101] = { 0, };

	scanf("%d %d", &n, &max);
	for (int i = 0; i < n; i++)
		scanf("%d", &arr[i]);

	for (int i = 0; i < n; i++) {
		for (int j = i + 1; j < n; j++) {
			for (int k = j + 1; k < n; k++) {
				sum = arr[i] + arr[j] + arr[k];
				if (sum > m && sum <= max)
					m = sum;
			}
		}
	}
	printf("%d", m);

	return 0;
}