package main.dom;
/*Триллиан в отчаянии схватила его за руку и потянула к двери, которую Форд и Зафод пытались открыть,
    но Артур был, как труп -- казалось, надвигающиеся воздухоплавающие грызуны загипнотизировали его.*/
public class Hamster {
    String type;
    String action1;
    String action2;
    String name;
    public Hamster (){
        this.type="воздухоплавающие ";
        this.action1="надвигаются ";
        this.action2="загипнотизировали ";
        this.name="грызуны ";
    }
    public String performAction(){
        return (action1+type+name+action2+Artur.name);
    }
}
