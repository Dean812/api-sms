package fr.orsys.groupe1.sms;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static String numeroDuDestinataire;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main( String[] args )
    {
        System.out.print("Merci de renseigner le num�ro de t�l�phone du destinataire (en commen�ant par +336 ou +337) : ");
        numeroDuDestinataire = scanner.nextLine();
        scanner.close();
        
        // TODO envoyer une requ�te HTTP en utilisant la m�thode POST � l'API REST d'OVH
        // merci de consulter le guide d'OVH
    }
}