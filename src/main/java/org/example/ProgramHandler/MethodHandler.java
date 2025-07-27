package org.example.ProgramHandler;




import com.fathzer.soft.javaluator.DoubleEvaluator;


import java.util.ArrayList;
import java.util.List;

public class MethodHandler {

    //list of all the allowed math operators
    private static List<Character> operators = new ArrayList<>(List.of('+', '-', '*', '/','^', 'E'));
    public String errormessage = "Error";

    public  String Calculate(String string) {




        //check if the string is empty if not return a error message in string format
        if(!string.isEmpty()) {

            //checks if the input string contains letters if it does it returns a error message in string format
            if(Onlynumbers(string)) {

                //with the help of a java math libary I declare the evaluator the class that take the hole expression and calculate from a sting
                //then i get it in double format so i declare an int thats is the double with int value with help of the libary
                try {
                    DoubleEvaluator evaluator = new DoubleEvaluator();
                    Double result = evaluator.evaluate(string);
                    int i = result.intValue();


                    if(i == evaluator.evaluate(string)) return String.valueOf(i);

                    return result.toString();
                } catch (RuntimeException e) {
                    return  errormessage;
                }



            } else return "The input can not contain letters";




        } else  return "Error the input can not be empty";



    }

//checks if the string input only contains numbers and the math expressions
    public boolean Onlynumbers(String string) {

       for (int i = 0; i < string.length(); i++) {


            if (Character.isLetter(string.charAt(i)) && !operators.contains(string.charAt(i))) {


                    return false;
            }
       }
            return true;
    }


    public  boolean getifoperatorbefore(String string) {

        for(int i = 0; i < operators.size(); i++) {
            if(string.charAt(string.length() - 1) == operators.get(i)) {
                return true;

            }

        }

        return false;
    }

    public String GetErrorMessage()  {
        return errormessage;
    }











    }
