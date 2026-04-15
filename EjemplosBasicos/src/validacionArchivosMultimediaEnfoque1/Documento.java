package validacionArchivosMultimediaEnfoque1;

public abstract class Documento implements Validable  {

	private  long size;

	public Documento(long size) {
		super();
		this.size = size;
	}

	public double getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Document despite:" + size;
	}

	


	

	
	}


