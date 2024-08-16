package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        boolean isValuePresent = false;
        for (Map.Entry<Integer, Integer> entry : functionMap.entrySet()) {
            int functionValue = entry.getValue();
            if (functionValue == requiredValue) {
                isValuePresent = true;
                break;
            }
        }
        return isValuePresent;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> functionMap = new HashMap<>();
        for (Integer key : sourceList) {
            Integer value = 5 * key + 2;
            functionMap.put(key, value);
        }

        return functionMap;
    }
}
