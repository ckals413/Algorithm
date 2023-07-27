#include<stdio.h>
#include<stdlib.h> // abs() 함수를 사용하기 위해 추가

int main() {
	int n;
	int x, y;
	int x_min = 10000 , y_min = 10000 ;
	int x_max = -10000, y_max = -10000;
	int y_len, x_len;
	scanf("%d", &n);
	

	for (int i = 0; i < n; i++) {
		scanf("%d %d", &x, &y);
		
		if (x < x_min) {
			x_min = x;
		}
		if (x > x_max) {
			x_max = x;
		}
		if (y < y_min) {
			y_min = y;
		}
		if (y > y_max) {
			y_max = y;
		}

	}
	x_len = abs(x_max - x_min); // abs() 함수를 사용하여 절대값 계산
	y_len = abs(y_max - y_min);

	printf("%d", x_len * y_len);
}