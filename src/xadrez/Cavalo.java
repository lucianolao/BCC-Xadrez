
package xadrez;

public class Cavalo extends Peca
{

    public Cavalo()
    {
        super();
    }

    public boolean movimentar(int a,int b,int x, int y,Casa casa[][],int linhaRei, int colunaRei)//movendo a,b para x,y
    {
        if(Math.abs(a-x)==2)
        {
            if(Math.abs(b-y)==1)
            {
                return !(Rei.reiEmPerigo(a,b,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
            }
        }
        else
        {
            if(Math.abs(a-x)==1)
            {
                if(Math.abs(b-y)==2)
                {
                    return !(Rei.reiEmPerigo(a,b,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
                }
            }
        }
        return false;
    }

    public boolean testarAmeacaAoRei(int a,int b,int x, int y,Casa casa[][])//movendo a,b para x,y
    {
        if(Math.abs(a-x)==2)
        {
            if(Math.abs(b-y)==1)
            {
                return true;
            }
        }
        else
        {
            if(Math.abs(a-x)==1)
            {
                if(Math.abs(b-y)==2)
                {
                    return true;
                }
            }
        }
        return false;
    }

}
