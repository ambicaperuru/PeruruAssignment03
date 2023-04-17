package generics;
class GenericExample<T> {
	T obj;
	GenericExample(T obj) {
		this.obj = obj;
	}
	public T getObject() {
		return this.obj;
	}
}
