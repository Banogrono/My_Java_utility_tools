 static String u2Converter(String number) { // converts decimal to binary
        int num = Integer.parseInt(number);
        StringBuilder formatNumber = new StringBuilder(Integer.toBinaryString(num));

        while (formatNumber.length() % 8 != 0) {
           if (num < 0)
               formatNumber.insert(0,1);
           else
               formatNumber.insert(0,0);
        }

        for (int i = formatNumber.length() -1 ; i >= 0 ; i--) {
            if (i % 4 == 0 && i != formatNumber.length() -1) {
                formatNumber.insert(i," ");
            }
        }
        return formatNumber.toString();
    }
