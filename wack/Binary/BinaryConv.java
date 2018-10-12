package Binary;

/**
 *
 * @author Tim Barber
 */
public class BinaryConv {
    private String binNum;
    private int decNum;
    private int converted;
    private int binConverted;
    
    public BinaryConv(){
        binNum = "";
        decNum = 0;
        converted = 0;
        binConverted = 0;
    }
    
    public BinaryConv(String s){
        binNum = s;
        converted = 0;
        decNum = 0;
        binConverted = 0;
    }
    
    public BinaryConv(String binaryNum, int decimalNum){
        binNum = binaryNum;
        converted = 0;
        decNum = decimalNum;
        binConverted = 0;
    }
    
    public BinaryConv(int decimalNum){
        binNum = "";
        converted = 0;
        decNum = decimalNum;
        binConverted = 0;
    }
    
    public void setBinNum(String s){
        binNum = s;
    }
    
    public String getBinNum(){
        return binNum;
    }
    
    public void setDecNum(int i){
        decNum = i;
    }
    
    public int getDecNum(){
        return decNum;
    }
    
    public void calculateBinary(){
        for(int i = 0; i < decNum; i++){
            binConverted = binConverted/10 + i;
        }
    }
    
    public void calculateDecimal(){
        for(int i = 0; i < binNum.length(); i++){
            converted = (converted*2)+Integer.valueOf(binNum.charAt(i))-48;
        }
    }
    
    public int getDecimalEQ(){
        calculateBinary();
        return converted;
    }
    
    public String getBinaryEQ(){
        calculateDecimal();
        return String.valueOf(binConverted);
    }
    
    public String getBinaryEQ(int decimalNumber){
        setDecNum(decimalNumber);
        calculateBinary();
        return String.valueOf(binConverted);
    }
    
    @Override
    public String toString(){
        calculateBinary();
        calculateDecimal();
        return "" + binNum + " in decimal is: " + converted + "\n" + decNum + " in binary is: " + binConverted;
    }
}

/*
 * The MIT License
 *
 * Copyright 2018 barber.timothy20.
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
