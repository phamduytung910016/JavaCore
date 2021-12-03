package entity;

import java.util.Random;

public abstract class Bee {
    private String type;
    private int health;
    private boolean alive;

    public Bee() {
        //khởi tạo giá trị ban đầu mỗi khi một đối tượng bee được tạo ra
        this.health = 100;
        this.alive = true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;

        this.updateStatus();
    }

    protected void updateStatus(){
        //update the alive status when the health value changed
        if("Queen".equals(this.type)){
            if(getHealth() < 20){
                this.alive = false;
            }
        }else if("Drone".equals(this.type)){
            if(getHealth() < 50){
                this.alive = false;
            }
        }else if("Worker".equals(this.type)){
            this.alive = false;
        }
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        String beeDetails = this.getType() + "\t" + this.getHealth()
                + "\t" + (isAlive() == true ? "alive" : "deadth");
        return beeDetails;
    }

    public void damage(){
        if(this.isAlive()){
            Random random = new Random();
            int damageAmount = random.nextInt(100) + 1;
            int delta = this.getHealth() - damageAmount;
            if(delta > 0){
                this.setHealth(delta);
            }else {
                this.setHealth(0);
            }
        }
    }
}
