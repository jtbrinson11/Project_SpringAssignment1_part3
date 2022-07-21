package org.SpringAssignment1_part3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
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
