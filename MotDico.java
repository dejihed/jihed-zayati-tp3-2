package tp_3;

public class MotDico {
	
	public static int count=0;
	private int num;
	private String mot;
	private String def;
	public MotDico(String mot, String definition) {
        count++;
        num = count;
        this.mot = mot;
        def = definition;
    }
	public String getMot() {
		return mot;
	}
	public String getdef() {
		return def;
	}
	public void setDef(String ch) {
		def=ch;
	}
	public void setMot(String ch) {
		mot=ch;
	}
	public boolean synonyme(MotDico m) {
		if((this.mot).equals(m.mot))
			return true;
		else
			return false;
	}
	public String toString() {
        return "mot " + num + ": " + mot + " : " + def;
    }
}

