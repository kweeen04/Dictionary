package repository;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


import java.util.HashMap;
import model.Dictionary;

/**
 *
 * @author DiepTCNN
 */
public interface IDictionaryRepository {
    void addWord(HashMap<String, Dictionary> dictionarys);
    void removeWord(HashMap<String, Dictionary> dictionarys);
    void translate(HashMap<String, Dictionary> dictionarys);
}
