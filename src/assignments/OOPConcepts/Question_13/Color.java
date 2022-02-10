package assignments.OOPConcepts.Question_13;

import java.util.Arrays;

public class Color {
    //rgb array with 3 ints is used to hold r,g,b values
    private int[] rgb = new int[3];

    public final static int[] WHITE     = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY      = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
    public final static int[] BLACK     = new int[]{0, 0, 0};
    public final static int[] RED       = new int[]{255, 0, 0};
    public final static int[] PINK      = new int[]{255, 175, 175};
    public final static int[] ORANGE    = new int[]{255, 200, 0};
    public final static int[] YELLOW    = new int[]{255, 255, 0};
    public final static int[] GREEN     = new int[]{0, 255, 0};
    public final static int[] MAGENTA   = new int[]{255, 0, 255};
    public final static int[] CYAN      = new int[]{0, 255, 255};
    public final static int[] BLUE      = new int[]{0, 0, 255};


    public Color(int r, int g, int b){
        rgb[0] = r;
        rgb[1] = g;
        rgb[2] = b;
    }

    public Color() {
        this(255,255,255);
    }

    public String toString() {

        int[][] sets = {WHITE,LIGHT_GRAY,GRAY,DARK_GRAY,BLACK,RED,PINK,ORANGE,YELLOW,GREEN,MAGENTA,CYAN,BLUE};
        String[] colors = {"white","light gray","gray","dark gray","black","red","pink","orange","yellow","green",
                            "magenta","cyan","blue"};
        int i=0;
        for (int[] set : sets) {
            if(Arrays.equals(set,rgb)){
                return colors[i];
            }
            i++;
        }
        return "n/a"; //change this to return colors
    }
}
