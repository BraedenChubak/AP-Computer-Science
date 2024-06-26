package Q4.Prog7000l;

import java.util.Arrays;
public class LinearRegression {
    private double theta0; // y-Intercept
    private double theta1; // Slope
    private double alpha; // Learning Rate
    private double tolerance;
    private double[] objective; // Cost per epoch


    public LinearRegression(double thetaOne, double thetaZero, double learningRate, double tol) {
        theta0 = thetaZero;
        theta1 = thetaOne;
        alpha = learningRate;
        tolerance = tol;
    }

    public void fit(double[][] X_train, double[] Y_train, int epochs) {
        int m = X_train.length;
        objective = new double[epochs];
        double[] error = new double[m];

        for (int epoch = 0; epoch < epochs; epoch++) {
            if (epoch > 0) {
                double temp0 = 0, temp1 = 0;
                // RHS of Gradient Descent
                for (int i = 0; i < m; i++) {
                    // Predicted label - Actual label
                    double temp = (theta1 * X_train[i][0] + theta0) - Y_train[i];
                    temp0 += temp;
                    temp1 += temp * X_train[i][0];
                }
                // LHS of Gradient Descent
                theta0 -= (1.0 / m) * alpha * temp0;
                theta1 -= (1.0 / m) * alpha * temp1;
            }
            // TODO: calculate error/cost and repeat
        }
    }

    public String toString() {
        return "Regression line: y = " + theta1 + " * x + " + theta0 + "\nObjective: " + Arrays.toString(objective) + "\nMin. Objective: " + (double)Arrays.stream(objective).min().getAsDouble();
    }

    public double getIntercept() { return theta0; }

    public double getSlope() { return theta1; }

    public double predict(double x) { return theta1 * x + theta0; }
}