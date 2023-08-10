#include<stdio.h>
#include<stdlib.h>
//=== 스택 코드의 시작 ===

#define MAX_STACK_SIZE 1005

typedef int element;
typedef struct {
	element data[MAX_STACK_SIZE];
	int top;
}StackType;

//스택 초기화 함수
void init_stack(StackType* s) {
	s->top = -1;
}

// 공백 상태 검출함수
int is_empty(StackType* s) {
	return(s->top == -1);
	// return 문안에 top == -1 이면 true 를 반환 아니면 false 를반환
}

// 포화 상태 검출함수
int is_full(StackType* s) {
	return (s->top == (MAX_STACK_SIZE - 1));
}

// 삽입함수
void push(StackType* s, element item) {
	if (is_full(s)) {
		fprintf(stderr, "스택 포화에러\n");
		return;
	}
	else s->data[++(s->top)] = item;
}

// 삭제함수
element pop(StackType* s) {
	if (is_empty(s)) {
		fprintf(stderr, "스택 공백에러\n");
		exit(1);
	}
	else
		return s->data[(s->top)--];
}
// 피크함수
element peek(StackType* s) {
	if (is_empty(s)) {
		fprintf(stderr, "스택 공백 에러\n");
		exit(1);
	}
	else return s->data[s->top];
}


//=== 스택 코드의 끝 ===


int main() {
	StackType s;
	init_stack(&s);

	int T;
	int n,cnt =1;

	scanf("%d", &T);

	for (int i = 0; i < T; i++) {
		scanf("%d", &n);
		if (n == cnt) {
			cnt++;
		}
		else {
			push(&s, n);
		}
		while (!is_empty(&s) && peek(&s) == cnt) {
			pop(&s);
			cnt++;
		}

	}

	if (is_empty(&s)) {
		printf("Nice");
	}
	else {
		printf("Sad");
	}

	return 0;
}