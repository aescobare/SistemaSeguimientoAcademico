package com.loyola.ssa.entities;

public class Usuario 
{
    
    private String nick;

    private String password;
    private  String mensaje;

    public String getMensaje() {
	return mensaje;
    }
    
    public String getNick()
    {
	return nick;
    }
    public void setNick(String nick)
    {
	this.nick=nick;
    }
    public String getPassword()
    {
	return password;
    }
    public void setPassword(String password)
    {
	this.password=password;
    }
    
   public void Registrar_datos()
    {
	    }
}
