package com.sapher.youtubedl.utils;

import java.io.IOException;
import java.io.InputStream;

public class StreamGobbler extends Thread {

	private InputStream stream;
	private StringBuffer buffer;

	public StreamGobbler(StringBuffer buffer, InputStream stream) {
		this.stream = stream;
		this.buffer = buffer;
		start();
	}

	@Override
	public void run() {
		try {
			int nextChar;
			while ((nextChar = stream.read()) != -1) {
				buffer.append((char) nextChar);
			}
		} catch (IOException e) {

		}
	}
}