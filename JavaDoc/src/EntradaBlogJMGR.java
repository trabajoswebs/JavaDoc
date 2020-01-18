
/**
 * Clase para manejar las entradas de un blog.
 * @author Ana López
 * @version 2.3
 * @since 21/3/1999
 */
public class EntradaBlogJMGR{	
	
	/**
	 * caracter del separador
	 */
	public static char separador=':';
	/**
	 * número del identificador de la entrada
	 */
	private int id;
	/**
	 * cadena de salida de texto
	 */
	private String texto;
	/**
	 * nombre del autor
	 */
	private String autor;
	
	/**
	 * Constructor de 3 parámetros de la clase. recibe el número de entrada, el nombre del autor
	 * de la entrada y el texto que contiene la entrada. Si el número de entrada
	 * es negativo, lanza una excepción.
	 * @param id int
	 * @param autor String
	 * @param texto String
	 * @throws IllegalArgumentException
	 */
	public EntradaBlogJMGR(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
		
	/**
	 * Método que devuelve el identificador de la entrada
	 * @return devuelve el id de la entrada
	 * @since 2.3
	 */
	public int getId(){
		return this.id;
	}

	/**
	 * El método muestra texto completo de la entrada
	 * @return devuelve el texto del artículo
	 * @since 2.3
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * El metodo convierte el nombre del autor en mayuscula
	 * @return devuelve el nombre del autor en mayuscula
	 * @since 2.3
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	//
	/**
	 * Método devuelve el nombre del autor. 
	 * @deprecated usar getAutor
	 * @return devuelve nombre del autor
	 */
	public String devuelveAutor(){
		return this.autor;
	}

	/**
	 * Metodo principal se crea la entrada y se imprime el contenido y datos del articulo
	 * @param args
	 * @throws IllegalArgumentException si el identificador es negativo
	 */
	public static void main(String[] args) {
		EntradaBlogJMGR e1=new EntradaBlogJMGR (3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}