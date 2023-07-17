#include <stdio.h>
int main() {
	int student[31];
	int n;
	for (int i = 1; i <= 30; i++) {
		student[i] = 0;
	}
	for (int i = 1; i <= 28; i++) {
		scanf("%d", &n);
		student[n] = 1;
	}
	for (int i = 1; i <= 30; i++) {
		if (student[i] == 0)
			printf("%d\n", i);
	}
	return 0;
}