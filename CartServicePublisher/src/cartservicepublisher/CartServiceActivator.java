package cartservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class CartServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Cart Section");
		CartServicePublish publisherService = new CartServicePublishImpl();
		publishServiceRegistration = context.registerService(
				CartServicePublish.class.getName(), publisherService, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Cart functionality stop");
		publishServiceRegistration.unregister();
		
	}

}
