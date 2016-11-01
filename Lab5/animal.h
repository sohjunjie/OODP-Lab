#pragma once
#include <string>

using namespace std;
enum Color { Green, Blue, White, Black, Brown };

class Animal
{

private:
	string _name;
	Color _Color;

public:
	Animal();
	Animal(string name, Color color);
	
	~Animal();
	virtual void speak() const;
	virtual void move() const = 0;

};

