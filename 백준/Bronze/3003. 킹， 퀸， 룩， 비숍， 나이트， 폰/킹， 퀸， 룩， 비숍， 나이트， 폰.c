#include <stdio.h>
int main() {
	int a=1, b=1, c=2, d=2, e=2, f=8;
	int g, h, i, j, k, l;
	scanf("%d %d %d %d %d %d", &g, &h, &i, &j, &k, &l);
	printf("%d %d %d %d %d %d", a - g, b - h, c - i, d - j, e - k, f - l);
	return 0;
}