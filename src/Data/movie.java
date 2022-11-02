/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.util.*;
/**
 *
 * @author Rionna
 */
public class movie {
    
    private int MovieId, Duration;
    private String title, director, cast, synopis, genre;
    
    public movie()
    {
        
    }
    
    public movie(int id, int duration, String title, String direc, String cast, String synopis, String genre)
    {
        this.MovieId=id;
        this.Duration=duration;
        this.title=title;
        this.cast=cast;
        this.director=direc;
        this.synopis=synopis;
        this.genre=genre;
    }
    
    public int getMovieID()
    {
        return MovieId;
    }
    
    public int getDuration()
    {
        return Duration;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getCast()
    {
        return cast;
    }
    
    public String getDirector()
    {
        return director;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public String getSynopis()
    {
        return synopis;
    }
    
    public void setMovieID(int id)
    {
        this.MovieId=id;
    }
    
    public void setDuration(int duration)
    {
        this.Duration=duration;
    }
    
    public void setTitle(String title)
    {
        this.title=title;
    }
    
    public void setCast(String cast)
    {
        this.cast=cast;
    }
    
    public void setDirector(String direc)
    {
        this.director=direc;
    }
    
    public void setGenre(String genre)
    {
        this.genre=genre;
    }
    
    public void setSynopis(String synopis)
    {
        this.synopis=synopis;
    }
    
    @Override
    public String toString()
    {
        return "Movie{"+"MovieID= "+MovieId+", Title="+title+", Director"+director+", Cast="+cast+", Synopis"+synopis+", Duration="+Duration+", Genre="+genre+"}";
    }
}
