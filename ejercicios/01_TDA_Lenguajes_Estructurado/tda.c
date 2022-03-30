#include <stdio.h>
#include <string.h>

struct persona{

	char Nombre[20];
	char Apellidos[30*2];
	int Edad;
	char Genero;
	char Accion1[25];
	char Accion2[25];
	char Accion3[25];
	char Accion4[25];

} Persona = {

	"Alexis","Martinez Monrroy ",
	22,
	'M',
	"","Desayunando","Platicando","Acostado"

};

int main(void){

	printf("\n Persona");
	printf("\n Nombre: %s", Persona.Nombre);
	printf("\n Apellidos: %s", Persona.Apellidos);
	printf("\n Edad: %d", Persona.Edad);
	printf("\n Genero: %c", Persona.Genero);
	printf("\n %s esta %s", Persona.Nombre, Persona.Accion1);
	printf("\n %s esta %s", Persona.Nombre, Persona.Accion2);
	printf("\n %s esta %s", Persona.Nombre, Persona.Accion3);
	printf("\n %s esta %s", Persona.Nombre, Persona.Accion4);

return 0;

}
