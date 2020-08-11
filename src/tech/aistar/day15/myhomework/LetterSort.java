package tech.aistar.day15.myhomework;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * @author: Merlin
 * @time: 2020/8/11 16:45
 */
public class LetterSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        letterSort(str);

    }

    public static void letterSort(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (map.get(c) == null) {
                map.put(c, 0);
            }
            int tmp = map.get(c);
            map.put(c, ++tmp);
        }
        List<CharacterDTO> characterDTOS = new ArrayList<>();
        map.forEach((character, counter) -> {
            characterDTOS.add(new CharacterDTO(character, counter));
        });
        characterDTOS.stream().sorted(new Comparator<CharacterDTO>() {
            @Override
            public int compare(CharacterDTO o1, CharacterDTO o2) {
                if (o1.getCount() == o2.getCount()) {
                    return Character.compare(o2.getLetters(), o1.getLetters());
                }
                return Integer.compare(o1.getCount(), o2.getCount());
            }
        }).forEach(x -> System.out.println(x.getLetters()+":"+x.getCount()));



    }

}
