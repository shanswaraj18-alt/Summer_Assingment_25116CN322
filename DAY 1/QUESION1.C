//WAP to calculate sum of first n natural numbers.
#include <stdio.h>
int main(){
    int i,n,sum=0;
    printf("enter the value of n\n");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        sum+=i;
    }
printf("%d\n",sum);
return 0;
    } 

