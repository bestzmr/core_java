package tech.aistar.day15.myhomework;

/**
 * @author: Merlin
 * @time: 2020/8/11 16:58
 */
public class CharacterDTO {
    char letters ;
    int count;

    public CharacterDTO(char letters, int count) {
        this.letters = letters;
        this.count = count;
    }

    public CharacterDTO() {
    }

    public char getLetters() {
        return letters;
    }

    public void setLetters(char letters) {
        this.letters = letters;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
