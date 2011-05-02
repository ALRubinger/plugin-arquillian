package org.jboss.seam.forge.arquillian.container;

import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.forge.project.Project;
import org.jboss.forge.project.dependencies.DependencyBuilder;
import org.jboss.forge.project.dependencies.ScopeType;
import org.jboss.forge.project.facets.DependencyFacet;

public class Jboss7Managed implements Container {
    @Inject @Named("arquillianVersion") String arquillianVersion;
    @Inject Project project;
    @Inject ProfileBuilder builder;


    @Override public void installDependencies() {
        DependencyBuilder dep1 = DependencyBuilder.create()
                .setGroupId("org.jboss.as")
                .setArtifactId("jboss-as-arquillian2-container-managed")
                //.setVersion(arquillianVersion)
                .setVersion("7.0.0.Beta4-jbw2011")
                .setScopeType(ScopeType.TEST);

        DependencyBuilder dep2 = DependencyBuilder.create()
                .setGroupId("org.jboss.as")
                .setArtifactId("jboss-as-controller-client")
                .setVersion("7.0.0.Beta4-jbw2011")
                .setScopeType(ScopeType.TEST);

        // Add dependencies
        final DependencyFacet facet = project.getFacet(DependencyFacet.class);
        facet.addDependency(dep1);
        facet.addDependency(dep2);
    }
}
