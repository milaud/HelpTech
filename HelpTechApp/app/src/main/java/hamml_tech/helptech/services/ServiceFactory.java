package hamml_tech.helptech.services;


/**
 * Service factory class. Responsible for creating services
 */
public class ServiceFactory {

    private ServiceFactory() {}

    private Service makeService(ServiceName name) {
        switch (name) {
            case DATA:
                return new DataService();
            case DATABASE:
                return new DataBaseService();
            case NETWORK:
                return new NetworkService();
        }
        return null;
    }

    /**
     * A singleton factory object
     */
    public static ServiceFactory mServiceFactory = new ServiceFactory();

}
