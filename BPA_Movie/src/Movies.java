import java.util.Scanner;

public class Movies {

    public static void main(String[] args) {
        double movieReviewWebsite = 0;
        double focusReview = 0;
        double criticReview = Math.round((double)((Math.random() * 100) + 1) * 100.0) / 100.0;
        double finalReview = 0;
        int amount = 0;

        try {
            // Get amount of movies being reviewed
            Scanner scan = new Scanner(System.in);
            System.out.println("How many movies are being reviewed? ");
            int amountOfMovies = scan.nextInt();
            while (amount < amountOfMovies) {

                System.out.println("Please enter ratings from the movie review website for movie #" + (amount + 1));
                for (int j = 0; j < 3; j++) {
                    movieReviewWebsite += scan.nextInt();
                }


                System.out.println("Please enter ratings from the focus group for movie #" + (amount + 1));
                for (int i = 0; i < 2; i++) {
                    focusReview += scan.nextDouble();
                }

                finalReview = (movieReviewWebsite / 3) * 0.2;
                finalReview += (focusReview / 2) * 0.3;
                finalReview += (criticReview * 0.5);
                finalReview = ((Math.round(finalReview * 100.0) / 100.0));
                System.out.println("Movie Critic Rating " + (Math.round((criticReview * 100 )) / 100));
                System.out.println();
                System.out.println("Ratings for Movie #1");
                System.out.println("Average website rating: " + (Math.round((movieReviewWebsite / 3) * 100.0)) / 100.0);
                System.out.println("Average focus group rating: " + (Math.round((focusReview / 2) * 100.0)) / 100.0);
                System.out.println("Average movie critic rating: " + criticReview);
                System.out.println("Final Review: " + finalReview);
                System.out.println();
                amount++;
            }
        } catch (Exception e) {
            System.out.println("Invalid Type");
            System.exit(0);
        }
    }
}
