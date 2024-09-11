public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";
        switch ( sigla ) {
            case "p":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.err.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
            }
    }

}



      
    


