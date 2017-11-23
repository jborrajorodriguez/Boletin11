package boletin11;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Boletin11 {

    public static void main(String[] args) {
        Seleccion seleccion1=new Seleccion(04,108,"España"," ");
        JOptionPane.showMessageDialog(null,seleccion1.toString());
        Seleccion xogador1=new Xogador(23,"delantero",21,01,"Juan","Borrajo");
        JOptionPane.showMessageDialog(null,xogador1.toString());
        Adestrador adestrador1=new Adestrador("Española",02,56,"Carlos","Rodriguez");
        JOptionPane.showMessageDialog(null,adestrador1.toString());
        Masaxista masaxista1=new Masaxista("Médico",12,03,53,"Alex","Rodriguez");
        JOptionPane.showMessageDialog(null,masaxista1.toString());
        seleccion1.concentrarse();
        xogador1.concentrarse();
        adestrador1.concentrarse();
        masaxista1.concentrarse();
        seleccion1.viaxar();
        xogador1.viaxar();
        adestrador1.viaxar();
        masaxista1.viaxar();
    }

}
