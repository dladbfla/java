package _3._0328;

public class Review {
    int reviewId;
    int lectureId;  //강의 아이디
    String loginId;  //유저의 아이디
    int rating;  //(1~10점)
    String text;  //리뷰 텍스트



    public Review() {
    }

    public Review(int reviewId, int lectureId, String loginId, int rating, String text) {
        this.reviewId = reviewId;
        this.lectureId = lectureId;
        this.loginId = loginId;
        this.rating = rating;
        this.text = text;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String toString(){
        return reviewId+", "+lectureId + ", "+loginId+", "+rating+", "+text;
    }

}
