#include "childAnimal.h"
#include <iostream>


Dog::Dog(string name, Color color, string owner) : Mammal(name, color)
{
	_Owner = owner;
}

Dog::~Dog()
{
}

void Dog::speak() const
{
	cout << "Woof" << endl;
}

void Dog::move() const
{
	cout << "Dog moves" << endl;
}

Cat::Cat(string name, Color color, string owner) : Mammal(name, color)
{
	_Owner = owner;
}

Cat::~Cat()
{
}

void Cat::speak() const
{
	cout << "Meow" << endl;
}

void Cat::move() const
{
	cout << "Cat moves" << endl;
}

Lion::Lion(string name, Color color, string owner) : Mammal(name, color)
{
	_Owner = owner;
}

Lion::~Lion()
{
}

void Lion::speak() const
{
	cout << "Roar" << endl;
}

void Lion::move() const
{
	cout << "Lion moves" << endl;
}
