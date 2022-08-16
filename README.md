# 1_Java_learning
 Exploring Java

## Tutorial 1
* Based off the tutorial from [**Programming with Mosh**](https://www.youtube.com/watch?v=eIrMbAQSU34)
* Started on 27/07/2022
* Hoping for 1 hour of coding per day


### Notes from tutorial
4 parts
* Beginner
* Intermediate
* Advanced 
* Mastery
#### Command Line info

1. `System.out.println`
    * Class.member.method 
      * (System class defined within Java.lang package)
      * (Out is a field member)

#### What happened when we Run main.main
2 steps involved 
1. Compilation
2. Executions

#### Variables
``int age = 30;``
1. Specify the type
2. Apply name of var
3. initialise the value
4. camelCase is used for var naming

#### Types
1. Primitive
Basic types (8 of them)
   1. byte [1 byte] (range -128,127)
   2. short [2 byte] (range -32K,32K)
   3. int [4 byte] (range -2B,2B)
   4. long [8 byte] 
   5. float [4 byte] (can take decimal)
   6. double [8 byte]
   7. char [2 byte] (letters)
   8. boolean [1 byte] true/false


``123_456_789`` **Can seperate big numbers with underscore for readability**
``3_123_456_789L`` the **L** specifies that it is LONG type
``float price=10.99`` by default sees it as a double (Replace with ``float prince = 10.99F``)
``char letter = 'A'`` single character = single quotes / string = double quotes


2. Reference  
   * Used for storing complex objects eg. date, mail msgs.  
   * Date is a reference type
   * **We must allocate memory**
`Date now = new Date();`
   * Object is an instance of a class
   * `now.getTime()` is a method of Date class 
(primative types dont have that)

##### Primative vs Reference Types
**Memory management**
* Using primative types, variables are non dependant
* Reference variables only point to a specific location in memory
* Primative types are the value of the location in memory


## Strings
We don't have to use 

      String msg = new String("hello world");
but instead can use, as a java shortcut

      String msg = "hello world";

* Can concatenate strings using +
* Can use methods on strings 
  1. "indexOf"
  2. endsWith
  3. toLowerCase(toUpperCase)
  4. trim
  5. replace (does not modify strings)

Use \ to prefix java syntax in a string

## Arrays
```int[] numbers = new int[5]```
* 5 specifies the size of array
* first element is numbers[0]
* Printing array gives you the string generated in the memory location  
#### to print array
System.out.println(Arrays.toString(numbers));

can also instantiate using `int[] numbers = {1,2,3,4,5}`
* `numbers.length` is the length of array. They have a fixed length once created
* `numbers.sort` sorts the array

We can create 2D/3D arrays ``int [][] numbers = new int [2][3];``
* To print multi dimensional strings `Arrays.deepToString()`
* We can also create using
        
        int[] [] numbers = {{1,2,3},{4,5,6}}

## Constants
Variables that we do not want to change during their lifetime
        
        final float PI = 3.14F

* final sets it as a constant
* Should use caps

## Arithmetic Expressions 
We can use increment

``x++;`` = ``++x``

        int y = x++
        y = x
        x +1
If we have ++ after x it copies first then increments

        int y ++x
        x+1
        y= x


* x +=2 (/=, *=, -=)

## Casting
* **Implicit casting** Happens when the cast goes from small to big, this is fine 
    * can only happen between compatible types
  
``Integer.parseInt()`` takes string and returns an int

## Math Class
`int result = Math.round(1.1F);`
* Sets result to the rounded result within brackets
* `ceil` is the ceiling of the value inside brackets
* `int result = (int)Math.ceil(1.1F);` (int) casts the value to integer 

## Number formatting

NumberFormat is abstract, can't be created using an instance.

~~`NumberFormat currency = new NumberFormat()`~~
```
NumberFormat currency = NumberFormat.getCurrencyInstance()
currency.format(1234567.897);
```
* Can also use getPercentInstance

We can define the object and call the function in the one line using dot operator
`NumberFormat.getCurrencyInstance().format(0.234)`

## Reading input

`Scanner scanner = new Scanner(System.in)`

System.in is a field in system class
variable defined in a class

scanner.nextByte();

scanner.next();
    returns a string
    reads one token only, a token is reflected by the space or tab

scanner.nextLine()
this takes the whole line

## Logical operators

Use of **and**, **or** and **not** variables in snippet below;

        boolean tooHot = false;
        boolean tooSunny = true;
        boolean isNice = !tooHot && !tooSunny;
        boolean needJacket = tooHot || tooSunny;

Implementation of **If statements**
        
        if(temp>40){
        System.out.println("Hot");
        } else if (temp<20){
        System.out.println("Cold");
        } else{
            System.out.println("nice");
            boolean tooHot = false
        }

Scope of tooHot is only available within else block
**Instantiate variable in main block**.
**easiest way to implement the value of a var**
`boolean hasHighIncome = (income > 100_000);`
### Ternary Operator

        String className = income > 10 ? "first" : "Economy"; 
        Var = <Logical exp> ? <if true> : <if false>;
Question mark and colon is ternary operator


## Switch case

    switch(role) {
    case "admin":
        sout("admin");
        break
    case "moderator":
        sout("moderator");
        break;
    default:
        sout("guest");
    }

### For loops syntax
For (int i=0;I<5;I++){
}

### While loops
while (I>0)
{}

Inequality operator does not work for strings.

Strings are references, only compares the address of the reference var

``!String.equals()``


### Do while
Executes at least once

        Do{

        }While(I>1);

* **Break** comes out of loop
* **Continue** moves to beginning of loop again

### For each
Limited to stepping through forward only
We dont have access to index either 

    Strings [] fruits = {"apple","orange","pear"};

    For (string fruit:fruits)
     Sout (fruit);


# Important Notes
1. sout is shorthand for print out to term
2. Within intelliJ we can change vars using Shift+F6 to rename var everywhere, also suggests names for var
3. 