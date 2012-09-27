package fi.kauppalehti.domain;

import static java.lang.String.format;
import java.util.concurrent.atomic.AtomicLong;

public class Account {

	private final Long id;	
	private final Long test;
	
	public Account() {
		this.id = idSequence.getAndIncrement();
		this.test = null;
	}
	
	public Long getId() {
		return id;
	}
	
	private static final AtomicLong idSequence = new AtomicLong();

	@Override
	public String toString() {
		return format("Account: id=%s", getId());
	}

}
