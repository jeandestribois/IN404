import java.util.ArrayList;

public class Document
{
    private ArrayList<CD> listeCD;
    private ArrayList<DVD> listeDVD;
    private String type;

    public Document(String type)
    {
       this.type=type;
    }
}
