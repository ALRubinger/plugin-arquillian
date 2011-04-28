package org.jboss.seam.forge.arquillian.container;

import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.forge.project.Project;
import org.jboss.forge.project.dependencies.DependencyBuilder;
import org.jboss.forge.project.dependencies.ScopeType;

public class Jboss7Remote implements Container
{
   @Inject @Named("arquillianVersion")
   String arquillianVersion;

   @Inject 
   Project project;

   @Inject
   ProfileBuilder builder;

   @Override public void installDependencies() {
        DependencyBuilder dep1 = DependencyBuilder.create()
                .setGroupId("org.jboss.arquillian.container")
                .setArtifactId("arquillian-jbossas-remote-7")
                //.setVersion(arquillianVersion)
                .setVersion("1.0.0-SNAPSHOT")
                .setScopeType(ScopeType.TEST);

        DependencyBuilder dep2 = DependencyBuilder.create()
                .setGroupId("org.jboss.as")
                .setArtifactId("jboss-as-controller-client")
                .setVersion("7.0.0.Beta3")
                .setScopeType(ScopeType.TEST);

        DependencyBuilder dep3 = DependencyBuilder.create()
                 .setGroupId("org.jboss.marshalling")
                 .setArtifactId("jboss-marshalling-river")
                 .setVersion("1.3.0.CR8")
                 .setScopeType(ScopeType.TEST);

        
        
        builder.addProfile("jbossas-remote-7", dep1, dep2, dep3);
    }
}
