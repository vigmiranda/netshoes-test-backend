package com.netshoes.problems.problem1.impl;


import com.netshoes.problems.problem1.api.Stream;

// NAO RENOMEAR ESSA CLASSE!
public class StreamImpl implements Stream {

    private Character[] text;

    // Nao alterar esse construtor!
    public StreamImpl(String stream) {
         setText(stream.chars().mapToObj(c -> (char)c).toArray(Character[]::new));
    }

    @Override
    public char getNext() {
        // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.
        return 0;
    }

    @Override
    public boolean hasNext() {
        // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.
        return false;
    }

    public Character[] getText() {
        return text;
    }

    public void setText(Character[] text) {
        this.text = text;
    }
}
