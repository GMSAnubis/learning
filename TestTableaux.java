import java.util.Arrays;

class TestTableaux
{
    public static void main (String[] args)
    {
        String[] series ={"Babylon5","Battlestar Galactica","Dark Matter","Grimm","Stargate","Kaamelott","StarTrek: The next generation"};
        String[] films ={"Premier Contact","Octobre Rouge","60 secondes chrono","Arrêtes-moi si tu peux","Stargate"};
        String[][] videos =
            {
            series,
            films,
            
            };
       
        Arrays.sort(videos[1]);                 //tri par ordre alpha numérique
         for (String titreFilm : videos[1])     // On affiche les données du tableau film
         {
             System.out.println(titreFilm);
         }
        System.out.println("--- FIN ---");
    }
}