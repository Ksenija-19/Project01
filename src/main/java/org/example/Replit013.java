package org.example;

public class Replit013 {
    public static void main(String[] args) {
        //1. Create an int variable called myNumber. Set it equal to any number other than 0.
        //2. We will refer to myNumber as the _original number_ from now on.
        //3. Create an int variable called stepOne. Set it equal to the original number (myNumber) multiplied by itself.
        //4. Create an int variable called stepTwo. Set it equal to the previous result (stepOne) plus the original number (myNumber).
        //5. Create an int variable called stepThree. Set it equal to the previous result (stepTwo) divided by the original number.
        //6. Create an int variable called stepFour. Set it equal to the previous result (stepThree) plus 17.
        //7. Create an int variable called stepFive. Set it equal to the previous result (stepFour) minus the original number.
        //8. Create an int variable called stepSix.Set it equal to the previous result (stepFive) divided by 6.
        //9. Let's print out the value of the last step as: "The magic number is _ !"
        //   The magic number is _!
        int myNumber = 7;
        int stepOne =  myNumber*myNumber;
        int stepTwo =  stepOne+myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix =  stepFive / 6;
        System.out.println(" The magic number is " + stepSix + "!");





    }
}
