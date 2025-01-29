package view;

import java.util.Scanner;

import model.Tarefa;

public class Tela {
	public void exibirMenu() {
	System.out.println("----MENU PRINCIPAL-----");
	System.out.println("1 - Inclusão de Tarefa");
	System.out.println("2 - Consulta de Tarefa");
	System.out.println("3 - Alteração de Tarefa");
	System.out.println("4 - Exclusão de Tarefa");
	System.out.println("0 - F I M ");
	System.out.println("Digite a opção desejada:");
	}
	
	public Tarefa exibirInclusao() {
		Scanner teclado = new Scanner(System.in);
		Tarefa tarefa = new Tarefa();
		
		System.out.println("I N C L U S Ã O");
		System.out.println("Descrição : ");
		tarefa.setDescricao(teclado.nextLine());
		System.out.println("Prazo : ");
		tarefa.setPrazo(teclado.nextInt());
		System.out.println("Finalizada (S/N)? ");
		String status = teclado.next();
		
		if(status.equals("S")) {
			tarefa.setFinalizada(true);
		} else {
			tarefa.setFinalizada(false);
		}
		
		return tarefa;
		
	}
	
	public void exibirTarefa(Tarefa tarefa) {
		System.out.println("C O N S U L T A");
		System.out.println(tarefa);
		System.out.println("----------------------------------------");		
	}
	
	public Tarefa exibirAlteracao(Tarefa tarefa) {
        Scanner teclado = new Scanner(System.in);
        Scanner menu = new Scanner(System.in);
        
        System.out.println("A L T E R A Ç Ã O");
        System.out.println("---------------------------------------");
        System.out.println("1 - Descrição");
        System.out.println("2 - Prazo");
        System.out.println("3 - Status");
        System.out.println("o que você deseja alterar?");
        int opcao = menu.nextInt();
        System.out.println("---------------------------------------"); 

        if (opcao == 1) {
            System.out.println("Descrição (" + tarefa.getDescricao() + "): ");
            tarefa.setDescricao(teclado.nextLine());
        } else if (opcao == 2) {
            System.out.println("Novo Prazo: ");
            tarefa.setPrazo(teclado.nextInt());
        } else if (opcao == 3) {
            System.out.println("Finalizada (" + tarefa.isFinalizada() +")(S/N)? ");
            String status = teclado.next();
            if (status.equals("S") || status.equals("s")) {
                tarefa.setFinalizada(true);
            } else {
                tarefa.setFinalizada(false);
            }
        } else {
            System.out.println("Opção inválida.");
        }

        return tarefa;
    }
	
	public Tarefa exibirExclusao(Tarefa tarefa) {
		tarefa.setDescricao("");
		tarefa.setFinalizada(false);
		tarefa.setPrazo(0);
		System.out.println("Tarefa excluida!");
		
		return tarefa;
	}
}
