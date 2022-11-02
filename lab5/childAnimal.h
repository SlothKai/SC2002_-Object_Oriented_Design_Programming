#include <string>
#include "animalClass.h"

using namespace std;

#ifndef C_CLASS
#define C_CLASS

class Dog : public Mammal
{
    public:
        Dog();
        Dog(string n, COLOR c, string owner);
        ~Dog();
        void speak();
        void move() override;
        void eat();

    protected:
        string _owner;
};

class Cat : public Mammal
{
    public:
        Cat();
        Cat(string n, COLOR c);
        ~Cat();
        void speak();
        void move();
        void eat();
};

class Lion : public Mammal
{
    public:
        Lion();
        Lion(string n, COLOR c);
        ~Lion();
        void speak();
        void move();
        void eat();
};

#endif