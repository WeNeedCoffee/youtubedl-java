package com.sapher.youtubedl;

/**
 * YoutubeDL Exception
 */
public class YoutubeDLException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 8479394201905984337L;
	/**
	 * Exception message
	 */
	private String message;

	/**
	 * Construct YoutubeDLException from another exception
	 *
	 * @param e Any exception
	 */
	public YoutubeDLException(Exception e) {
		message = e.getMessage();
	}

	/**
	 * Construct YoutubeDLException with a message
	 *
	 * @param message
	 */
	public YoutubeDLException(String message) {
		this.message = message;
	}

	/**
	 * Get exception message
	 *
	 * @return exception message
	 */
	@Override
	public String getMessage() {
		return message;
	}
}
