package org.example;


import java.util.Scanner;

public class Tris {
    public String[][] campo;
    static final int righe = 3;
    static final int colonne = 3;
    Scanner in = new Scanner(System.in);



    public Tris() {
        campo = new String[righe][colonne];
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                campo[i][j] = " ";
            }
        }
    }

    public java.lang.String visulizza() {
        java.lang.String r = "";
        for (int i = 0; i < righe; i++) {
            r = r + "|";
            for (int j = 0; j < colonne; j++) {
                r = r + campo[i][j];
            }
            r = r + "|\n";
        }
        return r;
    }

    public void giocata(String player) {
        Scanner input = new Scanner(System.in);
        int riga, colonna;
        boolean valida;
        do{
            valida=true;
            System.out.println("Inserisci riga per "+player);
            System.out.println("-1 per uscire ");
            riga = in.nextInt();
            System.out.print("Inserisci colonna per " +player);
            System.out.println(" : ");
            colonna = in.nextInt();
            if (riga<0 || riga>2 || colonna<0 || colonna>2) {
                valida = false;
                System.out.println("Riga e colonna devono essere tra 0 e 2");
            } else if (campo[riga][colonna] != " ") {
                valida=false;
                System.out.println("Posizione occupata, ritenta");
            }
        } while (!valida);

        campo[riga][colonna] = player;
    }


    public java.lang.String vincitore() {
        int k = 0;
        int h = 0;
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                if (campo[i][j] == "x") {
                    k++;
                    if (k == 3) {
                        return " VINCE IL GIOCATORE X ";
                    }
                } else {
                    if (campo[i][j] == "o") {
                        h++;
                        if (h == 3) {
                            return " VINCE IL GIOCATORE O ";
                        }
                    }
                }
            }
            k = 0;
            h = 0;
        }

        for (int i = 0; i < colonne; i++) {
            for (int j = 0; j < righe; j++) {
                if (campo[j][i] == "x") {
                    k++;
                    if (k == 3) {
                        return " VINCE IL GIOCATORE X ";
                    }
                } else {
                    if (campo[j][i] == "o") {
                        h++;
                        if (h == 3) {
                            return " VINCE IL GIOCATORE O ";
                        }
                    }
                }
            }
            k = 0;
            h = 0;
        }
        for (int i = 0; i < righe; i++) {
            int j = i;
            if (campo[i][j] == "x") {
                k++;
                if (k == 3) {
                    return " VINCE IL GIOCATORE X ";
                }
            } else {
                if (campo[i][j] == "o") {
                    h++;
                    if (h == 3) {
                        return " VINCE IL GIOCATORE O ";
                    }
                }
            }
        }
        k = 0;
        h = 0;
        int j = 2;
        for (int i = 0; i < righe; i++) {
            if (campo[i][j] == "x") {
                k++;
                if (k == 3) {
                    return " VINCE IL GIOCATORE X ";
                }
            } else {
                if (campo[i][j] == "o") {
                    h++;
                    if (h == 3) {
                        return " VINCE IL GIOCATORE O ";
                    }
                }
            }
            j--;
        }
        return "";
    }

}




