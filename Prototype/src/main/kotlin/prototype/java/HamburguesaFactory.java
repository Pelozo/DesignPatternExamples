package prototype.java;

import prototype.java.Hamburguesa.Carne;
import prototype.java.Hamburguesa.Extra;
import prototype.java.Hamburguesa.Pan;
import prototype.java.Hamburguesa.Size;

import java.util.ArrayList;
import java.util.List;


public class HamburguesaFactory {

	private Carne carne;
	private Size size;
	private Pan pan;
	private List<Extra> extras = new ArrayList<>();

	public prototype.java.Hamburguesa crea() {
		return new prototype.java.Hamburguesa(carne, size, pan, extras.toArray(new Extra[extras.size()]));
	}

	public HamburguesaFactory setCarne(Carne carne) {
		this.carne = carne;
		return this;
	}

	public HamburguesaFactory setSize(Size size) {
		this.size = size;
		return this;
	}

	public HamburguesaFactory setPan(Pan pan) {
		this.pan = pan;
		return this;
	}

	public HamburguesaFactory addExtra(Extra extra) {
		this.extras.add(extra);
		return this;
	}

	public HamburguesaFactory removeExtra(Extra extra) {
		this.extras.remove(extra);
		return this;
	}

	public HamburguesaFactory from(Hamburguesa hamburguesa){
		this.carne = hamburguesa.getCarne();
		this.size = hamburguesa.getSize();
		this.pan = hamburguesa.getPan();
		this.extras = new ArrayList<Extra>(hamburguesa.getExtras());
		return this;
	}

	// -- hamburguesas de la carta
	public static Hamburguesa royal() {
		return new Hamburguesa(Carne.VACUNO, Size.GRANDE, Pan.NORMAL, Extra.CEBOLLA, Extra.QUESO);
	}

	public static Hamburguesa king() {
		return new Hamburguesa( Carne.VACUNO, Size.EXTRA_GRANDE, Pan.NORMAL, Extra.CEBOLLA, Extra.HUEVO);
	}


}

