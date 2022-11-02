using namespace std;

#include <iostream>
#include <string>
#include "animalClass.h"

#ifdef A_CLASS
#define A_CLASS


Animal::Animal() : _name("unknown"), _color(Green)
{
    cout << "Constructing Animal object " << _name << endl;
}

Animal::Animal(string n, COLOR c) : _name(n), _color(c)
{
    string colors[5] = {"green", "blue", "white", "black", "brown"};
    cout << "Constructing animal " << _name << " with color " << colors[c] << endl;
}

Animal::~Animal()
{
    cout << "Destructing Animal object named " << _name << endl;
}

void Animal::speak()
{
    cout << "Animal speaks " << endl;
}

Mammal::Mammal()
{
}

Mammal::Mammal(string n, COLOR c) : Animal(n, c)
{
}

Mammal::~Mammal()
{
    cout << "Destructing Animal object named " << _name << endl;
}

void Mammal::eat()
{
    cout << _name << " the Mammal eats" << endl;
}

void Mammal::move()
{
    cout << _name << " the Mammal moves" << endl;
}

#endif