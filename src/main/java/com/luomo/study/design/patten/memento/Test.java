package com.luomo.study.design.patten.memento;

/**
 * @author LiuMei
 * @date 2018-07-12.
 */
public class Test {

    public static void main(String[] args) {
        Role role = new Role();
        role.showState();

        RoleCaretaker roleCaretaker = new RoleCaretaker();
        roleCaretaker.setRoleMemento(role.saveState());

        role.fight();
        role.showState();
        
        role.recoveryState(roleCaretaker.getRoleMemento());
        role.showState();
    }

}
