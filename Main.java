

/*
public class Main {
   public static void main(String[] args) {

    System.out.println("I love pizza");
    System.out.println("It's really good!");
    System.out.println();
    System.out.println();

    // This is a comment

    
}
*/

    /*
    public class Main {

    public static void main(String[] args) {

        int x = 123;
        double y = 3.14f;
        boolean z = false;
        char symbol = '@';
        String name = "Bro";

        System.out.println(name);


}
    */

    /* 
    public class Main {

    public static void main(String[] args) {

        String x = "water";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x=y;
        y=temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);

    }
    */

/*
import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+food);

    }

} 
*/

/* 
public class Main {
    public static void main(String[] args) {
        
        // expression = operands & operators
        // operands = values, variables, numbers, quantity
        // operators = + - * / %

        double friends = 10;

        friends--;

        System.out.println(friends);
    
    }
}
*/

/*
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
    }

}
*/

/*
public class Main {
    
    public static void main(String [] args) {

        double x = 3.14;
        double y = -10;

        double z = Math.floor(x);

        System.out.println(z);

    }
}
*/

/*
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is : "+z);

        scanner.close();

    }
}
*/

/*
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        //int x = random.nextInt(6)+1;
        //double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(z);
    }
}
*/

// if statements
/* 
public class Main {

    public static void main(String[] args) {

        // if statement = performs a block of code if it's condition evaluates to be true
         
        int age = 75;

        if(age==75) {
            System.out.println("Ok Boomer!");
        }
        else if (age>=18) {
            System.out.println("You are an adult!");
        }
        else if(age >=13) {
            System.out.println("You are a teenager!");
        }
        else {
            System.out.println("You are not an adult!");
        }


    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        //switch = statement that allows a variable to be treated for equality against a list of values

        String day = "Saturday";

        switch(day) {
        case "Sunday": System.out.println("It is Sunday!");
        break;
        case "Monday": System.out.println("It is Monday!");
        break;
        case "Tuesday": System.out.println("It is Tuesday!");
        break;
        case "Wednesday": System.out.println("It is Wednesday!");
        break;
        case "Thursday": System.out.println("It is Thursday!");
        break;
        case "Friday": System.out.println("It is Friday!");
        break;
        case "Saturday": System.out.println("It is Saturday!");
        break;
        default: System.out.println("That is not a day!");
        }
    }
}
*/

/*
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // logical operators = used to connect two or more expressions
        //
        // && = (AND) both conditions must be true
        // || = (OR) either condition must be true
        // ! = (NOT) reverses boolean value of condition

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game *pew pew*");
        }
        else {
            System.out.println("You quit the game");
        }
    }
}
*/

/* 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // while loop = executes a block of code as long as a it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) { 
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello "+name);

    }
}
*/

/*
public class Main {

    public static void main (String[] args) {

        // for loop = executes a block of code a limited amount of times

        for(int i=10; i>=0; i-=2) {
            System.out.println(i);
        }

        System.out.println("Happy new year!");

    }
}
*/

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // nested loops = a loop inside a loop

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int i=1; i<=rows; i++) {
            System.out.println();
            for (int j=1; j<=columns;j++) {
                System.out.print(symbol);
            }
        }
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        // array = used to store multiple values in a single variable

        String[] cars = {"Camaro","Corvette","Tesla","BMW"};

        cars[0] = "Mustang";

        System.out.println(cars[3]);

    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        // array = used to store multiple values in a single variable

        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for(int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        // 2D array = an array of arrays

        String[][] cars = { 
                            {"Camaro", "Corvette", "Silverado"},
                            {"Mustang","Ranger","F-150"},
                            {"Ferrari","Lambo","Tesla"}
                        };

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        for (int i=0; i<cars.length; i++) {
            System.out.println();
            for (int j=0; j<cars[i].length; j++) {
                System.out.println(cars[i][j]+" ");
            }
        }
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        // String = a reference data type that can store one or more characters
        //          reference data types have access to useful methods

        String name = " Hardik ";

        //boolean result = name.equalsIgnoreCase("bro");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("o");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        //String result = name.replace('o', 'a');

        System.out.println(result);
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        // wrapper class = provides a way to use primitive data types as reference data types
        //                 reference data types contain useful methods
        //                 can be used with collections.(ex.ArrayList)

        //primitive        //wrapper
        //---------        //-------
        // boolean          Boolean
        // char             Character
        // int              Integer
        // double           Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive data 
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive 

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Hardik";
        
        if(b=='@') {
            System.out.println("That is true");
        }
        else {
            System.out.println("That is false");
        }
    }
}
*/

/*
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ArrayList = a resizable array.
        //              Elements can be added and removed after compilation phase
        //              store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hotdog");

        food.set(0, "Sushi");
        food.remove(2);
        food.clear();

        for (int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
*/

/*
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //2D ArrayList = a dynamic list of lists
        //You can change the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        bakeryList.add("tomatoes");
        bakeryList.add("zucchini");
        bakeryList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");
        drinksList.add("peppers");

        groceryList.add(bakeryList);
        groceryList.add(bakeryList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(2).get(1));
        
    }
}
*/

/*
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // for-each = traversing technique to iterate through the elements in an array/collection
        //            less steps, more readable
        //            less flexible 

        // String [] animals = {"cat", "dog", "rat", "bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        // method = a block of code that is executed whenever it is called upon
        
        /*String name = "Hardik";
        int age = 21;

        hello(name,age);

    }
        static void hello(String name, int age) {
            System.out.println("Hello "+ name);
            System.out.println("You are "+age);
        }
        */
/*
        int x = 3;
        int y = 4;

        System.out.println(add(x,y));

    }

    static int add(int x, int y) {
        int z = x + y;
        return z;
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {
        
        // overloaded methods = methods that share the same name but have different parameters
        //                      method name + parameters = method signature

        double x = add(1.0,2.0, 3.0, 4.0);

        System.out.println(x);
    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return b + a;
    }
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c;
    }
    static double add(double a, double b) {
        System.out.println("This is overloaded method #1");
        return b + a;
    }
    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }
}
*/

/*
public class project {

    public static void main(String[] args) {

        //printf() = an optional method to control, format, and display text to the console window
        //           two arguments = format string + (object/variable/value)
        //           % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Hardik";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        System.out.printf("%b",myBoolean);
        System.out.printf("%c",myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d",myInt);
        System.out.printf("%f",myDouble);

        //[width]
        //minimum number of characters to be written as output
        //System.out.printf("Hello %-10s",myString);

        //[precision]
        //sets number of digits of precision when outputting floating-point values
        //System.out.printf("You have this much money %f ",myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        System.out.printf("You have this much money %1000f ",myDouble);
    }
}
*/


/*final = final is a method that cannot be overwritten by any subclass, meaning that the implementation
method is fixed and cannot be changed in any derived classes. */

/*
public class Main {

    public static void main(String[] args) {

        final double pi = 3.14159;


        System.out.println(pi);
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        // object = an instance of a class that may contain attributes and methods
        // example: (phone, desk, computer, coffee cup)

        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);

        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

        //myCar.drive();
        //myCar.brake();
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        //constructor = special method that is called upon 

        Human human1 = new Human("Rick",65,70);
        Human human2 = new Human("Morty",16,50);

        human1.eat();
        human2.drink();
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        //local = delcared inside a method
        //        visible only to that method

        //global = declared outside a method, but within a class
        //         visible to all parts of a class

        DiceRoller diceRoller = new DiceRoller();

    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        // overloaded constructors = multiple constructors within a class with the same name,
        //                           but have different parameters
        //                           name + parameters = signature

        Pizza pizza = new Pizza("thick crust", "tomato", "mozzerella", "pepperoini");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        // toString() = special method that all objects inherit,
        //              that returns a string that "textually represents" an object.
        //              can be used both implicitly and explicitly

        Car car = new Car();


        System.out.println(car.toString());
        System.out.println(car);

    }
    
}
*/

/*
public class Main {

    public static void main(String[] args) {

        Food[] refrigerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {
        
        Garage garage = new Garage();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.park(car1);
        garage.park(car2);
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared.
        //                    The class "owns" the static member

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        Friend.displayFriends();


    }
}
*/

/*
public class Main {

    public static void main(String[] args) {
        
        //inheritance = the process where one class acquires,
        //              the attributes and methods of another.

        Car car = new Car();

        car.go();

        Bicycle bike = new Bicycle();

        //bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        // method overriding =  Declaring a method in sub class,
        //                      which is already present in parent class.
        //                      done so that a child class can give its own implementation
        Animal animal = new Animal();
        Dog dog = new Dog();
        
        dog.speak();
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        //super = keyword refers to the superclass (parent) of an object
        //        very similar to the "this" keyword

        Hero hero1 = new Hero("Batman",42,"$$$");
        Hero hero2 = new Hero("Superman",43, "everything");

        System.out.println(hero2.toString());
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        // abstract = abstract classes cannot be instantiated, but they can have a subclass
        //            abstract methods are declared without an implementation

        //Vehicle vehicle = new Vehicle();
        Car car = new Car();

        car.go();
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {
        
        // Encapsulation = attributes of a class will be hidden or private,
        //                 Can be accessed only through methods (getters & setters)
        //                 You should make attributes private if you have no reason to make them

        Car car = new Car("Chevrolet","Camaro",2021);

        car.setYear(2022);
        
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        // Objects - In java, an object is an instance of a class, 
        also known as a blueprint that defines the structure and behavior of objects.
        //

        Car car1 = new Car("Chevrolet","Camaro",2021);
        //Car car2 = new Car("Ford","Mustang",2022);
        //car2.copy(car1);
        Car car2 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        
        // interface = a template that can be applied to a class.
        //             similar to inheritance, but specifies what a class has/must do.
        //             classes can apply more than one interface, inheritance is limited to 1 super
        
        // Hawk hawk = new Hawk();

        // hawk.flee();

        Fish fish = new Fish();

        fish.hunt();
        fish.flee();
        
    }
}
*/

/*
public class Main {

    public static void main(String[] args) {

        // polymorphism = greek word for poly-"many", morph-"form"
        //                The ability of an object to identify as more than one type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        car.go();
        bicycle.go();
        boat.go();

        for (Vehicle x : racers) {
            x.go();
        }

    }
}
*/

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // polymorphism = many shapes/forms
        // dynamic = after compilation (during runtime)

        // ex. A corvette is a: corvette, and a car and a vehicle, and an object

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("1=dog 2=cat: ");
        int choice = scanner.nextInt();

        if(choice==1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice==2){
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }
    }
}
*/

/*
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner;
    
        public static void main(String[] args) {
            
        // exception = an event that occurs during the execution of a program that,
        //             disrupts the normal flow of instructions
    
    try {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter a whole number to divide: ");
        int x = scanner.nextInt();
    
        System.out.println("Enter a whole number to divide by: ");
        int y = scanner.nextInt();
    
        int z = x/y;
    
        System.out.println("result: " + z);
        scanner.close();
            }
            catch(ArithmeticException e){
                System.out.println("You can't divide by 0! Dummy!");
            }
            catch(InputMismatchException e){
                System.out.println("Please enter a number OMFG!!!");
            }
            catch(Exception e){
                System.out.println("Something went wrong");
            }
            finally {
                scanner.close();
        }
    }
}
*/

/*
import java.io.File;

public class Main {

    public static void main(String[] args) {
        
        // file = An abstract representation of file and directory pathnames

        File file = new File("secret_message.txt");

        if (file.exists()) {
            System.out.println("That file exists! :O!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else {
            System.out.println("That file doesn't exist :(");
        }
    }
}
*/

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    // FileWriter in java is a class used for writing character-based data to files. It
    // extends the OutputStreamWriter class and is part of the java.io.package. 

    public static void main(String[] args) {
        
        try {
        FileWriter writer = new FileWriter("poem.txt");
        writer.write("Roses are Red \nViolets are blue \nBooty booty booty \nRockin");
        writer.append("\n(A poem by bro)");
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}