public class Hero implements Comparable<Hero>{

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo(Hero hero) {
    	return this.getname().compareTo(hero.getname());
    }
    	Comparator<Hero> comparator = new Comparator<Hero>() {
    		@Override
    	    public int compare(Hero hero1, Hero hero2) {
    	        return hero1.getName().compareTo(hero2.getName());
    	    }
    	
    	};
  
}