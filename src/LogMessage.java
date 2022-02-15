import java.util.ArrayList;
import java.util.Arrays;
public class LogMessage
{
    private String machineId;
    private String description;
    /** Precondition: message is a valid log message. */
    public LogMessage(String message)
    {
        int i = message.indexOf(":");
        machineId=message.substring(0,i);
        description=message.substring(i+1);
    }
    /** Returns true if the description in this log message properly contains keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword)
    {
        String k = " "+keyword+" ";
        String m = " "+description+" ";
        if (m.indexOf(k)!=-1){
            return true;
        }
        return false;
    }
    public String getMachineId()
    { return machineId; }
    public String getDescription()
    { return description; }
// There may be instance variables, constructors, and methods that are not shown.
}