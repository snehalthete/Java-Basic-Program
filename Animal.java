package st;

	class AnimalMoves {
	    public void move() {
	        System.out.println("Animal moves");
	    }
	}

	class Cheetah extends Animal {
	    @Override
	    public void move() {
	        System.out.println("Cheetah runs");
	    }
	}

	 class Animal {
	    public static void main(String[] args) {
	        AnimalMoves animal = new AnimalMoves();
	        Cheetah cheetah = new Cheetah();

	        animal.move(); // Output: Animal moves
	        cheetah.move(); // Output: Cheetah runs
	    }

		public void move() {
			// TODO Auto-generated method stub
			
		}

		public void makeSound() {
			// TODO Auto-generated method stub
			
		}
	}


