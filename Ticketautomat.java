/**
 * * � ������ �������� ������ ������������ ������� �������� ������,
� * ������ ������� �� ���� �� �������.
� * ��������� ������ ������ ����� ���� ���� ������������
� * ������������.
� * �������� ������ ��������� � ���, ��� ��� �������� ����� �������������
� ���������� �������, ��� ��� �������� ���������� �����, ������ ��� �������� �����
� * �����������.
� * ����� ����, �� ������������, ��� � ���� �������� �������� �����.
 *
 * @author David J. Barnes und Michael K�lling
 * @version 2006.03.30
 */
public class Ticketautomat 
{
    // ���� ������ � ���� ������.
    private int preis;
    // �����, ������� ���� ����� ������� ������������� ������.
    private int bisherGezahlt;
    //����� �����, ������� ���� ����� ������� ���� �������.
    private int gesamtsumme;
    private int wechselgeld;

    /**
     *�������� ������ � �������� �� ������ ����
����� * (� ������).
����� * ����������: ���� ������ ���� ������ ����
����� * ������ �� ��������� ���

     */
    public Ticketautomat(int ticketpreis)
    {
         preis = ticketpreis;
         this.preis=25;
        bisherGezahlt = 0;
        gesamtsumme = 0;
        wechselgeld=0;
    }
   

    /**
     * ��������� ���� ������ �� ���� ������� (� ������)
     */
    public int gibPreis()
    {
        return preis;
    }

    /**
     * ��������� ����� ��� ���������� ����� �� ��������� �����
����� * ��� ������.
     */
    public int gibBisherGezahltenBetrag()
    {
        return bisherGezahlt;
    }

    /**
     *�������� ��������� ����� (� ������) � �������� �������� ��
����� * ��������� �����.
     */
    public void geldEinwerfen(int betrag)
    {
        bisherGezahlt = bisherGezahlt + betrag;
        System.out.println(bisherGezahlt);
    }

    /**
     * ������������ �����.
����� * �������� ����� ����� � ���������� �����, ����������
����� * ����� ����� ����.
     */
    public void ticketDrucken()
    {
         // ����������� ���������� ������.
        System.out.println("##################");
        System.out.println("# Die BlueJ-Linie");
        System.out.println("# Ticket");
        System.out.println("# " + preis + " Cent.");
        System.out.println("##################");
        System.out.println();

        //�������� ����� ����� � �������������� ������
        gesamtsumme = gesamtsumme + bisherGezahlt;
        //����� ����������� �������.
        bisherGezahlt = 0;
    }
    /**
     * konsol viydet sotvetstvuyushiy summu
     */
    public void meldung(){
       System.out.println("���������� �������� ��������������� ����� � �������"); 
    }
    /**
     * konsol viydet bilet skolko stoit
     */
    public void preisAusgeben(){
    System.out.println("����� ����� " + preis + " ����."); 
    }
    /**
     * vozvrashaet gesamtsumme
     */
    
    public int gibGesamtsumme(){
    return gesamtsumme;
    }
    /**
     * ������� �������� gesamtsumme
     */
    public void leeren(){
        gesamtsumme=0;
        
    }
    public int preisSetzen(int preis){
        return preis; 
    
    }
    /**
     * sdachi dayet
     */
    public int wechselgeldAuszahlen(){
    int wechselgeld;
    wechselgeld = bisherGezahlt;
    bisherGezahlt=0;
    return wechselgeld;
    }
     /**
      * proveryaet summu otrisat ne prinimaet
      */
     public void gelEinwerfen(int betrag){
        if (betrag>0){
        bisherGezahlt= bisherGezahlt+ betrag;
        }
        else {
        System.out.println("Pojaluysta polozhite vvedeniy summu"+ betrag);
        }
    }

}