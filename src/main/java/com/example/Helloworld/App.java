package com.example.Helloworld;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.example.Helloworld.configuration.HelloWorldConfiguration;
import com.example.Helloworld.health.TemplateHealthCheck;
import com.example.Helloworld.resources.HelloWorldResource;

/**
 * Hello world!
 *
 */
public class App extends Application<HelloWorldConfiguration>
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        new App().run(args);
    }
    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        // nothing to do yet
    }
	@Override
	public void run(HelloWorldConfiguration arg0, Environment arg1)
			throws Exception {
		final HelloWorldResource resource = new HelloWorldResource(
				arg0.getTemplate(),
				arg0.getDefaultName()
		);
		final TemplateHealthCheck healthCheck = new TemplateHealthCheck(arg0.getTemplate());
		arg1.healthChecks().register("template", healthCheck);
		arg1.jersey().register(resource);
		
	}
}
