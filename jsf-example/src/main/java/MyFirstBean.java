
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "firstBean", eager = true)
public class MyFirstBean {

	public String getMessage() {
		return "The First One!";
	}
	
}
