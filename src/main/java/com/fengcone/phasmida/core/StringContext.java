package com.fengcone.phasmida.core;

import java.util.ArrayList;
import java.util.List;

public class StringContext {
    private String string;
    private int endIndex;
    private int startIndex;
    private List<IndexPair> indexPairs;
    private boolean nextNeedBeHead;

    public boolean needBeHead() {
        return nextNeedBeHead;
    }

    public void setNextNeedBeHead(boolean nextNeedBeHead) {
        this.nextNeedBeHead = nextNeedBeHead;
    }

    public StringContext(String string) {
        this.nextNeedBeHead = true;
        this.string = string;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public void clearIndexPair() {
        this.indexPairs.clear();
    }

    public IndexPair getLastIndexPair(int reverseIndex) {
        if (indexPairs == null || indexPairs.size() < reverseIndex) {
            return null;
        }
        return indexPairs.get(indexPairs.size() - reverseIndex);
    }

    public int getStringLength() {
        return this.string.length();
    }

    public void putIndexPair(int fragmentsIndex, int startIndex, int endIndex) {
        IndexPair pair = new IndexPair();
        pair.setStartIndex(startIndex);
        pair.setEndIndex(endIndex);
        pair.setFragmentsIndex(fragmentsIndex);
        if (indexPairs == null) {
            indexPairs = new ArrayList<>();
        }
        indexPairs.add(pair);
    }

    @Override
    public String toString() {
        return "StringContext [string=" + string + ", endIndex=" + endIndex + ", startIndex=" + startIndex + ", indexPairs=" + indexPairs + "]";
    }
}
