#include <iostream>
#include <string>

#include "childAnimal.h"

using namespace std;

#ifdef C_CLASS
#define C_CLASS

Dog::Dog() : Mammal() {
    cout << "Constructing generic dog " << Dog::_name << endl;
}
Dog::Dog(string n, COLOR c, string owner) : Mammal(n,c), _owner(owner){
     cout << "My owner is " << _owner << endl;
}
void Dog::speak() {
    cout << _name <<" the dog woofs "<< endl ;
}
void Dog::move() {
    cout << _name << " the dog moved" << endl;
}

void Dog::eat()
{
    cout << _name << " the dog eats" << endl;
}
Dog::~Dog()
{
    cout << "Destructing Dog object named " << _name << endl;
}

//--------------------------------------------------------------

Cat::Cat() : Mammal() {
    cout << "Constructing generic cat " << Cat::_name << endl;
}
Cat::Cat(string n, COLOR c) : Mammal(n,c){
}
void Cat::speak() {
    cout << _name << " the cat meow "<< endl ;
}
void Cat::move() {
    cout << _name << " the cat moved" << endl;
}
void Cat::eat()
{
    cout << _name << " the cat eats" << endl;
}
Cat::~Cat()
{
    cout << "Destructing Cat object named " << _name << endl;
}

//-------------------------------------------------------------

Lion::Lion() : Mammal() {
    cout << "Constructing generic lion " << Lion::_name << endl;
}
Lion::Lion(string n, COLOR c) : Mammal(n,c){
}
void Lion::speak() {
    cout << _name <<" the lion roars " << endl ;
}
void Lion::move() {
    cout << _name << " the lion moved" << endl;
}
void Lion::eat()
{
    cout << _name << " the lion eats" << endl;
}
Lion::~Lion()
{
    cout << "Destructing Lion object named " << _name << endl;
}

#endif