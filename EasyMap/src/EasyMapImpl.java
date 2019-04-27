import java.util.Optional;

public abstract class EasyMapImpl<K,V> implements EasyMap<K,V> {
	
	@Override
	public void setPair(K key, V value) {
		this.put(key,value);
	}
	
	@Override
	public Optional<V> getValue(K key){
		return this.getValue(key);
	}
	
}
