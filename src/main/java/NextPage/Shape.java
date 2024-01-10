package NextPage;
//Create an Interface 'Shape' with undefined methods as calculateArea and
//calculatePerimeter. Create 2 classes Circle & Square that implements
//functionality defined in the Shape Interface. Test your code.

   interface Shape{
       double calculateArea();
       double calculatePerimeter();
   }
   class Circle implements Shape{
       double radius;
       public Circle(double radius){
           this.radius=radius;
       }
       @Override
       public double calculateArea(){
           return Math.PI*radius;
       }

       @Override
       public double calculatePerimeter() {
           return 2*Math.PI*radius;
       }
   }
   class Square implements Shape{
       double side;
       public Square(Double side){
           this.side=side;
       }

       @Override
       public double calculateArea() {
           return side*side;
       }
       @Override
       public double calculatePerimeter(){
           return 4*side;
       }
   }

