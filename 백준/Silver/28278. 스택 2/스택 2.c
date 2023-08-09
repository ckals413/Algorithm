#include<stdio.h>
#include<stdlib.h>

//=== 스택 코드의 시작 ===

#define MAX_STACK_SIZE 1000000

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
	int X, k,n;
	int cnt = 0;
	StackType s;
	init_stack(&s);

	scanf("%d", &X);
	for (int i = 0; i < X; i++)
	{
		scanf("%d", &k);
		switch (k) {
		case 1:
			scanf("%d", &n);
			push(&s, n);
			break;
		case 2:
			
			if (is_empty(&s))//비어있으면 true
				printf("-1\n");
			else
				printf("%d\n", pop(&s));
			
			break;
		case 3:
			printf("%d\n",s.top+1);
			break;
		case 4:
			if (is_empty(&s))
				printf("1\n");
			else
				printf("0\n");
			break;
		case 5:
			if (is_empty(&s)) 
				printf("-1\n");
			else
				printf("%d\n", peek(&s));
			break;
		}		
	}
	return 0;
}