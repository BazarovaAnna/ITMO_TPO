package main.dom;
/*Триллиан в отчаянии схватила его за руку и потянула к двери, которую Форд и Зафод пытались открыть,
    но Артур был, как труп -- казалось, надвигающиеся воздухоплавающие грызуны загипнотизировали его.*/
public class Trillian implements Human{
    public String name;
    public HumanFeelings feel;
    HumanActions act1;
    HumanActions act2;
    public Trillian(){
        this.name="Триллиан ";
        this.feel=HumanFeelings.inDespair;
        this.act1=HumanActions.GrabHand;
        this.act2=HumanActions.Pull;
    }
    public String performAction(){
        return(name+feel.str+act1.str+act2.str);
    }
}
