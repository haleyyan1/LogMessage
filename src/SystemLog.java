import java.util.ArrayList;
import java.util.Arrays;
public class SystemLog
{
    /** Contains all the entries in this system log.
     * Guaranteed not to be null and to contain only non-null entries.
     */
    private ArrayList<LogMessage> messageList;
    /** Removes from the system log all entries whose descriptions properly contain keyword,
     * and returns a list (possibly empty) containing the removed entries.
     * Postcondition:
     * - Entries in the returned list properly contain keyword and
     * are in the order in which they appeared in the system log.
     * - The remaining entries in the system log do not properly contain keyword and
     * are in their original order.
     * - The returned list is empty if no messages properly contain keyword.
     */
    public ArrayList<LogMessage> removeMessages(String keyword)
    {
        ArrayList<LogMessage> removed = new ArrayList<LogMessage>();
        for (int i = 0;i<messageList.size();i++){
            if (messageList.get(i).containsWord(keyword)) {
                removed.add(messageList.get(i));
                messageList.remove(i);
                i--;
            }
        }
        return removed;
    }
// There may be instance variables, constructors, and methods that are not shown.
}
