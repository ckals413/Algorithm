#include<stdio.h>
#include<string.h>

int main() {
    char major[51]; //전공이름
    double n; // 수강 학점
    char grade[2]; //성적

    double n_sum = 0.0; //총 수강 학점
    double grade_n = 0.0; //성적 숫자로 환산
    double k = 0.0; // 학점* 성적의 합

    for (int i = 0; i < 20; i++) {
        scanf("%s %lf %s", major, &n, grade);
        if (grade[0] == 'P') {
            continue;
        }
        n_sum += n;
        if (grade[0] == 'F') {
            continue;
        }
        if (grade[0] == 'A') {
            grade_n = 4.0;
        }
        else if (grade[0] == 'B') {
            grade_n = 3.0;
        }
        else if (grade[0] == 'C') {
            grade_n = 2.0;
        }
        else if (grade[0] == 'D') {
            grade_n = 1.0;
        }
        if (grade[1] == '+') {
            grade_n += 0.5;
        }
        k += n * grade_n;
    }

    printf("%lf", k / n_sum);

    return 0;
}
