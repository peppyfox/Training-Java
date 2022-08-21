package excercise3lab4.src;
//subclass of class item
abstract class WrittenItem extends Item
{
	//private data for author
	private String author;
	void setAuthor(String str)
	{
		author = str;
	}
	public int getidNum()
	{
		return super.getidNum();
	}
	public String getTitle()
	{
		return super.getTitle();
	}
	public int getNumCopies()
	{
		return super.getCopies();
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
		return false;
		WrittenItem otherWrittenItem = (WrittenItem) obj;
		return super.equals(otherWrittenItem) && author == otherWrittenItem.author;
	}

	public WrittenItem()
	{
		
	}
	
}
