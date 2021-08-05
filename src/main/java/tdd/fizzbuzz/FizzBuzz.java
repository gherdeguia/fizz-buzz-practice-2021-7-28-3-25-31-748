package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int givenNumber){

        if(givenNumber % 3 == 0){
            return "Fizz";
        }
        else if(givenNumber % 5 == 0){
            return "Buzz";
        }
        else if(givenNumber % 7 == 0){
            return "Whizz";
        }
        else{
            return String.valueOf(givenNumber);
        }

    }



}
