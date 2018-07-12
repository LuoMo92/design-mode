package com.luomo.study.design.patten.memento;

import static com.luomo.study.design.patten.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-07-12.
 */
public class Role {

    private int vit = 100;
    private int atk = 100;
    private int def =100;

    public RoleMemento saveState() {
        return new RoleMemento(vit, atk, def);
    }

    public void recoveryState(RoleMemento roleMemento) {
        this.vit = roleMemento.getVit();
        this.atk = roleMemento.getAtk();
        this.def = roleMemento.getDef();
    }

    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public void showState() {
        print("生命力=" + vit);
        print("攻击力=" + atk);
        print("防御力=" + def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
