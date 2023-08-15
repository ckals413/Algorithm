#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define MAX_QUEUE_SIZE 10001
typedef int element;
typedef struct {
	element data[MAX_QUEUE_SIZE];
	int front, rear;
}DequeType;

// 오류함수 생략하겠음

//초기화 
void init_deque(DequeType* q) {
	q->front = q->rear = 0;
}

// 공백상태 검출함수
int is_empty(DequeType* q) {
	return(q->front == q->rear);
}
// 포화상태 검출함수 
int is_full(DequeType* q) {
	return ((q->rear + 1) % MAX_QUEUE_SIZE == q->front);
}
//(꼬리)===============
// 삽입함수
void add_rear(DequeType* q, element item) {
	if (is_full(q))
		return;
	q->rear = (q->rear + 1) % MAX_QUEUE_SIZE;
	q->data[q->rear] = item;
}
// 삭제함수
element delete_rear(DequeType* q) {
	int prev = q->rear;
	if (is_empty(q))
		return -1;
	q->rear = (q->rear - 1 + MAX_QUEUE_SIZE) % MAX_QUEUE_SIZE;
	return q->data[prev];
}
// 확인 함수
element get_rear(DequeType* q) {
	if (is_empty(q)) {
		return -1;
	}
	return q->data[q->rear];
}
//=======================

//(앞)===================

// 삽입 함수
void add_front(DequeType* q, element val) {
	if (is_full(q))
		return;
	q->data[q->front] = val;
	q->front = (q->front - 1 + MAX_QUEUE_SIZE) % MAX_QUEUE_SIZE;
}

//삭제함수
element delete_front(DequeType* q) {
	if (is_empty(q)) {
		return -1;
	}
	q->front = (q->front + 1) % MAX_QUEUE_SIZE;
	return q->data[q->front];
}
//확인 함수
element get_front(DequeType* q) {
	if (is_empty(q))
		return -1;
	return q->data[(q->front + 1) % MAX_QUEUE_SIZE];
}

element size(DequeType* q) {
	return (q->rear - q->front + MAX_QUEUE_SIZE) % MAX_QUEUE_SIZE;
}

int main(void) {
	DequeType queue;
	init_deque(&queue);
	int n,a;
	char st[20];
	scanf("%d", &n);
	for (int i = 0; i < n; i++)
	{
		scanf("%s", st);
		if (strcmp(st, "push_back") == 0) {
			scanf("%d", &a);
			add_rear(&queue, a);
		}
		else if (strcmp(st, "push_front") == 0) {
			scanf("%d", &a);
			add_front(&queue, a);
		}
		else if (strcmp(st, "pop_front") == 0) {
			printf("%d\n",delete_front(&queue));
		}
		else if (strcmp(st, "pop_back") == 0) {
			printf("%d\n", delete_rear(&queue));
		}
		else if (strcmp(st, "size") == 0) {
			printf("%d\n", size(&queue));
		}
		else if (strcmp(st, "empty") == 0) {
			printf("%d\n", is_empty(&queue));
		}
		else if (strcmp(st, "front") == 0) {
			if (is_empty(&queue)) {
				printf("-1\n");
			}
			else {
				printf("%d\n", get_front(&queue));
			}
		}
		else if (strcmp(st, "back") == 0) {
			if (is_empty(&queue)) {
				printf("-1\n");
			}
			else {
				printf("%d\n", get_rear(&queue));
			}
		}
	}
}