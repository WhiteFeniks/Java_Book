class TestArrays {

    public static void main(String[] args) {

    String[] islands = new String[4];
    int[] index = new int[4];

    int y = 0;
    int ref;

    islands[0] = "Bermudi";
    islands[1] = "Fidji";
    islands[2] = "Azorskie ostrova";
    islands[3] = "Komsumel";

    index[0] = 1;
    index[1] = 3;
    index[2] = 0;
    index[3] = 2;

    while (y < 4){
        ref = index[y];
        y = y + 1;
        System.out.println(islands[ref]);
    }
    }
}
