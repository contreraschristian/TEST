// Christian A. Contreras
// CSC 321-40
// LAB11 (11/14/23)

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int userInput;

	printf("Enter a number: ");
	scanf("%d", &userInput);

	printf("Your number squared is %d\n", userInput*userInput);

	return EXIT_SUCCESS;
}
