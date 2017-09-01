public class Tarjeta{
    private float saldo;
    
    /*
     * constructor de la tarjeta
     */
    public Tarjeta(){
        saldo = 0;
    }
    
    /*
     * metodo en el que se deposita dinero 
     */
    public void depositar(float dinero){
        if(saldo<0){
        saldo=saldo+dinero;
        }
    }
    
    /*
     * metodo para que se pueda retirar dinero 
     */
    public float retirar(float dinero){
        if(saldo>=dinero){
            saldo=saldo-dinero;
        return dinero;
       }else{
            return 0;
        }
    }
    
    /*
     * metodo para consultar el dinero que se tiene en la cuenta
     */
    public float consulta(float dinero){
        return dinero;
    }
}