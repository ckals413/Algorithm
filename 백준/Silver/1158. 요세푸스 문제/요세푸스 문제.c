#include<stdio.h>
#include<stdlib.h>

// === 원형큐 코드 시작 ===

#define MAX_QUEUE_SIZE 5001
typedef int element;
typedef struct {//큐 타입
	element data[MAX_QUEUE_SIZE];
	int front, rear;
}QueueType;

//오류함수
void error(char* message) {
	fprintf(stderr, "%s\n", message);
	exit(1);
}

// 큐 초기화 함수
void init_queue(QueueType* q) {
	q->front = q->rear = 0;
}

//공백 상태 검출함수
int is_empty(QueueType* q) {
	return(q->front == q->rear);//같으면(비어있으면) true
}
//포화상태 검출함수
int is_full(QueueType* q) {
	return((q->rear + 1) % MAX_QUEUE_SIZE == q->front);
}

//원형큐 출력함수
void queue_print(QueueType* q) {
	printf("QUEUE(front=%d rear=%d)=", q->front, q->rear);
	if (!is_empty(q)) {
		int i = q->front;
		do {
			i = (i + 1) % (MAX_QUEUE_SIZE);
			printf("%d |", q->data[i]);
			if (i == q->rear)
				break;
		} while (i != q->front);
	}
	printf("\n");
}
//삽입함수
void enqueue(QueueType* q, element item) {
	if (is_full(q))
		error("큐가 포화상태입니다.");
	q->rear = (q->rear + 1) % MAX_QUEUE_SIZE;
	q->data[q->rear] = item;
}

//삭제함수
element dequeue(QueueType* q) {
	if (is_empty(q))
		error("큐가 공백상태입니다.");
	q->front = (q->front + 1) % MAX_QUEUE_SIZE;
	return q->data[q->front];
}

//체크함수
element peek(QueueType* q) {
	if (is_empty(q)) {
		error("큐가 공백상태입니다.");
		return q->data[(q->front + 1) % MAX_QUEUE_SIZE];
	}
}

//==== 원형 큐 코드 끝 ====

int main(void) {
	QueueType queue;
	init_queue(&queue);
	int N, k;
	scanf("%d %d", &N, &k);
	for (int i = 0; i < N; i++)
	{
		enqueue(&queue, i+1);
	}// 큐에 1부터 N까지 넣는다..

	for (int i = 0; i < k - 1; i++) {
		enqueue(&queue, dequeue(&queue));
	}
	printf("<%d", dequeue(&queue));

	while (!is_empty(&queue)) {
		for (int i = 0; i < k - 1; i++) {
			enqueue(&queue, dequeue(&queue));
		}
		printf(", %d", dequeue(&queue));
	}
	printf(">");

}