package org.example;

//contrato Autenticavel
   // quem assina esse contrato, precisa imprelemntar
     //metodo setSenha
     //metodo autentica
public abstract interface Autenticavel {

    public abstract void setSenha(int senha);
    public abstract boolean autentica(int senha);

}
