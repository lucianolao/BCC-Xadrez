
package xadrez;

public class Rei extends Peca
{

    public Rei()
    {
        super();
    }

    public boolean movimentar(int a,int b,int x, int y,Casa casa[][],int linhaRei, int colunaRei)//movendo a,b para x,y
    {
        if((Math.abs(a-x)<=1)&&(Math.abs(b-y)<=1))
        {
            return !(Rei.reiEmPerigo(a,b,x,y,casa,linhaRei,colunaRei));//true se o rei não estiver em perigo
        }
        else
        {
            return false;
        }
    }

    public boolean testarAmeacaAoRei(int a,int b,int x, int y,Casa casa[][])//movendo a,b para x,y
    {
        if((Math.abs(a-x)<=1)&&(Math.abs(b-y)<=1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean reiEmPerigo(int a,int b,int x, int y,Casa casa[][],int linhaRei, int colunaRei)
    {//este método simula a jogada pra testar alguma possível ameaça
        int i=0,j=0;
        if(casa[a][b].getNomePeca().equals("rei"))//rei se movendo, atualizar sua posição
        {
            linhaRei = x;
            colunaRei = y;
        }
        if(casa[a][b].getCorPeca().equals("branco")) //vez das peças brancas
        {
            String nome = new String(casa[x][y].getNomePeca());//backup do nome
            String cor = new String(casa[x][y].getCorPeca());//backup da cor
            Peca peca = casa[x][y].getPeca();
            casa[x][y].setNomePeca(casa[a][b].getNomePeca());//simulando jogada
            casa[x][y].setCorPeca(casa[a][b].getCorPeca());//simulando jogada
            casa[x][y].setPeca(casa[a][b].getPeca());
            casa[a][b].setNomePeca("0");//simulando jogada
            casa[a][b].setCorPeca("0");//simulando jogada
            casa[a][b].equals(null);
            for(i=0;i<8;i++)
            {
                for(j=0;j<8;j++)
                {
                    if(casa[i][j].getCorPeca().equals("preto")) //testar ameaças inimigas
                    {
                        if(casa[i][j].getPeca().testarAmeacaAoRei(i,j,linhaRei,colunaRei,casa))
                        {
                            casa[a][b].setNomePeca(casa[x][y].getNomePeca());//retomando a posição anterior à simulação
                            casa[a][b].setCorPeca(casa[x][y].getCorPeca());//retomando a posição anterior à simulação
                            casa[a][b].setPeca(casa[x][y].getPeca());
                            casa[x][y].setNomePeca(nome);//retomando a posição anterior à simulação
                            casa[x][y].setCorPeca(cor);//retomando a posição anterior à simulação
                            casa[x][y].setPeca(peca);
                            return true;
                        }
                    }
                }
            }
            casa[a][b].setNomePeca(casa[x][y].getNomePeca());//retomando a posição anterior à simulação
            casa[a][b].setCorPeca(casa[x][y].getCorPeca());//retomando a posição anterior à simulação
            casa[a][b].setPeca(casa[x][y].getPeca());
            casa[x][y].setNomePeca(nome);//retomando a posição anterior à simulação
            casa[x][y].setCorPeca(cor);//retomando a posição anterior à simulação
            casa[x][y].setPeca(peca);
            return false;
        }
        else //vez das peças pretas
        {
            String nome = new String(casa[x][y].getNomePeca());//backup do nome
            String cor = new String(casa[x][y].getCorPeca());//backup da cor
            Peca peca = casa[x][y].getPeca();
            casa[x][y].setNomePeca(casa[a][b].getNomePeca());//simulando jogada
            casa[x][y].setCorPeca(casa[a][b].getCorPeca());//simulando jogada
            casa[x][y].setPeca(casa[a][b].getPeca());
            casa[a][b].setNomePeca("0");//simulando jogada
            casa[a][b].setCorPeca("0");//simulando jogada
            casa[a][b].equals(null);
            for(i=0;i<8;i++)
            {
                for(j=0;j<8;j++)
                {
                    if(casa[i][j].getCorPeca().equals("branco")) //testar ameaças inimigas
                    {
                        if(casa[i][j].getPeca().testarAmeacaAoRei(i,j,linhaRei,colunaRei,casa))
                        {
                            casa[a][b].setNomePeca(casa[x][y].getNomePeca());//retomando a posição anterior à simulação
                            casa[a][b].setCorPeca(casa[x][y].getCorPeca());//retomando a posição anterior à simulação
                            casa[a][b].setPeca(casa[x][y].getPeca());
                            casa[x][y].setNomePeca(nome);//retomando a posição anterior à simulação
                            casa[x][y].setCorPeca(cor);//retomando a posição anterior à simulação
                            casa[x][y].setPeca(peca);
                            return true;
                        }
                    }
                }
            }
            casa[a][b].setNomePeca(casa[x][y].getNomePeca());//retomando a posição anterior à simulação
            casa[a][b].setCorPeca(casa[x][y].getCorPeca());//retomando a posição anterior à simulação
            casa[a][b].setPeca(casa[x][y].getPeca());
            casa[x][y].setNomePeca(nome);//retomando a posição anterior à simulação
            casa[x][y].setCorPeca(cor);//retomando a posição anterior à simulação
            casa[x][y].setPeca(peca);
            return false;
        }
    }


}