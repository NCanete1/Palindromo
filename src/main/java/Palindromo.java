public class Palindromo {
    public static String Normalizar(String texto){
        texto=texto.toLowerCase().replace(" ","").replace(".","").replace(",","");
        texto=texto.replace("á","a").replace("é","e").replace("í","i").replace("ó","o").replace("ú","u");
        return texto;
    }
    public static boolean Comparar(String texto) {
        String txt=Normalizar(texto);
        int i = 0;
        int j = txt.length() - 1;
        while (i < j) {
            if(txt.charAt(i)!=txt.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void EsPalindromo(String str){
        if(Comparar(str)){System.out.println("Es palindromo");
        }else{
            System.out.println("NO");
        }
    }
}


