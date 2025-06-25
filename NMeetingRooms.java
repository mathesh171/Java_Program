import java.util.Arrays;
import java.util.Comparator;
public class NMeetingRooms
{
    public class data{
        int start;
        int end;
        int pos;
        
        public data(int start, int end, int pos){
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
        
        @Override
        public String toString() {
            return "Meeting data{ start=" + start + "End=" + end + "Pos=" + pos +"}";
        }
    }
    
    public int maxMeetings(int[] start, int[] end, int n) {
        data data[] = new data[n];
        for(int i=0;i<n;i++){
            data[i] = new data(start[i], end[i], i+1);
        }
        
        Arrays.sort(data, Comparator.comparing((NMeetingRooms.data m) -> m.end)
                                        .thenComparing((NMeetingRooms.data m) -> m.pos));
        
        // for(data d:data)
        // System.out.println(d);
        
        int count = 1, freeTime = data[0].end;
        int meet[] = new int[n], a = 0;
        for(int i=1;i<n;i++){
            if(data[i].start > freeTime){
                freeTime = data[i].end;
                count++;
                meet[a++] = data[i].pos;
            }
        }
        
        return count;
    }
    
	public static void main(String[] args) {
		int start[] = {1, 3, 0, 5, 8, 5};
		int end[] = {2, 4, 6, 7, 9, 9};
		NMeetingRooms meeting = new NMeetingRooms();
		int meet = meeting.maxMeetings(start, end, start.length);
		System.out.println(meet);
	}
}