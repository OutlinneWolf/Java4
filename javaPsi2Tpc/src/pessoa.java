
public class pessoa {
	
	//Atributos ---------------------------
    //Sempre Privados
    private String nome;
    private String apelido;
    private String sexo;
    private String dataNascimento;
    private String morada;
    private int telefone;
    private long bi;
    private long nif;
    private long niss;

    //Construtores-------------------------
    public pessoa(String name, String lastN)
    {
        nome = name;
        apelido = lastN;
    }

    public pessoa(String name, String lastName, String dataN)
    {
        nome = name;
        apelido = lastName;
        dataNascimento = dataN;
    }

    //Métodos-------------------------------

    // Sets
    public void agoraFaloEu(String nome)
    {
        Console.WriteLine("Eu " + getName() + getLastName() + " Falo Agora");
    }

    public void agoraFaloEu(pessoa p)
    {
        Console.WriteLine("Eu " + p.getName() + p.getLastName() + " Falo Agora");
        Console.ReadKey();
        p.agoraFaloEu(this);
    }

    public String dizOlaAPessoa(String nome)
    {
        return "Ola "+nome+"Eu sou o " + this.nome+ " " +apelido;
    }

    public String dizOlaAmigo(String nomeAmigo)
    {
        return "Ola " + nomeAmigo + "Eu sou o " + nome + apelido;
    }

    public String dizOlaAmigo(params String[] nomesAmigos)  //params é a palavra chave (keyword) que permite receber
    {                                                       //qualquer tipo de dados, desde que sejam todos do mesmo
        StringBuilder sb = new StringBuilder();             //tipo, independementemente de ser enviado ou por uma lista
                                                            //de strings ou por um array
        foreach(String s in nomesAmigos)
        {
            sb.Append(s + ", ");
        }

        return dizOlaAPessoa(sb.ToString());
    }

    public void dizOlaAmigo(pessoa px)
    {
        Console.WriteLine("Ola " + px.getName() + px.getLastName() + "Eu sou o " + nome + " " + apelido);
    }

    public void setSexo(String sexo)
    {
         this.sexo = sexo; 
    }

    public void setDataNascimento(String dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }

    public void setMorada(String morada)
    {
        this.morada = morada;
    }

    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }

    public void setBi(long bi)
    {
        this.bi = bi;
    }

    public void setNif(long nif)
    {
        this.nif = nif;
    }

    public void setNiss(long niss)
    {
        this.niss = niss;
    }

    // Gets
    public long getNiss()
    {
        return niss;
    }

    public long getNif()
    {
        return nif;
    }

    public long getBi()
    {
        return bi;
    }

    public int getTelefone()
    {
        return telefone;
    }

    public String getMorada()
    {
        return morada;
    }

    public String getName()
    {
        return nome;
    }

    public String getLastName()
    {
        return apelido;
    }

    public String getDataN()
    {
        return dataNascimento;
    }

   public String getSexo()
   {
        return sexo;
   }
}
