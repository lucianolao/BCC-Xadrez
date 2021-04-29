
package xadrez;
import javax.swing.JToggleButton;

public class Casa
{
    private JToggleButton botao;
    private String nomepeca;
    private String corPeca;
    private String corCasa;
    private Peca peca;

    public void setBotao(JToggleButton novo)
    {
        botao = novo;
    }

    public void setNomePeca(String novo)
    {
        nomepeca=novo;
    }

    public void setCorPeca(String novo)
    {
        corPeca=novo;
    }

    public void setCorCasa(String novo)
    {
        corCasa=novo;
    }

    public void setPeca(Peca novo)
    {
        peca=novo;
    }

    public JToggleButton getBotao()
    {
        return botao;
    }

    public String getNomePeca()
    {
        return nomepeca;
    }

    public String getCorPeca()
    {
        return corPeca;
    }

    public String getCorCasa()
    {
        return corCasa;
    }

    public Peca getPeca()
    {
        return peca;
    }
}
