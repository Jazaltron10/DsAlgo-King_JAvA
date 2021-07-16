package DA_UNIT;

public class Week_5 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
/**
class Rectangle {
    constructor(height,width){
        this.height = height;
        this.width = width;
    }
}

const square = new Rectangle(5,5);
const poster = new Rectangle(2,3);
console.log(square);
console.log(poster);

//NAMED CLASS
var Square = class rectangle {
    constructor(height,width){
        this.height = height ;
        this.width = width ;
    }
};
console.log(Square)

//UNNAMED CLASS
var SquaRe = class {
    constructor(height,depth){
        this.height = height ;
        this.depth = depth ;
    }
};
//asid = prompt (SquaRe.height);
//console.log(asid)


//CLASS METHODS 
//PROTOTYPE METHOD
class FootballPitch {
    constructor(height,width){
        this.height = height;
        this.width = width;
    }
    get area(){//here area is a getter
        return this.calcArea();
    }
    calcArea(){//here calcArea is a method 
        return this.height * this.width;
    }
}

const Marakana = new FootballPitch(120,55);
const Anfield = new FootballPitch(90,45);

console.log(`The Area of the Marakana stadium in brazil is ${Marakana.area} Square meter`);
console.log(`The Area of the Marakana stadium in liverpool is ${Anfield.area} Square meter`);

//STATIC METHOD
class point{
    constructor(x,y){
        this.x = x
        this.y = y 
    }
    static distance(a,b){
        const dx = a.x - b.x ;
        const dy = a.y - b.y ;
        return Math.hypot(dx,dy)//sqrt((dx*dx) + (dy*dy))
    }
}
const point_1 = new point(7,2);
const point_2 = new point(3,8);

console.log(point.distance(point_1,point_2));//7.211102550927979
/*NOTE:
The static distance method is called directly using the class name i.e point, 
without an object(like point_1 and  point_2)

The static method cannot be called through a class instance,i.e an object(point_1 and point_2)  

They are often used to create utility functions for an application
(from what i can tell here the objects are used as the arguments)

class Cat {
    constructor(name,type,color) {
        this.name = name ;
        this.type = type;
        this.color = color;
        }
    speak(line) {
            //this.line = line;
            console.log(`The ${this.type} Cat says '${line}'`);
        }
    }
    
    let FurryCat = new Cat("","Domesticated","");
    let Lion = new Cat("Lion","Wild","brown");
    let Cheetah  = new Cat("","speedster","");

    FurryCat.speak('meowww');
    console.log(Lion);
    Cat.prototype.tail = "Long, and freaking strong"
    console.log(Lion.tail);
    Cat.prototype.speed = "speed: The Flash Level Of Speed"
    console.log(Cheetah.speed);
    //let kl = prompt(Cheetah.name,"Whats the name of this ungodly beast");
    //console.log(kl);
    console.log(Cheetah);
    
    let object = new class { getWord() { return "Hell0"; } };
    console.log(object.getWord());// → hello
/*Class declarations currently allow only methods—properties that hold functions—
to be added to the prototype. 

//INHERITANCE
class Animal {
    constructor(name){
        this.name = name;
    }
    speak(){
        console.log(`${this.name} makes a noise`);
    }
}

class Dog extends Animal {
    speak(){
        console.log(`${this.name} barks`);
    }
}

let dog = new Dog ('Rex');
dog.speak();




class CAR {
    constructor(name){
        this.name = name;
    }
    acceleration(){
        console.log(`${this.name} used to have an acceleration of at least 5secs in 0-60mph before the update`)
    }
}
class Tesla extends CAR {
    acceleration(){
        super.acceleration();
        console.log(`${this.name} now has an impressive acceleration of at least 1.9secs in 0-60mph after the update` )
    }
}
/*The super keyword is used to call a parent's methods
->in the code above the parents acceleration() method is called using the super keyword

let ModelX = new Tesla ("P100d");
ModelX.acceleration();


/* 
If there is a constructor present in the subclass,
it needs to first call "super()" before using "this."





class Human { 
    
    constructor(name){
        this.name = name;
    }
}

class Learner extends Human {
    constructor(name,age){
        super(name);
        this.age = age;
    }
}

class Banker extends Learner {
    constructor(name,age,salary,company){
        super(name,age)
        this.salary = salary;
        this.company = company;
    }
}

class SecurityAnalyst extends Banker {
    constructor(name,age,salary,company,Level,Car,Bonus){
        super(name,age,salary,company)
        this.Level = Level;
        this.Car = Car;
        this.Bonus = Bonus;
    }
}

class Footballer extends Learner {
    constructor(name,age,salary,company){
        super(name,age)
        this.salary = salary;
        this.company = company;
    }
}

class SoftWareEngineer extends Learner {
    constructor(name,age,Base_salary,Bonus,company){
        super(name,age)
        this.Base_salary = Base_salary;
        this.Bonus = Bonus;
        this.company = company;
    }
}


let flapjack = new Learner("flapjack","22");
console.log(flapjack);


let Dimon = new Banker("Dimon","45","$1,000,000","JP MORGAN");
console.log(Dimon);


let Josh = new SecurityAnalyst("Josh","30","$250,000","Wells fargo","L5","Cybertruck","$30,000");
console.log(Josh);


let Neymar = new Footballer("Neymar","28","$1,100,000","PSG");
console.log(Neymar);


let Annie = new SoftWareEngineer("Annie","25","$250,000","$30,000","Google");
console.log(Annie);
 */