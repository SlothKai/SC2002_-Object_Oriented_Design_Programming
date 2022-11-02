#include <iostream>
#include <string>

using namespace std ;

enum COLOR { Green, Blue, White, Black, Brown } ;
string color[] = { "Green", "Blue", "White", "Black", "Brown" };

class Animal {
    public :
        Animal() : _name("unknown"), _color(Green) {
            cout << "constructing Animal object "<< _name << endl ;
        }

        ~Animal() {
            cout << "destructing Animal object "<< _name << endl ;
        }

        virtual void speak() const {
            cout << "Animal speaks "<< endl ;
        }

        Animal(string n, COLOR c){
            _name = n;
            _color = c;
            cout << "My name is " << _name << " and I am " << color[_color] << " in color" << endl ;
        }
        virtual void move() = 0;

    protected :
        string _name;
        COLOR _color;
};

class Mammal: public Animal {
    public: 
        void eat() const{
                cout << "the Mammal eats" << endl;
        };

        Mammal(string n, COLOR c) : Animal(n, c)
        {
        }

        ~Mammal() {
            cout << "destructing Mammal object "<< _name << endl ;
        }

        void move() {
            cout << _name << " the Mammal moved" << endl;
        }
};

class Dog: public Mammal {
    public:
        Dog(string n, COLOR c, string owner) : Mammal(n,c) 
        {
            _owner = owner;
            cout << "My owner is " << _owner << endl;
        }

        void speak() const {
            cout << "Dog bark woof "<< endl ;
        }

        void move() override {
            cout << _name << " the dog moved" << endl;
        }

    protected: 
        string _owner;
};

int main() {   
    
    //Animal a("Peter", Black); 
    //a.speak();

    /*Mammal b("June", Blue);
    b.speak();*/
    
    Dog c("kk", White, "ME");
    c.speak();
    c.move();

    /*Animal *animalPtr = new Dog("Lassie", White, "Andy");
    animalPtr->move();
    animalPtr->speak();
    delete animalPtr;*/

    cout << "Program exiting .... "<< endl ;
    return 0;
}