//틀린답

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        int[] copyNumbers = numbers;
        
        String[] strNumbers = new String[numbers.length];
        
        int temp = 0;
        String strTemp ="";
        
        for(int i=0; i< strNumbers.length; i++){ //정수 크기에 따라 10만단위로 통일
            strNumbers[i] = String.valueOf(numbers[i]);
            
            if(strNumbers[i].length() == 1){
                copyNumbers[i] = copyNumbers[i] * 100000;
            }else if(strNumbers[i].length() == 2){
                copyNumbers[i] = copyNumbers[i] * 10000;
            }else if(strNumbers[i].length() == 3){
                copyNumbers[i] = copyNumbers[i] * 1000;
            }else if(strNumbers[i].length() == 4){
                copyNumbers[i] = copyNumbers[i] * 100;
            }
        }
        
        for(int i=0; i<copyNumbers.length; i++){
            for(int j=0; j<copyNumbers.length; j++){
                
                if(copyNumbers[i] > copyNumbers[j]){
                    temp = copyNumbers[j];
                    copyNumbers[j] = copyNumbers[i];
                    copyNumbers[i] = temp;
                    
                    strTemp = strNumbers[j];
                    strNumbers[j] = strNumbers[i];
                    strNumbers[i] = strTemp;
                }else if(copyNumbers[i] == copyNumbers[j]){
                    if(strNumbers[i].length() < strNumbers[j].length()){
                        strTemp = strNumbers[j];
                        strNumbers[j] = strNumbers[i];
                        strNumbers[i] = strTemp;
                    }
                }
            }
        }
            
        for(String str : strNumbers){
            answer = answer + str;
        }       
        return answer;
    }
}
