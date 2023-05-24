package src.ex5;

public class NumeroFornecido {
        public int Numero;

        public NumeroFornecido(int numero) {
            super();
            this.Numero = numero;
        }
        public int ModuloDoNumero() {
            if (this.Numero >= 0) {
                return Numero;
            } else {
                return (-1 * Numero);
            }
        }

    }
