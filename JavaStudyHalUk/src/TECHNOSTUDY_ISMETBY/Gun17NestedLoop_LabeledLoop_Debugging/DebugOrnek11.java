package TECHNOSTUDY_ISMETBY.Gun17NestedLoop_LabeledLoop_Debugging;

public class DebugOrnek11 {
    public static void main(String[] args) {

        for (int i = 0; i < 40; i++) {
            if (i / 15 == 1) {
                continue;
            }
            System.out.println(i);
        }

    }
}
