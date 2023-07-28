
int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    // 가장 긴 막대를 c로 만듦
    if (a > b && a > c) {
        int temp = a;
        a = c;
        c = temp;
    }
    else if (b > a && b > c) {
        int temp = b;
        b = c;
        c = temp;
    }

    // 삼각형이 성립하는지 확인
    if (c >= a + b) {
        // 삼각형을 만들 수 없는 경우
        // 가장 긴 막대 c를 조정하여 삼각형을 만들 수 있도록 함
        c = a + b - 1;
    }

    // 세 막대로 만들 수 있는 가장 큰 삼각형의 둘레 출력
    printf("%d", a + b + c);

    return 0;
}
