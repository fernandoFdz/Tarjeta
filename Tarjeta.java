public class Tarjeta{
    private float saldo();
    public tarjeta{
        saldo=0;
    }
    
    public void depositar(float dinero){
        saldo=saldo+dinero;
    }
    
    public float retirar(float dinero){
        if(saldo>=dinero){
            saldo=saldo-dinero;
        }return dinero;
        else 
        return 0;
    }
    
    public void consulta(float dinero){
        
    }
}