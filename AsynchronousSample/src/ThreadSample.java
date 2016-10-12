//Threadクラスを使用したサンプル
public class ThreadSample extends Thread {
	private int number = 0;
	private static int round = 5;
	private Resource resource = null;

	public ThreadSample( int number, Resource resource)
	{
		this.number = number;
		this.resource = resource;
	}

	//非同期処理
	public void run()
	{
		for( int i = 1; i <= round; i++ )
		{
			try {
				Thread.sleep( (long)( Math.random()*1000 ) );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			resource.getResource();
			System.out.println(this.number+"さん "+i+"個目取得");
		}
		System.out.println(this.number+"さん 取得完了");
	}

}
