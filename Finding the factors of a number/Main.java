#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    int rem = n%i;
      if(rem==0)
      {
        printf("%d\n",i);
      }
  }
	return 0;
}