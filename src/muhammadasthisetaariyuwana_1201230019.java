import java.util.Scanner;

public class muhammadasthisetaariyuwana_1201230019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputAngka;
        String inputCommand;

        do{
            System.out.print("Masukkan angka : ");
            inputAngka = input.nextInt();
            if(inputAngka % 2 == 0){
                System.out.println(inputAngka + " adalah Genap");
            }else{
                System.out.println(inputAngka + " adalah Ganjil");
            }

            System.out.print("Lagi (Y / N)? : ");
            inputCommand = input.next();
            System.out.println();
        }while (
                inputCommand.equalsIgnoreCase("y")
        );


//        while(true){
//
//            try{
//                System.out.print("Masukkan angka : ");
//                inputAngka = input.nextInt();
//
//                if(inputAngka % 2 == 0){
//                    System.out.println(inputAngka + " adalah Genap");
//                }else{
//                    System.out.println(inputAngka + " adalah Ganjil");
//                }
//            }catch ( Exception e){
//                break;
//
//            }
//
//        }
    }
}