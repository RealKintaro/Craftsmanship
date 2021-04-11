package dao;

import java.util.List;

public interface Dao<T> {
	public List<T> getAll();
	public T get(int id);
	public boolean save(T t);
	public void update(T t, String[] params);
	public void delete(T t);
}
