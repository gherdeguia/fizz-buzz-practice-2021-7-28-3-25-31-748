package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int givenNumber){

        if(givenNumber % 3 == 0){
            return "Fizz";
        }
        else{
            return String.valueOf(givenNumber);
        }

    }



}
