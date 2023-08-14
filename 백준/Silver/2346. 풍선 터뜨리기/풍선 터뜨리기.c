#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int first;
    int second;
} pair;

int n;
pair dq[100000]; // Assuming n will not exceed 100000

int main() {
    int i;
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        int tmp;
        scanf("%d", &tmp);
        dq[i].first = tmp;
        dq[i].second = i + 1;
    }

    while (1) {
        int cnt = dq[0].first;
        printf("%d ", dq[0].second);

        for (i = 0; i < n - 1; i++) {
            dq[i] = dq[i + 1];
        }
        n--;

        if (n == 0) break;

        if (cnt > 0) {
            for (i = 0; i < cnt - 1; i++) {
                pair temp = dq[0];
                for (int j = 0; j < n - 1; j++) {
                    dq[j] = dq[j + 1];
                }
                dq[n - 1] = temp;
            }
        }
        else {
            for (i = cnt; i < 0; i++) {
                pair temp = dq[n - 1];
                for (int j = n - 1; j > 0; j--) {
                    dq[j] = dq[j - 1];
                }
                dq[0] = temp;
            }
        }
    }

    return 0;
}
