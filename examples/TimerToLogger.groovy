/**
 * a redo of this <a href:"http://saltnlight5.blogspot.com/2012/08/getting-started-with-apache-camel-using.html">blog</a>
 * using CamelGLite
 */
@Grab("com.github.camel-glite:camel-glite:0.4.1")
@Grab('org.slf4j:slf4j-simple:1.6.6')
@GrabResolver(name = 'camel-glite', root = 'http://jcenter.bintray.com/')
import camelscript.CamelGLite

new CamelGLite().with {
    consumeForever("timer://jdkTimer?period=1000") {
        send("log://camelLogger?level=INFO")
    }
}
