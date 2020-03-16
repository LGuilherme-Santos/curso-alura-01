
public class TestaContaCliente {
	
	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		minhaConta.titular = new Cliente();
		
		minhaConta.titular.nome = "Guilherme";
		
		System.out.println("Titular da conta é " + minhaConta.titular.nome);
		
		minhaConta.deposita(500);
		System.out.println("Saldo da conta: " + minhaConta.getSaldo());
		
	}

}
