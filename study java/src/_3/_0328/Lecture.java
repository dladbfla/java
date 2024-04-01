package _3._0328;

public class Lecture {
    int lectureId;
    String title;
    int duration;
    Category category;
    Defficulty difficulty;

    public Lecture(){

    }

    public Lecture(int lectureId, String title, int duration, Category category, Defficulty difficulty) {
        this.lectureId = lectureId;
        this.title = title;
        this.duration = duration;
        this.category = category;
        this.difficulty = difficulty;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Defficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Defficulty difficulty) {
        this.difficulty = difficulty;
    }


}
