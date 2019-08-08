import java.util.HashMap;
import java.util.*;

public class Hashmatique{
    public static void main(String[]args){
        HashMap<String,String>trackList = new HashMap<String,String>();
        trackList.put("emaye chesave","lalalaala");
        trackList.put("boom shakalaka", "ding dong ");
        trackList.put("zing zong", "tin tin ti");
        trackList.put("rim zim", "rocking rocking");

        Set<String> keys = trackList.keySet();
        for(String key:keys){
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}