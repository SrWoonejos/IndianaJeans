package cl.dmiranda;
import java.util.ArrayList;
import java.util.List;

public class ProductoServicio extends Producto{
	
	private Producto prod;


public Producto getProd() {
	return prod;
}

public void setProd(Producto prod) {
	this.prod = prod;
}
	
public List<Producto> getListarProducto() {
		return getListarProducto();
	}


public void setListarProducto(List<Producto> listarProducto) {
	}
			

public void listarProductos()  {
	
	List<Producto> lista= new ArrayList<Producto> ();
	lista.add(new Producto ("Jeans", "$5.990-", " Bodega ", "COD00456Abl ", "T.12 ", "Pillin ", "Verde"));
	
	} 

public void agregarProducto(Producto producto) {
    
}

public void guardarLista ()  {
	setProd(new Producto ("Jeans", "$5.990-", " Bodega ", "COD00456Abl ", "T.10 ", "Pillin ", "Verde"));
	
}
}

