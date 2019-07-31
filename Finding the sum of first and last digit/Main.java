#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  int last_num = num%10;
  while(num>10)
  {
    num = num/10;
  }
   int first_num = num;
  int sum = last_num + first_num;
  printf("%d",sum);
	return 0;
}