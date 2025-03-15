class Funcionario { //Superclasse que representa um funcionário genérico
    private String nome;
    private String cpf;
    protected Double salarioBase; //Modificador "protected" permite o acesso nas subclasses

    //Construtor para inicializar os atributos do funcionário
    public Funcionario(String nome, String cpf, Double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    //Método que calcula o salário base (pode ser sobrescrito pelas subclasses)
    public Double calcularSalario() {
        return this.salarioBase;
    }

    //Método para exibir as informações do funcionário
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário Base: R$" + calcularSalario());
    }
}

//Subclasse Administrativo que herda de Funcionario
class Administrativo extends Funcionario {
    private String departamento;

    //Construtor que recebe os atributos da superclasse e o novo atributo "departamento"
    public Administrativo(String nome, String cpf, Double salarioBase, String departamento) {
        super(nome, cpf, salarioBase); //Chama o construtor da superclasse
        this.departamento = departamento;
    }

    //Sobrescrita do método calcularSalario (polimorfismo)
    @Override
    public Double calcularSalario() {
        return salarioBase * 2.25; //Ajusta o salário com um multiplicador
    }
    
    //Sobrescrita do método exibirInfo para incluir o departamento
    @Override
    public void exibirInfo() {
        super.exibirInfo(); //Chama o método da superclasse
        System.out.println("Departamento: " + this.departamento);
    }
}

//Subclasse Professor que herda de Funcionario
class Professor extends Funcionario {
    private String titulacao;
    private int horasAula;
    private static final Double VALOR_HORA_AULA = 200.0; //Valor fixo por hora aula

    //Construtor que recebe atributos da superclasse e novos atributos "titulacao" e "horasAula"
    public Professor(String nome, String cpf, Double salarioBase, String titulacao, int horasAula) {
        super(nome, cpf, salarioBase);
        this.titulacao = titulacao;
        this.horasAula = horasAula;
    }

    //Sobrescrita do método calcularSalario, adicionando o pagamento por hora aula
    @Override
    public Double calcularSalario() {
        return salarioBase + (this.horasAula * VALOR_HORA_AULA);
    }
    
    //Sobrescrita do método exibirInfo para incluir a titulação e as horas aula
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Titulação: " + this.titulacao);
        System.out.println("Horas Aula: " + this.horasAula);
    }
}

//Subclasse Tecnico que herda de Funcionario
class Tecnico extends Funcionario {
    private static final Double ADICIONAL_TECNICO = 3700.00; //Valor fixo adicional para técnicos
    private String cargo;

    //Construtor que recebe atributos da superclasse e o novo atributo "cargo"
    public Tecnico(String nome, String cpf, Double salarioBase, String cargo) {
        super(nome, cpf, salarioBase);
        this.cargo = cargo;
    }

    //Sobrescrita do método calcularSalario para incluir o adicional técnico
    @Override
    public Double calcularSalario() {
        return salarioBase + ADICIONAL_TECNICO;
    }
    
    //Sobrescrita do método exibirInfo para incluir o cargo
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cargo: " + this.cargo);
    }
}

//Classe principal para executar o programa
public class SistemaFuncionario {
    public static void main(String[] args) throws Exception {
        //Criando instâncias das classes
        Administrativo adm1 = new Administrativo("João", "099999", 2000.100, "RH");
        Administrativo adm2 = new Administrativo("Maria", "088888", 2000.100, "Financeiro");
        Professor prof1 = new Professor("Carlos", "077777", 2000.100, "Doutor", 80);
        Tecnico tec1 = new Tecnico("Flavia", "06666", 2000.100, "Tecnico Senior");
        
        //Exibindo informações dos funcionários
        System.out.println("Funcionários");
        adm1.exibirInfo();
        adm2.exibirInfo();
        prof1.exibirInfo();
        tec1.exibirInfo();
    }
}
