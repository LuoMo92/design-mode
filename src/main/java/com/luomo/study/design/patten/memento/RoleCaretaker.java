package com.luomo.study.design.patten.memento;

/**
 * @author LiuMei
 * @date 2018-07-12.
 */
public class RoleCaretaker {

    private RoleMemento roleMemento;

    public RoleMemento getRoleMemento() {
        return roleMemento;
    }

    public void setRoleMemento(RoleMemento roleMemento) {
        this.roleMemento = roleMemento;
    }
}
