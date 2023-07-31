package com.bolsadeideas.springboot.app.springbootid.models.domain;

public class ItemFactura {

    private Producto producto;
    private Integer cantidad;
   
   public ItemFactura() {
        producto = new Producto();
        cantidad = 0;
    }
   
   
    public ItemFactura(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


    public Integer calcularImporte(){
        return producto.getPrecio() * cantidad;
    }
    
    
}
