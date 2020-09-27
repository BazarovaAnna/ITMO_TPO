package main.dom;
/*Триллиан в отчаянии схватила его за руку и потянула к двери, которую Форд и Зафод пытались открыть,
    но Артур был, как труп -- казалось, надвигающиеся воздухоплавающие грызуны загипнотизировали его.*/
public class Artur implements Human {
    public static String name;
    public HumanFeelings feel;
    public Artur(){
        this.name="Артур ";
        this.feel=HumanFeelings.LikeDeadman;
    }
    public String performAction(){
        return(name+feel.str);
    }
}
