public class ShoesDtails {
    
            String ShoesBrand = "NIKE";
    static  int ShoesSize = 42; 
    static  String ShoesColor = "Blue";



    public void Show_Shoes_Brand(){
        System.out.println("Shoes Brand: " + ShoesBrand);     
    }


    public static int Show_Shoes_Size(){
        return ShoesSize;                  
        
    }

    public static String Shoes_Color(){
        return  ShoesColor;
    }


    public static void main(String[]args){

        ShoesDtails shoes1 = new ShoesDtails(); 



        shoes1.Show_Shoes_Brand();

        System.out.println("Shoes Size: " + ShoesDtails.Show_Shoes_Size());

        System.out.println("Shoes Color: " + ShoesDtails.Shoes_Color());
        
    }
}
