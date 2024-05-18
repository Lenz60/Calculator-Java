public class Calculate {
    public static int  Calculating(String choice, int a, int b){
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

    public static int Add(int a, int b){
        return a+b;
    }
    public static int Substract(int a, int b){
        return a-b;
    }
    public static int Multiply(int a, int b){
        return a*b;
    }
    public static int Divide(int a, int b){
        return a/b;
    }
}
