public class SuperArray{
	  private int size=0;
	  private String[] data;


	  public SuperArray(){
	    data = new String[10];
	  }

		public SuperArray(int startSize){
			if (startSize < 0 ){
      	throw new IllegalArgumentException("Array size cannot be " + startSize);
    	}
			data = new String[startSize];
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

		public String toStringDebug(){
    String out = "{";
    for (String i:  data){
      out += i + ", ";
    }
    return out.substring(0,out.length()-2) + "}";
  }

	  public String get(int index){
			if (index < 0 || index >= size()){
	      throw new IndexOutOfBoundsException("Index cannot be " + index);
	    }
	    return ""+ data[index];
	  }

	  public String set(int index, String str){
			if (index < 0 || index >= size()){
	      throw new IndexOutOfBoundsException("Index cannot be " + index);
	    }
	    data[index] = str;
			return "Yay! \n index: " + index + " \n value: " + str;
	  }

		private void resize() {
			String[] newData = new String[(size + 1) * 2];
			for (int i = 0; i < size(); i++){
				newData[i] = data[i];
			}
			this.data = newData;
    }

		public boolean contains(String target){
			for (int  i = 0; i < size(); i++){
      if (get(i).equals(target)){
        return true;
      }
    }
    return false;
		}

		public int indexOf(String target){
			if (this.contains(target)){
				for (int  i = 0; i < size(); i++){
					if (get(i).equals(target)){
		        return i;
		      }
				}
			}
			return -1;

		}

		public int lastIndexOf(String target){
			if (this.contains(target)){
				for (int  i = size()-1; i > -1; i--){
					if (get(i).equals(target)){
		        return i;
		      }
				}
			}
			return -1;
		}

		public void add(int index ,String str){


			if (0 <= index && index <= size){
				if (data.length == size()) resize();
		    for (int i = size(); i > 0; i--){
		      if (i > index) data[i] = data[i - 1];
		    }
		    data[index] = str;
		    size++;
	    }else{
				throw new IndexOutOfBoundsException("Index cannot be " + index);
			}
		 }


		public String remove(int index){
		if (data.length == size()) resize();
		if (index < 0 || index >= size()){
			throw new IndexOutOfBoundsException("Index cannot be " + index);
		}
    String str = data[index];
    for (int i = index; i < size()-1; i++){
      data[i] = data[i+1];
    }
    size--;
    return "Index:  "+index+"    Value removed:  "+str;
		}

		public boolean remove(String str){
			if (!this.contains(str)) return false;
			remove(this.indexOf(str));
			return true;
		}

	}
