public class CalculadoraTest {
    
    private Calculadora calculadora;

    public void testaCalculadoraSoma(){

        calculadora = new Calculadora();
        int resultadoEsperado = 4;

        int resultado = calculadora.somar(2, 2);

        if(resultado == resultadoEsperado){
            System.out.println("Teste Ok");
        } else{
            System.out.println("Teste falhou");
        }
    }
}
