package LAB1.TASK3;

public class Number {
    public static String[] hundreds = {"Сто ","Двести ","Триста ","Четыреста ","Пятьсот ","Шестьсот ","Семсьсот ","Восемьсот ","Девятьсот "};
    public static String[] tens = {"десять","двадцать ","тридцать ","сорок ","пятьдесят ","шестьдесят ","семьдесят ","восемьдесят ","девяносто "};
    public static String[] units = {"один","два","три","четыре","пять","шесть","семь","восемь","девять"};
    public static String[] exception = {"одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};

    public static String Descriptor(int num) {
        if ( num < 100 || num > 999){
            return "Неподходящее число";
        }
        StringBuilder desc = new StringBuilder();
        String temp = Integer.toString(num);
        int[] number = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            number[i] = temp.charAt(i) - '0';
        }
        for (int i = 0; i < temp.length(); i++)
        {
            if (i == 1 && number[1] == 1) {
                if (number[2] == 1) {
                    desc.append(exception[0]);
                }
                if (number[2] == 2) {
                    desc.append(exception[1]);
                }
                if (number[2] == 3) {
                    desc.append(exception[2]);
                }
                if (number[2] == 4) {
                    desc.append(exception[3]);
                }
                if (number[2] == 5) {
                    desc.append(exception[4]);
                }
                if (number[2] == 6) {
                    desc.append(exception[5]);
                }
                if (number[2] == 7) {
                    desc.append(exception[6]);
                }
                if (number[2] == 8) {
                    desc.append(exception[7]);
                }
                if (number[2] == 9) {
                    desc.append(exception[8]);
                }
                break;
            }
            switch (number[i]) {
                case 1: {
                    if (i == 0) {
                        desc.append(hundreds[0]);
                    }
                    if (i == 1) {
                        desc.append(tens[0]);
                    }
                    if (i == 2) {
                        desc.append(units[0]);
                    }
                    break;
                }
                case 2: {
                    if (i == 0) {
                        desc.append(hundreds[1]);
                    }
                    if (i == 1) {
                        desc.append(tens[1]);
                    }
                    if (i == 2) {
                        desc.append(units[1]);
                    }
                    break;
                }
                case 3: {
                    if (i == 0) {
                        desc.append(hundreds[2]);
                    }
                    if (i == 1) {
                        desc.append(tens[2]);
                    }
                    if (i == 2) {
                        desc.append(units[2]);
                    }
                    break;
                }
                case 4: {
                    if (i == 0) {
                        desc.append(hundreds[3]);
                    }
                    if (i == 1) {
                        desc.append(tens[3]);
                    }
                    if (i == 2) {
                        desc.append(units[3]);
                    }
                    break;
                }
                case 5: {
                    if (i == 0) {
                        desc.append(hundreds[4]);
                    }
                    if (i == 1) {
                        desc.append(tens[4]);
                    }
                    if (i == 2) {
                        desc.append(units[4]);
                    }
                    break;
                }
                case 6: {
                    if (i == 0) {
                        desc.append(hundreds[5]);
                    }
                    if (i == 1) {
                        desc.append(tens[5]);
                    }
                    if (i == 2) {
                        desc.append(units[5]);
                    }
                    break;
                }
                case 7: {
                    if (i == 0) {
                        desc.append(hundreds[6]);
                    }
                    if (i == 1) {
                        desc.append(tens[6]);
                    }
                    if (i == 2) {
                        desc.append(units[6]);
                    }
                    break;
                }
                case 8: {
                    if (i == 0) {
                        desc.append(hundreds[7]);
                    }
                    if (i == 1) {
                        desc.append(tens[7]);
                    }
                    if (i == 2) {
                        desc.append(units[7]);
                    }
                    break;
                }
                case 9: {
                    if (i == 0) {
                        desc.append(hundreds[8]);
                    }
                    if (i == 1) {
                        desc.append(tens[8]);
                    }
                    if (i == 2) {
                        desc.append(units[8]);
                    }
                    break;
                }

        }
    }
        return desc.toString();
}
}
