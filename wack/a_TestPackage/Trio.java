package a_TestPackage;


/**
 *
 * @author Tim Barber
 */
public class Trio {

    public static double getTwoCombinedPrices(double x, double y, double z) {
        return Math.max(Math.max(x, y) + z, Math.max(x, z) + y);
    }

    public static void main(String[] args) {
        double[][] tests = {{1, 2, 3}, {3, 1, 2}, {1, 3, 2}, {5, 6, 5}, {2.34, 2.45, 7.12}};
        for (double[] dl : tests) {
            System.out.println("Combined prices of " + dl[0] + ", " + dl[1] + ", and " + dl[2] + ": " + getTwoCombinedPrices(dl[0], dl[1], dl[2]));
        }

    }
}

/*
 * The MIT License
 *
 * Copyright (c) 2019 Tim Barber.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
