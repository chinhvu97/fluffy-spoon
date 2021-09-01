import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BinaryWatch {
    List<String> result = new ArrayList<>();

    public List<String> readBinaryWatch(int turnedOn) {
        int[] choices = {0, 1};
        int[] combine = new int[10];
        backtrack(0, combine, choices, 0, turnedOn);
        return result;
    }

    private void backtrack(int index, int[] combine, int[] choices, int count, int turnedOn) {
        for (int i = 0; i < choices.length; i++) {
            combine[index] = choices[i];
            if (choices[i] == 1) count++;
            if (index == combine.length - 1) {
                if (count == turnedOn) {
                    String temp = process(combine);
                    if (!Objects.equals(temp, "")) result.add(temp);
                }
            } else {
                backtrack(index + 1, combine, choices, count, turnedOn);
            }
        }
    }

    public String process(int[] combine) {
        //hour
        int hour = 0;
        int minute = 0;
        for (int i = 0; i <= 3; i++) {
            if (combine[i] == 1) {
                hour += getAnything(3 - i);
            }
        }
        for (int i = 4; i < 10; i++) {
            if (combine[i] == 1) {
                minute += getAnything(9 - i);
            }
        }
        String time = "";
        if (hour > 11 || minute >= 60) return "";
        if (minute < 10) {
            time += hour + ":0" + minute;
        } else {
            time += hour + ":" + minute;
        }
        return time;
    }

    public int getAnything(int level) {
        int h = 1;
        for (int i = 0; i < level; i++) {
            h = h * 2;
        }
        return h;
    }
}
