public class ThreadSampleMain {

	public static void main(String[] args) {
		System.out.println("Threadのサンプル");
		Resource resource = new Resource(15);

		Thread sample1 = new Thread(new ThreadSample(1,resource) );
		Thread sample2 = new Thread(new ThreadSample(2,resource) );
		Thread sample3 = new Thread(new ThreadSample(3,resource) );

		resource.printTotalResource();

		//非同期処理実行
		sample1.start();
		sample2.start();
		sample3.start();

		try {
			//非同期処理の終了を待つ
			sample1.join();
			sample2.join();
			sample3.join();
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		resource.printTotalResource();

	}

}
