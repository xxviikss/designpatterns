package com.company;

public interface ResourceFactory {
    ChoosingThings createChoosingThings(ChoosingThings.Type type);

    Size createSize(int size);
}
