package teste;

import modelo.ContaCorrente;
import modelo.GerenciadorDeImpostoDeRenda;
import modelo.SeguroDeVida;

	public class TesteTributavel {
		public static void main(String[ ] args) {
			ContaCorrente cc = new ContaCorrente (100);
			SeguroDeVida sgv = new SeguroDeVida( ) ;
			GerenciadorDeImpostoDeRenda giprenda = new GerenciadorDeImpostoDeRenda( );

			giprenda.adicionar(cc);
			giprenda.adicionar(sgv);
			System.out.println (giprenda.getTotal( ));
		}

}