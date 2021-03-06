package NoteTaker;

public class NoteTakerNode {        // LinkedListNode
    private String title, note;
    private NoteTakerNode next;

    public NoteTakerNode() { }
    public NoteTakerNode(String _title, String _note) {
        title = _title;
        note = _note;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public String getNote() { return note; }
    public NoteTakerNode getNext() { return next; }

    public void setTitle(String title) { this.title = title; }
    public void setNote(String note) { this.note = note; }
    public void setNext(NoteTakerNode next) { this.next = next; }
}
