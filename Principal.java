// startsWith()
// endsWith()
// indexOf()
// replaceAll()
// substring()

public class Principal {
    public static void main(String[] args) {
        String str = "http://";
        if(str.startsWith("http")) {
            System.out.println("É um site");
        } else if(str.endsWith("jpg")){
            System.out.println("É uma imagem");
        }

        String k = "A menina foi para a escola";
        if(k.indexOf("escola") > -1) {
            System.out.println("Existe");
        }

        String b = "Pra vc ser campeao tem que ir";
        b = b.replaceAll("vc", "você");
        System.out.println(b);

        String d = "A casa amarela";
        String c = d.substring(2, 4);
        System.out.println(c);
    }
}
