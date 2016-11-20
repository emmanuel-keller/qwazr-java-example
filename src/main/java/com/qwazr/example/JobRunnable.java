package com.qwazr.example;

import java.util.Date;

/**
 * Created by ekeller on 20/11/2016.
 */
public class JobRunnable implements Runnable {

	public static volatile Date lastJobExecution;

	@Override
	public void run() {
		lastJobExecution = new Date();
	}
}
