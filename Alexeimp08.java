import java.io.*;

public class Alexeimp08 {

    public static void main(String[] args) {
        Filleser filleser = new Filleser();
        String nokkel = args[0];
        String [] ord = filleser.lestFil(args[1]);
        int antalltraader = Integer.parseInt(args[2]);
        int antallord = filleser.getAntord();
        int fra= 0;
        int til= antallord/antalltraader;
        int temp = til;
        int antallforekomster = 0;
        Traader [] traader = new Traader [antalltraader];
// Using if else, to determine the ammount of threads by input, if you only want to use
// one thread, then it will use the one thread that is automaticly made when the main method is called.
    if (antalltraader>1){
        for (int i = 0; i< antalltraader; i++){
            traader[i]= new Traader(fra,til,nokkel,ord,Thread.currentThread());
            traader[i].start();
            fra = til+1;
            temp = til+temp;
        }
        try {
        for (int i = 0; i< antalltraader; i++){
            traader[i].join();
            antallforekomster = antallforekomster + traader[i].getAntall();
        }}
        catch (InterruptedException e){
            System.out.println("Error");}
        System.out.println("\t Sookeord: " + nokkel+ "\n\t Antall funnet: " + antallforekomster);
    }
    else {
        antallord--;
        for (int i = 0; i<= antallord; i++){

              if (nokkel.equalsIgnoreCase(ord[i])){antallforekomster++;}
          }
        System.out.println("\t Sookeord: " + nokkel+ "\n\t Antall funnet: " + antallforekomster);
        }

    }}


