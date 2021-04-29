
package xadrez;

public class Rainha extends Peca
{

    public Rainha()
    {
        super();
    }

    //apenas uma incremento do código do bispo no último else do código da torre
    public boolean movimentar(int a,int b,int x, int y,Casa casa[][],int linhaRei, int colunaRei)//movendo a,b para x,y
    {
        int copyA = a;//porque os valores de "a" e "b" mudam durante o método
        int copyB = b;
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
                return !(Rei.reiEmPerigo(copyA,copyB,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
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
                return !(Rei.reiEmPerigo(copyA,copyB,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
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
                    return !(Rei.reiEmPerigo(copyA,copyB,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
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
                    return !(Rei.reiEmPerigo(copyA,copyB,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
                }
            }
            else
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
                            else
                            {
                                return false;
                            }
                        }
                    }
                }
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
                            else
                            {
                                return false;
                            }
                        }
                    }
                }
            }
        }
    }
}