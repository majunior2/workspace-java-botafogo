package model;

public class App {

	public static void main(String[] args) {
		Tarefa exemplo = new Tarefa();
		Tarefa exemplo02 = new Tarefa();
		Tarefa exemplo3 = new Tarefa();
		Tarefa exemplo4 = new Tarefa();
		Tarefa exemplo5 = new Tarefa();
		Tarefa exemplo6 = new Tarefa();
		Tarefa exemplo7 = new Tarefa();
		Tarefa exemplo8 = new Tarefa();
		Tarefa exemplo09 = new Tarefa();
		Tarefa exemplo10 = new Tarefa();
		
		
		exemplo.setId(1);
		exemplo.setDescricao("Comprar Batata");
		exemplo.setPrazo(1);
		exemplo.setFinalizada(false); 
		
		exemplo02.setId(2);
		exemplo02.setDescricao("skincare");
		exemplo02.setPrazo(1);
		exemplo02.setFinalizada(false); 
		
		exemplo3.setId(3);
		exemplo3.setDescricao("estudar");
		exemplo3.setPrazo(1);
		exemplo3.setFinalizada(false); 
		
		exemplo4.setId(4);
		exemplo4.setDescricao("fazer abdominal");
		exemplo4.setPrazo(1);
		exemplo4.setFinalizada(false); 
		
		exemplo5.setId(5);
		exemplo5.setDescricao("fazer bike");
		exemplo5.setPrazo(1);
		exemplo5.setFinalizada(false); 
		
		exemplo6.setId(6);
		exemplo6.setDescricao("Comprar coca cola");
		exemplo6.setPrazo(1);
		exemplo6.setFinalizada(false); 
		
		exemplo7.setId(7);
		exemplo7.setDescricao("treinar");
		exemplo7.setPrazo(1);
		exemplo7.setFinalizada(false); 
		
		exemplo8.setId(8);
		exemplo8.setDescricao("Comprar ingresso para o cinema");
		exemplo8.setPrazo(1);
		exemplo8.setFinalizada(false); 
		
		exemplo09.setId(9);
		exemplo09.setDescricao("Almoçar");
		exemplo09.setPrazo(1);
		exemplo09.setFinalizada(false); 
		
		exemplo10.setId(10);
		exemplo10.setDescricao("Limpar a casa");
		exemplo10.setPrazo(1);
		exemplo10.setFinalizada(false); 
		
		System.out.println("Tarefa: " + exemplo.getId() + " - " +
                exemplo.getDescricao() + " - " +
                exemplo.getPrazo() + " - " +
                exemplo.isFinalizada());
	}

}
