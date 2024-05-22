package Q4.Prog7300P;

import java.util.Arrays;

public class Prog7300p {
    public static void main(String[] args) {
        // AND Neuron
        double[][] X_train = {
            {0,0},
            {0,1},
            {1,0},
            {1,1}
        };
        double[] y_train = {0,0,0,1};

        System.out.println("AND Neuron:");
        var model = new Perceptron(0.1, 15);
        model.fit(X_train, y_train);

        // Predict using training model
        double[] y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // Print weights & bias(es)
        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());

        // OR Gate
        y_train = new double[]{0,1,1,1};

        System.out.println("\nOR Neuron:");
        var model2 = new Perceptron(0.1, 15);
        model2.fit(X_train, y_train);

        // Predict using training model
        y_pred = model2.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // NAND Gate
        y_train = new double[]{1,1,1,0};

        System.out.println("\nNAND Neuron:");
        var model3 = new Perceptron(0.1, 15);
        model3.fit(X_train, y_train);

        // Predict using training model
        y_pred = model3.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // NOR Gate
        y_train = new double[]{1,0,0,0};

        System.out.println("\nNOR Neuron:");
        var model4 = new Perceptron(0.1, 15);
        model4.fit(X_train, y_train);

        // Predict using training model
        y_pred = model4.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));

        // NOT Gate
        X_train = new double[][]{
                {0},
                {1}
        };
        y_train = new double[]{1,0};

        System.out.println("\nNOT Neuron:");
        var model5 = new Perceptron(0.1, 15);
        model5.fit(X_train, y_train);

        // Predict using training model
        y_pred = model5.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: " + Arrays.toString(y_train));
    }
}

/*
AND Neuron:
Epoch 1: Loss: 0.0
Epoch 2: Loss: 0.0
Epoch 3: Loss: 0.0
Epoch 4: Loss: 0.25
Epoch 5: Loss: 0.25
Epoch 6: Loss: 0.25
Epoch 7: Loss: 0.25
Epoch 8: Loss: 0.25
Epoch 9: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [0.0, 0.0, 0.0, 1.0]
Actual: [0.0, 0.0, 0.0, 1.0]
Weights: [0.141529048009075, 0.09941185207395503]
Bias: -0.19999999999999987

OR Neuron:
Epoch 1: Loss: 0.0
Epoch 2: Loss: 0.25
Epoch 3: Loss: 0.0
Epoch 4: Loss: 0.0
Epoch 5: Loss: 0.25
Epoch 6: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 8: Loss: 0.25
Epoch 9: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.25
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [1.0, 1.0, 1.0, 1.0]
Actual: [0.0, 1.0, 1.0, 1.0]

NAND Neuron:
Epoch 1: Loss: 0.25
Epoch 2: Loss: 0.25
Epoch 3: Loss: 0.25
Epoch 4: Loss: 0.0
Epoch 5: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [1.0, 1.0, 1.0, 0.0]
Actual: [1.0, 1.0, 1.0, 0.0]

NOR Neuron:
Epoch 1: Loss: 0.25
Epoch 2: Loss: 0.25
Epoch 3: Loss: 0.0
Epoch 4: Loss: 0.0
Epoch 5: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [1.0, 0.0, 0.0, 0.0]
Actual: [1.0, 0.0, 0.0, 0.0]

NOT Neuron:
Epoch 1: Loss: 0.5
Epoch 2: Loss: 0.5
Epoch 3: Loss: 0.5
Epoch 4: Loss: 0.0
Epoch 5: Loss: 0.0
Epoch 6: Loss: 0.0
Epoch 7: Loss: 0.0
Epoch 8: Loss: 0.0
Epoch 9: Loss: 0.0
Epoch 10: Loss: 0.0
Epoch 11: Loss: 0.0
Epoch 12: Loss: 0.0
Epoch 13: Loss: 0.0
Epoch 14: Loss: 0.0
Epoch 15: Loss: 0.0
Predicted: [1.0, 0.0]
Actual: [1.0, 0.0]
 */