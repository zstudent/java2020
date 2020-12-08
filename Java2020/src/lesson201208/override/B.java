package lesson201208.override;

class B extends A {
	
	@Override
	protected void m() {}
	
//	@Override
//	public void chain(String s) {}  ERROR:  wrong signature
	
	@Override
	public B chain() { return this;}
	// B type is covariant to A
}