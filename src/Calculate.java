public class Calculate {
    public static double  Calculating(String choice, double a, double b){
        if(choice == "Add"){
            return Add(a,b);
        }else if(choice == "Substract"){
            return Substract(a,b);
        }else if(choice == "Multiply"){
            return Multiply(a,b);
        }else if (choice == "Divide"){
            return Divide(a,b);
        }
//        return false;
        return 0;
    }

    public static  double Add(double a, double b){
        return a+b;
    }
    public static double Substract(double a, double b){
        return a-b;
    }
    public static double Multiply(double a, double b){
        return a*b;
    }
    public static double Divide(double a, double b){
        return a/b;
    }
}
