package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview inception = new MovieReview();
        MovieReview aboutTime = new MovieReview();

        MovieReview[] movieReviews = new MovieReview[]{inception, aboutTime};

        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        for(MovieReview mv : movieReviews){
            System.out.println("영화 제목: " + mv.title + ", 리뷰: " + mv.review);
        }
    }
}
