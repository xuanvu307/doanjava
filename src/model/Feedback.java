package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Feedback{
    private LocalDateTime timeFeedback;
    private String feedback;
    private String userName;

    public LocalDateTime getTimeFeedback() {
        return timeFeedback;
    }

    public void setTimeFeedback(LocalDateTime timeFeedback) {
        this.timeFeedback = timeFeedback;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                ", feedback='" + feedback + '\'' +
                ", userName='" + userName + '\'' +
                "timeFeedback=" + timeFeedback +
                '}';
    }
}