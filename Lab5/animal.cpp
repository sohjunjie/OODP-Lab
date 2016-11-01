#include "animal.h"
#include <iostream>

Animal::Animal()
{
	_name = "unknown";
	cout << "constructing Animal object " << _name << endl;
}

Animal::Animal(string name, Color color)
{
	string colorTxt[] = { "Green", "Blue", "White", "Black", "Brown" };
	_name = name;
	_Color = color;
	cout << "constructing Animal object " << _name << " " << colorTxt[_Color] << endl;
}


Animal::~Animal()
{
	cout << "destructing Animal object " << _name << endl;
}

void Animal::speak() const
{
	cout << "Animal speaks " << endl;
}
