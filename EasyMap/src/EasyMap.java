import java.util.Map;
import java.util.Optional;

public interface EasyMap<K,V> extends Map<K,V> {
	public void setPair(K key, V value);
	Optional<V> getValue(K key);
	public EasyMap<K,V> createEasyMap();
}
