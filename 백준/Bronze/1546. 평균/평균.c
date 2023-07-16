#include <stdio.h>
int main() {
	float score[1000],high=0,total=0;
	int N;
	scanf("%d", &N);

	for (int i = 0; i < N; i++) {
		scanf("%f", &score[i]);
		if (high < score[i]) high = score[i];
	}
	for (int j = 0; j < N; j++) {
		score[j] = score[j] / high * 100.0;
		total += score[j];
	}
	printf("%f", total /N);
    return 0;
}