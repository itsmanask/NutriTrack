//female_Revati

package gender;


import java.util.Scanner;

abstract class Diet_female
{
	
  abstract void provideDietPlan();
  abstract void provideSpecificDietPlan();
}



class Normal_female extends Diet_female
{
  @Override
 
  void provideDietPlan() 
  {
      System.out.print("\n \t Normal Diet Plan:");
}

  @Override
  void provideSpecificDietPlan() 
  {
	  Scanner sc=new Scanner(System.in);
  	  
	  	int attempts = 0;
	    while (attempts < 3) {
	        try {
	        	System.out.print("\n\nEnter 1 for weight gain, 2 for weight loss : ");
	        	int choice=sc.nextInt();

	  	  if(choice==1)
	  	  {
  		System.out.print("\n\nEarly Morning (6:00 am - 6:30 am):\r\n"
  	      		+ "1. Option 1: Warm water with honey and lemon.\r\n"
  	      		+ "2. Option 2: 1 glass of milk with a banana.\r\n"
  	      		+ "\nBreakfast (8:00 am - 8:30 am):\r\n"
  	      		+ "1. Option 1: 1 bowl of oats porridge cooked in milk with nuts and dried fruits.\r\n"
  	      		+ "2. Option 2: 2-3 Parathas (whole wheat) with a side of curd or yogurt and 1 boiled egg.\r\n"
  	      		+ "3. Option 3: 2 stuffed whole wheat bread sandwiches with paneer or mashed avocado and veggies.\r\n"
  	      		+ "4. Option 4: Vegetable Upma with a side of coconut chutney and a glass of fresh juice.\r\n"
  	      		+ "5. Option 5: Moong dal chilla with green chutney and a glass of buttermilk.\r\n"
  	      		+ "\nMid-Morning Snack (10:30 am - 11:00 am):\r\n"
  	      		+ "1. Option 1: Banana or Mango Shake made with milk, nuts, and a scoop of protein powder.\r\n"
  	      		+ "2. Option 2: Greek yogurt with honey, nuts, and seeds.\r\n"
  	      		+ "3. Option 3: Vegetable or chicken soup with whole wheat bread.\r\n"
  	      		+ "4. Option 4: Sprouts salad with lemon juice, chopped onions, and tomatoes.\r\n"
  	      		+ "5. Option 5: A small bowl of mixed nuts and dried fruits.\r\n"
  	      		+ "\nLunch (1:00 pm - 1:30 pm):\r\n"
  	      		+ "1. Option 1: 2-3 Rotis or a generous portion of Rice with Chicken Curry or Paneer Curry and mixed vegetable\r\n"
  	      		+ "sabzi.\r\n"
  	      		+ "2. Option 2: Quinoa pulao with Rajma or Chickpea curry and cucumber raita.\r\n"
  	      		+ "3. Option 3: Whole wheat pasta with mixed veggies and grilled chicken or tofu.\r\n"
  	      		+ "4. Option 4: Stuffed capsicum with brown rice and dal.\r\n"
  	      		+ "5. Option 5: Dahi rice with aloo gobi sabzi and papad.\r\n"
  	      		+ "\nAfternoon Snack (4:00 pm - 4:30 pm):\r\n"
  	      		+ "1. Option 1: Fruit smoothie with yogurt, nuts, and seeds.\r\n"
  	      		+ "2. Option 2: Dhokla with mint chutney.\r\n"
  	      		+ "3. Option 3: Boiled eggs with whole wheat toast.\r\n"
  	      		+ "4. Option 4: Paneer tikka or grilled chicken skewers.\r\n"
  	      		+ "5. Option 5: Makhana (fox nuts) roasted with ghee and spices.\r\n"
  	      		+ "\nEvening Snack (6:00 pm - 6:30 pm):\r\n"
  	      		+ "1. Option 1: Veggie or chicken sandwich on whole wheat bread.\r\n"
  	      		+ "2. Option 2: Fruit chaat with a sprinkle of chaat masala and lemon juice.\r\n"
  	      		+ "3. Option 3: Vegetable or chicken momos with spicy dip.\r\n"
  	      		+ "4. Option 4: Whole wheat crackers with hummus.\r\n"
  	      		+ "5. Option 5: Boiled sweet corn with butter and spices.\r\n"
  	      		+ "\nDinner (8:00 pm - 8:30 pm):\r\n"
  	      		+ "1. Option 1: 2-3 Rotis or a serving of Rice with Fish Curry or Paneer Tikka Masala and stir-fried vegetables.\r\n"
  	      		+ "2. Option 2: Vegetable or chicken biryani with cucumber raita.\r\n"
  	      		+ "3. Option 3: Masoor dal with jeera rice and bhindi masala.\r\n"
  	      		+ "4. Option 4: Palak paneer with missi roti and salad.\r\n"
  	      		+ "5. Option 5: Vegetable khichdi with kadhi and papad.\r\n"
  	      		+ "\nBedtime (10:00 pm - 10:30 pm):\r\n"
  	      		+ "1. Option 1: Warm milk with a spoonful of ghee and a pinch of turmeric.\r\n"
  	      		+ "2. Option 2: A small bowl of cottage cheese (paneer) with honey or fruit compote.\r\n"
  	      		+ "Feel free to mix and match these options based on your preferences and dietary requirements. Additionally,\r\n"
  	      		+ "it's important to stay hydrated throughout the day by drinking plenty of water and fluids like coconut water or\r\n"
  	      		+ "herbal teas. Consult with a nutritionist or healthcare professional for personalized advice and adjustments to\r\n"
  	      		+ "this diet plan."
  	      		+ "\n\nThank you for choosing NutriTrack.");
  		break;
  	  }
  	  else if(choice==2)
  	  {
  		System.out.println("\nEarly Morning (6:00 am - 6:30 am):\r\n"
  	      		+ "1. Option 1: Warm water with lemon and honey.\r\n"
  	      		+ "2. Option 2: Green tea with a few almonds or walnuts.\r\n"
  	      		+ "3. Option 3: A glass of lukewarm water with apple cider vinegar.\r\n"

  	      		+ "\nBreakfast (8:00 am - 8:30 am):\r\n"
  	      		+ "1. Option 1: Vegetable dalia (broken wheat) upma.\r\n"
  	      		+ "2. Option 2: Oats porridge with fruits and nuts.\r\n"
  	      		+ "3. Option 3: Whole wheat toast with avocado and boiled egg.\r\n"
  	      		+ "4. Option 4: Moong dal chilla with mint chutney.\r\n"
  	      		+ "5. Option 5: Sprouts salad with a squeeze of lemon and chaat masala.\r\n"

  	      		+ "\nMid-Morning Snack (10:30 am - 11:00 am):\r\n"
  	      		+ "1. Option 1: Greek yogurt with berries and a sprinkle of flaxseeds.\r\n"
  	      		+ "2. Option 2: Fruit salad with a mix of seasonal fruits.\r\n"
  	      		+ "3. Option 3: Steamed corn or roasted makhana (fox nuts).\r\n"
  	      		+ "4. Option 4: Boiled egg whites with a dash of pepper.\r\n"
  	      		+ "5. Option 5: Vegetable soup or clear chicken soup.\r\n"

  	      		+ "\nLunch (1:00 pm - 1:30 pm):\r\n"
  	      		+ "1. Option 1: Grilled chicken or fish with quinoa and steamed vegetables.\r\n"
  	      		+ "2. Option 2: Dal tadka with 1-2 phulkas (whole wheat rotis) and cucumber raita.\r\n"
  	      		+ "3. Option 3: Brown rice with mixed vegetable curry and salad.\r\n"
  	      		+ "4. Option 4: Paneer bhurji with multigrain roti and green salad.\r\n"
  	      		+ "5. Option 5: Chickpea salad with a variety of veggies and a light dressing.\r\n"

  	      		+ "\nAfternoon Snack (4:00 pm - 4:30 pm):\r\n"
  	      		+ "1. Option 1: Smoothie with spinach, banana, almond milk, and chia seeds.\r\n"
  	      		+ "2. Option 2: Roasted chickpeas (chana) or peanuts.\r\n"
  	      		+ "3. Option 3: Cottage cheese (paneer) cubes with cucumber slices.\r\n"
  	      		+ "4. Option 4: Whole grain crackers with hummus or guacamole.\r\n"
  	      		+ "5. Option 5: Boiled edamame beans with a sprinkle of salt and pepper.\r\n"

  	      		+ "\nEvening Snack (6:00 pm - 6:30 pm):\r\n"
  	      		+ "1. Option 1: Green tea with a small handful of mixed nuts.\r\n"
  	      		+ "2. Option 2: Vegetable soup or clear broth.\r\n"
  	      		+ "3. Option 3: Baked sweet potato fries or carrot sticks with hummus.\r\n"
  	      		+ "4. Option 4: Roasted seaweed snacks.\r\n"
  	      		+ "5. Option 5: A small bowl of low-fat yogurt with berries.\r\n"

  	      		+ "\nDinner (8:00 pm - 8:30 pm):\r\n"
  	      		+ "1. Option 1: Grilled tofu or paneer tikka with stir-fried vegetables.\r\n"
  	      		+ "2. Option 2: Lentil soup (dal) with a side of sautéed greens and 1-2 phulkas.\r\n"
  	      		+ "3. Option 3: Quinoa pulao with mixed vegetable curry.\r\n"
  	      		+ "4. Option 4: Grilled fish with steamed broccoli and quinoa.\r\n"
  	      		+ "5. Option 5: Stir-fried tofu or chicken with bell peppers and brown rice.\r\n"

  	      		+ "\nBedtime (10:00 pm - 10:30 pm):\r\n"
  	      		+ "1. Option 1: A cup of chamomile tea or warm milk with a pinch of turmeric.\r\n"
  	      		+ "2. Option 2: A small bowl of cottage cheese (paneer) with a sprinkle of cinnamon.\r\n"
  	      		+ "\n\nThank you for choosing NutriTrack.");
  		break;
  	  }
  	  else
  	  {
  		  System.out.println("Enter correct input");
  		  sc.nextLine();
  		  attempts++;
  	  }
      
  }
        catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage()+ "\nPlease Enter correct input");
            sc.nextLine();
            attempts++;
        }
        finally
        {
        	if (attempts == 3) {
                System.out.println("\nMaximum attempts reached. Thank you for choosing NutriTrack");
                sc.close();
                System.exit(1);
        	}
}
    }
  }
}

class Thyroid_female extends Diet_female 
{
	  @Override
	  void provideDietPlan() 
	  {
	      System.out.print("\n \t Thyroid Diet Plan:");
	  }
	  
	  
	  @Override
	  void provideSpecificDietPlan() 
	  {
		
	  	Scanner sc=new Scanner(System.in);
	  	
	  	
	  	int attempts = 0;
	    while (attempts < 3) {
	        try {
	        	System.out.print("\n\nEnter 1 for weight gain, 2 for weight loss : ");
	        	int choice=sc.nextInt();
	  	
	  	if(choice==1){
	      System.out.print("\n\nEarly Morning (6:00 am - 6:30 am):\r\n"
	      		+ "1.	Warm water with a squeeze of lemon and a pinch of cinnamon.\r\n"
	      		+ "2.	Luke warm water boiled with overnight soaked fenugreek seeds / coriander seeds.\r\n"
	      		+ "3.	Eat 4 to 5 neem leaves / curry leaves empty stomach\r\n"
	      		+ "\r\n"
	      		+ "Breakfast (8:00 am - 8:30 am):\r\n"
	      		+ "1. 1 bowl of Oats Porridge cooked in water or low-fat milk with a handful of nuts and seeds.\r\n"
	      		+ "2. 1 boiled egg or 1 small bowl of low-fat yogurt.\r\n"
	      		+ "3. 1 glass of Green Tea or Herbal Tea.\r\n"
	      		+ "\r\n"
	      		+ "Mid-Morning Snack (10:30 am - 11:00 am):\r\n"
	      		+ "1. 1 medium-sized Apple or Pear.\r\n"
	      		+ "2. 5-6 Soaked Almonds or Walnuts.\r\n"
	      		+ "\r\n"
	      		+ "Lunch (1:00 pm - 1:30 pm):\r\n"
	      		+ "1. 2 Rotis or a small bowl of Brown Rice.\r\n"
	      		+ "2. 1 bowl of Mixed Vegetable Curry (avoiding cruciferous vegetables like cauliflower and broccoli).\r\n"
	      		+ "3. 1 small bowl of Dal (lentils) or Chicken Curry (preferably grilled or roasted).\r\n"
	      		+ "4. 1 serving of Cucumber and Tomato Salad with a dash of lemon juice.\r\n"
	      		+ "\r\n"
	      		+ "Afternoon Snack (4:00 pm - 4:30 pm):\r\n"
	      		+ "1. 1 cup of Green Tea or Herbal Tea.\r\n"
	      		+ "2. 1 small bowl of Sprouts Salad with onions, tomatoes, and chaat masala.\r\n"
	      		+ "\r\n"
	      		+ "Evening Snack (6:00 pm - 6:30 pm):\r\n"
	      		+ "1. 1 glass of Buttermilk (Chaas) with roasted cumin powder and mint leaves.\r\n"
	      		+ "2. 1 small bowl of Roasted Chickpeas (Chana) or Makhana (Foxnuts).\r\n"
	      		+ "\r\n"
	      		+ "Dinner (8:00 pm - 8:30 pm):\r\n"
	      		+ "1. 1 bowl of Vegetable Soup (made with non-cruciferous vegetables like carrots, spinach, and tomatoes).\r\n"
	      		+ "2. 1 small bowl of Grilled Fish or Tofu.\r\n"
	      		+ "3. 1 small bowl of Stir-fried Vegetables (avoiding cruciferous vegetables).\r\n"
	      		+ "4. 1 small bowl of Quinoa or Dalia (broken wheat).\r\n"
	      		+ "\r\n"
	      		+ "Bedtime (10:00 pm - 10:30 pm):\r\n"
	      		+ "1. 1 glass of Warm Turmeric Milk (made with low-fat milk).\r\n"
	      		+ "\r\n"
	      		+ "Additional Tips:\r\n"
	      		+ "- Include iodine-rich foods like fish, sea vegetables (like seaweed), and iodized salt in moderation.\r\n"
	      		+ "- Consume selenium-rich foods like Brazil nuts, sunflower seeds, and whole grains.\r\n"
	      		+ "- Limit processed foods, refined sugars, and trans fats in your diet.\r\n"
	      		+ "- Stay hydrated by drinking plenty of water throughout the day.\r\n"
	      		+ "- Engage in regular physical activity such as walking, yoga, or swimming to support weight loss and overall well-being.\r\n"
	      		+ "- Consult with a healthcare professional or nutritionist to monitor your thyroid levels and adjust your diet as needed.\r\n"
	      		+"\n\nThank you for choosing NutriTrack");
	      break;
	  }
	  	
	  	else if(choice==2)
		{
	    System.out.print("\n\nEarly Morning (6:00 am - 6:30 am):\r\n"
	    		+ "1.	Warm water with honey and a pinch of cinnamon.\r\n"
	    		+ "2.	Luke warm water boiled with overnight soaked coriander seeds.\r\n"
	    		+ "3.	Eat 4 to 5 curry leaves empty stomach.\r\n"
	    		+ "\r\n"
	    		+ "Breakfast (8:00 am - 8:30 am):\r\n"
	    		+ "1. 1 bowl of Dalia (broken wheat) cooked in milk with nuts and dried fruits.\r\n"
	    		+ "2. 2-3 Parathas (stuffed with potatoes, paneer, or mixed vegetables) with a side of curd or yogurt.\r\n"
	    		+ "3. 1 glass of Fresh Fruit Juice (avoid straining for maximum fiber content).\r\n"
	    		+ "\r\n"
	    		+ "Mid-Morning Snack (10:30 am - 11:00 am):\r\n"
	    		+ "1. 1 Banana or Mango Shake made with milk, nuts, and a scoop of protein powder.\r\n"
	    		+ "2. 1 small bowl of Mixed Nuts (cashews, almonds, walnuts) and Seeds (sunflower, pumpkin).\r\n"
	    		+ "\r\n"
	    		+ "Lunch (1:00 pm - 1:30 pm):\r\n"
	    		+ "1. 2-3 Rotis or a generous portion of Rice with:\r\n"
	    		+ "   - 1 bowl of Chicken Curry or Paneer Curry or Rajma.\r\n"
	    		+ "   - 1 bowl of Mixed Vegetable Sabzi (include potatoes, peas, carrots, beans).\r\n"
	    		+ "   - 1 small bowl of Raita (made with full-fat yogurt).\r\n"
	    		+ "\r\n"
	    		+ "Afternoon Snack (4:00 pm - 4:30 pm):\r\n"
	    		+ "1. 1 glass of Banana or Mango Lassi (made with full-fat yogurt).\r\n"
	    		+ "2. 1 small bowl of Steamed Corn or Bhel Puri (without sev and excessive chutneys).\r\n"
	    		+ "\r\n"
	    		+ "Evening Snack (6:00 pm - 6:30 pm):\r\n"
	    		+ "1. 1 Veg Sandwich (whole wheat bread) with a filling of mashed avocado, cucumber, tomatoes, and cheese.\r\n"
	    		+ "2. 1 small bowl of Upma or Khichdi made with ghee and loaded with veggies.\r\n"
	    		+ "\r\n"
	    		+ "Dinner (8:00 pm - 8:30 pm):\r\n"
	    		+ "1. 2-3 Rotis or a serving of Rice with:\r\n"
	    		+ "   - 1 bowl of Egg Curry or Fish Curry or Paneer Curry.\r\n"
	    		+ "   - 1 bowl of Stir-fried Vegetables (broccoli, bell peppers, carrots) with tofu or paneer.\r\n"
	    		+ "   - 1 small bowl of Dal (lentils) or Chole (chickpeas) curry.\r\n"
	    		+ "\r\n"
	    		+ "Bedtime (10:00 pm - 10:30 pm):\r\n"
	    		+ "1. 1 glass of Warm Milk with a spoonful of ghee and a pinch of turmeric.\r\n"
	    		+ "\r\n"
	    		+ "Additional Tips:\r\n"
	    		+ "- Include healthy fats like ghee, nuts, seeds, and avocados in your meals.\r\n"
	    		+ "- Opt for whole grains like brown rice, whole wheat, and oats instead of refined grains.\r\n"
	    		+ "- Consume protein-rich foods such as eggs, chicken, fish, paneer, lentils, and beans.\r\n"
	    		+ "- Eat small, frequent meals throughout the day to increase calorie intake.\r\n"
	    		+ "- Stay hydrated by drinking enough water and fluids like coconut water, buttermilk, and herbal teas.\r\n"
	    		+ "- Incorporate strength training exercises into your fitness routine to promote muscle growth and weight gain.\r\n"
	    		+ "- Consult with a healthcare professional or nutritionist to create a personalized diet plan based on your specific needs and goals.\r\n"
	    		+"\n\nThank you for choosing NutriTrack");
	    break;
	}
	  	else
		{
			System.out.println("Please Enter correct input");
			attempts++;
		}
	  }
	        catch (Exception e) {
	            System.out.println("An exception occurred: " + e.getMessage()+ "\nPlease Enter correct input");
	            sc.nextLine();
	            attempts++;
	        }
	        finally
	        {
	        	if (attempts == 3) {
	                System.out.println("\nMaximum attempts reached. Thank you for choosing NutriTrack");
	                sc.close();
	                System.exit(1);
	        	}
	}
	    }
	  }
	}

class Diabetes_female extends Diet_female {
  @Override
 
  void provideDietPlan() {
      System.out.print("\n \t Diabetes Diet Plan:");
  }

  @Override
  void provideSpecificDietPlan() {
      System.out.print("\n\nType 1- Diabetes- Breakfast Options (8:00 am - 8:30 am):\r\n"
      		+ "1. Option 1: Vegetable omelette made with egg whites, spinach, tomatoes, and capsicum. Serve with whole\r\n"
      		+ "wheat toast.\r\n"
      		+ "2. Option 2: Quinoa porridge cooked in almond milk with sliced almonds and berries.\r\n"
      		+ "3. Option 3: Moong dal chilla (pancake) with mint chutney and a small bowl of low-fat yogurt.\r\n"
      		+ "4. Option 4: Whole wheat toast with avocado spread and boiled egg whites.\r\n"
      		+ "5. Option 5: Ragi (finger millet) dosa with coconut chutney and a small bowl of sambar.\r\n"
      		+ "6. Option 6: Methi (fenugreek) paratha with a side of low-fat curd and cucumber slices.\r\n"
      		+ "7. Option 7: Smoothie bowl with spinach, banana, almond milk, and chia seeds, topped with nuts and seeds.\r\n"
      		+ "8. Option 8: Low-sugar high-fiber cereal with milk and a serving of fresh fruit like apple or pear slices.\r\n"
      		+ "\nMid-Morning Snack Options (10:30 am - 11:00 am):\r\n"
      		+ "1. Option 1: Greek yogurt with a sprinkle of cinnamon and a handful of mixed nuts.\r\n"
      		+ "2. Option 2: Cottage cheese (paneer) cubes with cucumber and tomato slices.\r\n"
      		+ "3. Option 3: Roasted chana (chickpeas) with chaat masala and a squeeze of lemon.\r\n"
      		+ "4. Option 4: Boiled egg whites with a sprinkle of black pepper and a small fruit like orange or guava.\r\n"
      		+ "5. Option 5: Sugar-free peanut butter on whole grain crackers or celery sticks.\r\n"
      		+ "6. Option 6: Fresh vegetable sticks (carrots, bell peppers) with hummus dip.\r\n"
      		+ "7. Option 7: Almonds and walnuts mix with a few dried apricots or raisins.\r\n"
      		+ "8. Option 8: Sprouts salad with tomatoes, onions, and a dash of lemon juice.\r\n"
      		+ "\nLunch Options (1:00 pm - 1:30 pm):\r\n"
      		+ "1. Option 1: Grilled chicken or fish with a side of quinoa and stir-fried vegetables.\r\n"
      		+ "2. Option 2: Mixed dal (lentils) with a small portion of brown rice or roti, cucumber raita, and salad.\r\n"
      		+ "3. Option 3: Palak paneer (spinach with cottage cheese) with whole wheat roti or millet roti.\r\n"
      		+ "4. Option 4: Chickpea salad with cucumbers, tomatoes, onions, and a lemon-tahini dressing.\r\n"
      		+ "5. Option 5: Tofu or paneer stir-fry with bell peppers, mushrooms, and a light soy sauce.\r\n"
      		+ "6. Option 6: Lentil soup (dal) with a side of quinoa or barley and a green salad.\r\n"
      		+ "7. Option 7: Whole wheat pasta with marinara sauce, grilled vegetables, and a sprinkle of parmesan cheese.\r\n"
      		+ "8. Option 8: Stuffed capsicum with a mix of vegetables and a side of curd.\r\n"
      		+ "\nAfternoon Snack Options (4:00 pm - 4:30 pm):\r\n"
      		+ "1. Option 1: Avocado slices on whole grain toast with a dash of pepper and salt.\r\n"
      		+ "2. Option 2: Low-sodium popcorn seasoned with nutritional yeast and a sprinkle of paprika.\r\n"
      		+ "3. Option 3: Baked sweet potato wedges with a Greek yogurt dip.\r\n"
      		+ "4. Option 4: Tomato and mozzarella cheese skewers with basil leaves and olive oil.\r\n"
      		+ "5. Option 5: Hummus with whole wheat pita bread and carrot sticks.\r\n"
      		+ "6. Option 6: Boiled edamame beans with a pinch of sea salt.\r\n"
      		+ "7. Option 7: Low-fat cottage cheese (paneer) cubes with cherry tomatoes and basil leaves.\r\n"
      		+ "8. Option 8: A small bowl of fruit salad with a mix of berries, melons, and kiwi.\r\n"
      		+ "\nDinner Options (7:00 pm - 8:00 pm):\r\n"
      		+ "1. Option 1: Grilled tofu or paneer tikka with brown rice or quinoa and sautéed vegetables.\r\n"
      		+ "2. Option 2: Stir-fried vegetables (broccoli, bell peppers, carrots) with whole wheat noodles or brown rice.\r\n"
      		+ "3. Option 3: Fish curry with a side of millet or whole wheat roti and a cucumber-tomato salad.\r\n"
      		+ "4. Option 4: Egg curry with spinach and a small portion of jeera (cumin) rice.\r\n"
      		+ "5. Option 5: Vegetable khichdi made with moong dal and served with a cucumber-tomato salad.\r\n"
      		+ "6. Option 6: Stuffed bitter gourd (karela) with spiced mashed potatoes and a small serving of roti.\r\n"
      		+ "7. Option 7: Grilled chicken breast with roasted sweet potatoes and sautéed green beans.\r\n"
      		+ "8. Option 8: Spinach and mushroom risotto with a side of mixed greens salad.\r\n"
      		+ "\nBedtime Snack Options (9:30 pm - 10:00 pm):\r\n"
      		+ "1. Option 1: A small bowl of low-fat yogurt with a sprinkle of cinnamon and a few berries.\r\n"
      		+ "2. Option 2: A piece of dark chocolate (70% cocoa or higher) with a few almonds.\r\n"
      		+ "3. Option 3: A cup of herbal tea (like chamomile or peppermint) with a small biscuit or cracker.\r\n"
      		+ "4. Option 4: A small apple or pear with a tablespoon of almond butter.\r\n"
      		+ "5. Option 5: A handful of roasted pumpkin seeds or sunflower seeds.\r\n"
      		+ "This plan offers a variety of healthy options suitable for managing type 1 diabetes. Remember to monitor\r\n"
      		+ "blood sugar levels regularly and consult with a healthcare professional or dietitian for personalized guidance.\r\n"
      		+ "\nTYPE 2 DiabetesBreakfast Options (8:00 am - 8:30 am):\r\n"
      		+ "1. Option 1: Vegetable oats upma made with carrots, peas, and beans.\r\n"
      		+ "2. Option 2: Quinoa porridge cooked in almond milk with sliced almonds and berries.\r\n"
      		+ "3. Option 3: Moong dal chilla (pancake) with mint chutney and a small bowl of low-fat yogurt.\r\n"
      		+ "4. Option 4: Whole wheat toast with avocado spread and boiled egg whites.\r\n"
      		+ "5. Option 5: Ragi (finger millet) dosa with coconut chutney and a small bowl of sambar.\r\n"
      		+ "6. Option 6: Methi (fenugreek) paratha with a side of low-fat curd and cucumber slices.\r\n"
      		+ "7. Option 7: Smoothie bowl with spinach, banana, almond milk, and chia seeds, topped with nuts and seeds.\r\n"
      		+ "8. Option 8: Low-sugar high-fiber cereal with milk and a serving of fresh fruit like apple or pear slices.\r\n"
      		+ "\nMid-Morning Snack Options (10:30 am - 11:00 am):\r\n"
      		+ "1. Option 1: Greek yogurt with a sprinkle of cinnamon and a handful of mixed nuts.\r\n"
      		+ "2. Option 2: Cottage cheese (paneer) cubes with cucumber and tomato slices.\r\n"
      		+ "3. Option 3: Roasted chana (chickpeas) with chaat masala and a squeeze of lemon.\r\n"
      		+ "4. Option 4: Boiled egg whites with a sprinkle of black pepper and a small fruit like orange or guava.\r\n"
      		+ "5. Option 5: Sugar-free peanut butter on whole grain crackers or celery sticks.\r\n"
      		+ "6. Option 6: Fresh vegetable sticks (carrots, bell peppers) with hummus dip.\r\n"
      		+ "7. Option 7: Almonds and walnuts mix with a few dried apricots or raisins.\r\n"
      		+ "8. Option 8: Sprouts salad with tomatoes, onions, and a dash of lemon juice.\r\n"
      		+ "\nLunch Options (1:00 pm - 1:30 pm):\r\n"
      		+ "1. Option 1: Grilled chicken or fish with a side of quinoa and stir-fried vegetables.\r\n"
      		+ "2. Option 2: Mixed dal (lentils) with a small portion of brown rice or roti, cucumber raita, and salad.\r\n"
      		+ "3. Option 3: Palak paneer (spinach with cottage cheese) with whole wheat roti or millet roti.\r\n"
      		+ "4. Option 4: Chickpea salad with cucumbers, tomatoes, onions, and a lemon-tahini dressing.\r\n"
      		+ "5. Option 5: Tofu or paneer stir-fry with bell peppers, mushrooms, and a light soy sauce.\r\n"
      		+ "6. Option 6: Lentil soup (dal) with a side of quinoa or barley and a green salad.\r\n"
      		+ "7. Option 7: Whole wheat pasta with marinara sauce, grilled vegetables, and a sprinkle of parmesan cheese.\r\n"
      		+ "8. Option 8: Stuffed capsicum with a mix of vegetables and a side of curd.\r\n"
      		+ "\nAfternoon Snack Options (4:00 pm - 4:30 pm):\r\n"
      		+ "1. Option 1: Avocado slices on whole grain toast with a dash of pepper and salt.\r\n"
      		+ "2. Option 2: Low-sodium popcorn seasoned with nutritional yeast and a sprinkle of paprika.\r\n"
      		+ "3. Option 3: Baked sweet potato wedges with a Greek yogurt dip.\r\n"
      		+ "4. Option 4: Tomato and mozzarella cheese skewers with basil leaves and olive oil.\r\n"
      		+ "5. Option 5: Hummus with whole wheat pita bread and carrot sticks.\r\n"
      		+ "6. Option 6: Boiled edamame beans with a pinch of sea salt.\r\n"
      		+ "7. Option 7: Low-fat cottage cheese (paneer) cubes with cherry tomatoes and basil leaves.\r\n"
      		+ "8. Option 8: A small bowl of fruit salad with a mix of berries, melons, and kiwi.\r\n"
      		+ "\nDinner Options (7:00 pm - 8:00 pm):\r\n"
      		+ "1. Option 1: Grilled tofu or paneer tikka with brown rice or quinoa and sautéed vegetables.\r\n"
      		+ "2. Option 2: Stir-fried vegetables (broccoli, bell peppers, carrots) with whole wheat noodles or brown rice.\r\n"
      		+ "3. Option 3: Fish curry with a side of millet or whole wheat roti and a cucumber-tomato salad.\r\n"
      		+ "4. Option 4: Egg curry with spinach and a small portion of jeera (cumin) rice.\r\n"
      		+ "5. Option 5: Vegetable khichdi made with moong dal and served with a cucumber-tomato salad.\r\n"
      		+ "6. Option 6: Stuffed bitter gourd (karela) with spiced mashed potatoes and a small serving of roti.\r\n"
      		+ "7. Option 7: Grilled chicken breast with roasted sweet potatoes and sautéed green beans.\r\n"
      		+ "8. Option 8: Spinach and mushroom risotto with a side of mixed greens salad.\r\n"
      		+ "\nBedtime Snack Options (9:30 pm - 10:00 pm):\r\n"
      		+ "1. Option 1: A small bowl of low-fat yogurt with a sprinkle of cinnamon and a few berries.\r\n"
      		+ "2. Option 2: A piece of dark chocolate (70% cocoa or higher) with a few almonds.\r\n"
      		+ "3. Option 3: A cup of herbal tea (like chamomile or peppermint) with a small biscuit or cracker.\r\n"
      		+ "4. Option 4: A small apple or pear with a tablespoon of almond butter.\r\n"
      		+ "5. Option 5: A handful of roasted pumpkin seeds or sunflower seeds.\r\n"
      		+ "This diet plan provides a variety of nutritious options suitable for managing type 2 diabetes. It's important to\r\n"
      		+ "monitor blood sugar levels regularly and consult with a healthcare professional or dietitian for personalized\r\n"
      		+ "guidance."
      		+ "\n\nThank you for choosing NutriTrack.");
  }
}

class Pcod_female extends Diet_female {
  @Override
 
   void provideDietPlan() {
      System.out.print("\n \t PCOD Diet Plan:");
  }

  @Override
   void provideSpecificDietPlan() {
      System.out.println("\n\nEarly Morning (6:00 am - 6:30 am):\r\n"
      		+ "1. 1 glass of Warm Milk with a spoonful of honey and a few soaked almonds or walnuts.\r\n"
      		+ "2. Luke warm water with squeezed lemon , honey and cinnamon.\r\n"
      		+ "3. Luke warm water boiled with overnight soaked coriander seeds.\r\n"
      		+ "4. Eat 4 to 5 neem / curry leaves empty stomach\r\n"
      		+ "\nBreakfast (8:00 am - 8:30 am):\r\n"
      		+ "1. 1 large bowl of Poha (flattened rice) cooked with peanuts, peas, and potatoes.\r\n"
      		+ "2. 2 medium-sized Parathas (stuffed with paneer, potatoes, or mixed vegetables) with a side of curd or yogurt.\r\n"
      		+ "3. 1 glass of Fresh Fruit Juice (avoid straining for maximum fiber content).\r\n"
      		+ "\nMid-Morning Snack (10:30 am - 11:00 am):\r\n"
      		+ "1. 1 banana or mango shake made with milk, nuts, and a scoop of protein powder.\r\n"
      		+ "2. 1 small bowl of Dry Fruits (cashews, almonds, raisins) and seeds (sunflower, pumpkin).\r\n"
      		+ "\nLunch (1:00 pm - 1:30 pm):\r\n"
      		+ "1. 2-3 Rotis or a generous portion of Rice with:\r\n"
      		+ " - 1 bowl of Chicken Curry or Paneer Curry or Dal Tadka.\r\n"
      		+ " - 1 bowl of Mixed Vegetable Sabzi (include potatoes, peas, carrots, beans).\r\n"
      		+ " - 1 small bowl of Raita (made with full-fat yogurt).\r\n"
      		+ "\nAfternoon Snack (4:00 pm - 4:30 pm):\r\n"
      		+ "1. 1 glass of Buttermilk (Chaas) with a pinch of black salt and roasted cumin powder.\r\n"
      		+ "2. 1 bowl of Sprouted Moong Salad with chopped onions, tomatoes, and a squeeze of lemon.\r\n"
      		+ "\nEvening Snack (6:00 pm - 6:30 pm):\r\n"
      		+ "1. 1 Veg Sandwich (whole wheat bread) with a filling of mashed avocado, cucumber, tomatoes, and cheese.\r\n"
      		+ "2. 1 small bowl of Upma or Khichdi made with ghee and loaded with veggies.\r\n"
      		+ "\nDinner (8:00 pm - 8:30 pm):\r\n"
      		+ "1. 2-3 Rotis or a serving of Rice with:\r\n"
      		+ " - 1 bowl of Egg Curry or Fish Curry or Soybean Curry.\r\n"
      		+ " - 1 bowl of Mixed Vegetable Sabzi.\r\n"
      		+ " - 1 small bowl of Dal (lentils) or Rajma or Chickpeas curry.\r\n"
      		+ "\nBedtime (10:00 pm - 10:30 pm):\r\n"
      		+ "1. 1 glass of Warm Milk with a sprinkle of turmeric and a pinch of cinnamon.\r\n"
      		+ "\nAdditional Tips:\r\n"
      		+ "- Include healthy fats like ghee, nuts, seeds, and avocados in your meals.\r\n"
      		+ "- Opt for whole grains like brown rice, whole wheat, and oats instead of refined grains.\r\n"
      		+ "- Consume protein-rich foods such as eggs, chicken, fish, paneer, and lentils.\r\n"
      		+ "- Eat small, frequent meals throughout the day to increase calorie intake.\r\n"
      		+ "- Stay hydrated by drinking enough water and fluids like coconut water, buttermilk, and herbal teas.\r\n"
      		+ "- Incorporate strength training exercises into your fitness routine to promote muscle growth and weight gain.\r\n"
      		+ "- Consult with a healthcare professional or nutritionist to create a personalized diet plan based on your specific\r\n"
      		+ "needs and goals"
      		+ "\n\nThank you for choosing NutriTrack.");
  
}
}
class Maintenance_female extends Diet_female
{
   
    @Override
    void provideSpecificDietPlan() 
    {
        System.out.print("\n\nEarly Morning (6:00 am - 6:30 am):\r\n"
        		+ "1. Option 1: Warm water with lemon and honey.\r\n"
        		+ "2. Option 2: Herbal tea (like ginger tea or green tea) with a few almonds or walnuts.\r\n"
        		+ "3. Option 3: A glass of lukewarm water with apple cider vinegar.\r\n"
        		+ "\r\n"
        		+ "Breakfast (8:00 am - 8:30 am):\r\n"
        		+ "1. Option 1: Vegetable oats upma with a side of yogurt or buttermilk.\r\n"
        		+ "2. Option 2: Poha (flattened rice) cooked with vegetables and peanuts.\r\n"
        		+ "3. Option 3: Multigrain toast with scrambled eggs and a fruit salad.\r\n"
        		+ "4. Option 4: Ragi (finger millet) dosa with coconut chutney and sambar.\r\n"
        		+ "5. Option 5: Smoothie bowl with mixed fruits, yogurt, and granola topping.\r\n"
        		+ "\r\n"
        		+ "Mid-Morning Snack (10:30 am - 11:00 am):\r\n"
        		+ "1. Option 1: Fruit salad with a mix of seasonal fruits and a sprinkle of chaat masala.\r\n"
        		+ "2. Option 2: Sprouts salad with cucumber, tomatoes, and lemon dressing.\r\n"
        		+ "3. Option 3: Roasted chana (chickpeas) or makhana (fox nuts) with a hint of spices.\r\n"
        		+ "4. Option 4: Low-fat yogurt with chopped nuts and seeds.\r\n"
        		+ "5. Option 5: Vegetable clear soup or coconut water.\r\n"
        		+ "\r\n"
        		+ "Lunch (1:00 pm - 1:30 pm):\r\n"
        		+ "1. Option 1: Roti or phulka with a variety of vegetable curries like bhindi masala, aloo gobhi, and dal.\r\n"
        		+ "2. Option 2: Brown rice pulao with mixed vegetable raita and grilled chicken or paneer tikka.\r\n"
        		+ "3. Option 3: Quinoa salad with chickpeas, bell peppers, and a lemon-tahini dressing.\r\n"
        		+ "4. Option 4: Palak (spinach) paneer with whole wheat naan and cucumber-tomato salad.\r\n"
        		+ "5. Option 5: Steamed fish with stir-fried veggies and a small portion of steamed rice.\r\n"
        		+ "\r\n"
        		+ "Afternoon Snack (4:00 pm - 4:30 pm):\r\n"
        		+ "1. Option 1: Whole grain crackers with hummus or guacamole.\r\n"
        		+ "2. Option 2: Baked sweet potato wedges with mint yogurt dip.\r\n"
        		+ "3. Option 3: Boiled egg whites with a sprinkle of black pepper and chaat masala.\r\n"
        		+ "4. Option 4: Veggie sticks (carrots, cucumbers, bell peppers) with yogurt dip.\r\n"
        		+ "5. Option 5: Roasted chana chaat with onions, tomatoes, and a squeeze of lemon.\r\n"
        		+ "\r\n"
        		+ "Evening Snack (6:00 pm - 6:30 pm):\r\n"
        		+ "1. Option 1: Green tea with a small handful of mixed nuts.\r\n"
        		+ "2. Option 2: Fruit smoothie made with low-fat yogurt or milk and chia seeds.\r\n"
        		+ "3. Option 3: Grilled paneer or tofu skewers with mint chutney.\r\n"
        		+ "4. Option 4: Corn bhel made with boiled corn, onions, tomatoes, and tangy spices.\r\n"
        		+ "5. Option 5: Roasted bhel made with puffed rice, peanuts, and chopped veggies.\r\n"
        		+ "\r\n"
        		+ "Dinner (8:00 pm - 8:30 pm):\r\n"
        		+ "1. Option 1: Jowar (sorghum) roti with aloo baingan sabzi and cucumber raita.\r\n"
        		+ "2. Option 2: Lentil soup (dal) with a side of stir-fried veggies and quinoa.\r\n"
        		+ "3. Option 3: Whole wheat pasta with marinara sauce and a side of grilled vegetables.\r\n"
        		+ "4. Option 4: Vegetable khichdi made with moong dal and served with roasted papad.\r\n"
        		+ "5. Option 5: Tawa-paneer masala with multigrain chapati and a green salad.\r\n"
        		+ "\r\n"
        		+ "Bedtime (10:00 pm - 10:30 pm):\r\n"
        		+ "1. Option 1: A cup of chamomile tea or warm milk with a pinch of turmeric.\r\n"
        		+ "2. Option 2: A small bowl of low-fat yogurt or cottage cheese (paneer) with a sprinkle of cinnamon.\r\n"
        		+ "\r\n"
        		+ "\n\nThank you for choosing NutriTrack");
    }
    void provideDietPlan() {
        System.out.print("\n \t Maintenance Diet Plan:");
    }
}



public class female_Revati {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;
        boolean validInput = false;

        while (attempts < MAX_ATTEMPTS) {
            try {
                System.out.print("\n 1. Press 1 for Normal diet. \n 2. Press 2 for Thyroid diet. \n 3. Press 3 for Diabetes diet. \n 4. Press 4 for PCOD diet. \n 5. Press 5 for Maintenence Diet. \n\nEnter your choice: ");
                ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        Diet_female normalDiet = new Normal_female();
                        normalDiet.provideDietPlan();
                        normalDiet.provideSpecificDietPlan();
                        validInput = true;
                        break;
                        
                    case 2:
                        Diet_female thyroidDiet = new Thyroid_female();
                        thyroidDiet.provideDietPlan();
                        thyroidDiet.provideSpecificDietPlan();
                        validInput = true;
                        break;
                    case 3:
                        Diet_female diabetesDiet = new Diabetes_female();
                        diabetesDiet.provideDietPlan();
                        diabetesDiet.provideSpecificDietPlan();
                        validInput = true;
                        break;
                    case 4:
                        Diet_female pcodDiet = new Pcod_female();
                        pcodDiet.provideDietPlan();
                        pcodDiet.provideSpecificDietPlan();
                        validInput = true;
                        break;
                    case 5:
                        Diet_female maintenanceDiet = new Maintenance_female();
                        maintenanceDiet.provideDietPlan();
                        maintenanceDiet.provideSpecificDietPlan();
                        validInput = true;
                        break;
                    default:
                        System.out.println("\nInvalid input. Please enter a valid choice.");
                        attempts++;
                        break;
                }
                if (validInput) {
                    break; // Exit the loop if input is valid
                }
            } 
            catch (Exception e) 
            {
                System.out.println("\nError: Invalid input. Please enter a valid choice.");
                sc.nextLine();
                attempts++;
            }
            finally
            {
            	if (attempts == 3) 
            	{
                    System.out.println("\nMaximum attempts reached. Thank you for choosing NutriTrack.");
                    sc.close();
                    System.exit(1);
            	}
            	
        
    }
    }
}
}