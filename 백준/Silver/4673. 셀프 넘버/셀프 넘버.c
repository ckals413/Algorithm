#include <stdio.h>

int calc(int n) {
    int s = n;
    while (n != 0) {
        s += n % 10;
        n = n / 10;
    }
    return s;
}

int main() {
    char notS[10001] = { 0 };

    for (int i = 1; i < 10001; i++) {
        int sum = calc(i);

        if (sum < 10001) {
            notS[sum] = 1;
        }
    }

    for (int j = 1; j < 10001; j++) {
        if (!notS[j]) {
            printf("%d\n", j);
        }
    }

    return 0;
}

