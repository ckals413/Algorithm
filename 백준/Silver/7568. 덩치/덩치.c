#include <stdio.h>

int main() {
	int a[50] = { 0 };
	int b[50] = { 0 };
	int N;
	scanf("%d", &N);

	for (int i = 0; i < N; i++) {
		scanf("%d %d", &a[i],&b[i]);
	}

	for (int i = 0; i < N; i++) {
		int t = 0;
		for (int j = 0; j < N; j++) {
			if (a[i] < a[j] && b[i] < b[j]) {
				t++;
			}
		}
		printf("%d ", t + 1);
	}
	return 0;
}