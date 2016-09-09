package uk.rossf.todone;

import java.util.Date;


public class Task {
    private String title, description;
    private Date dueDate, createdDate;
    private Priority priority;

    // constructor for easy creation

    public Task(String title, String description, Date dueDate, Date createdDate, Priority priority) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.createdDate = createdDate;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
