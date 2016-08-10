package andrea.maino.blog.model.entity;

public class Usuario {
	
	private int id; 
	private String email;
    private String senha;
    private String nome;
	
   
    public int getId() {
		return id;
	}
    
	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
	@Override
    public boolean equals(Object obj) {
        if(obj instanceof Usuario){
            Usuario user = (Usuario) obj;
            return user.getEmail().equals(getEmail());
        }
 
        return false;
    }

}
