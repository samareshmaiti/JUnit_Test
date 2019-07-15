package com.stackroute.pe1;
public class SumOfElements {


        public String  sumOfIntegerValue(String inputString)
        {
            String[] splitInput = inputString.split(" ");
            boolean find = true;
            int sum = 0;
            for (String string: splitInput) {
                for (int i = 0; i < string.length(); i++){
                    if ( (!(Character.isDigit(string.charAt(i)))) &&
                            (string.charAt(i) != '-') &&
                            (string.charAt(i) != '+')){
                        find = false;
                    }

                }
            }
            if (find){
                for (String str: splitInput){
                    sum += Integer.parseInt(str);
                }
                return String.valueOf(sum);
            }
            else {
                return "Non Integer Value";
            }
        }

    }

