package somepackage;

import java.util.Random;

import javax.faces.bean.*;


@ManagedBean
public class Navigator {

	public String toRandomPage() {
		Random r = new Random();
		int result = r.nextInt((3 - 1) + 1) + 1;
		
		System.out.println(result);
		
		if(result == 1) {
			return ("page1");
		} else if(result == 2) {
			return ("page2");
		} else {
			return ("page3");
		}
	}

	public String toStartPage() {
		return ("starting-page.xhtml");
	}
}
