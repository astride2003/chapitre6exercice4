//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        compteEpargne epargne = new compteEpargne();
        epargne.compte = "123";
        epargne.solde = 1000;
        epargne.tauxInteret = 2.5;
        System.out.println("COMPTE D'EPARGNE :");
        System.out.println("compte: "+epargne.compte+" solde: "+epargne.solde+" taux d'interet: "+epargne.tauxInteret);
        System.out.println();

        compteCourant courant = new compteCourant();
        courant.compte = "045";
        courant.solde =5009;
        courant.limite= 20000;
        System.out.println("COMPTE COURANT");
        System.out.println("compte: "+courant.compte+" solde: "+courant.solde+" limite: "+courant.limite);
        System.out.println();

        Cod certificat = new Cod();
        certificat.compte = "058";
        certificat.solde =40000;
        certificat.duree= 12;
        System.out.println("CERTIFICAT DE DEPOT");
        System.out.println("compte: "+certificat.compte+" solde: "+certificat.solde+" durée: "+certificat.duree);

    }
}