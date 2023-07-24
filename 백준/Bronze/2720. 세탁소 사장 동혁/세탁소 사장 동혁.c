#include <stdio.h>

int main() {
	int T,n;
	int a, b, c, d;//a=0.25 b=0.10, c = 0.05, d = 0.01
	scanf("%d", &T);
	for (int i = 0; i < T; i++) {
		a = 0, b = 0, c = 0, d = 0;
		scanf("%d", &n);
		a = n / 25;
		n = n % 25;
		b = n / 10;
		n = n % 10;
		c = n / 5;
		n = n % 5;
		d = n / 1;
		printf("%d %d %d %d\n",a,b,c,d );

	}

	return 0;
}