#include <stdio.h>
int main() {
	char str[5][15];
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 15; j++) {
			str[i][j] = 0;
		}
	}
	for (int i = 0; i < 5; i++) {
		scanf("%s", str[i]);
	}
	for (int j = 0; j < 15; j++) {
		for (int i = 0; i < 5; i++) {
			if(str[i][j]!='\0')
			printf("%c", str[i][j]);
		}
	}

	return 0;
}