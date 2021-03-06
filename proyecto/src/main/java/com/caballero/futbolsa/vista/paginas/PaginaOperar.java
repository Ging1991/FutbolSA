package com.caballero.futbolsa.vista.paginas;

import com.caballero.futbolsa.MyUI;
import com.caballero.futbolsa.persistencia.pojos.Jugador;
import com.caballero.futbolsa.vista.PaginaBase;
import com.caballero.futbolsa.vista.formularios.FormularioColocarOrden;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class PaginaOperar extends PaginaBase{
	private static final long serialVersionUID = 1L;
	public static String NOMBRE = "PaginaOperar";

	@Override
	public VerticalLayout setContenido() {
		MyUI ui = (MyUI) UI.getCurrent();
		Jugador jugador = (Jugador) ui.getSesion("jugador_activo");
		VerticalLayout contenido = new VerticalLayout();
		contenido.addComponent(new FormularioColocarOrden(jugador));
		return contenido;
	}

}