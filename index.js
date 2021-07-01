'use strict'

const person=function(firstName,birthYear) {
 this.firstName=firstName;
 this.birthYear=birthYear;
}

const phani=new person('Phaneendra',2001);
console.log(phani);
const yaswanth=new person('Yaswanth',2001);
console.log(yaswanth);

person.prototype.calcAge=function()
{
    console.log(2050-this.birthYear);
}
phani.calcAge();
console.log(phani.__proto__);
console.log(phani.hasOwnProperty('firstName'));
console.log(person.prototype.isPrototypeOf(phani));


class person{
    constructor(firstName,birthYear){
        this.firstName=firstName;
        this.birthYear=birthYear;
    }
    // calcAge(){
    //    console.log(2050-this.birthYear);
    // }
}

const phani=new person('Phaneendra',2001);
console.log(phani);

person.prototype.calcAge=function(){
    console.log(2050-this.birthYear);
}

phani.calcAge();

