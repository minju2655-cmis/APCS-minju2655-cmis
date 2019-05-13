import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MinJu extends Robot
{
    public MinJu(){
        super(Color.ORANGE);
    }
    
    public void init(){
        
    }
    
    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearLeft() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     */
    public void behave(){
        if (isClearRight()==true){
            right();
        }
        else if (isClearRight() == false) {
            while (isClearRight()==false){
                down();
            }
            while (isClearUp() == true && isClearRight() == false) {
                up();
            }
            while (isClearUp()==false && isClearRight() ==false){
                down();
            }
            while (isClearDown()==false && isClearRight()==false){
                up();
            }
        }
        else if (isClearUp() == false){
            while (isClearDown() == true && isClearRight() == false){
                down();
            }
            while (isClearRight()==false && isClearDown()==false){
                left();
            }
        }
        else if (isClearDown() == false){
            while (isClearLeft() == false){
                up();
            }
            while (isClearRight() == false){
                up();
            }
            while (isClearUp() == false){
                left();
            }
        }
        }
    }

