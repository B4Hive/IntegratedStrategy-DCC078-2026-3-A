package b4hive;

public class Aluno {

    private float nota;

    public float getNota() {
        return nota;
    }

    public void somarNota(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.nota = calculadora.calcular("Somar");
    }

    public void subtrairNota(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.nota = calculadora.calcular("Subtrair");
    }

    public void dividirNota(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.nota = calculadora.calcular("Dividir");
    }

    public void multiplicarNota(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.nota = calculadora.calcular("Multiplicar");
    }

    public void calcularMediaNotas(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.nota = calculadora.calcular("Media");
    }

}
