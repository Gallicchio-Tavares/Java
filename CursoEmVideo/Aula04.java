public class Aula04 {
    // métodos acecssores e modificadores (getters + setters)
    /*
     garantem maior segurança no acesso
     */
    public static void main(String[] args){

        Caneta2 c1 = new Caneta2("Faber Castell", "preta", 0.9); // forma nova, + fácil
        Caneta2 c2 = new Caneta2("Caran d'Ache", "vermelha", 0.5);
        Caneta2 c3 = new Caneta2("Staedtler", "azul", 0.2);
        //c1.setModelo("Staedtler");
        //c1.modelo = "bic";// vai funcionar pq é public
        //c1.setPonta(0.7);
        //c1.ponta = 0.6; //  não vai funcionar pq é private
        
        // ^ forma antiga

        c1.status();
        c2.status();
        c3.status();
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
}
