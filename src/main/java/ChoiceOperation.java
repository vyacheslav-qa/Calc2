/**
 * Created by User on 14.03.15.
 */
public class ChoiceOperation {

    public MyOperation choice(String calcOperation) {

        switch (calcOperation) {
            case "+":
                return new Plus();

            case "-":
                return new Minus();

            case "*":
                return new Multiplication();

            case "/":

                return new Division();
        }
        //  throw new Exception();
        return null;
    }
}
