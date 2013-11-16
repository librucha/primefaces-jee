package cz.librucha.show.primefaces;

import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.Service;

import javax.enterprise.inject.Produces;
import java.util.Set;

/**
 * Created by librucha on 11/16/13.
 */
public class GuavaServicesProducer {

	@Produces
	public Set<Service> dummyServices() {
		return ImmutableSet.of();
	}
}
