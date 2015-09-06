package lambda;

public class UseRunnable
{

	public static void main(String[] args) throws Exception
	{
		Runnable r1 = () -> {
			try
			{
				Thread.sleep(200);
			} catch (Exception e)
			{

				e.printStackTrace();
			}
			System.out.println("thread 1");
		};
		Runnable r2 = () -> {
			System.out.println("thread 2");
		};
		new Thread(r1).start();
		new Thread(r2).start();

	}
}
