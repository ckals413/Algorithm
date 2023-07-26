
#include <stdio.h>

int main() {
	int a, b, v, cnt=0,day = 1;
	scanf("%d %d %d", &a, &b, &v);
	int d = (v - b) / (a - b);
	if ((v - b) % (a - b) != 0) { d++; }
	printf("%d", d);
}
