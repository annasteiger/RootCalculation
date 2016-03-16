package mvc.main;

import mvc.controller.RootController;

public class Main {
	static RootController controller;

	public static void main(String[] args) {
		controller = new RootController();
		controller.showView();
	}

}
