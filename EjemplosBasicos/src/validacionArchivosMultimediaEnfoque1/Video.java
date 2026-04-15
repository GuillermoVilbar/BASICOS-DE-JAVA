package validacionArchivosMultimediaEnfoque1;

public abstract class Video implements Validable {

private int length;

public Video(int length) {
	super();
	this.length = length;
}

public int getLength() {
	return length;
}

@Override
public String toString() {
	return "Video [length=" + length + "]";
}



}
