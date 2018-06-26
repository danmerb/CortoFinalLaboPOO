
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author Jeniffer Merino<<https://github.com/danmerb>>
 * @param <Generic>
 */
public interface metodos <Generic>{
    public boolean create(Generic g);
    public boolean delete(Object key);
    public boolean update(Generic c);
    
    public Generic read(Object key);
    public ArrayList<Generic> readAll();
}
