class Hobbits {
    String name;

    public static void main (String[] args){

        Hobbits[] h = new Hobbits[3];
        int z = -1;

        while (z < 2) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "Bilbo";
            if (z == 1){
                h[z].name = "Frodo";
            }
            if (z == 2){
                h[z].name = "Sem";
            }
            System.out.print(h[z].name + " - ");
            System.out.println("The name of a good hobbit");
        }
    }
}
