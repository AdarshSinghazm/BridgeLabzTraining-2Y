public class OnlineCourseManagement {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Tech Academy";

    public OnlineCourseManagement(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + " | Duration: " + duration + " weeks | Fee: ₹" + fee + " | Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        OnlineCourseManagement c1 = new OnlineCourseManagement("Java", 8, 5000);
        c1.displayCourseDetails();

        OnlineCourseManagement.updateInstituteName("Skill Hub");
        OnlineCourseManagement c2 = new OnlineCourseManagement("Python", 6, 4500);
        c2.displayCourseDetails();
    }

}
