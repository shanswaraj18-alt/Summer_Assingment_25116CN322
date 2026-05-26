//WAP to print multiplication table of a no.
#include<stdio.h>
int main(){
    int n ,i;
    printf("enter the no.for finding the multiplication table of it");
    scanf("%d",&n);
    printf("multiplication table of given no.");
    for(i=1;i<=10;i++){
        int multiplication_table =n*i;
        printf("\n%d\n",multiplication_table); 
    }
    return 0;
}