#include <stdio.h>
#include <string.h> //strlen 함수를 위한 것 

int main() {
	char  Word[100];//문자열 배열 선언
	scanf("%s", Word);
	//a -> b -> c -> d 자리 수를 기준으로 for 문을 돌린다. 
	for (int i = 97; i <= 122; i++) {

		int cnt = 0; //위치 세주기를 위한 cnt 
		//NULL 나오기 전까지만 
		while (Word[cnt] != 0) {

			//조건:  문자열을 앞에서부터 체크하면서 같은 것을 만나면 break 해줌 
			if (Word[cnt] == i) {
				break;
			}
			cnt++;
		}
		if (Word[cnt] == i) {
			printf("%d ", cnt);
		}
		else
			printf("-1 ");

	}
	return 0;

}