package deliveryservicesubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import deliveryservicepublisher.DeliveryServicePublish;

public class DeliveryServiceActivator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext context) throws Exception {

		System.out.println("");
		serviceReference = context.getServiceReference(DeliveryServicePublish.class.getName());
		DeliveryServicePublish servicePublish = (DeliveryServicePublish) context.getService(serviceReference);
		servicePublish.getCustomerDeliveryDetails();
		
	}

	public void stop(BundleContext context) throws Exception {

		System.out.println("end");
		context.ungetService(serviceReference);
		
	}

}
