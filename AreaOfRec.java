package st;

	class Shape {
		
	   public double getArea() {
	        return 0; // Default implementation, overridden in subclasses
	    }
	}

	class Rectangle extends Shape {
	    private double length;
	    private double width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public double getArea() {
	        return length * width;
	    }
	}

	 class AreaOfRec {
	    public static void main(String[] args) {
	        AreaOfRec rectangle = new AreaOfRec();
	        System.out.println("Area of rectangle: " + rectangle.getArea());
	    }

		private String getArea() {
			// TODO Auto-generated method stub
			return null;
		}

		
	}


