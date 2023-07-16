#include<stdio.h>

int main() {
	int T;
	scanf("%d", &T);
	int arr[T];
	for (int i = 0; i < T; i++) {
		scanf("%d", &arr[i]);
	}
	int max;
	int min;
	max = arr[0];
	min = arr[0];
	for (int i = 0; i < T; i++) {
		if (arr[i] > max)
			max = arr[i];
	}
	for (int i = 0; i < T; i++) {
		if (arr[i] < min)
			min = arr[i];
	}
	printf("%d %d", min, max);
}