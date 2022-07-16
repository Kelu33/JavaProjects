class Movies {

    public static void main(String[] args) {
        String[] movies = new String[] {
                "Indiana Jones and the Kingdom of the Crystal Skull",
                "Indiana Jones and the Last Crusade",
                "Indiana Jones and the Temple of Doom"
        };
        String[][] actors = new String[][] {
                { "Harrison Ford", "Shia LaBeouf", "Karen Allen" },
                { "Harrison Ford", "Sean Connery", "Denholm Elliott" },
                { "Harrison Ford", "Kate Capshaw", "Ke Huy Quan" }
        };
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i] + "\n With :");

            for (int j = 0; j < actors[i].length; j++) {
                System.out.println("    - " + actors[i][j]);
            }
        }
    }
}
