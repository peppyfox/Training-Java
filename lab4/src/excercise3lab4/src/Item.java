package excercise3lab4.src;

abstract class Item 
{
	//private data for: identification number, title, and number of copies
		private int idNum;
		private String title;
		private int numCopies;
		public Item() //constructors
		{
			idNum =0;
			title = " ";
			numCopies = 0;
		}
		public Item(int idNum, String title, int numCopies)//constructors
		{
			this.idNum = idNum;
			this.title = title;
			this.numCopies = numCopies;
		}
		public int setidNum(int id)//setter
		{
			idNum = id;
		return id;
		}
		public String setTitle(String str)//setter and getter
		{
			title = str;
			return str;
		}
		public int setNumCopies(int n)//setter and getter
		{
			numCopies = n;
			return n;
		}
		public int getidNum()//getter
		{
			return idNum;
		}
		public String getTitle()//getter
		{
			return title;
		}
		public int getCopies()//getter
		{
			return numCopies;
		}
		public void checkIn()//checkin
		{
			numCopies = numCopies + 1;
		}
		public void checkOut()//checkout
		{
			numCopies = numCopies - 1;
		}
		public void addItem(int idNum, String str, int n)
		{
			setidNum(idNum);
			setTitle(str);
			setNumCopies(n);
		}
		public String toString()
		{
			return ("ID: " +idNum+ " Title: " +title+ " Number of Copies: " +numCopies);
		}
		public void print()
		{
			System.out.println("Title: " +title);
			System.out.println("ID: " +idNum);
			System.out.println("Number of copies: " +numCopies);
		}
		public boolean equals(Object obj)
		{
			if(obj == null)
					return false;
			Item otherItem = (Item) obj;
			if(idNum == otherItem.idNum && title == otherItem.title && numCopies== otherItem.numCopies)
				return true;
			else
				return false;
		}
		public void addItem()
		{
			numCopies++;
		}
}
