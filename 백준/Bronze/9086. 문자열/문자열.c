#include <stdio.h>

int main() {
	int t;
	char arr[1001];
	int len;
	scanf("%d", &t);
	for (int i = 0; i < t; i++) {
		scanf("%s", arr);
		len = strlen(arr);
		printf("%c%c", arr[0], arr[len-1]);
		printf("\n");
	}
	return 0;
}
