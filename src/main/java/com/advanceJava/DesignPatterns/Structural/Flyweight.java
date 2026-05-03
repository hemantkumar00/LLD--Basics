package com.advanceJava.DesignPatterns.Structural;

import java.util.HashMap;
import java.util.Map;


/*
 * Client code - The client code usually creates a bunch of pre-populated flyweights in the initialization stage of the application.
 */
public class Flyweight {
    static void main() {
        Bullet pistolBullet = new Bullet("Pistol");
        Bullet rifleBullet = new Bullet("Shark");
        Bullet sniperBullet = new Bullet("Sniper");
        BulletFactory bulletFactory = new BulletFactory();
        bulletFactory.addBullet(BulletType.PISTOL, pistolBullet);
        bulletFactory.addBullet(BulletType.RIFLE, rifleBullet);
        bulletFactory.addBullet(BulletType.SNIPER, sniperBullet);
        FlyingBullet flyingBullet1 = new FlyingBullet();
        flyingBullet1.bullet = bulletFactory.getBullet(BulletType.SNIPER);
        System.out.println(flyingBullet1.bullet);
        FlyingBullet flyingBullet2 = new FlyingBullet();
        flyingBullet2.bullet = bulletFactory.getBullet(BulletType.SNIPER);
        System.out.println(flyingBullet2.bullet);
    }
}

/*
 * Intrinsic state:- The intrinsic state is stored in the flyweight object.
 * It is independent of the flyweight's context and remains the same for all flyweight objects.
 */

class Bullet {
    String image;
    Bullet(String image) {
        this.image = image;
    }
}

/*
 * Extrinsic state:- The extrinsic state is stored or computed by client objects. It depends on the flyweight's context and changes with it.
 */

class FlyingBullet {
    double x;
    double y;
    double z;
    double radius;
    double direction;
    double speed;
    int status;
    int type;
    Bullet bullet;
}

/*
 * Flyweight factory:- The flyweight factory is responsible for creating and managing flyweight objects. It ensures that flyweights are shared properly.
 * When a client requests a flyweight, the flyweight factory either returns an existing instance or creates a new one, if it doesn't exist yet.
 */

class BulletFactory {
    private static final Map<BulletType, Bullet> bullets = new HashMap<>();

    public Bullet getBullet(BulletType type) {
        return bullets.get(type);
    }

    public void addBullet(BulletType type, Bullet bullet) {
        bullets.put(type, bullet);
    }
}

enum BulletType {
    PISTOL,
    RIFLE,
    SNIPER,
    SHOTGUN
}
