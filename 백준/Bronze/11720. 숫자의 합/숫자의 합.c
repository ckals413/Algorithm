#include <stdio.h>

int main() {
	int t;
	int sum = 0;
	scanf("%d", &t);	
	char arr[t];
	scanf("%s", arr);
	for (int i = 0; i < t; i++) {
		sum += arr[i] - '0';
	}
	printf("%d", sum);


	return 0;
}
