#include <stdio.h>

int main()
{
    float num1, num2;    
    float *ptr1, *ptr2; 

    float add, sub, mul, div;

    ptr1 = &num1;
    ptr2 = &num2;

   
    printf("Enter first value: ");
    scanf("%f", ptr1);
    printf("Enter second value");
    scanf("%f",ptr2);

    
    add  = (*ptr1) + (*ptr2);
    sub = (*ptr1) - (*ptr2);
    mul = (*ptr1) * (*ptr2);
    div  = (*ptr1) / (*ptr2);

 
    printf("addition = %.2f\n", add);
    printf("substraction = %.2f\n", sub);
    printf("multiplication = %.2f\n", mul);
    printf("division = %.2f\n", div);

    return 0;
}
