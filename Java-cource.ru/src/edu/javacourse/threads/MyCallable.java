package edu.javacourse.threads;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Long> {

	@Override
	public Long call() throws Exception {
		Processor p = new Processor();
		return p.process();
	}

}
