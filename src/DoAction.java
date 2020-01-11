
public class DoAction implements Action {
    @Override
    public int plus(int a, int b) {
        return a+b;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int divided(int a, int b) throws MyException {
        try {
            return a / b;
        }catch (ArithmeticException e) {
            throw new MyException("Делить на ноль нельзя!");
        }
    }
}