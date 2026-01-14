package poo;

public class Superheroe {

	
		private String nombre;
		private String superpoder;
		private boolean capa;
		
		public Superheroe(String nombre, String superpoder){
			this.nombre = nombre;
			this.superpoder = superpoder;
			this.capa=true;
			
		}
		
		
		public void describir () {
			System.out.print("Soy " + nombre + ", mi poder es " + superpoder);
			if(capa=true) {
				System.out.print(" y llevo capa");
			}else{
				System.out.print(" y no llevo capa");
				
			}
		}
		

	}


