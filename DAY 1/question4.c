//WAP to count digits in a number
#include<stdio.h>
int main(){
    int num,count=0;
    printf("enter the no. to count digit");
    scanf("%d",&num);
    while(num>0){
    num=num/10;
    count++ ; 
    }
    printf("%d",count);
    return 0;
}