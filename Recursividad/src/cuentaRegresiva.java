
public class cuentaRegresiva {

    int cuentaRegresiva(int n) {
        return (n==0)? 1:n * cuentaRegresiva(n-1);
    }

}
