#include<stdio.h>
 
void swap(int *,int *);        
 
void main( )
{
    int n1,n2;
    printf("Enter first value:");
    scanf("%d",&n1);
    
     printf("Enter second value:");
    scanf("%d",&n2);
    
    
    printf("\n before calling the swap function are n1=%d n2=%d",n1,n2);
    swap(&n1,&n2);   
	                                       
    printf("\n after calling the swap function are n1=%d n2=%d",n1,n2);
}
 
void swap(int *n1,int *n2)                           
{ 
   /* int temp;
    temp=*n1;
    *n1=*n2;
    *n2=temp;*/
    
    
    *n1= *n1 + *n2;
    *n2= *n1 - *n2;
    *n1= *n1 - *n2;
   
}
