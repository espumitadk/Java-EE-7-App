package beans;

import javax.ejb.Local;

@Local
public interface LogBeanInterface {
    void log(String name) throws Exception;


}
