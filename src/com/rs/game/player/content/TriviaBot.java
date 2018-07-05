package com.rs.game.player.content;

import java.util.Random;

import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.utils.Misc;

/**
 * @Author: Danny
 */
public class TriviaBot {
	
	
	private static String songs [][] = { 
		  {"I could stay awake, just to hear you breathin'", "I Don't Wanna Miss a Thing"},
		  {"Oh Mama Mia, Mama Mia, Mama Mia let me go!", "Bohemian Rhapsody"},
		  {"Lamborghini Mercy", "Mercy"},
		  {"Let's go to the beach beach, let's go get away", "Starships"},
		  {"I got sunshine, on a cloudy day", "My Girl"},
		  {"Move to the sound of my body", "Hips Don't Lie"},
		  {"Your poor little heart, will be all alone", "Runaway Baby"},
		  {"Went the distance, now I'm back on my feet", "Eye of the Tiger"},
		  {"Hey I just met you, and this is crazy", "Call Me Maybe"},
		  {"Let's take this back to straight Hip-Hop, and start it from scratch", "Berzerk"},
		  {"It goes one for the money, two for the show", "Go To Church"},
		  {"Put your weary head to rest, don't you cry no more", "Wayward Son"},
		  {"I got nine lives, cats eyes", "Back in Black"},
		  {"Rejoice every time you hear the sound of my voice", "When I'm Gone"},
		  {"My love, you'll never live without, I know you want me girl cause I can see you checking me out", "We Made You"},
		  {"Brings me back sweet childhood memories", "Sweet Child O' Mine"},
		  {"California, knows how to party", "California Love"},
		  {"Today is gonna be the day that they're gonna throw it back to you", "Wonderwall"},
		  {"I crashed my car into the bridge", "I Love It"},
		  {"Ah whimo whep ah whimo whep", "In The Jungle"},
		  {"And you can tell anybody, this is a song for you", "Your Song"},
		  {"So I set the world on fire, we can burn brighter than the sun", "We Are Young"},
		  {"I won't answer what you need answered", "I won Lucker"},
		  {"I've become so numb, I can't feel you there. Become so tired, so much more aware", "Numb"} };
	
	private static String puzzles [][] = { 
			  {"Figure out this anagram: 'Geertips'", "Prestige"},
			  {"Figure out this anagram: 'gjaojoen'", "jaejoong"},
			  {"Figure out this anagram: 'tcas'", "cats"},
			  {"Figure out this anagram: 'gdos'", "dogs"},
			  {"Figure out this anagram: 'obom'", "boom"},
			  {"Figure out this anagram: 'osetirot'", "Tortoise"},
			  {"Figure out this anagram, 'megldaono'","Megalodon"}, };
	
	private static String server [][] = { 
		  {"What is Innocent's Favourite kind of music?", "Dubstep"},
		  {"What was the first obsidian weapon Jagex released?", "Dark Dagger"},
		  {"What grants you the Fire Cape?", "Fight Caves"},
		  {"What is the worst update Jagex ever made?", "EOC"},
		  {"What is the maximum total level you can achieve?", "2496"},
		  {"What gaming genre is Runescape?", "MMORPG"},
		  {"In what year was Runescape established?", "1998"},
		  {"What is the max skill cap?", "99"},
		  {"How many portals are there at clan wars?", "3"},
		  {"What weapon is a Tormented Demon's weakness?", "Darklight"},
		  {"How many barrows brothers were there originally?", "6"},
		  {"In what year was the Duplication Glitch in Runescape?", "2003"},
		  {"What is the first ancient spell?", "Smoke Rush"},
		  {"What is the most powerful curse?", "Turmoil"},
		  {"How much of a percentage does a dragon dagger special require?", "25%"},
		  {"How much of a percentage does a Thok's sword special require?", "25%"},
		  {"What is the best free to play armour?", "Rune Armour"},
		  {"How much xp is required to achieve 120 Dungeoneering?", "104m"},
		  {"What do you receive when a fire disappears?", "Ashes"},
		  {"What is the name of the kiln cape?", "TokHaar-Kal"},
		  {"What is the maximum amount of xp you can gain per skill?", "200m"},
		  {"What colours is the Saradomin Flag? (3 Colours)", "Blue, White and Yellow"},
		  {"What colours is the zamorock Flag? (2 Colours)", "Black and Red"},
		  {"What colours is the Guthix Flag?", "Green"},
		  {"What prayer Level do you need to use Steel Skin?", "28"},
		  {"What is the Maxed level for Runescape in Evolution of Combat?", "200"},
		  {"What is King Black Dragons Combat Level", "276"},
		  {"What is the Maxed level for Runescape before Evolution of Combat?", "138"},
		  {"What attack level do you need to use an iron scimitar in Evolution of Combat?", "10"},
		  {"At what mining level can you mine Runite Ore?", "85"},
		  {"At what mining level can you mine Mithril Ore?", "55"},
		  {"At what mining level can you mine Adamantite Ore?", "70"},
		  {"At what mining level can you mine Gold Ore?", "40."},
		  {"At what fishing level can you fish Lobster?", "40"},
		  {"At what fishing level can you fish Sword Fish?", "50"},
		  {"At what fishing level can you fish Tuna?", "35."},
		  {"What Tool do you need to fish Lobster?", "Lobster Pot"},
		  {"What Tool do you need to fish Tuna?", "Harpoon"},
		  {"What Tool do you need to fish Sword Fish?", "Harpoon"},
		  {"What is the strongest Dungeoneering weapon type?", "Primal"},
		  {"What woodcutting level do you need to cut magic logs?", "75"},
		  {"What cooking level do you need to cook Rocktails?", "93"},
		  {"What Smithing level do you need to smith rune Warhammers?", "94"},
		  {"What bones give the most XP per bury?", "Frost Dragon Bones"},
		  {"What Summoning level do you need to use the TzRek Jad?", "99"},
		  {"What Summoning level do you need to summon the Fruit bat?", "69"},
		  {"What Slayer level do you need to fight Ganodermic beasts?", "95"},
		  {"What Sishing level do you need to fish manta rays?", "81"},
		  {"What Fletching level do you need to fletch Magic Shortbows?", "80"},
		  {"What Agility level do you need for advanced Barbarian outpost?", "90"},
		  {"What emote uses a cannon?", "Chaotic Cookery"},
		  {"What's the first four digits of a max stack?", "2147"},
		  {"What's all the digits of a max stack?", "2147483647"},
		  {"What Prayer level do you need for Turmoil?", "95"},
		  {"What does AGS stand for?", "Armadyl Godsword"},
		  {"What does BGS stand for?", "Bandos Godsword"},
		  {"What does SGS stand for?", "Saradomin Godsword"},
		  {"What does ZGS stand for?", "Zamorak Godsword"},
		  {"What's the strongest spirit shield type?", "Divine"},
		  {"What do you get from the recipe for disaster mini-game?", "Culinaromancer's Gloves"},
		  {"What's the Highest Slayer Master?", "Kuradal"},
		  {"What does SOF stand for?", "Squeal of Fortune"},
		  {"What weapon one hits almost anything?", "Deathtouched Dart"},
		  {"What aura gives you red wings?", "Corruption"},
		  {"What aura gives you white wings?", "Salvation"},
		  {"What aura gives you green wings?", "Harmony"},
		  {"What colour charm gives you the most xp?", "Blue"},
		  {"What type of Shield does General Graador Drop?", "Bandos Warshield"},
		  {"What currency is used to buy Chaotics?", "Dungeoneering Points"},
		  {"How much Mill do you need to make your cash turn Green?", "10m"},
		  {"What potion blocks dragonfire breath?", "Antifire Potion"},
		  {"Where is our current home located?", "Oo'glog"},
		  {"What boss drops off-hands?", "Blink"},
		  {"How many altars are there at home?", "6"},
		  {"How many cooking areas are there near home?", "1"},
		  {"What skill levels do you need to prestige?", "99"},
		  {"How many squeal of fortune spins can you vote for?", "5"},
		  {"What is the famous drop of most NPCs on this server?", "Ecto-Tokens"},
		  {"What's the hardest skill to get max level in?", "Dungeoneering"},
		  {"When should you help noobs?", "Always"},
		  {"At what level do noobs stop being noobs?", "50"},
		  {"What Rank is a gold Crown?", "Administrator"},
		  {"What Rank is a Silver Crown?", "Moderator"},
		  {"What Rank is an i?", "Support"},
		  {"What colour is regular donator?", "Red"},
		  {"What colour is extreme donator?", "Green"},
		  {"What colour is Legendary donator?", "Blue"},
		  {"What colour is Supreme donator?", "Orange"},
		  {"What colour is Divine donator?", "Purple"},
		  {"What colour is Angelic donator?", "White"},
		  {"What tokens do you get from voting?", "Vote Tokens"},
		  {"How many Dungeoneering points are needed to buy a Chaotic?", "200k"},
		  {"How many thieving stalls in total are there at home?", "5"},
		  {"What npc sells skillcapes?", "Wise old man"},
		  {"What was the best thing that ever happened to this server?", "Not Anthony"},
		  {"This server is coded in what language?", "Java"},
		  {"What is Rage-Scape's custom skill?", "Assassin"} };
	
	private static String general [][] = { 
		  {"Is a tomato a fruit or a vegetable?", "Fruit"},
		  {"How many legs does a spider have?", "8"},
		  {"What is 'K-pop'?", "Korean Pop"},
		  {"What is a fish?", "A Fish"},
		  {"What music genre goes wub wub wub?", "Dubstep"},
		  {"How many continents are there.", "7"},
		  {"How many bones are in a fully grown human?", "206"},
		  {"How Many wisdom teeth can grow in your mouth?", "4"},
		  {"What member of the Beatles was assassinated in 1980?","John Lennon"},
		  {"Who developed the ragtime jazz?", "Scott Joplin"},
		  {"What instrument did Louis Armstrong play?","Trumpet"},
		  {"I see trees of _____, red roses too..?","Green"},
		  {"Which popular singer was called 'The King of Rock 'N' Roll","Elvis Presley"},
		  {"Who created Charlie Brown Christmas?","Charles Schulz"},
		  {"Who directed Jaws?","Steven Speilberg"},
		  {"What movie was an American film version of a popular Swedish novel?","Girl With The Dragon Tattoo"},
		  {"When was the movie E.T. released?","1982"},
		  {"What animal is classed as the king of the ocean?","Great White Shark"},
		  {"What movie is about the earth going into an ice-age?","The Day After Tomorrow"},
		  {"Who is Batman's nemesis?","The Joker"},
		  {"What movie features Simba the lion?","The Lion King"},
		  {"What movie lets any crime alowed for 24 hours?","The Purge"},
		  {"Dont stop ____, just hold on to that feelin'!!","Believin"},
		  {"What number did Michael Jordan wear?","23"},
		  {"What type of fish is Nemo?","Clown fish"},
		  {"Who is the founder of Apple?","steve jobs"},
		  {"What is the best food ever", "Bacon"},
		  {"(5(x+6) - 2b(1 + 2) + 69) / (5x - 6b)?", "99"},
		  {"What is the best number?", "69"},
		  {"First one to answer 'with 1', wins!", "With 1"},
		  {"When is a cat not a cat?", "When It's a Dog"},
		  {"What doesn't yolo?", "A Cat"},
		  {"Honey Comb is to Half Baked as Chips is to ___________", "French Fries"},
		  {"What instrument does Nicki Minaj play?", "Vocals"},
		  {"What did Michael Jackson die from?", "Cardiac arrest"},
		  {"What Disease does Muhammad Ali have?", "Parkinson's"},
		  {"How do dolphins sleep?", "With one eye open"},
		  {"How do lizards communicate?", "Push Ups"},
		  {"Why are Flamingos pink?", "Because they eat shrimp"},
		  {"What percentage of a jellyfish is water?", "95%"},
		  {"How does a snail breathe?", "Its skin"},
		  {"Between Mayweather and Canelo, who won?", "Mayweather"},
		  {"What number is Lionel Messi?", "10"},
		  {"What is the longest word in English language without a vowel?", "rhythm"},
		  {"What was the last letter added to English alphabet?", "J"},
		  {"How many earth's would fit into the sun?", "1.3 million"},
		  {"The first pig's house was made out of?", "Straw"},
		  {"The second pig's house was made out of?", "Sticks"},
		  {"The third pig's house was made out of?", "Bricks"},
		  {"Who is the worst singer in the world?", "Justin  Bieber"},
		  {"What is the best crate?", "Death crate"},
		  {"Who is the most epic celebrity on this planet?", "Jennifer Lawrence"},
		  {"Who runs the Illuminati?", "Upside Down Emma Watson"},
		  {"Herp Derp...", "Derp Herp"},
		  {"What was the worst thing that happened in 2013?", "Miley Cyrus"},
		  {"What is the best bible?", "The Lad Bible"},
		  {"In which year did Michael Jackson release his single entitled Thriller?", "1984"},
		  {"What is the largest State in the USA?", "Alaska"},
		  {"Which spirit is typically used to make a Cuba Libre?", "Rum"},
		  {"Which famous actor starred in the series 'The Fresh Prince of Bel-Air'?", "Will Smith"},
		  {"Which spirit is typically mixed with orange juice to create the cocktail known as 'screwdriver'?", "Vodka"},
		  {"What is a barracuda?", "A fish"},
		  {"Who had a hit with 'Firework' in 2010?", "Katy Perry"},
		  {"What is the name of the planet that Superman comes from?", "Krypton"},
		  {"What colour is a New York taxi?", "Yellow"},
		  {"What is the biggest man-made structure on Earth?", "The Great Wall of China"},
		  {"Where does the president of the United States of America reside?", "The White House"},
		  {"Which country's flag features a maple leaf?", "Canada"},
		  {"In Roman numerals, what amount does the letter M equal?", "1000"},
		  {"What language is spoken in Austria?", "German"},
		  {"On a standard English language keyboard, what letter is located between E and T?", "R"},
		  {"Who's treasure was buried in Treasure Island?", "Captain Flint's"},
		  {"What is a Vixen?", "A female fox"},
		  {"How many cards are there in a pack of cards?", "52"},
		  {"Complete the film name 'Crouching Tiger Hidden ______", "Dragon"} };
	
	private static String movies [][] = { 
		  {"Oh no, Leonardo is sinking!", "Titanic"},
		  {"Wait, it's a dream?!?", "Inception"},
		  {"Pie, Boobs, and more!", "American Pie"},
		  {"This movie gives me a nightmare!", "Nightmare on Elm Street"},
		  {"Here's Johnny!", "The Shining"},
		  {"Retired and Extremely Dangerous.", "RED"},
		  {"Oh no, it's Jason with a machete!", "Friday the 13th"},
		  {"You don't want to swim in Cape Cod anymore.", "Jaws"},
		  {"So after all this, I'm the missing patient?", "Shutter Island"},
		  {"The greatest hiests of Boston.", "Town"},
		  {"The greatest parody including the movie Narnia.", "Epic Movie"},
		  {"The series of scary movie parodies.", "Scary Movie"},
		  {"*flicks lighter in attic*", "The Grudge"},
		  {"Too fast for you?", "Fast and Furious"},
		  {"The world is ending!", "2012"},
		  {"Tsunami survival and reuniting.", "The Impossible"},
		  {"Good old James Bond.", "007"} };
	
	private static String categories [][][] = { songs, puzzles, server, general, movies };
	
	public static int questionid = -1;
	public static int round = 0;
	public static boolean victory = false;
	public static int answers = 0;
	public static int category;

	public TriviaBot() {
		//TODO
	}
	
	public static void Run() {
		category = Misc.random(0, 4);
		int rand = RandomQuestion(category);
		questionid = rand;
		answers = 0;
		victory = false;
		String title = "Trivia";
		if (category == 0)
			title = "Name the Song";
		else if (category == 1)
			title = "Puzzles";
		else if (category == 2)
			title = "RuneScape/Server";
		else if (category == 3)
			title = "General Trivia";
		else if (category == 4)
			title = "Name the Movie";
		for(Player participant : World.getPlayers()) {
			if(participant == null)
				continue;
				participant.hasAnswered = false;
				participant.getPackets().sendGameMessage("<col=56A5EC>["+title+"] "+categories[category][rand][0]+"</col>");
		}
	}
	
	public static void sendRoundWinner(String winner, Player player) {
		for(Player participant : World.getPlayers()) {
			if(participant == null)
				continue;
			if (answers <= 5) {
				answers++;
				if (answers == 5)
					victory = true;
				player.TriviaPoints++;
				player.getPackets().sendGameMessage("<col=56A5EC>[Trivia] "+winner+", you now have "+player.TriviaPoints+" Trivia Points.</col>");
				player.hasAnswered = true;
				World.sendWorldMessage("<col=56A5EC>[Winner] <col=FF0000>"+ winner +"</col><col=56A5EC> answered the question correctly ("+answers+"/5)!</col>", false);
				return;
			}
		}
	}
	
	public static void verifyAnswer(final Player player, String answer) {
		if(victory) {
			player.getPackets().sendGameMessage("That round has already been won, wait for the next round.");
		} else if (player.hasAnswered) {
			player.getPackets().sendGameMessage("You have already answered this question.");
		} else if(categories[category][questionid][1].equalsIgnoreCase(answer)) {
			round++;
			sendRoundWinner(player.getDisplayName(), player);
		} else {
			player.getPackets().sendGameMessage("That answer wasn't correct, please try it again.");
		}
	}
	
	public static int RandomQuestion(int i) {
		int random = 0;
		Random rand = new Random();
		random = rand.nextInt(categories[i].length);
		return random;
	}
	
	public static boolean TriviaArea(final Player participant) {
		if(participant.getX() >= 2630 && participant.getX() <= 2660 && participant.getY() >= 9377 && participant.getY() <= 9400) {
			return true;
		}
		return false;
	}
}
