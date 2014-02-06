package edu.macalester.comp124.life;

/**
 * RuleSet implementing Conway's Game of Life.
 *
 * @author Michael Ekstrand <ekstrand@cs.umn.edu>
 */
public class Highlife implements RuleSet {

    public String getName() {
        return "Highlife";
    }

    /**
     * Applies the rules of Conway's Game of Life.
     *
     * @param isAlive       The value of the current cell (true = alive).
     * @param neighborCount The number of living neighbors of the cell.
     * @return true if the cell should be alive in the next generation.
     */
    public boolean applyRules(boolean isAlive, int neighborCount) {
        if (isAlive) {
            if (neighborCount < 2 || neighborCount > 3) {
                return false;
            } else {
                return true;
            }

        } else {
            if (neighborCount == 3 || neighborCount == 6) {
                return true;
            } else {
                return false;
            }
        }


    }


}

















