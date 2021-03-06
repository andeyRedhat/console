package org.jboss.as.console.client.core.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import org.jboss.as.console.client.standalone.runtime.VMMetricsPresenter;
import org.jboss.as.console.client.standalone.runtime.VMMetricsView;
import org.jboss.as.console.spi.GinExtensionBinding;

/**
 * @author Heiko Braun
 * @date 3/23/12
 */
@GinExtensionBinding
public class ExampleExtensionBinding extends AbstractPresenterModule {
    @Override
    protected void configure() {

        bindPresenter(VMMetricsPresenter.class,
                VMMetricsPresenter.MyView.class,
                VMMetricsView.class,
                VMMetricsPresenter.MyProxy.class);

    }
}
