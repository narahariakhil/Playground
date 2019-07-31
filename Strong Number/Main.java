#include <stdio.h>
int main() {
	//Type your code
  int n,rem,sum=0,n1;
  scanf("%d",&n);
  n1 = n;
  while(n>0)
  {
    rem = n%10;
    int pro = 1;
    
    for(int i=1;i<=rem;i++)
    {
      pro = pro*i;
    }
    sum = sum + pro;
    n = n/10;
  }
  if(sum==n1)
    printf("Yes");
  else
    printf("No ");
      
	return 0;
}