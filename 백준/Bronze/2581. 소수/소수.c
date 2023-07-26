#include<stdio.h>

int is_prime(int num) {
	if (num <= 1) {
		return 0; // 1 이하의 수는 소수가 아님
	}
	for (int i = 2; i * i <= num; i++) {
		if (num % i == 0) {
			return 0; // num이 i로 나누어지면 소수가 아님
		}
	}
	return 1; // num이 소수인 경우
}

int main() {
	int min, max;
	int n = 0;
	int sum = 0;
	scanf("%d %d", &min, &max);
	n = max;
	for (int i = min; i <= max; i++) {
		if (is_prime(i)) {
			sum += i;
			if (n > i) {
				n = i;
			}
			
		}
	}
	if (sum != 0) {
		printf("%d\n", sum);
		printf("%d\n", n);
	}
	else
		printf("-1");
	return 0;
}