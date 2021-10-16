public class Music {
    //--fields
    private String name;
    private String singer;
    private int year;

    //--constructors
    public Music(String name , String singer , int year)
    {
        this.name = name;
        this.singer = singer;
        this.year = year;
    }

    //--methods

    //setters :
    /**
     * @param name sets the name of the song
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param singer sets the singer of the song
     */
    public void setSinger(String singer) {
        this.singer = singer;
    }
    /**
     * @param year sets the year of the song
     */
    public void setYear(int year) {
        this.year = year;
    }

    //getters :

    /**
     *
     * @return name of the song
     */
    public String getName() {
        return name;
    }
    /**
     *
     * @return singer of the song
     */
    public String getSinger() {
        return singer;
    }
    /**
     *
     * @return year of the song
     */
    public int getYear() {
        return year;
    }

}
