import java.util.Scanner;
public class ModChallenges
	{
		
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				int userChoice;
				do
					{
						System.out.println("Would you like to see 1) The Leap Year Challenge OR 2) FizzBuzz?");
						userChoice = userInput.nextInt();
						switch (userChoice)
						{
							case 1:
								leapYear();
								break;
							case 2:
								fizzBuzz();
								break;
							default:
								System.out.println("Please enter 1 or 2.");
								break;
						}
					}
				while(true);

			}
		public static void leapYear()
		{
			System.out.println("Hey, user! Enter a year and I'll tell you whether or not it's a leap year!");
			int testYear = userInput.nextInt();
			if ((testYear % 4 == 0) && !(testYear % 100 == 0))
				{
					System.out.println("That's a leap year!");
				}
			else if ((testYear % 100 == 0) && (testYear % 400 == 0))
				{
					System.out.println("That's a leap year on the turn of a century!");
				}
			else
				{
					System.out.println("That is not a leap year.");
				}
		}
		public static void fizzBuzz()
		{
			for (int i = 1; i <= 100; i++)
				{
					String str = "";
					int fizzOrBuzz = 0;
					if (i % 3 == 0)
						{
							str = str + "Fizz";
							fizzOrBuzz = fizzOrBuzz + 1;
						}
					if (i % 5 == 0)
						{
							str = str + "Buzz";
							fizzOrBuzz = fizzOrBuzz + 1;
						}
					if (fizzOrBuzz >= 1)
						{
							System.out.println(str);
						}
					else
						{
							System.out.println(i);
						}
				}
		}
	}
