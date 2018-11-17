package SearchAlgorithm.TimChuoiTangDanCoDoDaiLonNhat;

import java.util.ArrayList;

public class TimChuoiTangDanCoDoDaiLonNhat {
    public static String timChuoiTangDanCoDoDaiLonNhat(String s){
        char[] arr = s.toCharArray();

        ArrayList<Character> temp = new ArrayList<>();
        temp.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i - 1] < arr[i]) temp.add(arr[i]);
        }

        return new String(temp.toString());
    }
}
