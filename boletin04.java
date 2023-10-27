public class boletin04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        libro obxLib =new libro();

        obxLib.setAutor("Gretta");
        obxLib.setTitulo("Barbie");
        obxLib.setNumPaginas(232);
        obxLib.setAno(2005);

        libro obxLib2 =new libro("Los Miserables", "Victor Hugo",2008,567);

        System.out.println("O autor é "+obxLib.getAutor()+", o titulo é "+obxLib.getTitulo()+", o numero de paxinas é igual a "+ obxLib.getNumPaginas()+", o ano de publicación é "+obxLib.getAno()+".");

        System.out.println("O autor é "+obxLib2.getAutor()+", o titulo é "+obxLib2.getTitulo()+", o numero de paxinas é igual a "+ obxLib2.getNumPaginas()+", o ano de publicación é "+obxLib2.getAno()+".");
    }

}