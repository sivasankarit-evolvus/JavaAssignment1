package Assignment;

import java.util.HashMap;
import java.util.Map;

public class ImmutableRun {
	public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Physics");
        map.put("2", "Chemistry");
        ImmutableStudent s = new ImmutableStudent("RAM", 101, map);

        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getSubjects());

        map.put("3", "MATHS");
        // Remains unchanged due to deep copy in constructor
        System.out.println(s.getSubjects());
        s.getSubjects().put("4", "Biology");
        // Remains unchanged due to deep copy in getter
        System.out.println(s.getSubjects());
    }
}
