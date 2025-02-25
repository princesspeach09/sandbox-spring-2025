package org.example.sandbox.cards.standard;

import javax.naming.OperationNotSupportedException;

public interface Deck {

    void shuffle();
    void cut (int index);
    Card deal();
    Card turnOver();
    Card draw();
    int search (Card card);
    int size();
    void newOrder(Deck cards);

    default int newSize() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }



}

