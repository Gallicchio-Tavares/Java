package P2.questao2;

public class StringUtils{
    /*
     * esse método deve receber uma String e retornar uma nova String toda em caixa alta
    (letras maiúsculas) e com as letras A, E, I, O substituídas por 4, 3,1,0 respectivamente.
    Também criar um método para inverter a string.
     */
    public static String processa(String str){
        str = str.toUpperCase(); // primeiro, deixando tudo em caps.
        str = str.replaceAll("A", "4");
        str = str.replaceAll("E", "3");
        str = str.replaceAll("I", "1");
        str = str.replaceAll("O", "0");
        return str;
    }

    public static String inverte(String str){
        char[] normal = str.toCharArray();
        char[] invertida = str.toCharArray();
        for (int i = normal.length - 1; i >= 0; i--){
            invertida[normal.length - 1 - i] = normal[i];
        }
        String string = new String(invertida);
        return string;
    }
}
