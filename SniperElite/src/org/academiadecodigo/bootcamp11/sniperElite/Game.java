package org.academiadecodigo.bootcamp11.sniperElite;

/**
 * Created by codecadet on 29/09/17.
 */
public class Game {
    private GameObject[] gameObject;
    private SniperRifle sniperRifle;
    private int shotFired;
    private int target;
    private BarrelType barrelType;
    private int currentDamage;
    private Barrel barrel;

    public Game(int target) {
        this.target = target;
    }

    public void start() {
        this.sniperRifle = new SniperRifle(25, 500);
        createObjects(10);
        for (int i = 0; i < gameObject.length; i++) {

            if (gameObject[i] instanceof Enemy) {
                sniperRifle.shoot((Destroyble) gameObject[i]);
                gameObject[i].getMessage();

            }

        }
        shotFired = sniperRifle.getShoots();
        System.out.println(shotFired);

    }


    public void createObjects(int target) {
        gameObject = new GameObject[target];


        for (int i = 0; i < gameObject.length; i++) {

            int random = (int) (Math.random() * 10);
            System.out.println(random);

            if (random <= 2) {
                gameObject[i] = new Tree();
                System.out.println("Tree");
                continue;
            }
            if (random > 2 && random < 5) {
                gameObject[i] = new ArmouredEnemy(100, 100);
                System.out.println("Armoured Enemy");
                continue;
            }
            if (random > 5 && random < 8) {
                gameObject[i] = new SoldierEnemy(100);
                System.out.println("Soldier Enemy");
                continue;
            }
            if (random >= 8) {
               gameObject[i]=new Barrel(barrelType);
                System.out.println("barrel");
                }
            }

        }


    }


