package Assignment;

import java.util.HashMap;
import java.util.Map;

public class ImmutableStudent {
    private final String name;
    private final int regNo;
    private final Map<String, String> subjects;

    public ImmutableStudent(String name, int regNo,
                   Map<String, String> subjects)
    {
        this.name = name;
        this.regNo = regNo;

        Map<String, String> subjectsMap = new HashMap<>();
        for (Map.Entry<String, String> entry :
                subjects.entrySet()) {
            subjectsMap.put(entry.getKey(), entry.getValue());
        }
        this.subjects = subjectsMap;
    }

    public String getName() { return name; }

    public int getRegNo() { return regNo; }

    public Map<String, String> getSubjects()
    {
        Map<String, String> tempSubjectsMap = new HashMap<>();

        for (Map.Entry<String, String> entry :
                this.subjects.entrySet()) {
            tempSubjectsMap.put(entry.getKey(), entry.getValue());
        }
        return tempSubjectsMap;
    }
}
