
public class Resource {
	private int totalResource;

	public Resource( int resource )
	{
		this.totalResource = resource;
	}

	//共有リソースへのアクセスについてはsynchronizedを使用する。
	public synchronized void getResource()
	{
		int tmpResource = totalResource;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		this.totalResource = tmpResource-1;
	}

	public void printTotalResource()
	{
		System.out.println("\n■残りリソース■ "+this.totalResource+"個\n");
	}
}
