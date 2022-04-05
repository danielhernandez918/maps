import java.util.HashMap;

public class MapJava {
    public static void main(String[] args)  {
        HashMap<String, String> SongMap = new HashMap<String, String>();
        SongMap.put("Twinkle Star", "Twinkle twinkle little star...");
        SongMap.put("Sunshine", "Sunshine sunshine sunshine....");
        SongMap.put("What does the fox say", "The fox says ...");
        SongMap.put("Pokemon", "Gotta catch them all...");

        String val = SongMap.get("Twinkle Star");
        System.out.println(val);

        for (String key : SongMap.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, SongMap.get(key)));
        }
    }
}