package api.aha.oretama.jp.configuration.header;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.header.Header;
import org.springframework.security.web.header.writers.StaticHeadersWriter;

public class CacheControlHeadersWriter extends StaticHeadersWriter {

	/**
	 * Creates a new instance
	 */
	public CacheControlHeadersWriter() {
		super(createHeaders());
	}

	private static List<Header> createHeaders() {

		List<Header> headers = new ArrayList<Header>();
		headers.add(new Header("Cache-Control", "max-age=86400"));
		headers.add(new Header("Pragma", "cache"));
		return headers;
	}
}
