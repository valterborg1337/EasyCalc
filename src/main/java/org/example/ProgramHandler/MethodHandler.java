

package org.example.ProgramHandler;

import com.fathzer.soft.javaluator.DoubleEvaluator;
import java.util.ArrayList;
import java.util.List;

public class MethodHandler {
    private static List<Character> operators = new ArrayList(List.of('+', '-', '*', '/', '^', 'E'));
    public String errormessage = "Error";

    public String Calculate(String string) {
        if (!string.isEmpty()) {
            if (this.Onlynumbers(string)) {
                try {
                    DoubleEvaluator evaluator = new DoubleEvaluator();
                    Double result = (Double)evaluator.evaluate(string);
                    int i = result.intValue();
                    return (double)i == (Double)evaluator.evaluate(string) ? String.valueOf(i) : result.toString();
                } catch (RuntimeException var5) {
                    return this.errormessage;
                }
            } else {
                return "The input can not contain letters";
            }
        } else {
            return "Error the input can not be empty";
        }
    }

    public boolean Onlynumbers(String string) {
        for(int i = 0; i < string.length(); ++i) {
            if (Character.isLetter(string.charAt(i)) && !operators.contains(string.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public boolean getifoperatorbefore(String string) {
        for(int i = 0; i < operators.size(); ++i) {
            if (string.charAt(string.length() - 1) == (Character)operators.get(i)) {
                return true;
            }
        }

        return false;
    }

    public String GetErrorMessage() {
        return this.errormessage;
    }
}
