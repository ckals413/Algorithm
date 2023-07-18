#include <stdio.h>
int main() {
	int T,a,b;
	int arr[101][101];
	int count = 0;
	for (int i = 0; i < 101; i++) {
		for (int j = 0; j < 101; j++) {
			arr[i][j] = 0;
		}
	}
	scanf("%d", &T);
	for (int i = 0; i < T; i++) {
		scanf("%d %d", &a, &b);
		for (int k = a; k < a + 10; k++) {
			for (int r = b; r < b + 10; r++) {
				arr[k][r] = 1;
			}
		}
	}
	for (int i = 0; i < 101; i++) {
		for (int j = 0; j < 101; j++) {
			if (arr[i][j] == 1)
				count++;
		}
	}
	printf("%d", count);
	return 0;
}