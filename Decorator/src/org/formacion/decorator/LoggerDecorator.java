package org.formacion.decorator;

import java.util.List;

public class LoggerDecorator implements BaseDatos {

	BaseDatos db;
	Logger logger;

	public LoggerDecorator(BaseDatos db, Logger logger) {
		this.db = db;
		this.logger = logger;
	}

	@Override
	public void inserta(String registro) {
		logger.add("inserta " + registro);
		db.inserta(registro);
	}

	@Override
	public List<String> registros() {
		logger.add("lectura");
		return db.registros();
	}

}
