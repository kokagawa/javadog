package javadogs;

abstract class VirtualPet {
  String name;
  int maxEnergy;
  int energy;

  VirtualPet(String name, int maxEnergy, int energy) {
	  this.name = name;
	  this.maxEnergy = maxEnergy;
	  this.energy = energy;
	}


void sleep() {
	System.out.println(this.name + "：よく寝た。体力が回復したよ。");
	this.energy = this.maxEnergy;
}



void printinfo() {
	 System.out.println("[状態出力]");
	 System.out.println("名前：" + this.name);
	 System.out.println("最大体力：" + this.maxEnergy);
	 System.out.println("体力：" + this.energy);
}
abstract void move(); {}
}

class VirtualDog extends VirtualPet {
	VirtualDog(String name, int maxEnergy, int energy) {
		super(name, maxEnergy, energy);
	}
	void move() {
		if(this.energy < 10) {
			System.out.println(this.name + "：疲れちゃって、これ以上歩けないよ。");
		} else {
			System.out.println(this.name + "：歩いたよ。体力が１０減った。最大体力が１増えた。");
					this.energy -= 10;
					this.maxEnergy++;
		}
	}
}

class VirtualBird extends VirtualPet {
	VirtualBird(String name, int maxEnergy, int energy) {
		super(name, maxEnergy, energy);
	}
	void move() {
		if(this.energy < 10) {
			System.out.println(this.name + "：疲れちゃって、これ以上飛べないよ。");
		} else {
			System.out.println(this.name + "：パタパタ飛んだよ。体力が１０減った。最大体力が１増えた。");
					this.energy -= 10;
					this.maxEnergy++;
		}
	}
}

class VirtualMonkey extends VirtualPet {
	VirtualMonkey(String name, int maxEnergy, int energy) {
		super(name, maxEnergy, energy);
	}
	void move() {
		if(this.energy < 10) {
			System.out.println(this.name + "：疲れちゃって、これ以上登れないよ。");
		} else {
			System.out.println(this.name + "：木に登ったよ。体力が１０減った。最大体力が１増えた。");
					this.energy -= 10;
					this.maxEnergy++;
		}
	}
}

public class VirtualPetGame {
	public static void moveAndSleep(VirtualPet pet) {
		pet.move();
		pet.sleep();
	}
	public static void main(String[] args) {
       VirtualDog taro = new VirtualDog("タロ", 100, 50);
       VirtualBird piyo = new VirtualBird("ピヨ", 80, 40);
       VirtualMonkey saru = new VirtualMonkey("サル", 90 ,80);

       moveAndSleep(taro);
       moveAndSleep(piyo);
       moveAndSleep(saru);

}
}

interface Climbable {
	void climb();
}

