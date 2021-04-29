
package xadrez;

public class Bispo extends Peca
{

    public Bispo()
    {
        super();
    }

    public boolean movimentar(int a,int b,int x, int y,Casa casa[][],int linhaRei, int colunaRei)//movendo a,b para x,y
    {
        int copyA = a;//porque os valores de "a" e "b" mudam durante o método
        int copyB = b;
        if (x>a && y>b)//movendo no sentido superior direito
        {
            a++;
            b++;
            while(x>a)
            {
                if(!(casa[a][b].getNomePeca().equals("0")))//se tiver peça no caminho
                {
                    return false;
                }
                a++;
                b++;
                if (a>7 || b>7)//testando dimensoes da matriz
                {
                    return false;
                }
            }
            if(b==y)
            {
                return !(Rei.reiEmPerigo(copyA,copyB,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
            }
            else
            {
                return false;
            }
        }
        else
        {
            if(x>a && y<b)//movendo no sentido superior esquerdo
            {
                a++;
                b--;
                while(x>a)
                {
                    if(!(casa[a][b].getNomePeca().equals("0")))//se tiver peça no caminho
                    {
                        return false;
                    }
                    a++;
                    b--;
                    if (a>7 || b<0)//testando dimensoes da matriz
                    {
                        return false;
                    }
                }
                if(b==y)
                {
                    return !(Rei.reiEmPerigo(copyA,copyB,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if(x<a && y<b)//movendo no sentido inferior esquerdo
                {
                    a--;
                    b--;
                    while(x<a)
                    {
                        if(!(casa[a][b].getNomePeca().equals("0")))//se tiver peça no caminho
                        {
                            return false;
                        }
                        a--;
                        b--;
                        if (a<0 || b<0)//testando dimensoes da matriz
                        {
                            return false;
                        }
                    }
                    if(b==y)
                    {
                        return !(Rei.reiEmPerigo(copyA,copyB,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    if(x<a && y>b)//movendo no sentido inferior direito
                    {
                        a--;
                        b++;
                        while(x<a)
                        {
                            if(!(casa[a][b].getNomePeca().equals("0")))//se tiver peça no caminho
                            {
                                return false;
                            }
                            a--;
                            b++;
                            if (a<0 || b>7)//testando dimensoes da matriz
                            {
                                return false;
                            }
                        }
                        if(b==y)
                        {
                            return !(Rei.reiEmPerigo(copyA,copyB,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else//se tiver na mesma linha ou coluna
                    {
                        return false;
                    }
                }
            }
        }
    }

    public boolean testarAmeacaAoRei(int a,int b,int x, int y,Casa casa[][])//movendo a,b para x,y
    {
        if (x>a && y>b)//movendo no sentido superior direito
        {
            a++;
            b++;
            while(x>a)
            {
                if(!(casa[a][b].getNomePeca().equals("0")))//se tiver peça no caminho
                {
                    return false;
                }
                a++;
                b++;
                if (a>7 || b>7)//testando dimensoes da matriz
                {
                    return false;
                }
            }
            if(b==y)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if(x>a && y<b)//movendo no sentido superior esquerdo
            {
                a++;
                b--;
                while(x>a)
                {
                    if(!(casa[a][b].getNomePeca().equals("0")))//se tiver peça no caminho
                    {
                        return false;
                    }
                    a++;
                    b--;
                    if (a>7 || b<0)//testando dimensoes da matriz
                    {
                        return false;
                    }
                }
                if(b==y)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if(x<a && y<b)//movendo no sentido inferior esquerdo
                {
                    a--;
                    b--;
                    while(x<a)
                    {
                        if(!(casa[a][b].getNomePeca().equals("0")))//se tiver peça no caminho
                        {
                            return false;
                        }
                        a--;
                        b--;
                        if (a<0 || b<0)//testando dimensoes da matriz
                        {
                            return false;
                        }
                    }
                    if(b==y)
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    if(x<a && y>b)//movendo no sentido inferior direito
                    {
                        a--;
                        b++;
                        while(x<a)
                        {
                            if(!(casa[a][b].getNomePeca().equals("0")))//se tiver peça no caminho
                            {
                                return false;
                            }
                            a--;
                            b++;
                            if (a<0 || b>7)//testando dimensoes da matriz
                            {
                                return false;
                            }
                        }
                        if(b==y)
                        {
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    else//se tiver na mesma linha ou coluna
                    {
                        return false;
                    }
                }
            }
        }
    }
}