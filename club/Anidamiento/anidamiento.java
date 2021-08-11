import java.util.Scanner;

public class Anidamiento{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String edad = scanner.nextLine();

        //Forma 1 forma fea 

        if(edad != null){

            Integer edadInt = null;
            try {
                edadInt = Integer.parseInt(edad);
            } catch (Exception e) {
                //TODO: handle exception
            }
            if(edadInt == null){
                System.out.println("Edad invalida");
            }else{
                if(edadInt >= 18){
                    if(edadInt > 65){
                        System.out.println("Lo sentimos no puedes votar");
                    }else{
                        System.out.println("Puedes votar");
                    }
                }else{
                    System.out.println("Aun no puedes votar");
                }
            }
        }else{
            System.out.println("Edad faltante");
        }


         //Forma 2  forma congruente (todos positivos o todos negativos )  

         if(edad != null){

            Integer edadInt = null;
            try {
                edadInt = Integer.parseInt(edad);
            } catch (Exception e) {
                //TODO: handle exception
            }
            if(edadInt != null){
                if(edadInt >= 18){
                    if(edadInt <= 65){
                        System.out.println("Puedes votar");
                    }else{
                        System.out.println("Lo sentimos no puedes votar");
                    }
                }else{
                    System.out.println("Aun no puedes votar");
                }
            }else{
                System.out.println("Edad invalida");
            }
        }else{
            System.out.println("Edad faltante");
        }



        //Forma 3  cerrar con negativos   

        if(edad != null{
        System.out.println("Edad faltante");
        return;
        }

        Integer edadInt = null;
        try {
            edadInt = Integer.parseInt(edad);
        } catch (Exception e) {
            //TODO: handle exception
        }

        if(edadInt == null){
            System.out.println("Edad invalida");
            return;
        }

        if(edadInt < 18){
            System.out.println("Aun no puedes votar");
            return;
        }
            
        if(edadInt > 65){
            System.out.println("Lo sentimos ya no puedes votar"); 
            return;
        }

        System.out.println("Puedes votar");


        //forma 4 cerrar con negativos usando excepciones
        
        try {
            if(edad == null{
                throw new Exception("Edad faltante");
                }
        
                Integer edadInt = null;
                try {
                    edadInt = Integer.parseInt(edad);
                } catch (Exception e) {
                    //TODO: handle exception
                }
        
                if(edadInt == null){
                    throw new Exception("Edad invalida");
                }
        
                if(edadInt < 18){
                    throw new Exception("Aun no puedes votar");
                }
                    
                if(edadInt > 65){
                    throw new Exception("Lo sentimos ya no puedes votar"); 
                }
        
                System.out.println("Puedes votar");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}