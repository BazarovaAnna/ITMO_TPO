package main.dom;
/*Триллиан в отчаянии схватила его за руку и потянула к двери, которую Форд и Зафод пытались открыть,
    но Артур был, как труп -- казалось, надвигающиеся воздухоплавающие грызуны загипнотизировали его.*/
public class Zafod implements Human{
    public String name;
    public HumanFeelings feel=null;
    HumanActions act;
    public Zafod(){
        this.name="Зафод ";
        this.act=HumanActions.TryOpen;
    }
    public String performAction(){
        return(name+act.str);
    }
}