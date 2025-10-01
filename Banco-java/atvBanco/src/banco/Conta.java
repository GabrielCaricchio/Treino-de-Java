package banco;
public class Conta {
    private String titular;
    private String cpf;
    private Integer nconta;
    private Double saldo;

}

public Conta(String titular, String cpf, Integer nconta, Double saldo){
    this.titular = titular;
    this.cpf = cpf;
    this.nconta = nconta;
    this.saldo = 0;
}

public String getTitular(){
    return titular;
}

public void setTitular(String titular){
    this.titular = titular;
}

public String getCpf(){
    return cpf;
}

public void setCpf(String cpf){
    this.cpf = cpf;
}

public String getNconta(){
    return nconta;
}

public void setNconta(String nconta){
    this.nconta = nconta;
}

public String getSaldo(){
    return saldo;
}

public void setSaldo(String saldo){
    this.saldo = saldo;
}

public String toString() {
    return "Dados de conta"
            "titular"

}
