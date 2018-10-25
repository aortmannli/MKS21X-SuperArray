c class SuperArray{
	  private int size=0;
	  private String[] data;


	  public SuperArray(){
	    data = new String[];
	  }


	  public void clear(){
	    size=0;
	  }


	  public int size(){
	    return size;
	  }


	  public boolean isEmpty()}{
	    return size ==0;
	  }


	  public boolean add(String str){
	    data[size()] = str;
	    size++;
	  }


	  public String toString(){
	    String out = "{";
	    for(int i =0; i < size()-1; i+=){
	      out += data[i]
	      if (i != size()-1) out +=  ",";
	    }
	    return out;
	  }


	  public String get(int index){
	    if (index < 0 || index >= size()) return null;
	    return data[index];
	  }


	  public String set(int index, String str){
	    if (index < 0 || index >= size()) return null;
	    data[index] = str;
	  }


	  private void resize() {
	    
	  }


	}

