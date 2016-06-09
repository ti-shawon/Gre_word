package gre;


public class word_class {
    private String word,meaning,sentence,web_link;
    int state,cumulative_frequency;

    public word_class(String word, String meaning, String sentence,String web_link) {
        this.word = word;
      
        this.meaning = meaning;
        this.sentence = sentence;
        this.state = 0;
        this.web_link=web_link;
    }

    public String getWeb_link() {
        return web_link;
    }

    public void setCumulative_frequency(int cumulative_frequency) {
        this.cumulative_frequency = cumulative_frequency;
    }
    
    
    
    public int getCumulative_frequency() {
        return cumulative_frequency;
    }

    public String getWord() {
        return word;
    }

    

    public String getMeaning() {
        return meaning;
    }

    public String getSentence() {
        return sentence;
    }

    public int getState() {
        return state;
    }
}
