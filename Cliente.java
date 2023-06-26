public class Cliente
{
    private String identificacion;
    private String nombre;
    private String sucursal;
    private double compra1;
    private double compra2;
    private double compra3;
    
    public String getIdentificacion(){
        return identificacion;
    }
    public void setIdentificacion(String identificacion){
        if(identificacion != null)this.identificacion = identificacion;
        else this.identificacion = "";
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public String getSucursal(){
        return sucursal;
    }
    public void setSucursal(String curso){
        if(sucursal != null) this.sucursal = sucursal;
        else this.sucursal = "";
    }
    
    public double getCompra1(){
        return compra1;
    }
    public void setCompra1(double compra1){
        if(compra1 >= 0) this.compra1 = compra1;
        else this.compra1 = 0;
    }
    
    public double getCompra2(){
        return compra2;
    }
    public void setCompra2(double compra2){
        if(compra2 >= 0) this.compra2 = compra2;
        else this.compra2 = 0;
    }
    
    public double getCompra3(){
        return compra3;
    }
    public void setCompra3(double compra3){
        if(compra3 >= 0) this.compra3 = compra3;
        else this.compra3 = 0;
    }
    
    Cliente(String identificacion, String nombre, String curso, double compra1, double compra2, double compra3){
        setIdentificacion(identificacion);    
        setNombre(nombre);
        setSucursal(sucursal);
        setCompra1(compra1);
        setCompra2(compra2);
        setCompra3(compra3);
    }
    
    double calcularPromedio(){
        return (this.compra1 + this.compra2 + this.compra3) / 3;
    }
}
