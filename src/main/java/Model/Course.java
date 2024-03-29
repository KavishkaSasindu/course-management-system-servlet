package Model;

public class Course {
    private String course;
    private String owner;
    private String institute;
    private String category;
    private String duration;

    public Course(String course, String owner, String institute, String category, String duration){
        this.course = course;
        this.owner = owner;
        this.institute = institute;
        this.category = category;
        this.duration = duration;
    }

    public String getCourse() {
        return course;
    }

    public  void setCourse(String course) {
        this.course = course;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
