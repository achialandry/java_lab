
public class Driver {

	public static void main(String[] args) {
		
		
		/*
		 * First Model
		 */
		Model firstModel = new Model("Shella", "Mendez", 65, 119);
//		first_model.printDetails();
		firstModel.displayModelDetails();
		
		/*
		 * Second Model
		 */
		Model secondModel = new Model("Dilan", "Azerina", 75, 100, false, true);
//		secondModel.printDetails();
		
		secondModel.displayModelDetails(false);
	}

}
