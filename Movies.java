import java.util.Arrays;
class Movies
{
    public static void main(String[] args)
    {
        String[] movie = 
        {
            "La dernière croisade",
            "Les aventuriers de l'arche perdue",
            "Le temple maudit"
        };
        String[] actors = 
        {
            "Harrison Ford, Sean Connery, Denholm Elliot",
            "Harrison Ford, Karen Allen, Paul Freeman",
            "Harrison Ford, Kate Capshaw, Jonathan Ke Quan"
        };
       /* String[][] saga =
        {
            movie,
            actors,
        };

       for (int i=0; i<saga[0].length; i++)
       {
           System.out.println("Dans le film "+saga[0][i]+" les acteurs principaux sont: "+saga[1][i]);
       } */

       String[] moviesArray2 = Arrays.copyOf(movie, movie.length + 2);
for(int i = 0; i < movie.length; i++) {
    moviesArray2[i] = movie[i];
} 

int lastPreviousIndex = movie.length -1;

moviesArray2[lastPreviousIndex + 1] = "Indiana Jones and the Fate of Atlantis";
moviesArray2[lastPreviousIndex + 2] = "Indiana Jones and Facebook's Personal Data";

for (String movies : moviesArray2) {
    System.out.println(movies);
}

    }
}