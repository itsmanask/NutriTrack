//other_Deshpande

package gender;

class Diet_plan
{
	protected void diet_plan_header()
	{
		System.out.println("Diet plan as follows: ");
	}
}
public class other_Deshpande extends Diet_plan
{
    public void main(String[] args)
    {
    	super.diet_plan_header();
        System.out.println("\n" +
                "Breakfast (7:00 AM):\n" +
                "- Oatmeal topped with fresh berries and a sprinkle of nuts or seeds\n" +
                "- A glass of orange juice or a piece of whole fruit\n" +
                "\n" +
                "Mid-Morning Snack (10:00 AM):\n" +
                "- Greek yogurt with a drizzle of honey and a handful of almonds\n" +
                "\n" +
                "Lunch (12:30 PM):\n" +
                "- Grilled chicken or tofu salad with mixed greens, cherry tomatoes, cucumber, bell peppers, and a vinaigrette dressing\n" +
                "- A whole grain roll or a small serving of quinoa\n" +
                "\n" +
                "Afternoon Snack (3:00 PM):\n" +
                "- Sliced apple with peanut butter or a small handful of carrot sticks with hummus\n" +
                "\n" +
                "Dinner (6:30 PM):\n" +
                "- Baked salmon with roasted sweet potatoes and steamed broccoli\n" +
                "- A side salad with mixed greens, avocado, and balsamic vinaigrette\n" +
                "\n" +
                "Evening Snack (8:30 PM):\n" +
                "- A small bowl of mixed berries or a piece of dark chocolate\n" +
                "\n Thank you for choosing NutriTrack.");
    }
}