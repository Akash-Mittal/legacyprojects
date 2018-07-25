package pkg11.scancomp;

import org.springframework.stereotype.Component;

@Component(value="name1")
public class Name {
	private String fname, lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return fname + "\t" + lname;
	}
}
