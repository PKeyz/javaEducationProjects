//10
//find all roots of a quadratic equation and print them using format() in Java.

//quadratic equation =  ax^2 + bx + c = 0
//calculating root x= (-b +- sqrt(b^2 - 4ac)) / (2a)

/* 
    determinant = (b^2 -4ac)
    if det > 0, roots are real and different
    if det == 0, roots are real and equal
    if det < 0, roots are complex and different 

*/

public class FindRoots10
{
    public static void main(String[] args)
    {
        //value a,b,c
        double a = 2.3, b = 4, c = 5.6;
        double root1, root2;

        //calculate the determinant (b^2 - 4ac)
        double determinant = b * b - 4 * a * c;

        //check if determinant is greater than 0
        if (determinant > 0)
        {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f",root1,root2);
        }

        //check if determinant is equal to 0
        if (determinant == 0)
        {
            //two real and equal roots
            //det is equal to 0
            // so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f",root1,root2);
        }

        //if determinant is less than zero
        else
        {

            //roots are complex numbers and distinct

            double real = -b / (2 * a );
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f + %.2fi ", real, imaginary);
            System.out.format("root2 = %.2f - %.2fi ", real, imaginary);
        }
    }
}




// well yeah, I really have to level up my understanding of mathematics....