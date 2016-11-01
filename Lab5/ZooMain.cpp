#include <string>
#include <iostream>
#include "mammal.h"
#include "childAnimal.h"

using namespace std;

void addDog(Mammal **zoo, int loc);
void addCat(Mammal **zoo, int loc);
void addLion(Mammal **zoo, int loc);
void moveAnimals(Mammal **zoo, int zooSize);
Color getAnimalColor();

int main() {

	int zooCap;
	int choice;
	int currSize = 0;

	cout << "Enter max zoo capacity: " << ends; cin >> zooCap;
	cin.get();	// get dummy new line
	Mammal **zoo = new Mammal*[zooCap];

	do {
		cout << "(1) Add dog" << endl;
		cout << "(2) Add cat" << endl;
		cout << "(3) Add lion" << endl;
		cout << "(4) Move all animals" << endl;
		cout << "(5) Quit" << endl;
		cout << "" << endl;
		cout << "    Enter the number of your choice: " << ends; cin >> choice;

		if (choice <= 3 && choice >= 1) {
			if (currSize >= zooCap) {
				cout << "Exceed zoo capacity" << endl;
				continue;
			}
			currSize += 1;
		}

		switch (choice) {
			case 1:
				addDog(zoo, currSize - 1);
				break;
			case 2:
				addCat(zoo, currSize - 1);
				break;
			case 3:
				addLion(zoo, currSize - 1);
				break;
			case 4:
				moveAnimals(zoo, currSize);
				break;
			case 5:
				break;
		}
	} while (choice < 5);


	return 0;

}

void moveAnimals(Mammal **zoo, int zooSize) {

	Mammal *tempMam;

	for (int i = 0; i < zooSize; i++) {
		tempMam = zoo[i];
		if (tempMam != NULL) {
			tempMam->move();
			tempMam->speak();
			tempMam->eat();
		}
		delete zoo[i];
	}

}

void addDog(Mammal **zoo, int loc) {

	string dogName;
	Color dogColor;
	string owner;

	cout << "Name of dog: " << ends;			cin >> dogName;
	cout << "Select color of dog: " << endl;	dogColor = getAnimalColor();
	cout << "Dog owner name: " << ends;			cin >> owner;

	zoo[loc] = new Dog(dogName, dogColor, owner);

}

void addCat(Mammal **zoo, int loc) {

	string catName;
	Color catColor;
	string owner;

	cout << "Name of cat: " << ends;			cin >> catName;
	cout << "Select color of cat: " << endl;	catColor = getAnimalColor();
	cout << "Cat owner name: " << ends;			cin >> owner;

	zoo[loc] = new Cat(catName, catColor, owner);

}

void addLion(Mammal **zoo, int loc) {

	string lionName;
	Color lionColor;
	string owner;

	cout << "Name of lion: " << ends;			cin >> lionName;
	cout << "Select color of lion: " << endl;	lionColor = getAnimalColor();
	cout << "Lion owner name: " << ends;		cin >> owner;
	
	zoo[loc] = new Lion(lionName, lionColor, owner);

}

Color getAnimalColor() {

	int choice;
	Color color;

	cout << "(1) Green" << endl;
	cout << "(2) Blue" << endl;
	cout << "(3) White" << endl;
	cout << "(4) Black" << endl;
	cout << "(5) Brown" << endl;

	cin >> choice;
	switch (choice) {
	case 1:
		color = Color::Green;
		break;
	case 2:
		color = Color::Blue;
		break;
	case 3:
		color = Color::White;
		break;
	case 4:
		color = Color::Black;
		break;
	case 5:
		color = Color::Brown;
		break;
	}

	return color;

}