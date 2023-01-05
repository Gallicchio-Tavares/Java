package P2.questao1;

public class Estrela extends CorpoCeleste{
    public Estrela(String id) {
        super(id);
    }
    
    public String toString() {
        return "[Estrela]" + "" + super.toString();
    }
}
