#include <stdio.h>

int main() {
	int N;
	int arr[1001];
	int sum;

	scanf("%d", &N);
	for (int i = 0; i < N; i++)
	{
		scanf("%d", &arr[i]);
	}
	
	for (int i = 0; i < N - 1; i++) {
		for (int j = 0; j < N - i - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				// 두 원소의 위치를 교환
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}

	sum = 0;
	int waitingTime = 0;

	for (int i = 0; i < N; i++) {
		waitingTime += arr[i];
		sum += waitingTime;
	}


	printf("%d", sum);


	return 0;
}