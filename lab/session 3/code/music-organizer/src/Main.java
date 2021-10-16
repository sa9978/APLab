public class Main {
    public static void main(String args[])
    {
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        MusicCollection favorites = new MusicCollection();

        Music music1 = new Music("music1" , "singer1" , 1992);
        Music music2 = new Music("music2" , "singer2" , 1993);
        Music music3 = new Music("music3" , "singer3" , 1994);
        Music music4 = new Music("music4" , "singer4" , 1995);
        Music music5 = new Music("music5" , "singer5" , 1996);
        Music music6 = new Music("music6" , "singer6" , 1997);
        Music music7 = new Music("music7" , "singer7" , 1998);
        Music music8 = new Music("music8" , "singer8" , 1999);

        pop.addFile(music1);
        pop.addFile(music2);

        jazz.addFile(music3);
        jazz.addFile(music4);

        rock.addFile(music5);
        rock.addFile(music6);

        country.addFile(music7);
        country.addFile(music8);

        favorites.addFile(music1);
        favorites.addFile(music3);

        System.out.println("POP :");
        pop.listAllFiles();

        System.out.println("JAZZ :");
        jazz.listAllFiles();

        System.out.println("ROCK :");
        rock.listAllFiles();

        System.out.println("COUNTRY :");
        country.listAllFiles();

        System.out.println("FAVORITES :");
        favorites.listAllFiles();

        System.out.println();
        pop.removeFile(1);
        System.out.println("NEW POP :");
        pop.listAllFiles();

        System.out.println();
        country.startPlaying(1);
        country.stopPlaying();

        System.out.println();
        pop.search("music1");
        pop.search("music2");


    }
}
