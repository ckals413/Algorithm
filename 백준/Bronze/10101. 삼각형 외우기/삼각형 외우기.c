#include<stdio.h>
int main() {
	int a, b, c;
	scanf("%d %d %d", &a, &b, &c);
	int sum = 0;
	sum = a + b + c;
	if (sum != 180) {
		printf("Error");
		return 0;
	}
	if (a != b && a != c && b != c) 
		printf("Scalene");
	if (a == 60 && b == 60 && c == 60)
		printf("Equilateral");
	if ((a == b && a != c) || (b == c && c != a) || (c == a && b != a))
		printf("Isosceles");

	return 0;
}