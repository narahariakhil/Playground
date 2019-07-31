#include<stdio.h>
int main()
{
  int num,f,l,sum;
  scanf("%d",&num);
  f=num/100;
  l=num%10;
  sum=f+l;
  printf("%d",sum);
  
  return 0;
}