public interface Action {
    int plus(int a, int b);
    int minus(int a, int b);
    int multiply(int a, int b);
    int divided(int a, int b) throws MyException;
}