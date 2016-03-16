package mvc.model;

public class RootModel {
	
	long _value;
	
	public RootModel(){
		reset();
		
	}

	public void reset() {
		this._value = 0;
		
	}
	
	public void calculateRoot(long number){
		this._value = (number * number);
	}
	
	public long getRoot(){
		return this._value;
	}

}
