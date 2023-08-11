#include<stdio.h>
#include<stdlib.h>
#include<string.h>

// === 원형큐 코드 시작 ===

#define MAX_QUEUE_SIZE 2000000
typedef int element;
typedef struct {//큐 타입
	element data[MAX_QUEUE_SIZE];
	int front, rear;
}QueueType;


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
        return -1;
	q->rear = (q->rear + 1) % MAX_QUEUE_SIZE;
	q->data[q->rear] = item;
}

//삭제함수
element dequeue(QueueType* q) {
    if (is_empty(q))
        return -1;
	q->front = (q->front + 1) % MAX_QUEUE_SIZE;
	return q->data[q->front];
}

//체크함수
element peek(QueueType* q) {
	if (is_empty(q)) {
        return -1;
	}
    return q->data[(q->front + 1) % MAX_QUEUE_SIZE];
}

//==== 원형 큐 코드 끝 ====

int main(void) {
    QueueType queue;
    init_queue(&queue);

    int N, a;
    char ch[6];  // 명령어 문자열을 저장할 배열
    scanf("%d", &N);

    for (int i = 0; i < N; i++) {
        scanf("%s", ch);

        if (strcmp(ch, "push") == 0) {  // strcmp 함수를 사용하여 문자열 비교
            scanf("%d", &a);
            enqueue(&queue, a);
        }
        else if (strcmp(ch, "pop") == 0) {
            if (!is_empty(&queue)) {
                printf("%d\n", dequeue(&queue));
            }
            else {
                printf("-1\n");
            }
        }
        else if (strcmp(ch, "size") == 0) {
            printf("%d\n", (queue.rear - queue.front + MAX_QUEUE_SIZE) % MAX_QUEUE_SIZE);
        }
        else if (strcmp(ch, "empty") == 0) {
            if (is_empty(&queue)) {
                printf("1\n");
            }
            else {
                printf("0\n");
            }
        }
        else if (strcmp(ch, "front") == 0) {
            if (!is_empty(&queue)) {
                printf("%d\n", queue.data[(queue.front + 1) % MAX_QUEUE_SIZE]);
            }
            else {
                printf("-1\n");
            }
        }
        else if (strcmp(ch, "back") == 0) {
            if (!is_empty(&queue)) {
                printf("%d\n", queue.data[queue.rear]);
            }
            else {
                printf("-1\n");
            }
        }
    }

    return 0;
}