package deliveryservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class DeliveryServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Delivery Section");
		DeliveryServicePublish publisherService = new DeliveryServicePublishImpl();
		publishServiceRegistration = context.registerService(
				DeliveryServicePublish.class.getName(), publisherService, null);
	}

	public void stop(BundleContext context) throws Exception {

		System.out.println("Delivery functionality stop");
		publishServiceRegistration.unregister();
		
	}

}
