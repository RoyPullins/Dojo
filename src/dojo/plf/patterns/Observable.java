package dojo.plf.patterns;


/**
 * @author WRPullins
 * @version 1.0
 */
public interface Observable {
    
    /**
     * Registers an Observer by adding it to the Observable objects list of
     * Observers
     * 
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * Remove a Observer.
     * 
     * @param o
     */
    public void removeObserver(Observer o);
    
    /**
     * Notifys all the Observers of the Observable that its state has changed.
     */
    public void notifyObservers();
}
