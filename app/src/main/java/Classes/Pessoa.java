package Classes;

public class Pessoa {

    public Pessoa(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    //atributos
    private float peso;
    private float altura;
    //O encapsulamento diz que os atributos devem ser privados, e só podem ser modificados dentro da classe que nasceu
    
    
    //para modifica-los fora dessa classe preciso criar modificadores de acesso
    //com isso fazemos get e set
    public void setPeso(float peso) {
        //aqui dentro podemos fazer validação de dados, do tipo:
        //se o usuario digitou o peso correto (se ele nao digitou numero negativo)
        //ou se ele colocou peso 0
        this.peso = peso;
    }    
    public float getPeso() {
       return peso;
    }
    
    
     public void setAltura(float altura) {
        this.altura = altura;
    }    
    public float getAltura() {
       return altura;
    }   
    
    

    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }
}
