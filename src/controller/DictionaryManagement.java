/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import model.Dictionary;
import repository.DictionaryRepository;
import repository.IDictionaryRepository;
import view.Menu;

/**
 *
 * @author ADMIN
 */
public class DictionaryManagement extends Menu<String>{
    private IDictionaryRepository dictionaryRepository;
    static String[] options = {"Add Word", "Delete Word", "Translate", "Exit"};
    HashMap<String, Dictionary> dictionarys;
    public DictionaryManagement() {
        super("===== DICTIONARY PROGRAM =====", options);
        dictionaryRepository = new DictionaryRepository();
        dictionarys = new HashMap<>();
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> dictionaryRepository.addWord(dictionarys);
            case 2 -> dictionaryRepository.removeWord(dictionarys);
            case 3 -> dictionaryRepository.translate(dictionarys);
            case 4 -> System.exit(0);
        }
    }
}
