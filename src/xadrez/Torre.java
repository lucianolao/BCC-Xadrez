
package xadrez;

public class Torre extends Peca
{

    public Torre()
    {
        super();
    }

    public boolean movimentar(int a,int b,int x, int y,Casa casa[][],int linhaRei, int colunaRei)//movendo a,b para x,y
    {
        int cont=0;
        if(a==x)
        {
            if(b<y)
            {
                for(cont=b+1;cont<y;cont++)
                {
                    if(!(casa[x][cont].getNomePeca().equals("0")))//se tiver peça no caminho
                    {
                        return false;
                    }
                }
                return !(Rei.reiEmPerigo(a,b,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
            }
            else
            {
                for(cont=y+1;cont<b;cont++)
                {
                    if(!(casa[x][cont].getNomePeca().equals("0")))//se tiver peça no caminho
                    {
                        return false;
                    }
                }
                return !(Rei.reiEmPerigo(a,b,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
            }
        }
        else
        {
            if(b==y)
            {
                if(a<x)
                {
                    for(cont=a+1;cont<x;cont++)
                    {
                        if(!(casa[cont][y].getNomePeca().equals("0")))//se tiver peça no caminho
                        {
                            return false;
                        }
                    }
                    return !(Rei.reiEmPerigo(a,b,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
                }
                else
                {
                    for(cont=x+1;cont<a;cont++)
                    {
                        if(!(casa[cont][y].getNomePeca().equals("0")))//se tiver peça no caminho
                        {
                            return false;
                        }
                    }
                    return !(Rei.reiEmPerigo(a,b,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
                }
            }
            else
            {
                return false;
            }
        }
    }

    public boolean testarAmeacaAoRei(int a,int b,int x, int y,Casa casa[][])//movendo a,b para x,y
    {
        int cont=0;
        if(a==x)
        {
            if(b<y)
            {
                for(cont=b+1;cont<y;cont++)
                {
                    if(!(casa[x][cont].getNomePeca().equals("0")))//se tiver peça no caminho
                    {
                        return false;
                    }
                }
                return true;
            }
            else
            {
                for(cont=y+1;cont<b;cont++)
                {
                    if(!(casa[x][cont].getNomePeca().equals("0")))//se tiver peça no caminho
                    {
                        return false;
                    }
                }
                return true;
            }
        }
        else
        {
            if(b==y)
            {
                if(a<x)
                {
                    for(cont=a+1;cont<x;cont++)
                    {
                        if(!(casa[cont][y].getNomePeca().equals("0")))//se tiver peça no caminho
                        {
                            return false;
                        }
                    }
                    return true;
                }
                else
                {
                    for(cont=x+1;cont<a;cont++)
                    {
                        if(!(casa[cont][y].getNomePeca().equals("0")))//se tiver peça no caminho
                        {
                            return false;
                        }
                    }
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
    }
}