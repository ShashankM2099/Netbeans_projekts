package userinput;

import java.util.Scanner;

/*
Author @ [Shashank Mondrati]
Version @ [9/20/2020]
Description : User Input based problems
1. Asking the user for averaged tests scores
2. Converting the user input to UPPERCASE, lowercase, length and first char at 0
3. Making a story based on userInput.

 */
public class UserInput { // class name

    public static void main(String[] args) {
        // Part II problem 1 : average test score
        Scanner input = new Scanner(System.in);
        System.out.println(" What is your first test score : "); // test scor
        double firstScore = input.nextDouble();
        System.out.println(" What is your second test score: "); // test scr
        double secScore = input.nextDouble();
        System.out.println(" What is your third test Score: "); // test scor
        double thirdScore = input.nextDouble();

        double avgScore = (firstScore + secScore + thirdScore) / (3); // adding averaged scores

        System.out.println(" Average score : " + avgScore); // result

        // Part two Problem 2 : UserInput favourite city
        System.out.println(" What is your favorite city : "); // asking the user for input
        String favCity = input.next();
        System.out.println(" The number of characters are: " + favCity.length()); // returns how many letters
        System.out.println(" Uppercase is : " + favCity.toUpperCase()); // all to uppercase
        System.out.println(" Lowercase is : " + favCity.toLowerCase()); // all to lowercase
        System.out.println(" First character is : " + favCity.charAt(0)); // first letter at 0 index

        // Part II problem 3: name, age and salary
        System.out.println(" What is your name : "); // name
        String name = input.next();
        System.out.println(" What is your age :");// age
        int age = input.nextInt();
        System.out.println(" How much is your annual salary : "); // salary using float
        float salary = input.nextFloat();

        System.out.println(" My name is " + name + " , and I am  " + age + " years old.");
        System.out.println(" My annual salary is $ " + salary); //result

        // Part Two: Final Problem : UserInput based story
        System.out.println(" What's your name? :");
        String yourName = input.next();
        System.out.println(" Whats your Age? : ");
        int yourAge = input.nextInt();
        System.out.println(" Whats your City ?: ");
        String city = input.next();
        System.out.println(" Whats your college?: ");
        String college = input.next();
        System.out.println(" Whats your profession? : ");
        String profession = input.next();
        System.out.println(" Whats your type of pet ?: ");
        String petType = input.next();
        System.out.println(" WHats your pet Name?: ");
        String petName = input.next();

        System.out.println(" There once was a person named " + yourName + " who lived in " + city
                + " ." + "\n At the age of " + yourAge + " ," + yourName + " went to college at" + college + " . \n"
                + yourName + " graduated and went to work at " + profession + "\n .Then, " + yourName + " adopted a(n)"
                + petType + " named " + petName + ".\n They both lived happily ever after. "); // result

    }

}
