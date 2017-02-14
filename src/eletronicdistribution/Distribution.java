/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eletronicdistribution;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author danieljunior
 */
public class Distribution {

    private final Queue<Layer> layers;

    public Distribution() {
        layers = new ArrayDeque<>();
        fillLayers();
    }

    private void fillLayers() {
        layers.add(new Layer(1, 's', 2));
        layers.add(new Layer(2, 's', 2));
        layers.add(new Layer(2, 'p', 6));
        layers.add(new Layer(3, 's', 2));
        layers.add(new Layer(3, 'p', 6));
        layers.add(new Layer(4, 's', 2));
        layers.add(new Layer(3, 'd', 10));
        layers.add(new Layer(4, 'p', 6));
        layers.add(new Layer(5, 's', 2));
        layers.add(new Layer(4, 'd', 10));
        layers.add(new Layer(5, 'p', 6));
        layers.add(new Layer(6, 's', 2));
        layers.add(new Layer(4, 'f', 14));
        layers.add(new Layer(5, 'd', 10));
        layers.add(new Layer(6, 'p', 6));
        layers.add(new Layer(7, 's', 2));
        layers.add(new Layer(5, 'f', 14));
        layers.add(new Layer(6, 'd', 10));
        layers.add(new Layer(7, 'p', 6));
    }

    public String getEletronicDistribution(int numberOfEletrons) {
        String resp = "";
        for (Layer layer : layers) {
            resp += layer.getNumberOfLayer();
            resp += layer.getSubLayer();
            String eletrons;
            if (numberOfEletrons > layer.getEletrons()) {
                eletrons = layer.getEletrons() + "";
            } else {
                eletrons = numberOfEletrons + "";
            }
            for (char c : eletrons.toCharArray()) {
                resp += charToSuperscript(c + "");
            }
            numberOfEletrons -= layer.getEletrons();
            if (numberOfEletrons <= 0) {
                break;
            }
        }
        return resp;
    }

    private String charToSuperscript(String str) {
        str = str.replaceAll("0", "⁰");
        str = str.replaceAll("1", "¹");
        str = str.replaceAll("2", "²");
        str = str.replaceAll("3", "³");
        str = str.replaceAll("4", "⁴");
        str = str.replaceAll("5", "⁵");
        str = str.replaceAll("6", "⁶");
        str = str.replaceAll("7", "⁷");
        str = str.replaceAll("8", "⁸");
        str = str.replaceAll("9", "⁹");
        return str;
    }
}
