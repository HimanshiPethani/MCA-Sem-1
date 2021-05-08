#include <stdio.h> 

void function(int a) 
{ 
	printf("Value  is %d\n", a); 
} 

int main() 
{ 

	void (*funptr)(int); 
	funptr = &function; 	
	(*funptr)(40); 	
	return 0; 
} 

