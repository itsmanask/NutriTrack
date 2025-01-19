//male_Joshi

package gender;
import java.util.*;

abstract class Diet_male
{
    abstract void provideDietPlan(); 
    abstract void provideSpecificDietPlan() ;
}



class Normal_male extends Diet_male
{
    
    @Override
    void provideDietPlan() 
    // provideDietPlan method is overridden
    {
        System.out.print("\n \t Normal Diet Plan:");
    }

    @Override
    void provideSpecificDietPlan()
    //provideSpecificDietPlan method is overridden
    {
    	Scanner sc=new Scanner(System.in);
    	  
	  	int attempts = 0;
	    while (attempts < 3) {
	        try {
	        	System.out.print("\n\nEnter 1 for weight gain, 2 for weight loss : ");
	        	int choice=sc.nextInt();

	  	  if(choice==1)
	  	  {
        System.out.print("\n\n For weight gain: \n Breakfast Options (8:00 am - 8:30 am):\r\n"
        		+ "1. Option 1: Two large whole wheat parathas stuffed with potatoes and served with yogurt.\r\n"
        		+ "2. Option 2: Vegetable oats porridge cooked in milk with nuts and fruits like bananas or apples.\r\n"
        		+ "3. Option 3: Poha (flattened rice) cooked with vegetables like peas, carrots, and bell peppers.\r\n"
        		+ "4. Option 4: Upma (semolina) with added vegetables like tomatoes, onions, and peas.\r\n"
        		+ "5. Option 5: Stuffed vegetable sandwich with whole grain bread, cucumber, tomatoes, and cheese.\r\n"
        		+ "6. Option 6: Three boiled eggs with two slices of whole wheat toast and a glass of milk.\r\n"
        		+ "7. Option 7: Idli or dosa with sambar and coconut chutney, accompanied by a glass of fresh juice.\r\n"
        		+ "8. Option 8: Fruit and nut smoothie with bananas, almonds, dates, and a scoop of protein powder.\r\n"
        		+ "\r\n"
        		+ "\nMid-Morning Snack Options (10:30 am - 11:00 am):\r\n"
        		+ "1. Option 1: Greek yogurt with honey and a handful of mixed nuts.\r\n"
        		+ "2. Option 2: Fruit salad with seasonal fruits like mangoes, apples, and oranges.\r\n"
        		+ "3. Option 3: Sprouts chaat with chopped onions, tomatoes, and a dash of lemon juice.\r\n"
        		+ "4. Option 4: Peanut butter sandwich on whole grain bread with a glass of milk.\r\n"
        		+ "5. Option 5: Boiled chickpeas (chana) with chaat masala and a sprinkle of lemon.\r\n"
        		+ "6. Option 6: Cottage cheese (paneer) cubes with cucumber and carrot sticks.\r\n"
        		+ "7. Option 7: Protein shake made with milk, bananas, almonds, and a spoonful of honey.\r\n"
        		+ "8. Option 8: Roasted chana dal with a mix of spices like cumin and coriander.\r\n"
        		+ "\r\n"
        		+ "\nLunch Options (1:00 pm - 1:30 pm):\r\n"
        		+ "1. Option 1: Chicken curry with brown rice or rotis, and a side of mixed vegetable salad.\r\n"
        		+ "2. Option 2: Rajma (kidney beans) or chole (chickpeas) curry with quinoa or whole wheat bread.\r\n"
        		+ "3. Option 3: Palak paneer (spinach with cottage cheese) with millet roti or naan.\r\n"
        		+ "4. Option 4: Egg curry with jeera (cumin) rice and a cucumber-tomato raita.\r\n"
        		+ "5. Option 5: Mixed dal (lentils) with a variety of vegetables, served with brown rice or whole wheat rotis.\r\n"
        		+ "6. Option 6: Fish curry with steamed rice and a side of stir-fried vegetables.\r\n"
        		+ "7. Option 7: Mushroom masala with chapatis or parathas and a green salad.\r\n"
        		+ "8. Option 8: Paneer tikka with mint chutney, whole grain bread, and a vegetable pulao.\r\n"
        		+ "\r\n"
        		+ "\nAfternoon Snack Options (4:00 pm - 4:30 pm):\r\n"
        		+ "1. Option 1: Banana or mango smoothie with oats, milk, and a scoop of protein powder.\r\n"
        		+ "2. Option 2: Whole grain crackers with hummus and cucumber slices.\r\n"
        		+ "3. Option 3: Boiled eggs (whites and yolks) with a sprinkle of black pepper and salt.\r\n"
        		+ "4. Option 4: Baked sweet potato wedges with a yogurt-based dip.\r\n"
        		+ "5. Option 5: Mixed nuts and dried fruits like almonds, cashews, and raisins.\r\n"
        		+ "6. Option 6: Chicken or paneer sandwich with lettuce, tomatoes, and mustard sauce.\r\n"
        		+ "7. Option 7: Vegetable soup with whole grain breadsticks or crackers.\r\n"
        		+ "8. Option 8: A small bowl of granola with yogurt and chopped fruits.\r\n"
        		+ "\r\n"
        		+ "\nDinner Options (7:00 pm - 8:00 pm):\r\n"
        		+ "1. Option 1: Mutton curry with brown rice or rotis and a side of cucumber-onion salad.\r\n"
        		+ "2. Option 2: Lentil soup (dal) with mixed vegetables and a serving of quinoa or barley.\r\n"
        		+ "3. Option 3: Grilled fish with steamed vegetables and whole wheat pasta or noodles.\r\n"
        		+ "4. Option 4: Chicken biryani made with brown rice and served with cucumber raita.\r\n"
        		+ "5. Option 5: Stuffed bell peppers with a mix of paneer, vegetables, and spices.\r\n"
        		+ "6. Option 6: Rajma chawal (kidney beans with rice) with a side of mixed pickle.\r\n"
        		+ "7. Option 7: Vegetable khichdi with a dollop of ghee and papad on the side.\r\n"
        		+ "8. Option 8: Tandoori chicken with mint chutney, rotis, and a vegetable salad.\r\n"
        		+ "\r\n"
        		+ "\nBedtime Snack Options (9:30 pm - 10:00 pm):\r\n"
        		+ "1. Option 1: Warm milk with a pinch of turmeric and a teaspoon of honey.\r\n"
        		+ "2. Option 2: A small bowl of low-fat yogurt with a sprinkle of flaxseeds or chia seeds.\r\n"
        		+ "3. Option 3: A handful of roasted chickpeas or peanuts.\r\n"
        		+ "4. Option 4: Cottage cheese (paneer) cubes with a slice of pineapple or melon.\r\n"
        		+ "5. Option 5: Whole grain crackers with cottage cheese spread and cucumber slices.\r\n"
        		+ "\n\nThank you for choosing NutriTrack");
        break;
    	}
    	else if(choice==2)
    	{
        System.out.print("\n\n For weight loss: \n Breakfast Options (8:00 am - 8:30 am):\r\n"
        		+ "1. Option 1: Vegetable oats upma with added carrots, peas, and beans.\r\n"
        		+ "2. Option 2: Two boiled eggs with a slice of whole wheat toast and a cup of green tea.\r\n"
        		+ "3. Option 3: Moong dal chilla (pancake) with mint-coriander chutney and a side of cucumber slices.\r\n"
        		+ "4. Option 4: Greek yogurt parfait with mixed berries and a sprinkle of flaxseeds.\r\n"
        		+ "5. Option 5: Quinoa porridge cooked in water or skimmed milk with nuts and cinnamon.\r\n"
        		+ "6. Option 6: Poha (flattened rice) cooked with onions, tomatoes, and curry leaves.\r\n"
        		+ "7. Option 7: Whole grain cereal with skim milk and a small portion of almonds or walnuts.\r\n"
        		+ "8. Option 8: Vegetable dalia (broken wheat) with a side of low-fat yogurt.\r\n"
        		+ "\r\n"
        		+ "\nMid-Morning Snack Options (10:30 am - 11:00 am):\r\n"
        		+ "1. Option 1: Green smoothie made with spinach, banana, almond milk, and chia seeds.\r\n"
        		+ "2. Option 2: Mixed fruit salad with a squeeze of lemon and a sprinkle of chaat masala.\r\n"
        		+ "3. Option 3: Boiled chickpeas (chana) seasoned with cumin and a dash of lemon juice.\r\n"
        		+ "4. Option 4: Greek yogurt with a spoonful of honey and a handful of mixed nuts.\r\n"
        		+ "5. Option 5: Cottage cheese (paneer) cubes with cucumber and carrot sticks.\r\n"
        		+ "6. Option 6: A small bowl of sprouts salad with tomatoes, onions, and coriander leaves.\r\n"
        		+ "7. Option 7: Baked sweet potato wedges with a yogurt-based dip.\r\n"
        		+ "8. Option 8: Boiled egg whites with a sprinkle of black pepper and a side of cucumber slices.\r\n"
        		+ "\r\n"
        		+ "\nLunch Options (1:00 pm - 1:30 pm):\r\n"
        		+ "1. Option 1: Grilled chicken breast with a side of quinoa or brown rice and steamed vegetables.\r\n"
        		+ "2. Option 2: Mixed dal (lentils) with a small portion of brown rice or whole wheat roti.\r\n"
        		+ "3. Option 3: Stir-fried tofu or paneer with broccoli, bell peppers, and a light soy sauce.\r\n"
        		+ "4. Option 4: Vegetable salad with boiled eggs, chickpeas, and a lemon-tahini dressing.\r\n"
        		+ "5. Option 5: Grilled fish with a side of quinoa salad and a cucumber raita.\r\n"
        		+ "6. Option 6: Lentil soup (dal) with a small serving of quinoa or barley and a green salad.\r\n"
        		+ "7. Option 7: Whole wheat pasta with marinara sauce and grilled vegetables.\r\n"
        		+ "8. Option 8: Chickpea (chana) salad with cucumbers, tomatoes, and a sprinkle of chaat masala.\r\n"
        		+ "\r\n"
        		+ "\nAfternoon Snack Options (4:00 pm - 4:30 pm):\r\n"
        		+ "1. Option 1: Protein shake made with skim milk, bananas, almonds, and a scoop of protein powder.\r\n"
        		+ "2. Option 2: Roasted chickpeas with cumin and paprika seasoning.\r\n"
        		+ "3. Option 3: Carrot sticks with hummus dip.\r\n"
        		+ "4. Option 4: Boiled edamame beans with a pinch of sea salt.\r\n"
        		+ "5. Option 5: Greek yogurt with a sprinkle of chia seeds and a few berries.\r\n"
        		+ "6. Option 6: Whole grain crackers with cottage cheese spread and cucumber slices.\r\n"
        		+ "7. Option 7: A small bowl of fruit chaat with a mix of seasonal fruits and a squeeze of lemon.\r\n"
        		+ "8. Option 8: Almonds or walnuts with a small piece of dark chocolate (70% cocoa or higher).\r\n"
        		+ "\r\n"
        		+ "\nDinner Options (7:00 pm - 8:00 pm):\r\n"
        		+ "1. Option 1: Grilled fish or chicken with a side of steamed vegetables and a small portion of quinoa.\r\n"
        		+ "2. Option 2: Stir-fried vegetables (broccoli, bell peppers, mushrooms) with tofu or paneer.\r\n"
        		+ "3. Option 3: Vegetable soup with a piece of whole wheat bread or a small serving of brown rice.\r\n"
        		+ "4. Option 4: Tofu or paneer curry with a side of sautéed greens and a small portion of whole wheat roti.\r\n"
        		+ "5. Option 5: Lentil soup (dal) with a side of mixed vegetable salad and a piece of whole grain bread.\r\n"
        		+ "6. Option 6: Grilled vegetable wrap with hummus and a side salad.\r\n"
        		+ "7. Option 7: Stuffed bell peppers with a mix of quinoa, vegetables, and spices.\r\n"
        		+ "8. Option 8: Chicken or paneer tikka with mint chutney, a portion of brown rice, and steamed broccoli.\r\n"
        		+ "\r\n"
        		+ "\nPro Tips for Weight Loss:\r\n"
        		+ "1. Stay hydrated by drinking plenty of water throughout the day.\r\n"
        		+ "2. Include fiber-rich foods like fruits, vegetables, and whole grains in your meals.\r\n"
        		+ "3. Limit your intake of sugary drinks, processed foods, and high-fat snacks.\r\n"
        		+ "4. Control portion sizes and practice mindful eating to avoid overeating.\r\n"
        		+ "5. Incorporate regular physical activity such as cardio, strength training, or yoga.\r\n"
        		+ "6. Get enough sleep each night to support your weight loss goals and overall well-being.\r\n"
        		+ "7. Monitor your progress regularly and make adjustments to your diet and exercise routine as needed.\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\n\nThank you for choosing NutriTrack");
        break;
    	}
    	else
    	{
    		System.out.println("Enter correct choice");
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
	  


class Thyroid_male extends Diet_male
{
    
    @Override
    void provideDietPlan() {
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
        System.out.print("\n\n For weight gain: \n Breakfast Options (8:00 am - 8:30 am):\r\n"
        		+ "1. Option 1: Paneer (cottage cheese) paratha with a side of curd and a glass of banana milkshake.\r\n"
        		+ "2. Option 2: Vegetable oats porridge cooked in milk with nuts and dried fruits.\r\n"
        		+ "3. Option 3: Quinoa upma with mixed vegetables and a glass of fresh fruit juice.\r\n"
        		+ "4. Option 4: Moong dal chilla (pancake) with mint-coriander chutney and a glass of almond milk.\r\n"
        		+ "5. Option 5: Stuffed whole wheat paratha with potatoes and a side of yogurt.\r\n"
        		+ "6. Option 6: Protein-rich smoothie with banana, peanut butter, and whey protein powder.\r\n"
        		+ "7. Option 7: Vegetable poha (flattened rice) cooked with onions, peas, and curry leaves.\r\n"
        		+ "8. Option 8: Ragi (finger millet) dosa with coconut chutney and a glass of buttermilk.\r\n"
        		+ "\r\n"
        		+ "\nMid-Morning Snack Options (10:30 am - 11:00 am):\r\n"
        		+ "1. Option 1: Greek yogurt with honey, mixed nuts, and dried fruits.\r\n"
        		+ "2. Option 2: Boiled eggs with a sprinkle of black salt and pepper.\r\n"
        		+ "3. Option 3: Banana or mango smoothie with a scoop of protein powder.\r\n"
        		+ "4. Option 4: Sprouts salad with cucumber, tomatoes, and lemon juice.\r\n"
        		+ "5. Option 5: Roasted chickpeas (chana) with chaat masala and a squeeze of lemon.\r\n"
        		+ "6. Option 6: Cottage cheese (paneer) cubes with pineapple slices.\r\n"
        		+ "7. Option 7: Almond butter on whole wheat toast with a glass of milk.\r\n"
        		+ "8. Option 8: Mixed fruit salad with a drizzle of honey and chia seeds.\r\n"
        		+ "\r\n"
        		+ "\nLunch Options (1:00 pm - 1:30 pm):\r\n"
        		+ "1. Option 1: Chicken curry with brown rice or roti and a side of mixed vegetable salad.\r\n"
        		+ "2. Option 2: Rajma (kidney beans) masala with quinoa or whole wheat bread and cucumber raita.\r\n"
        		+ "3. Option 3: Palak paneer (spinach and cottage cheese) with millet or sorghum roti and a bowl of dal.\r\n"
        		+ "4. Option 4: Stir-fried tofu or paneer with vegetables and a small portion of basmati rice.\r\n"
        		+ "5. Option 5: Fish curry with barley or amaranth roti and a side of green salad.\r\n"
        		+ "6. Option 6: Lentil soup (dal) with brown rice or whole wheat bread and a vegetable stir-fry.\r\n"
        		+ "7. Option 7: Chicken or paneer tikka with quinoa pilaf and mint chutney.\r\n"
        		+ "8. Option 8: Egg curry with whole wheat paratha or rice and cucumber-tomato salad.\r\n"
        		+ "\r\n"
        		+ "\nAfternoon Snack Options (4:00 pm - 4:30 pm):\r\n"
        		+ "1. Option 1: Protein shake made with milk, bananas, almonds, and oats.\r\n"
        		+ "2. Option 2: Avocado toast with a sprinkle of black pepper and lemon juice.\r\n"
        		+ "3. Option 3: Boiled edamame beans with a pinch of sea salt.\r\n"
        		+ "4. Option 4: Hummus with whole grain crackers or vegetable sticks.\r\n"
        		+ "5. Option 5: Cottage cheese (paneer) sandwich with cucumber and tomato slices.\r\n"
        		+ "6. Option 6: Baked sweet potato wedges with a yogurt-based dip.\r\n"
        		+ "7. Option 7: A small bowl of mixed nuts and seeds.\r\n"
        		+ "8. Option 8: Fruit smoothie with yogurt, chia seeds, and honey.\r\n"
        		+ "\r\n"
        		+ "\nDinner Options (7:00 pm - 8:00 pm):\r\n"
        		+ "1. Option 1: Grilled chicken or fish with quinoa or brown rice and sautéed vegetables.\r\n"
        		+ "2. Option 2: Vegetable khichdi with a side of curd or raita.\r\n"
        		+ "3. Option 3: Tofu or paneer curry with whole wheat roti or millet pulao.\r\n"
        		+ "4. Option 4: Spinach and mushroom stir-fry with barley or amaranth roti.\r\n"
        		+ "5. Option 5: Lentil soup (dal) with quinoa or sorghum roti and a green salad.\r\n"
        		+ "6. Option 6: Chickpea (chana) curry with whole grain bread or rice and cucumber-tomato salad.\r\n"
        		+ "7. Option 7: Stuffed bell peppers with quinoa or brown rice and a side of yogurt.\r\n"
        		+ "8. Option 8: Grilled vegetable wrap with hummus and a side of lentil soup.\r\n"
        		+ "\r\n"
        		+ "\nPro Tips for Weight Gain in Thyroid:\r\n"
        		+ "1. Focus on calorie-dense foods like nuts, seeds, dairy products, and healthy fats.\r\n"
        		+ "2. Include protein-rich foods in each meal to support muscle growth and weight gain.\r\n"
        		+ "3. Consume complex carbohydrates like whole grains, legumes, and root vegetables for sustained energy.\r\n"
        		+ "4. Stay hydrated by drinking enough water throughout the day.\r\n"
        		+ "5. Incorporate regular strength training exercises to build muscle mass.\r\n"
        		+ "6. Monitor thyroid hormone levels regularly and follow your doctor's recommendations.\r\n"
        		+ "7. Get enough sleep each night to support overall health and well-being.\r\n"
        		+ "\r\n"
        		+ "\nSuperfood Options to Reduce Thyroid Effects:\r\n"
        		+ "1. Seaweed: Rich in iodine, essential for thyroid function.\r\n"
        		+ "2. Brazil nuts: High in selenium, important for thyroid health.\r\n"
        		+ "3. Berries: Packed with antioxidants to reduce inflammation.\r\n"
        		+ "4. Greek yogurt: Good source of probiotics for gut health.\r\n"
        		+ "5. Spinach: Contains iron and vitamins crucial for thyroid function.\r\n"
        		+ "6. Flaxseeds: Provide omega-3 fatty acids for inflammation control.\r\n"
        		+ "7. Turmeric: Anti-inflammatory properties can benefit thyroid health.\r\n"
        		+ "8. Coconut oil: Medium-chain triglycerides (MCTs) ma\r\n"
        		+ "\n\nThank you for choosing NutriTrack");
        break;
    	}
    	else if(choice==2)
    	{
        System.out.print("\n\nFor weight loss: \n Breakfast Options (8:00 am - 8:30 am):\r\n"
        		+ "1. Option 1: Vegetable omelette with spinach, tomatoes, and mushrooms.\r\n"
        		+ "2. Option 2: Quinoa porridge cooked in water with almonds and a sprinkle of cinnamon.\r\n"
        		+ "3. Option 3: Greek yogurt with mixed berries and a teaspoon of flaxseeds.\r\n"
        		+ "4. Option 4: Moong dal chilla (pancake) with mint-coriander chutney and a side of cucumber slices.\r\n"
        		+ "5. Option 5: Whole wheat toast with avocado spread and boiled eggs.\r\n"
        		+ "6. Option 6: Vegetable dalia (broken wheat) with a side of low-fat yogurt.\r\n"
        		+ "7. Option 7: Protein smoothie with spinach, banana, and almond milk.\r\n"
        		+ "8. Option 8: Ragi (finger millet) dosa with coconut chutney and a glass of buttermilk.\r\n"
        		+ "\r\n"
        		+ "\nMid-Morning Snack Options (10:30 am - 11:00 am):\r\n"
        		+ "1. Option 1: Mixed fruit bowl with a squeeze of lemon and a sprinkle of chaat masala.\r\n"
        		+ "2. Option 2: Boiled chickpeas (chana) with a pinch of black salt and pepper.\r\n"
        		+ "3. Option 3: Greek yogurt with a spoonful of honey and a handful of mixed nuts.\r\n"
        		+ "4. Option 4: Carrot and cucumber sticks with hummus dip.\r\n"
        		+ "5. Option 5: Cottage cheese (paneer) cubes with cherry tomatoes.\r\n"
        		+ "6. Option 6: Almond butter on whole grain crackers.\r\n"
        		+ "7. Option 7: Sprouts salad with tomatoes, onions, and lemon juice.\r\n"
        		+ "8. Option 8: Whole grain toast with peanut butter and sliced banana.\r\n"
        		+ "\r\n"
        		+ "\nLunch Options (1:00 pm - 1:30 pm):\r\n"
        		+ "1. Option 1: Grilled chicken or fish with a side of steamed vegetables and quinoa.\r\n"
        		+ "2. Option 2: Mixed dal (lentils) with a small portion of brown rice or whole wheat roti.\r\n"
        		+ "3. Option 3: Stir-fried tofu or paneer with broccoli, bell peppers, and a light soy sauce.\r\n"
        		+ "4. Option 4: Chickpea (chana) salad with cucumbers, tomatoes, and a lemon-tahini dressing.\r\n"
        		+ "5. Option 5: Lentil soup (dal) with a side of quinoa or barley and a green salad.\r\n"
        		+ "6. Option 6: Grilled vegetable wrap with hummus and a side of lentil soup.\r\n"
        		+ "7. Option 7: Egg curry with whole wheat roti or brown rice and a cucumber raita.\r\n"
        		+ "8. Option 8: Stir-fried mushrooms with quinoa and a side of cucumber-tomato salad.\r\n"
        		+ "\r\n"
        		+ "\nAfternoon Snack Options (4:00 pm - 4:30 pm):\r\n"
        		+ "1. Option 1: Protein shake made with skim milk, bananas, almonds, and a scoop of protein powder.\r\n"
        		+ "2. Option 2: Roasted chickpeas (chana) with cumin and paprika seasoning.\r\n"
        		+ "3. Option 3: Whole grain crackers with cottage cheese (paneer) spread and cucumber slices.\r\n"
        		+ "4. Option 4: Green smoothie with spinach, kiwi, and coconut water.\r\n"
        		+ "5. Option 5: Boiled edamame beans with a pinch of sea salt.\r\n"
        		+ "6. Option 6: Greek yogurt with chia seeds and a few berries.\r\n"
        		+ "7. Option 7: Baked sweet potato wedges with a yogurt-based dip.\r\n"
        		+ "8. Option 8: Almonds or walnuts with a small piece of dark chocolate (70% cocoa or higher).\r\n"
        		+ "\r\n"
        		+ "\nDinner Options (7:00 pm - 8:00 pm):\r\n"
        		+ "1. Option 1: Grilled fish or tofu with roasted vegetables and a small portion of quinoa.\r\n"
        		+ "2. Option 2: Stir-fried vegetables (broccoli, bell peppers, mushrooms) with tofu or paneer.\r\n"
        		+ "3. Option 3: Lentil soup (dal) with a side of quinoa or brown rice and a green salad.\r\n"
        		+ "4. Option 4: Tofu or paneer curry with a side of sautéed greens and a small portion of whole wheat roti.\r\n"
        		+ "5. Option 5: Grilled chicken breast with steamed broccoli and a side of brown rice.\r\n"
        		+ "6. Option 6: Chickpea (chana) curry with whole grain bread or brown rice and a cucumber-tomato salad.\r\n"
        		+ "7. Option 7: Spinach and mushroom stir-fry with quinoa or barley.\r\n"
        		+ "8. Option 8: Vegetable khichdi with a side of yogurt or raita.\r\n"
        		+ "\r\n"
        		+ "\nPro Tips for Weight Loss in Thyroid:\r\n"
        		+ "1. Consume iodine-rich foods like seafood, dairy products, and iodized salt.\r\n"
        		+ "2. Include selenium sources such as Brazil nuts, sunflower seeds, and lentils.\r\n"
        		+ "3. Limit processed foods, refined sugars, and high-fat snacks.\r\n"
        		+ "4. Practice portion control and mindful eating to avoid overeating.\r\n"
        		+ "5. Engage in regular physical activity such as walking, yoga, or strength training.\r\n"
        		+ "6. Manage stress levels through relaxation techniques like meditation or deep breathing exercises.\r\n"
        		+ "7. Get regular check-ups and follow your doctor's advice for thyroid management.\r\n"
        		+ "\r\n"
        		+ "\nSuperfood Options to Reduce Thyroid Effects:\r\n"
        		+ "1. Seaweed: Rich in iodine, essential for thyroid function.\r\n"
        		+ "2. Brazil nuts: High in selenium, important for thyroid health.\r\n"
        		+ "3. Berries: Packed with antioxidants to reduce inflammation.\r\n"
        		+ "4. Greek yogurt: Good source of probiotics for gut health.\r\n"
        		+ "5. Spinach: Contains iron and vitamins crucial for thyroid function.\r\n"
        		+ "6. Flaxseeds: Provide omega-3 fatty acids for inflammation control.\r\n"
        		+ "7. Turmeric: Anti-inflammatory properties can benefit thyroid health.\r\n"
        		+ "8. Coconut oil: Medium-chain triglycerides (MCTs) may support thyroid function.\r\n"
        		+ "\r\n"
        		+ "\n\nThank you for choosing NutriTrack");
        break;
    	}
    	else
    	{
    		System.out.println("Enter correct input");
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

class Diabetes_male extends Diet_male  
{
    
    @Override
    void provideDietPlan() {
        System.out.print("\n \t Diabetes Diet Plan:");
    }

    
    @Override
    void provideSpecificDietPlan()
    {
        System.out.print("\n\n"
        		+ "Breakfast Options (8:00 am - 8:30 am):\r\n"
        		+ "1. Option 1: Vegetable dalia (broken wheat) cooked in water with mixed vegetables.\r\n"
        		+ "2. Option 2: Oats porridge made with milk or water, topped with almonds and flaxseeds.\r\n"
        		+ "3. Option 3: Moong dal chilla (pancake) with mint-coriander chutney and a side of cucumber slices.\r\n"
        		+ "4. Option 4: Greek yogurt with berries and a sprinkle of chia seeds.\r\n"
        		+ "5. Option 5: Whole wheat toast with avocado spread and boiled eggs.\r\n"
        		+ "6. Option 6: Vegetable upma with a side of low-fat yogurt.\r\n"
        		+ "7. Option 7: Protein smoothie with spinach, banana, and almond milk.\r\n"
        		+ "8. Option 8: Ragi (finger millet) dosa with coconut chutney and a glass of buttermilk.\r\n"
        		+ "\r\n"
        		+ "\nMid-Morning Snack Options (10:30 am - 11:00 am):\r\n"
        		+ "1. Option 1: Mixed fruit bowl with a sprinkle of cinnamon and a handful of nuts.\r\n"
        		+ "2. Option 2: Boiled chickpeas (chana) with a pinch of chaat masala and lemon juice.\r\n"
        		+ "3. Option 3: Greek yogurt with a spoonful of honey and a few almonds.\r\n"
        		+ "4. Option 4: Carrot and cucumber sticks with hummus dip.\r\n"
        		+ "5. Option 5: Cottage cheese (paneer) cubes with cherry tomatoes.\r\n"
        		+ "6. Option 6: Almond butter on whole grain crackers.\r\n"
        		+ "7. Option 7: Sprouts salad with tomatoes, onions, and lemon juice.\r\n"
        		+ "8. Option 8: Whole grain toast with peanut butter and sliced apple.\r\n"
        		+ "\r\n"
        		+ "\nLunch Options (1:00 pm - 1:30 pm):\r\n"
        		+ "1. Option 1: Grilled chicken or fish with a side of steamed vegetables and quinoa.\r\n"
        		+ "2. Option 2: Mixed dal (lentils) with a small portion of brown rice or whole wheat roti.\r\n"
        		+ "3. Option 3: Stir-fried tofu or paneer with broccoli, bell peppers, and a light soy sauce.\r\n"
        		+ "4. Option 4: Chickpea (chana) salad with cucumbers, tomatoes, and a lemon-tahini dressing.\r\n"
        		+ "5. Option 5: Lentil soup (dal) with a side of quinoa or barley and a green salad.\r\n"
        		+ "6. Option 6: Grilled vegetable wrap with hummus and a side of lentil soup.\r\n"
        		+ "7. Option 7: Egg curry with whole wheat roti or brown rice and a cucumber raita.\r\n"
        		+ "8. Option 8: Stir-fried mushrooms with quinoa and a side of cucumber-tomato salad.\r\n"
        		+ "\r\n"
        		+ "\nAfternoon Snack Options (4:00 pm - 4:30 pm):\r\n"
        		+ "1. Option 1: Protein shake made with skim milk, banana, almonds, and a scoop of protein powder.\r\n"
        		+ "2. Option 2: Roasted chickpeas (chana) with cumin and paprika seasoning.\r\n"
        		+ "3. Option 3: Whole grain crackers with cottage cheese (paneer) spread and cucumber slices.\r\n"
        		+ "4. Option 4: Green smoothie with spinach, mango, and coconut water.\r\n"
        		+ "5. Option 5: Boiled edamame beans with a pinch of sea salt.\r\n"
        		+ "6. Option 6: Greek yogurt with chia seeds and a few berries.\r\n"
        		+ "7. Option 7: Baked sweet potato wedges with a yogurt-based dip.\r\n"
        		+ "8. Option 8: Almonds or walnuts with a small piece of dark chocolate (70% cocoa or higher).\r\n"
        		+ "\r\n"
        		+ "\nDinner Options (7:00 pm - 8:00 pm):\r\n"
        		+ "1. Option 1: Grilled fish or tofu with roasted vegetables and a small portion of quinoa.\r\n"
        		+ "2. Option 2: Stir-fried vegetables (broccoli, bell peppers, mushrooms) with tofu or paneer.\r\n"
        		+ "3. Option 3: Lentil soup (dal) with a side of quinoa or brown rice and a green salad.\r\n"
        		+ "4. Option 4: Tofu or paneer curry with a side of sautéed greens and a small portion of whole wheat roti.\r\n"
        		+ "5. Option 5: Grilled chicken breast with steamed broccoli and a side of brown rice.\r\n"
        		+ "6. Option 6: Chickpea (chana) curry with whole grain bread or brown rice and a cucumber-tomato salad.\r\n"
        		+ "7. Option 7: Spinach and mushroom stir-fry with quinoa or barley.\r\n"
        		+ "8. Option 8: Vegetable khichdi with a side of yogurt or raita.\r\n"
        		+ "\r\n"
        		+ "\nPro Tips for Managing Diabetes:\r\n"
        		+ "1. Monitor blood sugar levels regularly and follow your healthcare provider's advice for medication and insulin if required.\r\n"
        		+ "2. Choose whole grains, legumes, and vegetables with a low glycemic index (GI) to help control blood sugar levels.\r\n"
        		+ "3. Incorporate lean protein sources like poultry, fish, tofu, and legumes into your meals for satiety and blood sugar management.\r\n"
        		+ "4. Include healthy fats such as avocados, nuts, seeds, and olive oil in moderation to support heart health and blood sugar control.\r\n"
        		+ "5. Portion control is key; aim for balanced meals with a mix of carbohydrates, proteins, and fats.\r\n"
        		+ "6. Stay physically active with regular exercise, such as walking, swimming, or yoga, to improve insulin sensitivity and overall health.\r\n"
        		+ "7. Manage stress levels through relaxation techniques like meditation, deep breathing exercises, or hobbies you enjoy.\r\n"
        		+ "\r\n"
        		+ "\nSuperfood Options to Reduce  Diabetes Effects:\r\n"
        		+ "1. Turmeric: Contains curcumin, which has anti-inflammatory and potential blood sugar-lowering effects.\r\n"
        		+ "2. Cinnamon: May help improve insulin sensitivity and lower blood sugar levels.\r\n"
        		+ "3. Fenugreek seeds: Rich in soluble fiber and may aid in blood sugar control.\r\n"
        		+ "4. Chia seeds: High in fiber and omega-3 fatty acids, beneficial for heart health and blood sugar management.\r\n"
        		+ "5. Berries (e.g., blueberries, strawberries): Packed with antioxidants and fiber, good for overall health and blood sugar control.\r\n"
        		+ "6. Leafy greens (e.g., spinach, kale): Low in calories and carbs, high in nutrients and antioxidants.\r\n"
        		+ "7. Flaxseeds: Rich in fiber and omega-3s, helpful for regulating blood sugar and promoting heart health.\r\n"
        		+ "8. Nuts (e.g., almonds, walnuts): Good sources of healthy fats, protein, and fiber, can be part of a balanced diabetic diet.\r\n"
        		+ "\n\nThank you for choosing NutriTrack");
    }
}


class Maintenance_male extends Diet_male
{
   
    @Override
    void provideSpecificDietPlan() {
        
        System.out.print("\n\n Breakfast Options (8:00 am - 8:30 am):\r\n"
        		+ "1. Option 1: Vegetable oats upma with added carrots, peas, and beans.\r\n"
        		+ "2. Option 2: Two boiled eggs with a slice of whole wheat toast and a cup of green tea.\r\n"
        		+ "3. Option 3: Moong dal chilla (pancake) with mint-coriander chutney and a side of cucumber slices.\r\n"
        		+ "4. Option 4: Greek yogurt parfait with mixed berries and a sprinkle of flaxseeds.\r\n"
        		+ "5. Option 5: Quinoa porridge cooked in water or skimmed milk with nuts and cinnamon.\r\n"
        		+ "6. Option 6: Poha (flattened rice) cooked with onions, tomatoes, and curry leaves.\r\n"
        		+ "7. Option 7: Whole grain cereal with skim milk and a small portion of almonds or walnuts.\r\n"
        		+ "8. Option 8: Vegetable dalia (broken wheat) with a side of low-fat yogurt.\r\n"
        		+ "\r\n"
        		+ "\nMid-Morning Snack Options (10:30 am - 11:00 am):\r\n"
        		+ "1. Option 1: Green smoothie made with spinach, banana, almond milk, and chia seeds.\r\n"
        		+ "2. Option 2: Mixed fruit salad with a squeeze of lemon and a sprinkle of chaat masala.\r\n"
        		+ "3. Option 3: Boiled chickpeas (chana) seasoned with cumin and a dash of lemon juice.\r\n"
        		+ "4. Option 4: Greek yogurt with a spoonful of honey and a handful of mixed nuts.\r\n"
        		+ "5. Option 5: Cottage cheese (paneer) cubes with cucumber and carrot sticks.\r\n"
        		+ "6. Option 6: A small bowl of sprouts salad with tomatoes, onions, and coriander leaves.\r\n"
        		+ "7. Option 7: Baked sweet potato wedges with a yogurt-based dip.\r\n"
        		+ "8. Option 8: Boiled egg whites with a sprinkle of black pepper and a side of cucumber slices.\r\n"
        		+ "\r\n"
        		+ "\nLunch Options (1:00 pm - 1:30 pm):\r\n"
        		+ "1. Option 1: Grilled chicken breast with a side of quinoa or brown rice and steamed vegetables.\r\n"
        		+ "2. Option 2: Mixed dal (lentils) with a small portion of brown rice or whole wheat roti.\r\n"
        		+ "3. Option 3: Stir-fried tofu or paneer with broccoli, bell peppers, and a light soy sauce.\r\n"
        		+ "4. Option 4: Vegetable salad with boiled eggs, chickpeas, and a lemon-tahini dressing.\r\n"
        		+ "5. Option 5: Grilled fish with a side of quinoa salad and a cucumber raita.\r\n"
        		+ "6. Option 6: Lentil soup (dal) with a small serving of quinoa or barley and a green salad.\r\n"
        		+ "7. Option 7: Whole wheat pasta with marinara sauce and grilled vegetables.\r\n"
        		+ "8. Option 8: Chickpea (chana) salad with cucumbers, tomatoes, and a sprinkle of chaat masala.\r\n"
        		+ "\r\n"
        		+ "\nAfternoon Snack Options (4:00 pm - 4:30 pm):\r\n"
        		+ "1. Option 1: Protein shake made with skim milk, bananas, almonds, and a scoop of protein powder.\r\n"
        		+ "2. Option 2: Roasted chickpeas with cumin and paprika seasoning.\r\n"
        		+ "3. Option 3: Carrot sticks with hummus dip.\r\n"
        		+ "4. Option 4: Boiled edamame beans with a pinch of sea salt.\r\n"
        		+ "5. Option 5: Greek yogurt with a sprinkle of chia seeds and a few berries.\r\n"
        		+ "6. Option 6: Whole grain crackers with cottage cheese spread and cucumber slices.\r\n"
        		+ "7. Option 7: A small bowl of fruit chaat with a mix of seasonal fruits and a squeeze of lemon.\r\n"
        		+ "8. Option 8: Almonds or walnuts with a small piece of dark chocolate (70% cocoa or higher).\r\n"
        		+ "\r\n"
        		+ "\nDinner Options (7:00 pm - 8:00 pm):\r\n"
        		+ "1. Option 1: Grilled fish or chicken with a side of steamed vegetables and a small portion of quinoa.\r\n"
        		+ "2. Option 2: Stir-fried vegetables (broccoli, bell peppers, mushrooms) with tofu or paneer.\r\n"
        		+ "3. Option 3: Vegetable soup with a piece of whole wheat bread or a small serving of brown rice.\r\n"
        		+ "4. Option 4: Tofu or paneer curry with a side of sautéed greens and a small portion of whole wheat roti.\r\n"
        		+ "5. Option 5: Lentil soup (dal) with a side of mixed vegetable salad and a piece of whole grain bread.\r\n"
        		+ "6. Option 6: Grilled vegetable wrap with hummus and a side salad.\r\n"
        		+ "7. Option 7: Stuffed bell peppers with a mix of quinoa, vegetables, and spices.\r\n"
        		+ "8. Option 8: Chicken or paneer tikka with mint chutney, a portion of brown rice, and steamed broccoli.\r\n"
        		+ "\r\n"
        		+ "\nPro Tips for Weight Maintenance:\r\n"
        		+ "1. Monitor portion sizes to ensure you're not overeating.\r\n"
        		+ "2. Include a variety of colorful fruits and vegetables in your meals for essential nutrients.\r\n"
        		+ "3. Limit processed foods, sugary snacks, and fried items.\r\n"
        		+ "4. Stay hydrated by drinking plenty of water throughout the day.\r\n"
        		+ "5. Engage in regular physical activity or exercise to support weight maintenance.\r\n"
        		+ "6. Practice mindful eating and listen to your body's hunger and fullness cues.\r\n"
        		+ "7. Get enough sleep each night to support overall health and well-being.\r\n"
        		+ "\n\nThank you for choosing NutriTrack");
    }
    void provideDietPlan() {
    	System.out.print("\n \t Maintenance Diet Plan:");
    }
}

public class male_Joshi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        while (attempts < 3) {
            try {
                System.out.println("\n 1. Press 1 for Normal diet.");
                System.out.println(" 2. Press 2 for Thyroid diet.");
                System.out.println(" 3. Press 3 for Diabetes diet.");
                System.out.println(" 4. Press 4 for Maintenance diet.");
                int ch = sc.nextInt();

                if (ch == 1) {
                    Diet_male normalDiet = new Normal_male();
                    normalDiet.provideDietPlan();
                    normalDiet.provideSpecificDietPlan();
                    break;
                } else if (ch == 2) {
                    Diet_male thyroidDiet = new Thyroid_male();
                    thyroidDiet.provideDietPlan();
                    thyroidDiet.provideSpecificDietPlan();
                    break;
                } else if (ch == 3) {
                    Diet_male diabetesDiet = new Diabetes_male();
                    diabetesDiet.provideDietPlan();
                    diabetesDiet.provideSpecificDietPlan();
                    break;
                } else if (ch == 4) {
                    Diet_male maintenanceDiet = new Maintenance_male();
                    maintenanceDiet.provideDietPlan();
                    maintenanceDiet.provideSpecificDietPlan();
                    break;
                } else {
                    System.out.println("\nInvalid Input. Please enter correct input.");
                    attempts++;
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage()+ " Please enter valid input");
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