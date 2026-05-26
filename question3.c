//WAP to find factorial of a no.
#include<stdio.h>
int main(){
    int i,n,fact =1;
    printf("enter the no. to find factorial of:");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        fact*=i;
    }
    printf("factoeial of given no. is:%d",fact);
    return 0;
}