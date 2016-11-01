#include "mammal.h"
#include <iostream>


Mammal::Mammal(string name, Color color) : Animal(name, color)
{
}

Mammal::~Mammal()
{
	cout << "destructing Mammal object " << endl;
}

void Mammal::eat() const
{
	cout << "Mammal eat" << endl;
}

void Mammal::move() const
{
	cout << "Mammal moves" << endl;
}
