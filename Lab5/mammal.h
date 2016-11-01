#pragma once
#include <string>
#include "animal.h"

class Mammal :
	public Animal
{
public:
	Mammal(string name, Color color);
	~Mammal();
	void eat() const;
	virtual void move() const;
};

