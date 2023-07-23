#include <stdio.h>
#include <string.h> //strlen 함수를 위한 것 

int main() {
	
	char arr[1000000];
	scanf("%[^\n]", arr);
	int cnt = 0;
	int len = strlen(arr);

	if (len == 1) {
		if (arr[0] == ' ') {
			printf("0\n");
			return 0;
		}
	}
	for (int i = 1; i<len-1; i++) {
		if (arr[i] == ' ') {
			cnt++;
		}
	}
	printf("%d", cnt+1);


	return 0;

}