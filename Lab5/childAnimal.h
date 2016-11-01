#pragma once
#include "mammal.h"

class Dog :
	public Mammal
{

private:
	string _Owner;


public:
	Dog(string name, Color color, string owner);
	~Dog();

	virtual void speak() const;
	virtual void move() const;
};


class Cat :
	public Mammal
{

private:
	string _Owner;

public:
	Cat(string name, Color color, string owner);
	~Cat();

	virtual void speak() const;
	virtual void move() const;
};



class Lion :
	public Mammal
{

private:
	string _Owner;

public:
	Lion(string name, Color color, string owner);
	~Lion();

	virtual void speak() const;
	virtual void move() const;
};
