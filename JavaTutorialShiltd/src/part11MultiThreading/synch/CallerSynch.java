/**
 * 
 */
package part11MultiThreading.synch;

/**
 * Здесь уже синхронизированный метод call
 * 
 * @author Shiltd
 *
 */
class CallerSynch implements Runnable {

	String msg;
	Callme target;
	Thread t;

	public CallerSynch(Callme targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		synchronized (target) {

			target.call(msg);
		}
	}
}
