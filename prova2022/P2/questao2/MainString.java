package P2.questao2;

public class MainString {
    public static void main(String[] args) {
        String palavra = "paralelismo";
        palavra = StringUtils.processa(palavra);
        System.out.println(palavra);
        System.out.println(StringUtils.inverte(palavra));
    }
}
