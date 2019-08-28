package duke.task;

public class Task {
    protected String name;
    protected boolean isDone;

    public Task(String name) {
        this.name = name;
        this.isDone = false;
    }

    public String statusIcon() {
        return (isDone ? "\u2713" : "\u2718");
    }

    public void markDone() {
        this.isDone = true;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s", this.statusIcon(), this.name);
    }
}
