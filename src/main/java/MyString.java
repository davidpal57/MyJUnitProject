public class MyString {
    public int returnNumberOfCharacters (String cuvant){
        return cuvant.length();
    }
    public String returnConcatenatedStrings (String a, String b, String c){
        return a+b+c;
    }

    public boolean firstLetterIsVowel(String cuvant) {
        String cuvantCuLitereMici = cuvant.toLowerCase();
        if ((cuvantCuLitereMici.charAt(0) == 'a') ||
        (cuvantCuLitereMici.charAt(0) == 'e') ||
                (cuvantCuLitereMici.charAt(0) == 'i') ||
                (cuvantCuLitereMici.charAt(0)=='o') ||
                (cuvantCuLitereMici.charAt(0)=='u'))
            return true;
        else return false;
    }
}
