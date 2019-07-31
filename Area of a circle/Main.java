#include<stdio.h>
#define PI 3.14
int main()
{
  //Type your code here
  float d,r,area;
  scanf("%f",&d);
  r = d/2;
  area = PI*r*r;
  printf("%.2f",area);
  return 0;
}