import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,d,e;
        System.out.print("Enter your math note:");
        int mat= input.nextInt();
        int mat1 = (mat>=0 && mat<100) ? mat : 0;
        if(mat>=0 && mat<100){
             a=1;
        }else {a=0;}

        System.out.print("Enter your physic note:");
        int phy= input.nextInt();
        int phy1 = (phy>=0 && phy<100) ? phy : 0;
        if(phy>=0 && mat<100){
            b=1;
        }else {b=0;}

        System.out.print("Enter your turkish note:");
        int turk= input.nextInt();
        int turk1 = (turk>=0 && turk<100) ? turk : 0;
        if(turk>=0 && turk<100){
            c=1;
        }else {c=0;}

        System.out.print("Enter your music note:");
        int msc= input.nextInt();
        int msc1 = (msc>=0 && msc<100) ? msc : 0;
        if(msc>=0 && msc<100){
            d=1;
        }else {d=0;}

        System.out.print("Enter your chemistry note:");
        int chem= input.nextInt();
        int chem1 = (chem>=0 && chem<100) ? chem : 0;
        if(chem>=0 && chem<100){
            e=1;
        }else {e=0;}

        double sum=(mat1+phy1+chem1+turk1+msc1);
        double summ=(a+b+c+d+e);
        double average=sum/summ;
        System.out.println("Your average is:"+average);





    }
}
