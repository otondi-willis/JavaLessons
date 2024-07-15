package org.sajourney.JavaLessons.datastructures;

import java.util.HashMap;
import java.util.Map;

public class TestResults {
    public static Map getOriginalGrades(){
        Map grades = new HashMap();
        grades.put("Mark", 90);
        grades.put("Mak", 40);
        grades.put("Mrk", 30);
        grades.put("Mok", 45);
        grades.put("Mok", 48);

        return grades;
    }
    public static Map getMakeUpGrades(){
        Map grades = new HashMap();
        grades.put("Mark", 60);
        grades.put("Mak", 50);
        grades.put("Mrk", 50);
        grades.put("Mok", 56);
        grades.put("Mok", 58);

        return grades;

    }
    public static void main(String[] args) {
        Map<String, Integer> gradebook = getOriginalGrades();
        Map<String, Integer> makeupGrades = getMakeUpGrades();

        gradebook.forEach((student,originalGrade)->{
            Integer makeupGrade = makeupGrades.get(student);
            if(makeupGrade > originalGrade){
                gradebook.put(student,makeupGrade);
            }
            System.out.println(student + ": " + gradebook.get(student));
        });

    }
}
