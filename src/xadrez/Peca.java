
package xadrez;

public abstract class Peca
{

    public abstract boolean movimentar(int a,int b,int x, int y,Casa casa[][],int linhaRei, int colunaRei);
    //movendo a,b para x,y

    public abstract boolean testarAmeacaAoRei(int a,int b,int x,int y,Casa casa[][]);
    //algoritmo semelhante ao movimentar(...), sem a chamada do "reiEmPerigo(...)"
    //com exceção do Peao(), que é completamente diferente, já que ele não
    //se movimenta no mesmo sentido que ameaça
}
