#include <stdio.h>

int main() {
	int a[51];
	int b[51];
	int N;
	int tmpA[51];
	int tmpB[51];


	scanf("%d", &N);
	for (int i = 0; i < N; i++)
	{
		scanf("%d", &a[i]);
	}
	for (int i = 0; i < N; i++)
	{
		scanf("%d", &b[i]);
	}
	int cnt = 0;
	for (int i = 0; i <= 100; i++)
	{
		for (int j = 0; j < N; j++)
		{
			if (i == a[j]) {
				tmpA[cnt] = i;
				cnt++;
			}
		}
	}
	cnt = 0;
	for (int i = 100; i >= 0; i--)
	{
		for (int j = 0; j < N; j++)
		{
			if (i == b[j]) {
				tmpB[cnt] = i;
				cnt++;
			}
		}
	}
	int sum = 0;
	for (int i = 0; i < N; i++)
	{
		sum += tmpA[i] * tmpB[i];
	}
	printf("%d", sum);
	return 0;
}