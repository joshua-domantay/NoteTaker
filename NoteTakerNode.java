package NoteTaker;

public class NoteTakerNode {        // LinkedListNode
    private String name, note;
    private NoteTakerNode next;

    public NoteTakerNode() { }

    public NoteTakerNode(String name, String note) {
        this.name = name;
        this.note = note;
    }

    // Getters and Setters
    public String getName() { return name; }
    public String getNote() { return note; }
    public NoteTakerNode getNext() { return next; }

    public void setName(String name) { this.name = name; }
    public void setNote(String note) { this.note = note; }
    public void setNext(NoteTakerNode next) { this.next = next; }
}
