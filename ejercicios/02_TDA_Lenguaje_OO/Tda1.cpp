#include <iostream>
using namespace std;

struct persona{
        char Nombre[15];
        char Apellido_1[15];
	char Apellido_2[15];
        int Edad;
        char Genero[15];
        char Accion_1[15];
        char Accion_2[15];
        char Accion_3[15];
        char Accion_4[15];

};

int main(){
    persona p;

        cout <<"Escriba el Nombre "<<endl;
        cin >> p.Nombre;

        cout <<"\nEscriba el Apellido Paterno "<<endl;
        cin >> p.Apellido_1;

	cout <<"\nEscriba el Apellido Materno"<<endl;
	cin >>p.Apellido_2;

        cout <<"\nEscriba la Edad "<<endl;
        cin >> p.Edad;

        cout <<"\nEscriba el Genero "<<endl;
        cin >> p.Genero;

        cout <<"Escriba la Primera Accion "<<endl;
        cin >> p.Accion_1;

        cout <<"\nEscriba la Segunda Accion "<<endl;
        cin >> p.Accion_2;

        cout <<"\nEscriba la Tercer Accion "<<endl;
        cin >> p.Accion_3;

        cout <<"\nEscriba la Cuarta Accion "<<endl;
        cin >> p.Accion_4;

        cout <<endl;

        cout<<"\nNombre: "<<p.Nombre;
        cout<<"\nApellidos: "<<p.Apellido_1<<" "<<p.Apellido_2;
        cout<<"\nEdad: "<<p.Edad;
        cout<<"\nGenero: "<<p.Genero;
        cout<<"\n"<<p.Nombre<<" "<<p.Accion_1;
        cout<<"\n"<<p.Nombre<<" "<<p.Accion_2;
        cout<<"\n"<<p.Nombre<<" "<<p.Accion_3;
        cout<<"\n"<<p.Nombre<<" "<<p.Accion_4;

   return 0;
}

