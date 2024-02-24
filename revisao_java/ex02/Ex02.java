public class Ex02 {

    public static void main(String[] args){
        int p1 = Integer.parseInt(args[1]);
        int p2 = Integer.parseInt(args[2]);
        int a = Integer.parseInt(args[3]);

        long CF = Math.round(((p1*2 + p2*3)/(2+3))*0.9 + (a*0.1));

        if(CF >= 6){
            System.out.println("APROVADO");
        } else {
            System.out.println("Reprovado");
        }

    }
}
