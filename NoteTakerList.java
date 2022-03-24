package NoteTaker;

public class NoteTakerList {
    private NoteTakerNode head, tail;
    private boolean organize;

    public NoteTakerList() { }

    public void addNote(String _title, String _note) {
        NoteTakerNode _toAdd = new NoteTakerNode(_title, _note);;
        if(head == null) {
            head = _toAdd;
            tail = head;
        }
        
        if(organize) {
            // Add based on _title
            // If _toAdd < tail, then set tail.next = _toAdd
            // Else, when adding, set tail if parent.next == null, otherwise add like LinkedList
        } else {
            tail.setNext(_toAdd);
        }
    }

    // Getters and Setters
    public boolean getOrganize() { return organize; }
    
    public void setOrganize(boolean _organize) { organize = _organize; }
}
