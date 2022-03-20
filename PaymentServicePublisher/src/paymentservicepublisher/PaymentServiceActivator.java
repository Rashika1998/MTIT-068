package paymentservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

public class PaymentServiceActivator implements BundleActivator {
	
	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Payment Section");
		PaymentServicePublish publisherService = new PaymentServicePublishImpl();
		publishServiceRegistration = context.registerService(
				PaymentServicePublish.class.getName(), publisherService, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Payment functionality stop");
		publishServiceRegistration.unregister();
		
	}

}
