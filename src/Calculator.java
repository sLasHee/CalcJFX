public class Calculator {
    private String buffer = "";
    private String operator;
    private String operand1;
    private String operand2;

    private boolean isOperator = false;

    public String addNumber(String value) {
        buffer = buffer+value;
        if (!isOperator) {
            operand1 = buffer;
        }
        else {
            operand2 = buffer;
        }
        return buffer;
    }

    public void addOperator(String value) {
        operator = value;
        buffer = "";
        isOperator = true;
    }

    public int getResult() throws MyException {
        DoAction doAction = new DoAction();
        int a,b;
        isOperator = false;
        buffer="";
        try {
            a = Integer.parseInt(operand1);
            b = Integer.parseInt(operand2);
        } catch (NumberFormatException e) {
            throw new MyException("Невреный ввод");
        }
        switch (operator) {
            case "+":
                return doAction.plus (a,b);
            case "-":
                return doAction.minus(a,b);
            case "*":
                return doAction.multiply(a,b);
            case "/":
                return doAction.divided(a,b);
        }
        return 0;
    }

}
