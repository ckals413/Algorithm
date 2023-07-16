#include<stdio.h>
int main() {
	int arr[9];
	int max, num =0;
	for (int i = 0; i < 9; i++) {
		scanf("%d", &arr[i]);
	}
	max = arr[0];
	for (int i = 0; i < 9; i++) {
		if (max < arr[i])
			max = arr[i];
	}
	for (int i = 0; i < 9; i++) {
		if (max == arr[i]) {
			num = i;
			break;
		}
	}
	printf("%d\n", max);
	printf("%d\n", num + 1);
}