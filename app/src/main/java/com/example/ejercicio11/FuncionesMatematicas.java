package com.example.ejercicio11;

public class FuncionesMatematicas {
        private double num1, num2;

        public FuncionesMatematicas(double num1, double num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        public double suma() {
            return num1 + num2;
        }

        public double resta() {
            return num1 - num2;
        }

        public double multiplicacion() {
            return num1 * num2;
        }

        public double division() {
            if (num2 == 0) {
                throw new IllegalArgumentException("No se puede dividir entre cero");
            }
            return num1 / num2;
        }
}
