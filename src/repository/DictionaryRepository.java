package repository;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import dataAccess.DictionaryDao;
import java.util.HashMap;
import model.Dictionary;

/**
 *
 * @author DiepTCNN
 */
public class DictionaryRepository implements IDictionaryRepository {

    @Override
    public void addWord(HashMap<String, Dictionary> dictionarys) {
        DictionaryDao.Instance().addWork(dictionarys);
    }

    @Override
    public void removeWord(HashMap<String, Dictionary> dictionarys) {
        boolean b = DictionaryDao.Instance().deleteWord(dictionarys);
        if (b == true)
            System.out.println("Successful");
        else
            System.out.println("Failed");
    }

    @Override
    public void translate(HashMap<String, Dictionary> dictionarys) {
        String s = DictionaryDao.Instance().translate(dictionarys);
        if (s != null) {
            System.out.println("Vietnamese: " + s);
            System.out.println("Successful");
        }
        else
            System.out.println("Failed");
    }
 
}

