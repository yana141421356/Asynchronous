
public class RunnableSampleMain {

	public static void main(String[] args) {
		System.out.println("Runnableのサンプル");

		Resource resource = new Resource(15);

		Thread sample1 = new Thread(new RunnableSample(1, resource) );
		Thread sample2 = new Thread(new RunnableSample(2, resource) );
		Thread sample3 = new Thread(new RunnableSample(3, resource) );

		resource.printTotalResource();

		sample1.start();
		sample2.start();
		sample3.start();

		try {
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
