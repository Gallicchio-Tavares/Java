class ContaBanco {
    // atributos:
    public int numConta;
    protected String tipo; // cc (conta corrente) ou cp (conta poupança)
    private String dono;
    private double saldo;
    private boolean status;
  
    public void setNumConta(int numConta) {
      this.numConta = numConta;
    }
  
    public int getNumConta() {
      return this.numConta;
    }
  
    public void setTipo(String tipo) {
      this.tipo = tipo;
    }
  
    public String getTipo() {
      return this.tipo;
    }
  
    public void setDono(String dono) {
      this.dono = dono;
    }
  
    public String getDono() {
      return this.dono;
    }
  
    public void setSaldo(double saldo) {
      this.saldo = saldo;
    }
  
    public double getSaldo() {
      return this.saldo;
    }
  
    public void setStatus(boolean status) {
      this.status = status;
    }
  
    public boolean getStatus() {
      return this.status;
    }
  
    public void estadoAtual(){
      System.out.println("-----------------------------");
      System.out.println("Conta: " + this.getNumConta());
      System.out.println("Tipo: " + this.getTipo());
      System.out.println("Dono: " + this.getDono());
      System.out.println("Saldo: " + this.getSaldo());
      System.out.println("Status: " + this.getStatus());
    }
  
    // sempre que eu abrir a conta, o saldo começa com zero e o status começa como
    // falso;
    public ContaBanco() {
      this.setSaldo(0);
      this.setStatus(false);
    }
  
    // sempre que eu criar uma conta, eu
    public void abrirConta(String t) {
      this.setTipo(t);
      this.setStatus(true);
      if (t == "cc") {
        this.setSaldo(50); //dar preferencia pra usar getters e setters
        System.out.println("Conta aberta com sucesso!");
      } else if (t == "cp") {
        this.setSaldo(150);
        System.out.println("Conta aberta com sucesso!");
      } else {
        System.out.println("Erro");
      }
    }
  
    public void fecharConta() {
      if (this.getSaldo() > 0) {
        System.out.println("Conta com dinheiro.");
      } else if (this.getSaldo() < 0) {
        System.out.println("Conta em débito."); // tá devendo grana
      } else {
        this.setStatus(false);
        System.out.println("Conta fechada com sucesso!");
      }
    }
  
    public void depositar(double valor) {
      if (this.getStatus() == true) {
        // saldo += valor;
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Depósito realizado na conta de " + this.getDono());
      } else {
        System.out.println("Impossível depositar."); // n pode depositar com uma conta fechada ou inexistente
      }
    }
  
    public void sacar(double valor) {
      if (this.getStatus()) {
        if (this.getSaldo() >= valor) {
          this.setSaldo(this.getSaldo() - valor);
          System.out.println("Saque realizado na conta de " + this.getDono());
          System.out.println("Você sacou R$"+valor);
        } else { // se o saldo for menor que o valor...
          System.out.println("Impossível sacar: saldo insuficiente.");
        }
      } else {
        System.out.println("Impossível sacar.");
      }
    }
  
    public void pagarMensal() {
      double valor = 0;
      if (this.getTipo() == "cc") {
        valor = 12;
      } else if (this.getTipo() == "cp") {
        valor = 20;
      }
      if (this.getStatus()) {
        if (this.getSaldo() > valor) {
          this.setSaldo(this.getSaldo() - valor);
           System.out.println("Valor mensal pago com sucesso.");
        } else {
          System.out.println("Saldo insuficiente.");
        }
      } else {
        System.out.println("Impossível realizar pagamento.");
      }
    }
  }
