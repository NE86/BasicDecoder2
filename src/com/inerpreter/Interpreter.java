package com.inerpreter;

import com.inerpreter.heap.Heap;
import com.inerpreter.tree.AnalyzeTree;
import com.inerpreter.util.VariableUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Interpreter {

    //Построчно читаем из файла
    private static ArrayList<String> readUsingFiles(String fileName) throws IOException {
        return (ArrayList<String>) Files.readAllLines(Paths.get(fileName));
    }

    //Разделяем код и номер строки
    private static TreeMap<Integer, ArrayList<String>> parse(ArrayList<String> needParse) {
        //Integer- номер строки, ArrayList - код разделенный по словам
        TreeMap<Integer, ArrayList<String>> code = new TreeMap<>();
        int i = 0;
        for (String aNeedParse : needParse) {
            //Разделяем всю строку по  пробелам
            String[] buf = aNeedParse.split(" ");
            //Проверяем указан ли номер строки
            if (VariableUtils.isNumber(buf[0])) {
                ArrayList<String> codeWithoutLineNumber = new ArrayList<>(Arrays.asList(buf).subList(1, buf.length));
                code.put(Integer.parseInt(buf[0]), codeWithoutLineNumber);
                i = Integer.parseInt(buf[0]);
            } else {
                i++;
                ArrayList<String> codeWithoutLineNumber = new ArrayList<>(Arrays.asList(buf));
                code.put(i, codeWithoutLineNumber);
            }
        }
        return code;
    }

    //Ищем операторы
    private static void operators() throws IOException {
        TreeMap<Integer, ArrayList<String>> code = parse(readUsingFiles("Basic code.txt"));
        Heap.initializeHeap(code);
        AnalyzeTree tree = new AnalyzeTree(code.lastKey());
        tree.run(code.firstKey());
    }

    public static void main(String[] args) throws IOException {
        operators();
    }
}