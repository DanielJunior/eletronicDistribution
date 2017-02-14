/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eletronicdistribution;

/**
 *
 * @author danieljunior
 */
public class Layer {
    private int numberOfLayer;
    private char subLayer;
    private int eletrons;

    public Layer(int numberOfLayer, char subLayer, int eletrons) {
        this.numberOfLayer = numberOfLayer;
        this.subLayer = subLayer;
        this.eletrons = eletrons;
    }

    public int getNumberOfLayer() {
        return numberOfLayer;
    }

    public void setNumberOfLayer(int numberOfLayer) {
        this.numberOfLayer = numberOfLayer;
    }

    public char getSubLayer() {
        return subLayer;
    }

    public void setSubLayer(char subLayer) {
        this.subLayer = subLayer;
    }

    public int getEletrons() {
        return eletrons;
    }

    public void setEletrons(int eletrons) {
        this.eletrons = eletrons;
    }
    
}
