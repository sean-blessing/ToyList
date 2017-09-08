package toylist.db;

public class ToyFactory {

	public static ToyDAO getToyDAO() {
		ToyDAO dao = new ToyArray();
		return dao;
	}
}
