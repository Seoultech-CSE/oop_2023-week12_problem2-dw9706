
            this.r[0] = numerator/gcd;
            this.r[1] = denominator/gcd;
        }

        /**Find GCD of two numbers*/
        private long gcd(long n, long d) {
            long t1 = Math.abs(n);
            long t2 = Math.abs(d);
            long remainder = t1%t2;

            while (remainder != 0) {
                t1 = t2;
                t2 = remainder;
                remainder = t1%t2;
            }

            return t2;
        }

        /**Return numerator*/
        public long getNumerator() {
            return r[0];
        }

        /**Return denominator*/
        public long getDenominator() {
            return r[1];
        }

        /**Add a rational number to this rational*/
        public Rational add(Rational secondNewRational) {
            long n = r[0]*secondNewRational.getDenominator() +
                    r[1]*secondNewRational.getNumerator();
            long d = r[1]*secondNewRational.getDenominator();
