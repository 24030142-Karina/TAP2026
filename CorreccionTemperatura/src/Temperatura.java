
    /*
     Clase que maneja la lógica de conversión de temperaturas

     celsiusAFahrenheit(): Convierte de Celsius a Fahrenheit
     fahrenheitACelsius(): Convierte de Fahrenheit a Celsius
     */

    class Temperatura {

        public float celsiusAFahrenheit(float valorCelsius) {
            return (valorCelsius * ((float) 9 / 5)) + 32;
        }
        // Numero a convertir * 9/5 + 32

        public float fahrenheitACelsius(float valorFahrenheit) {
            return (((float) 5 / 9) * (valorFahrenheit - 32));
            //  5/9 * Numero a convertir - 32
        }
    }

