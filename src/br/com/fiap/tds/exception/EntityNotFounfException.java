package br.com.fiap.tds.exception;

public class EntityNotFounfException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 358757167083314157L;
	
	public EntityNotFounfException() {
		super("Entidade n�o encontrada");
	}
	
	public EntityNotFounfException(String msg) {
		super(msg);
	}

}
