char in[100001];
char stack[100001];
char out[100001];

int main() {
    int i, top = -1;
    scanf("%[^\n]", &in);
    int len = strlen(in);
    for (i = 0; i < len; i++) {
        if (in[i] == '<') {
            while (top != -1) {
                out[i - top - 1] = stack[top];
                top--;
            }
            while (in[i] != '>') {
                out[i] = in[i];
                i++;
            }
            out[i] = in[i];
        }
        else if (in[i] == ' ') {
            while (top != -1) {
                out[i - top - 1] = stack[top];
                top--;
            }
            out[i] = in[i];
        }
        else {
            top++;
            stack[top] = in[i];
        }
    }
    while (top != -1) {
        out[i - top - 1] = stack[top];
        top--;
    }
    printf("%s", out);
    return 0;
}
