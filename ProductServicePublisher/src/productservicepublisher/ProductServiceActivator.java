package productservicepublisher;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class ProductServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Product Section");
		ProductServicePublish publisherService = new ProductServicePublishImpl();
		publishServiceRegistration = context.registerService(
				ProductServicePublish.class.getName(), publisherService, null);
	}

	public void stop(BundleContext context) throws Exception {

		System.out.println("Product functionality stop");
		publishServiceRegistration.unregister();
		
	}

}
