public class PracTwo {
    public int result=1;
    public int faktorial(int n){
        for(int i=1; i<=n; i++){
            result=result*i;
        }
        System.out.println(result);
        return result;
    }
    public static void main (String [] args){
        PracTwo Task = new PracTwo();
        Task.faktorial(25);
    }
}
