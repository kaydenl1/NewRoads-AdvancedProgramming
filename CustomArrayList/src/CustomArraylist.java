
public class CustomArraylist {
	
	private int array[] = new int[3];
	private int size = 0;
		
	public CustomArraylist() {
		
	}
	
	public void add(int x)
	{
		if(size > array.length -1)
		{
			doubleSize();
			array[size] = x;
			size++;
		}
		else
		{
			array[size] = x;
			size++;
		}
		//if there is room to add this element, add it
		//else, double the size of the array, and then add the element
		
	}
	public void addLast(int x)
	{
		if(size > array.length -1)
		{
			doubleSize();
			array[size] = x;
			size++;
		}
		else
		{
			array[size] = x;
			size++;
		}
		//if there is room to add this element, add it
		//else, double the size of the array, and then add the element
		
	}
	public void subtract(int x)
	{
		if(size < array.length -1)
		{
			doubleSize();
			array[size] = x;
			size--;
		}
		else
		{
			array[size] = x;
			size--;
		}
		//if there is room to add this element, add it
		//else, double the size of the array, and then add the element
	}
	
	public void addAt(int x, int pos)
	{
		if(size > array.length - 1) {
			doubleSize();
			for (int i = array.length; i < pos; i--) {
				array[i+1] = array[i];
			}
			array[pos] = x;
			size++;
		}
		else
		{
			for (int i = array.length; i < pos; i--) {
				array[i+1] = array[i];
			}
			array[pos] = x;
			size++;
		}

		//if there is room to add this element, add it
		//else, double the size of the array, and then add the element
		
	}
	
	public void addFirst(int x)
	{
		addAt(x, 0);

		//if there is room to add this element, add it
		//else, double the size of the array, and then add the element
		
	}
		
	private void doubleSize()
	{
		int tmp[] = new int[array.length];
		//copy original array into tmp
		System.arraycopy(array, 0, tmp, 0, tmp.length);
		//officially double the size of array
		array = new int[array.length*2];
		//copy tmp back into the new array that is doubled
		System.arraycopy(tmp, 0, array, 0, tmp.length);
		
	}
	public int get(int index)
	{
		return this.array[index];
	}
	
	public void remove(int x) {
		
		
		
	}
	
}
