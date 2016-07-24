package br.com.bdj.controller;

import javax.swing.JFrame;

import br.com.bdj.model.Banco;
import br.com.bdj.view.MenuFrame;

public class Main {
	public static Banco banco = new Banco();

	public static void main(String[] args) {


		MenuFrame menu = new MenuFrame();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
