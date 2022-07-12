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
        System.out.print("Merci de renseigner le numéro de téléphone du destinataire (en commençant par +336 ou +337) : ");
        numeroDuDestinataire = scanner.nextLine();
        scanner.close();
        
        // TODO envoyer une requête HTTP en utilisant la méthode POST à l'API REST d'OVH
        // merci de consulter le guide d'OVH
    }
}