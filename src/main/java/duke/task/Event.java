package duke.task;

public class Event extends Task {
    protected String time;

    public Event(String name, String time) {
        super(name);
        this.time = time;
        //Format date;
    }

    @Override
    public String toString() {
        return String.format("[E]%s (at: %s)", super.toString(), this.time);
    }
}
