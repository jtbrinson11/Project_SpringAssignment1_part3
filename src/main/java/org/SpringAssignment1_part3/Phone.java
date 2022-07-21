package org.SpringAssignment1_part2;

import org.springframework.stereotype.Component;

@Component
public class Phone {

    private String mob;

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }

    public Phone() {
        mob = "1122334455";
    }

    public Phone(String mob) {
        this.mob = mob;
    }
}
