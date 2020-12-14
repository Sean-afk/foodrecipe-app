package com.example.recipieapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TwoLineListItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipies> recipes1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Recipies>recipes1 = new ArrayList<>();
       recipes1.add(new Recipies("Burger","Beef","Method","A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, smoked or flame broiled. Hamburgers are often served with cheese, lettuce, tomato, onion, pickles, bacon, or chiles; condiments such as ketchup, mustard, mayonnaise, relish, or a \"special sauce\", often a variation of Thousand Island dressing; and are frequently placed on sesame seed buns. A hamburger topped with cheese is called a cheeseburger.\n"+
               "The term \"burger\" can also be applied to the meat patty on its own, especially in the United Kingdom, where the term \"patty\" is rarely used, or the term can even refer simply to ground beef. Since the term hamburger usually implies beef, for clarity \"burger\" may be prefixed with the type of meat or meat substitute used, as in beef burger, turkey burger, bison burger, or veggie burger.\n" +
               "Hamburgers are sold at fast-food restaurants, diners, and specialty and high-end restaurants. There are many international and regional variations of the hamburger.\n" +
               "\nThe term hamburger originally derives from Hamburg, Germany's second-largest city. Hamburger in German is the demonym of Hamburg, similar to frankfurter and wiener, names for other meat-based foods and demonyms of the cities of Frankfurt and Vienna (in German Wien) respectively.\n"+
               "By back-formation, the term \"burger\" eventually became a self-standing word that is associated with many different types of sandwiches, similar to a (ground meat) hamburger, but made of different meats such as buffalo in the buffalo burger, venison, kangaroo, chicken, turkey, elk, lamb or fish like salmon in the salmon burger, but even with meatless sandwiches as is the case of the veggie burger.",R.drawable.burger));
        recipes1.add(new Recipies("Pizza","none","Method","Pizza (Italian: [ˈpittsa], Neapolitan: [ˈpittsə]) is a savory dish of Italian origin consisting of a usually round, flattened base of leavened wheat-based dough topped with tomatoes, cheese, and often various other ingredients (such as anchovies, mushrooms, onions, olives, pineapple, meat, etc.), which is then baked at a high temperature, traditionally in a wood-fired oven. A small pizza is sometimes called a pizzetta. A person who makes pizza is known as a pizzaiolo.\n" +
                "In Italy, pizza served in formal settings, such as at a restaurant, is presented unsliced, and is eaten with the use of a knife and fork. In casual settings, however, it is cut into wedges to be eaten while held in the hand.\n" +
                "The term pizza was first recorded in the 10th century in a Latin manuscript from the Southern Italian town of Gaeta in Lazio, on the border with Campania. Modern pizza was invented in Naples, and the dish and its variants have since become popular in many countries. It has become one of the most popular foods in the world and a common fast food item in Europe and North America, available at pizzerias (restaurants specializing in pizza), restaurants offering Mediterranean cuisine, and via pizza delivery. Many companies sell ready-baked frozen pizzas to be reheated in an ordinary home oven.\n" +
                "The Associazione Verace Pizza Napoletana (lit. True Neapolitan Pizza Association) is a non-profit organization founded in 1984 with headquarters in Naples that aims to promote traditional Neapolitan pizza. In 2009, upon Italy's request, Neapolitan pizza was registered with the European Union as a Traditional Speciality Guaranteed dish, and in 2017 the art of its making was included on UNESCO's list of intangible cultural heritage",R.drawable.pizza));

        recipes1.add(new Recipies("Donut","1 c. whole milk" +
                "1/4 c. plus 1 tsp. granulated sugar, divided" +
                "1 packet (or 2 1/4 tsp.) active dry yeast " +
                "4 c. all-purpose flour, plus more if needed" +
                "1/2 tsp. kosher salt" +
                "6 tbsp. melted butter" +
                "2 large eggs" +
                "1/2 tsp. pure vanilla extract" +
                "Canola or vegetable oil, for frying","Method","A doughnut or donut is a type of fried dough confection or dessert food. It is popular in many countries and is prepared in various forms as a sweet snack that can be homemade or purchased in bakeries, supermarkets, food stalls, and franchised specialty vendors.\n"+
                "Doughnuts are usually deep fried from a flour dough, and typically either ring-shaped or a number of shapes without a hole, and often filled, but can also be ball-shaped (\"doughnut holes\"). Other types of batters can also be used, and various toppings and flavorings are used for different types, such as sugar, chocolate, or maple glazing. Doughnuts may also include water, leavening, eggs, milk, sugar, oil, shortening, and natural or artificial flavors.",R.drawable.donut1));
        recipes1.add(new Recipies("Dosa","3 cups rice" +
                "1 cup urad daal (split, skinless black gram)" +
                "3/4 teaspoon fenugreek seeds" +
                "Salt (to taste)" +
                "Vegetable / canola / sunflower cooking oil","Method",
                "Wash the rice and urad daal well. Add the fenugreek seeds to the mix and fill enough water in the rice-daal bowl to cover them about 2-inch deep. Soak overnight.\n" +
                        "Put some cooking oil in a small bowl and keep ready. You will also need a bowl of ice cold water, a large, flat nonstick pan, 2 sheets of paper towel, a ladle, a spatula, and a basting brush.\n" +
                        "When the upper surface begins to look cooked (it will no longer look soft or runny), flip the dosa. By this time, ideally, the surface that was underneath should be light golden in color. Cook for 1 minute after flipping.\n" +
                        "The dosa is almost done. Fold it in half and allow to cook for 30 seconds more.",R.drawable.dosa1));
        recipes1.add(new Recipies("Pancake","1 1/4 cups milk" +
                "1 egg" +
                "3 tablespoons butter melted" +
                "1 1/2 cups all-purpose flour" +
                "3 1/2 teaspoons baking powder" +
                "1 teaspoon salt" +
                "1 tablespoon white sugar","Method",
                "In a large bowl, sift together the flour, baking powder, salt and sugar. Make a well in the center and pour in the milk, egg and melted butter; mix until smooth." +
                        "Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. Brown on both sides and serve hot.",R.drawable.pancakes));
        recipes1.add(new Recipies("Pasta","1 tsp oil" +
                "1 tsp butter" +
                "2 clove garlic, finely chopped" +
                "1 inch ginger, finely chopped" +
                "½ onion, finely chopped" +
                "1 cup tomato pulp" +
                "¼ tsp turmeric / haldi" +
                "½ tsp kashmiri red chilli powder" +
                "2 tbsp tomato sauce" +
                "½ tsp garam masala","Method",
                "firstly, saute 1 inch ginger and 2 clove garlic in 1 tsp oil and 1 tsp butter." +
                        "further saute ½ onion till they turn soft." +
                        "additionally add 1 cup tomato pulp and saute well." +
                        "keep stirring till the tomato pulp thickens." +
                        "now add ¼ tsp turmeric, ½ tsp chilli powder, ½ tsp garam masala and ½ tsp salt." +
                        "saute till the spices gets cooked completely." +
                        "now add 2 tbsp corn, ¼ capsicum, ¼ carrot, 2 tbsp peas and 7 florets broccoli. saute for a minute." +
                        "add in 3 tbsp water and mix well." +
                        "cover and simmer for 5 minutes." +
                        "now add in 2 tbsp tomato sauce and ½ tsp mixed herbs. mix well." +
                        "add in cooked pasta and mix gently till the sauce gets coated well." +
                        "finally, serve masala pasta indian style hot topped with cheese if required.",R.drawable.pasta1));

        recipes1.add(new Recipies("Chocolate Cake","2 cups all-purpose flour\n" +
                "2 cups sugar\n" +
                "3/4 cup unsweetened cocoa powder\n" +
                "2 teaspoons baking powder\n" +
                "1 1/2 teaspoons baking soda\n" +
                "1 teaspoon salt\n" +
                "1 teaspoon espresso powder homemade or store-bought\n" +
                "1 cup milk buttermilk, almond, or coconut milk\n" +
                "1/2 cup vegetable oil canola oil, or melted coconut oil\n" +
                "2 large eggs\n" +
                "2 teaspoons vanilla extract\n" +
                "1 cup boiling water","Method","Chocolate cake is made with chocolate. It can also include other ingredients. These include fudge, vanilla creme, and other sweeteners. The history of chocolate cake goes back to 1764, when Dr. James Baker discovered how to make chocolate by grinding cocoa beans between two massive circular millstones. In 1828, Coenraad van Houten of the Netherlands developed a mechanical extraction method for extracting the fat from cacao liquor resulting in cacao butter and the partly defatted cacao, a compacted mass of solids that could be sold as it was rock cacao or ground into powder. The processes transformed chocolate from an exclusive luxury to an inexpensive daily snack. A process for making silkier and smoother chocolate called conching was developed in 1879 by Rodolphe Lindt and made it easier to bake with chocolate, as it amalgamates smoothly and completely with cake batters. Until 1890 to 1900, chocolate recipes were mostly for chocolate drinks, and its presence in cakes was only in fillings and glazes. In 1886, American cooks began adding chocolate to the cake batter, to make the first chocolate cakes in the US",R.drawable.choco));


        recipes1.add(new Recipies("Chicken Roll","200 gm chopped into cubes chicken" +
                "1 medium chopped tomato" +
                "1/2 pinch red chilli powder" +
                "2 tablespoon vegetable oil" +
                "1/2 cut into strips cucumber" +
                "1/2 tablespoon chopped coriander leaves" +
                "1 large thinly sliced onion" +
                "2 medium chopped green chilli" +
                "2 pinches garam masala powder" +
                "1 lemon wedges" +
                "1 teaspoon tomato ketchup" +
                "1 tablespoon green chilli sauce","Method",
                "Chicken Roll is a delectable North Indian recipe made using all purpose flour, stir-fried chicken, yoghurt and a variety of vegetables rolled into paranthas. On days you do not want to prepare an elaborate meal, this delectable dish can be a saviour. Rolls are quite popular across India and they are often a favourite evening snack. Egg Roll, Kathi Kebab Roll, Mutton Roll, Paneer Roll, Potato Roll and even Fish Roll are among its many variations. This easy roll recipe is made using chicken and has the unforgettable aroma of Indian spices. You can also utilize your leftover parathas and chapatis in making this recipe. If you do not like to use all-purpose flour or maida, you can make it with whole wheat flour too. In fact, it can be made even with leftover chicken. All you have to ensure is that you use the right amount of spices so that the flavour is not lost. Easy to pack and carry, you can also take it to office or prepare it for picnics and day trips. A must try roll recipe for all chicken lovers!\n",R.drawable.chickenroll));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerview_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        androidx.appcompat.widget.SearchView searchView = (androidx.appcompat.widget.SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new androidx.appcompat.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                myAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

}