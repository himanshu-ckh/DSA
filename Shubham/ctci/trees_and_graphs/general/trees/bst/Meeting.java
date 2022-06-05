package ctci.trees_and_graphs.general.trees.bst;

public class Meeting {

    int start;
    int duration;
    Meeting left;
    Meeting right;

    public Meeting(int start, int duration) {
        this.start = start;
        this.duration = duration;
        this.left = null;
        this.right = null;
    }

    public static Meeting insert(Meeting meeting, int start, int duration) throws Exception {
        if (start < 0) {
            throw new Exception("Start cannot be less than 0");
        }

        if (start + duration > 60) {
            throw new Exception("That will be end of the day");
        }

        if (meeting == null) {
            return new Meeting(start, duration);
        }

        if (meeting.start < start) {
            if (start < meeting.start + meeting.duration) {
                throw new Exception("Slot already occupied");
            } else {
                meeting.right = insert(meeting.right, start, duration);
            }
        }

        if (meeting.start > start) {
            if (start + duration > meeting.start) {
                throw new Exception("Slot already occupied");
            } else {
                meeting.left = insert(meeting.left, start, duration);
            }
        }

        return meeting;
    }

    public static void getAllMeetings(Meeting meeting) {
        if (meeting == null) {
            return;
        }

        getAllMeetings(meeting.left);
        System.out.println("Start : " + meeting.start + " and End : " + (meeting.start + meeting.duration));
        getAllMeetings(meeting.right);
    }

    public static void main(String[] args) throws Exception {
        Meeting meeting = new Meeting(0, 0);
        insert(meeting, 1, 5);
        insert(meeting, 10, 10);
        insert(meeting, 50, 5);
        insert(meeting, 35, 7);
        insert(meeting, 42, 4);
        getAllMeetings(meeting);
    }
}
