
public abstract class CryomoduleType
{
	public String name;
	
	public abstract void importRawData();
	
	public abstract void conditionData();
	
	public abstract void exportTravelerData();
	
	public abstract void prepareChartData();
}
