package sub;

class yyy {
    public static void main(String[] args) {
        String text = "Sfdd Axcvf ers dddg afa `sew";
        char charTmp;

        for (String word : text.split("\\s+")){
            charTmp = word.toLowerCase().charAt(0);
            if (Character.isLetter(charTmp))
                switch (charTmp) {
                    case 'e':
                    case 'y':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'c':
                    case 'd':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'b':
                    case 'q':
                    case 'm':
                    case 'z':
                    case 't':
                    case 'x':
                    case 'w':
                    case 'v':
                    case 's':
                    case 'r':
                    case 'p':
                    case 'n':
                    case 'l':
                    case 'k':
                    case 'j':
                        break;
                    default:
                        System.out.println(word);
                }
        }
    }
}