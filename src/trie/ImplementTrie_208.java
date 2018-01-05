package trie;

import java.util.HashMap;
import java.util.Map;

public class ImplementTrie_208 {

    public static void main(String[] args) {

        Trie trie = new Trie();
        trie.insert("hello");
        trie.insert("world");

        System.out.println(trie.search("hello"));
        System.out.println(trie.search("world"));
        System.out.println(trie.startsWith("hel"));
        System.out.println(trie.startsWith("world"));
        System.out.println(trie.startsWith("halo"));

        trie.delete("hello");

        System.out.println(trie.search("hello"));
        System.out.println(trie.search("world"));

    }


}
