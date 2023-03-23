package calculadora;

public class Calculadora {
    
    public int somar(int a, int b) {
        return a + b;
    }
    
    public double somar(double a, double b) {
        return a + b;
    }
    
    public float somar(float a, float b) {
        return a + b;
    }
    
    public long somar(long a, long b) {
        return a + b;
    }
    
    public int subtrair(int a, int b) {
        return a - b;
    }
    
    public double subtrair(double a, double b) {
        return a - b;
    }
    
    public float subtrair(float a, float b) {
        return a - b;
    }
    
    public long subtrair(long a, long b) {
        return a - b;
    }
    
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    public float multiplicar(float a, float b) {
        return a * b;
    }
    
    public long multiplicar(long a, long b) {
        return a * b;
    }
    
    public int dividir(int a, int b) {
        return dividirAux((double) a, (double) b).intValue();
    }
    
    public double dividir(double a, double b) {
        return dividirAux((double) a, (double) b).doubleValue();
    }
    
    public float dividir(float a, float b) {
        return dividirAux((double) a, (double) b).floatValue();
    }
    
    public long dividir(long a, long b) {
        return dividirAux((double) a, (double) b).longValue();
    }
    
    private Double dividirAux(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return a / b;
    }
    
}
