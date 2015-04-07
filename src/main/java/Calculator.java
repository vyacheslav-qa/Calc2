import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

/**
 * Created by User on 14.03.15.
 */
public class Calculator {


    public static void main(String[] args) throws IOException, CalcException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferReader = new BufferedReader(inputStreamReader);

        double a = 0;
        double b;
        double result = 0;
        String calcOperation;
        String opHelp = null;
        String opExit = null;

        ChoiceOperation choiceOp = new ChoiceOperation();


        while (true) {

            System.out.println("Введите help для подсказки");

            opHelp = bufferReader.readLine();
            if (opHelp.equals("help")) {
                System.out.println("Допустимые операторы в калькуляторе: '+', '-', '/', '*'");
                System.out.println("Введите первое число");
            }


            try {
                System.out.println("Вводите только цифры");
                a = Double.parseDouble((bufferReader.readLine()));
            } catch (NumberFormatException с) {

                continue;
            }

            System.out.println("Введите операцию '+', '-', '/', '*'");

            try {

                calcOperation = bufferReader.readLine();
                //если вернулся null, значить передали неокрректное значение.

            } catch (NullPointerException np) {
                System.out.println("Некорректный оператор");
                continue;
            }

            System.out.println("Введите второе значение");
            try {
                b = Double.parseDouble((bufferReader.readLine()));
            } catch (NumberFormatException с) {
                System.out.println("Вводите только цифры");
                continue;
            }


            try {
                result = choiceOp.choice(calcOperation).execute(a, b);
            } catch (NullPointerException np) {
                System.out.println("Введён некорректный оператор");
            }

            System.out.println(result);

            System.out.println("Если хотите завершить программу введите exit");

            opExit = bufferReader.readLine();

            if (opExit.equals("exit"))
                break;
        }

    }
}
