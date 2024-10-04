class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLenSec = timeToSeconds(video_len);
        int posSec = timeToSeconds(pos);
        int opStartSec = timeToSeconds(op_start);
        int opEndSec = timeToSeconds(op_end);
        
        for (String command : commands){
            if(command.equals("prev")){
               posSec = prevSec(posSec-10); // 10초 미만이면 맨처음으로 이동
            } else if (command.equals("next")){
                posSec = skipOpening(opStartSec, opEndSec, posSec); //오프닝 건너뛰기
                posSec = Math.min(videoLenSec, posSec+10);// 10초 이후
            }
            
            posSec = skipOpening(opStartSec, opEndSec, posSec); //오프닝 건너뛰기 검사

        }
        return secondsToTime(posSec);
    }
        
        
        
        // 초 변환
        private int timeToSeconds(String time){
            String [] parts = time.split(":");
            int minutes = Integer.parseInt(parts[0]);
            int seconds = Integer.parseInt(parts[1]);
            
            return (minutes * 60) + seconds;
        }
        
        //문자 변환
        private String secondsToTime(int seconds){
            int minutes = seconds/60;
            int remainSeconds = seconds%60;
            return String.format("%02d:%02d",minutes,remainSeconds);
        }
        
        // 오프닝 건너뛰기
        private int skipOpening(int opStartSec, int opEndSec, int posSec){
            if(opStartSec <= posSec && posSec <= opEndSec){
                return opEndSec;
            }
            return posSec;
        }
        // 처음으로 가기
        private int prevSec(int posSec){
            return Math.max(0, posSec);
        }
}