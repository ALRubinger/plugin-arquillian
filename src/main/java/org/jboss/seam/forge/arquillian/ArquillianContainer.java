package org.jboss.seam.forge.arquillian;

import org.jboss.seam.forge.arquillian.container.Container;
import org.jboss.seam.forge.arquillian.container.GlassFish3Embedded;
import org.jboss.seam.forge.arquillian.container.GlassFish3Remote;
import org.jboss.seam.forge.arquillian.container.Jboss5Remote;
import org.jboss.seam.forge.arquillian.container.Jboss5_1Managed;
import org.jboss.seam.forge.arquillian.container.Jboss5_1Remote;
import org.jboss.seam.forge.arquillian.container.Jboss6Embedded;
import org.jboss.seam.forge.arquillian.container.Jboss6Managed;
import org.jboss.seam.forge.arquillian.container.Jboss6Remote;
import org.jboss.seam.forge.arquillian.container.Jboss7Managed;

public enum ArquillianContainer {
    JBOSS_AS_5_REMOTE(Jboss5Remote.class),
    JBOSS_AS_5__1_REMOTE(Jboss5_1Remote.class),
    JBOSS_AS_5__1_MANAGED(Jboss5_1Managed.class),
    JBOSS_AS_6_REMOTE(Jboss6Remote.class),
    JBOSS_AS_6_MANAGED(Jboss6Managed.class),
    JBOSS_AS_6_EMBEDDED(Jboss6Embedded.class),
    JBOSS_AS_7_MANAGED(Jboss7Managed.class),
    GLASSFISH_3_1_EMBEDDED(GlassFish3Embedded.class),
    GLASSFISH_3_1_REMOTE(GlassFish3Remote.class);

    public Class<? extends Container> getContainer() {
        return container;
    }

    private Class<? extends Container> container;

    private ArquillianContainer(Class<? extends Container> container) {
        this.container = container;
    }
}
