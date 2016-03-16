package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.RootModel;
import mvc.view.RootView;

public class RootController {
	private RootView _view;
	private RootModel _model;
	
	public RootController(){
		this._model = new RootModel();
		this._view = new RootView();
		
		addListener();
	}
	
	public void showView() {
		this._view.setVisible(true);
		
	}

	private void addListener() {
		this._view.setRootCalculationListener(new RootCalculationListener());
		this._view.setResetFormListener(new ResetFormListener());
		
	}
	
	class RootCalculationListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            long wert = Long.valueOf(_view.getInput());
            _model.calculateRoot(wert);
            _view.setResult(String.valueOf(_model.getRoot()));
        }
    }

	 class ResetFormListener implements ActionListener{
	        public void actionPerformed(ActionEvent e) {
	            _view.resetView();
	            _model.reset();
	        }
	    }

}
