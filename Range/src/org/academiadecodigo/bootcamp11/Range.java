package org.academiadecodigo.bootcamp11;

import java.util.Iterator;

/**
 * Created by codecadet on 10/10/17.
 */
public class Range implements Iterable<Integer> {

    private Integer min;
    private Integer max;
    private int pos;
    private int delete;
    private boolean direction;

    public Range(Integer min, Integer max, boolean direction) {
        this.max = max;
        this.min = min;
        this.direction = direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    @Override
    public Iterator<Integer> iterator() {

        // se é para andar para trás, iterador para trás
        if (direction == false) {
            return new RangeIterator();
        }
        // senão, iterador para a frente
        return rangeIterator();
    }

    public class RangeIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return max == pos;
        }


        @Override
        public Integer next() {
            if (hasNext()) {
                pos++;
                return pos;
            }
            return null;
        }

        @Override
        public void remove() {

            delete = -1;
            if (delete == pos + 1) {
                next();
            }
        }
    }

    public RangeIterator rangeIterator() {

        pos = max + 1;

        return new RangeIterator() {

            @Override
            public boolean hasNext() {
                return pos == min;

            }

            @Override
            public Integer next() {

                if (hasNext()) {
                    pos--;
                    return pos;
                }
                return null;
            }

        };

    }


}
