package mx.redhat.fuse.demo.secure.soap;

import javax.jws.WebService;

/**
 * The HelloWorld interface defines a single method.
 * <p/>
 * We add the @WebService annotation to mark this interface as the definition for our web service.
 */
@WebService
public interface HelloWorld {

    String sayHi(String name);

}