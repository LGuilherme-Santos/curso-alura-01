
public class TestaContaCliente {
	
	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		Cliente cliente = new Cliente();
		
		cliente.setNome("Guilherme");
		
		minhaConta.setTitular(cliente);
		
		System.out.println("Titular da conta � " + minhaConta.getTitular().getNome());
		
		minhaConta.deposita(500);
		System.out.println("Saldo da conta: " + minhaConta.getSaldo());
		
		minhaConta.getTitular().setProfissao("Programador");
		
		cliente.setNome("Gui");
		minhaConta.setTitular(cliente);
		System.out.println("Titular da conta agora � " + minhaConta.getTitular().getNome());
		
		System.out.println("Profiss�o: " + minhaConta.getTitular().getProfissao());
		
	}

}
