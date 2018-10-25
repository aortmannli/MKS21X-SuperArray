public class SuperArray{
	  private int size=0;
	  private String[] data;


	  public SuperArray(){
	    data = new String[10];
	  }


	  public void clear(){
	    size=0;
	  }


	  public int size(){
	    return size;
	  }


	  public boolean isEmpty(){
	    return size ==0;
	  }


	  public boolean add(String str){
			if (data.length <= size) resize();
	    data[size()] = str;
	    size++;
			return true;
	  }


	  public String toString(){
	    String out = "{";
	    for(int i =0; i < size(); i++){
	      out += data[i];
	      if (i != size()-1) out +=  ",";
	    }
	    return out + "}";
	  }


	  public String get(int index){
	    if (index < 0 || index >= size()) return null;
	    return ""+ data[index];
	  }


	  public String set(int index, String str){
	    if (index < 0 || index >= size()) return null;
	    data[index] = str;
			return "Yay! \n index: " + index + " \n value: " + str;
	  }

		private void resize() {
			String[] newData = new String[(size + 1) * 2];
			for (int i = 0; i < this.size(); i++){
				newData[i] = data[i];
			}
			this.data = newData;
    }


	}
