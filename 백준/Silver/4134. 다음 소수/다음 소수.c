#include<stdio.h>
#include<math.h>

int main() {
	long long t;
	long long n;
	scanf("%lld", &t);
	for (long long i = 0; i < t; i++)
	{
		scanf("%lld", &n);
		if (n == 0 || n == 1 || n == 2)
		{
			printf("%d\n", 2);
			continue;
		}

		while (1) {
			int count = 0;
			//for (long long j = 2; j <= n / 2 ; j++) {
			for (long long j = 2; j <= sqrt((double)n); j++) {
			if (n % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				printf("%lld\n", n);
				break;
			}
			else
				n++;
		}
	}
	return 0;
}

