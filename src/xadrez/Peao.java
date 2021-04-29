
package xadrez;

public class Peao extends Peca
{
    private boolean primeiraJogada; //testar saída andando 2 casas

    public Peao()
    {
        super();
        primeiraJogada = true;
    }

    public boolean movimentar(int a,int b,int x, int y,Casa casa[][],int linhaRei, int colunaRei)//movendo a,b para x,y
    {
        if(casa[a][b].getCorPeca().equals("branco")) //vez das peças brancas
        {
            if(b==y && a+1==x) //uma casa acima
            {
                if(casa[x][y].getNomePeca().equals("0")) //se tiver vazio
                {
                    if(!(Rei.reiEmPerigo(a,b,x,y,casa,linhaRei,colunaRei)))//true se o rei não estiver em perigo
                    {
                        primeiraJogada = false;
                        if(x==7) //peão branco chegou ao outro lado
                        {
                            casa[a][b].setNomePeca("rainha");
                            casa[a][b].setPeca(new Rainha());
                        }
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if((b-1==y && a+1==x)||(b+1==y && a+1==x)) //comendo diagonal
                {
                    if(!casa[x][y].getNomePeca().equals("0")) //se não tiver vazio
                    {
                        if(!(Rei.reiEmPerigo(a,b,x,y,casa,linhaRei,colunaRei)))//true se o rei não estiver em perigo
                        {
                            primeiraJogada = false;
                            if(x==7) //peão branco chegou ao outro lado
                            {
                                casa[a][b].setNomePeca("rainha");
                                casa[a][b].setPeca(new Rainha());
                            }
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    if(primeiraJogada && b==y && a+2==x && casa[x][y].getNomePeca().equals("0"))
                    {
                        if(!(Rei.reiEmPerigo(a,b,x,y,casa,linhaRei,colunaRei)))//true se o rei não estiver em perigo
                        {
                            //andando 2 casas
                            primeiraJogada = false;
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else
                    {
                        return false; //jogada impossível para peão
                    }
                }
            }
        }
        else //vez das peças pretas
        {
            if(b==y && a-1==x) //uma casa abaixo
            {
                if(casa[x][y].getNomePeca().equals("0")) //se tiver vazio
                {
                    if(!(Rei.reiEmPerigo(a,b,x,y,casa,linhaRei,colunaRei)))//true se o rei não estiver em perigo
                    {
                        primeiraJogada = false;
                        if(x==0) //peão preto chegou ao outro lado
                        {
                            casa[a][b].setNomePeca("rainha");
                            casa[a][b].setPeca(new Rainha());
                        }
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if((b-1==y && a-1==x)||(b+1==y && a-1==x)) //comendo diagonal
                {
                    if(!casa[x][y].getNomePeca().equals("0")) //se não tiver vazio
                    {
                        if(!(Rei.reiEmPerigo(a,b,x,y,casa,linhaRei,colunaRei)))//true se o rei não estiver em perigo
                        {
                            primeiraJogada = false;
                            if(x==0) //peão preto chegou ao outro lado
                            {
                                casa[a][b].setNomePeca("rainha");
                                casa[a][b].setPeca(new Rainha());
                            }
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    if(primeiraJogada && b==y && a-2==x && casa[x][y].getNomePeca().equals("0"))
                    {
                        if(!(Rei.reiEmPerigo(a,b,x,y,casa,linhaRei,colunaRei)))//true se o rei não estiver em perigo
                        {
                            //andando 2 casas
                            primeiraJogada = false;
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else
                    {
                        return false; //jogada impossível para peão
                    }
                }
            }
        }
    }

    public boolean testarAmeacaAoRei(int a,int b,int x, int y,Casa casa[][])//movendo a,b para x,y
    {
        if(casa[a][b].getCorPeca().equals("branco")) //vez das peças brancas
        {
            if((b-1==y && a+1==x)||(b+1==y && a+1==x)) //comendo diagonal
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else //vez das peças pretas
        {
            if((b-1==y && a-1==x)||(b+1==y && a-1==x)) //comendo diagonal
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
        
}