package org.example;

public class App
{
    public static void main( String[] args )
    {
        int turni=0;
        String player= "x";
        Tris partita= new Tris();


        while(true){
            System.out.println(partita.visulizza());
            partita.giocata(player);
            System.out.println(partita.visulizza());
            String verifica = partita.vincitore();
            if(verifica.equalsIgnoreCase(" VINCE IL GIOCATORE X ") || verifica.equalsIgnoreCase(" VINCE IL GIOCATORE O ")){
                // Il gioco termina se un giocatore vince la partita
                System.out.println(verifica);
                return;
            }
            turni++;
            if(turni==9){
                System.out.println("NESSUN VINCITORE");
                return;
            }
            if(player=="x") player = "o";
            else player = "x";
        }
    }
}